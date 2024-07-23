package org.scoula.todo.service;

import org.scoula.todo.context.Context;
import org.scoula.todo.dao.TodoDao;
import org.scoula.todo.dao.TodoDaoImpl;
import org.scoula.todo.domain.TodoVO;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Supplier;
public class TodoService {
    TodoDao dao = new TodoDaoImpl();
    Supplier<String> userId = ()->Context.getContext().getUser().getId();
}

public void print() {
    try {
        int count = dao.getTotalCount(userId.get());
        List<TodoVO> list = dao.getList(userId.get());
        System.out.println("총 건수: " + count);
        System.out.println("=========================================");
        for (TodoVO todo : list) {
            System.out.printf("%03d] %s%s\n", todo.getId(), todo.getTitle(),
                    todo.getDone() ? "(완료)" : "");
        }
        System.out.println("=========================================");
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}




