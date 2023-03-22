import {io} from "socket.io-client"
import {toast} from "vue3-toastify"

let socket = io('http://localhost')

socket.on ('connect', () => {
    console.log('Connect')
    toast.info('Socket Connect')
})
socket.on ('my-name-is', (data) => {
    console.log('my-name-is'+data)
    toast.info('Socket Connect')
})
socket.on ('error', () => {
    console.log('Error')
    toast.error('Socket Error')
})

console.log('Socket Start')

export default socket