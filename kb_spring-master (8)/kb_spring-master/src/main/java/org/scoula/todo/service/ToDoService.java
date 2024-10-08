package org.scoula.todo.service;

import org.scoula.lib.cli.ui.Input;
import org.scoula.todo.dao.TodoDao;
import org.scoula.todo.dao.TodoListDao;
import org.scoula.todo.domain.Todo;


public class ToDoService {
    TodoDao dao = TodoListDao.getInstance();

    //메뉴1. 목록 메소드
    public void printTodoList() {
        for(Todo todo : dao.getList()){
//            todo의 id는 gid로 객체 생성시 1씩 더해서 삽입해줌
            String line = "%d] %s".formatted(todo.getId(), todo.getTitle());
            System.out.println(line);
        }
        System.out.println();
    }

    //메뉴2. 상세 메소드
    public void detailTodo() {
        // 사용자에게 찾을 todo의 id 입력받기
        int id = Input.getInt("Todo Id: ");
        // 사용자한테 받은 id로 해당 todo 찾기
        Todo todo = dao.getTodo(id);

        // 찾아온 todo의 상세 정보 출력
        System.out.println("[Todo 상세보기]-----------------------------------");
        System.out.println("ID         : " + todo.getId());
        System.out.println("제목        : " + todo.getTitle());
        System.out.println("설명        : " + todo.getDescription());
        System.out.println("완료여부    : " + todo.isDone());
        System.out.println("등록일      : " + todo.getRegDate());
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    //메뉴3. 추가 메소드
    public void addTodo() {
        System.out.println("[새 Todo 추가]----------------------------");
        String title = Input.getLine("제목: ");
        String description = Input.getLine("설명: ");
        System.out.println("-------------------------------------------");

//        사용자한테 받아온 제목과 설명으로 새로운 할일 생성
        Todo todo = Todo.builder()
                .title(title)
                .description(description)
                .done(false)
                .build();
//        할일 목록에 추가
        dao.add(todo);

        System.out.println();
    }

    //메뉴4. 수정 메소드
    public void updateTodo() {
        int id = Input.getInt("수정할 Id: ");
//        해당 id를 가진 todo를 찾아옴
        Todo todo = dao.getTodo(id);

        System.out.println("[Todo 수정하기]-----------------------------");
        System.out.println("ID      : " + todo.getId());
//        값을 입력하지 않으면 원래 제목, 입력하면 새로운 제목으로 return
        String title = Input.getLine("제목",todo.getTitle());
//        값을 입력하지 않으면 원래 설명, 입력하면 새로운 설명으로 return
        String description = Input.getLine("설명",todo.getDescription());
//        값을 입력하지 않으면 원래 완료여부, 입력하면 새로운 완료여부로 return
        Boolean done = Input.confirm("완료여부",todo.isDone());
        System.out.println("-------------------------------------------");
        System.out.println();

//        찾아온 todo를 새로 복제함
        Todo updateTodo = (Todo)todo.clone();
        updateTodo.setTitle(title);
        updateTodo.setDescription(description);
        updateTodo.setDone(done);

//        업데이트된 내용을 가진 todo로 리스트를 갈아끼움
        dao.update(updateTodo);
    }

    //메뉴5. 삭제 메소드
    public void deleteTodo() {
//        사용자에게 삭제할 todo의 아이디 입력받기
        int id = Input.getInt("삭제할 Todo Id : ");
//        해당하는 id의 todo를 목록에서 삭제
        dao.delete(id);

        System.out.println();
    }
}
