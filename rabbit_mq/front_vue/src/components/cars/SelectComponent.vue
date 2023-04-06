<template>
  <div>
    <div class="h3">{{ title }}</div>
    <div class="dropdown bootstrap-select">
      <select class="selectpicker  minWidth" @change="switchSelect($event)">
        <option value="null"> - -  - - </option>
        <option v-for="item in options" :key="item.id" :value="item.id">{{ item.name }}</option>
      </select>
    </div>
  </div>
</template>

<script>

export default {
  name: "SelectComponent",
  props: {
    options: [],
    title: String,
    callback: Function
  },
  methods: {
    switchSelect(ev) {
      let id = ev.target.value;
      console.log(id)
      if (id) {
        this.callback(id);
      }
    }
  }
}
</script>

<style scoped>
.minWidth{
  min-width: 250px;
}
</style>