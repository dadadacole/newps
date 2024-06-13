<template>
  <div id="app">
    <ExpenseForm
      :transactions="transactions"
      @add-transaction="addTransaction"
      @delete-transaction="deleteTransaction"
      @update-transaction="updateTransaction"
    />
  </div>
</template>

<script>
import ExpenseForm from '../components/ExpenseForm.vue';

export default {
  name: 'InOut',
  props: ['transactions'],
  components: {
    ExpenseForm,
  },
  methods: {
    addTransaction(date, transaction) {
      this.$emit('update-transactions', date, transaction);
    },
    deleteTransaction(id) {
      this.$emit('delete-transaction', id);
    },
    updateTransaction(transaction) {
      this.$emit('update-transactions', transaction);
    },
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
