<template>
  <div id="app">
    <ExpenseForm
      :transactions="transactions"
      @add-transaction="addTransaction"
      @delete-transaction="deleteTransaction"
      @update-transaction="updateTransaction"
      @load-transactions="setTransactions"
    />
  </div>
</template>

<script>
import ExpenseForm from '../components/ExpenseForm.vue';

export default {
  name: 'InOut',
  components: {
    ExpenseForm,
  },
  data() {
    return {
      transactions: {
        users: [],
        expenditures: [],
      },
    };
  },
  methods: {
    addTransaction(transaction) {
      const category = transaction.type === 'income' ? 'users' : 'expenditures';
      this.transactions[category].push(transaction);
    },
    deleteTransaction(id) {
      this.transactions.users = this.transactions.users.filter(
        (transaction) => transaction.id !== id
      );
      this.transactions.expenditures = this.transactions.expenditures.filter(
        (transaction) => transaction.id !== id
      );
    },
    updateTransaction(updatedTransaction) {
      const category =
        updatedTransaction.type === 'income' ? 'users' : 'expenditures';
      const index = this.transactions[category].findIndex(
        (transaction) => transaction.id === updatedTransaction.id
      );
      if (index !== -1) {
        this.transactions[category].splice(index, 1, updatedTransaction);
      }
    },
    setTransactions(data) {
      this.transactions = data;
      console.log('Transactions loaded:', this.transactions);
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
