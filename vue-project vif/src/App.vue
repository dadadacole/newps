<template>
    <div>
        <div v-for="(user, index) in underlist" :key="index" class="user-wrapper">
            <p>로그인회원 레벨: {{ getLevel(user.id) }}</p>
            <div v-if="getLevel(user.id) >= 100000" class="message">안녕하세요, {{ user.name }} 님. 골드 등급입니다!</div>
            <div v-else-if="getLevel(user.id) >= 50000" class="message">안녕하세요, {{ user.name }} 님. 실버 등급입니다!</div>
            <div v-else class="message">안녕하세요, {{ user.name }} 님. 브론즈 등급입니다!</div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            userList: [
                { id: 1, name: '김철수', level: 10000000 },
                { id: 2, name: '김한나', level: 2 },
                { id: 3, name: '김철수', level: 3 },
                { id: 4, name: '김철수', level: 4 },
                { id: 5, name: '김철수', level: 50001 },
                { id: 6, name: '김철수', level: 100001 },
                { id: 7, name: '김철수', level: 10001 },
                { id: 8, name: '김철수', level: 100000 },
            ],
            underlist: [{ id: 1 }, { id: 2 }, { id: 3 }],
        };
    },
    methods: {
        getLevel(id) {
            const targetUser = this.userList.find((user) => user.id === id);
            return targetUser ? targetUser.level : -1;
        },
    },
    created() {
        for (let i = 0; i < this.userList.length; i++) {
            this.underlist.push({ id: this.userList[i].id });
        }
    },
};
</script>

<!-- <template>
    <div>
        로그인회원 레벨:{{ $options.filters.levelCheck(userList, loginUser.id) }}
        <div v-if="$options.filters.levelCheck(userList, loginUser.id) === 2">안녕하세요 정회원이시네요!</div>
        <div v-else>안녕하세요 준회원이시네요!</div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            userList: [
                { id: 1, name: '김철수', level: 1 },
                { id: 2, name: '김한나', level: 2 },
                { id: 3, name: '김철수', level: 3 },
            ],
            loginUser: '',
        };
    },
    mounted() {
        this.loginUser = this.userList[0];
    },
    filters: {
        levelCheck(object, id) {
            if (object === undefined || object === null || object === '') {
                return -1;
            } else {
                let target = object.filter((object) => object.id === id);
                if (target.length === 0) {
                    return;
                } else {
                    return target[0].level;
                }
            }
        },
    },
};
</script> -->
