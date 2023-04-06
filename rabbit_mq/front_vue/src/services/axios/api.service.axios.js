import axios from 'axios';
import exception from "../exceptions/handlerHttp";

class ApiService {
    constructor(baseURL) {
        this.http = axios.create({
            baseURL: baseURL
        });
    }

    async get(path, config) {
        return new Promise(async (resolve, reject) => {
            await this.http.get(path, config).then(response => {
                resolve(response.data)
            }).catch(ex => {
                console.log(ex);
                resolve(exception(ex));
            });

        })
    }

    async post(path, data, config) {
        return new Promise(async (resolve, reject) => {
            await this.http.post(path, data, config).then(response => {
                resolve(response.data)
            }).catch(ex => {
                console.log(ex);
                resolve(exception(ex));
            });

        })
    }


    async put(path, data, config) {

        return new Promise(async (resolve, reject) => {
            await this.http.put(path, data, config).then(response => {
                resolve(response.data)
            }).catch(ex => {
                console.log(ex);
                resolve(exception(ex));
            });

        })
    }


}

//HOST
export default new ApiService("http://localhost/java");
// export default ApiService;
