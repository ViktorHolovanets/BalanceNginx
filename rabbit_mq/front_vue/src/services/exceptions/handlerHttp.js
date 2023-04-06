export default function (promise){
    return {
        isError:true,
        message:promise.response.statusText,
        status:promise.response.status
    }

}