<script setup>
import { RouterLink, RouterView } from 'vue-router'
import {toast} from "vue3-toastify";
import socket from "@/services/socketIo";
import {onMounted, onUnmounted} from "vue";
const doSendMessage = () => {
  console.log("sendMessage")
  socket.emit("new-message", "Hello World")
}
onMounted( () => {
  socket.on("new-message", (data) => {
    console.log(data)
    toast.info("New Message component " + data.username + " : " + data.message)
  })
})
onUnmounted( () => {
  MySocketIo.off("new-message");
})
</script>

<template>
 <div>Text</div>
</template>

<style>

</style>
