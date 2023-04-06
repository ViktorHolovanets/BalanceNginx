import {defineStore} from "pinia";
import api from '../services/axios/api.service.axios'

export const carStore = defineStore('post', {
    state: () => ({
        mark: [],
        model: [],
        generation: [],
        configuration: [],
        modification: [],
    }),
    actions: {
        getMark() {
            api.post('marks').then(data => this.mark = data)
            this.model = [];
            this.generation = [];
            this.configuration = [];
            this.modification = [];
        },

        getModel(paramId) {
            api.post('models', this.createFormData('markId',paramId)).then(data => {
                console.log(data);
                this.model = data;
            })
            this.generation = [];
            this.configuration = [];
            this.modification = [];
        },
        getGeneration(paramId) {
            api.post('generations', this.createFormData('modelId',paramId)).then(data => this.generation = data)
            this.configuration = [];
            this.modification = [];
        },
        getConfiguration(paramId) {
            api.post('configurations', this.createFormData('generationId',paramId)).then(data => this.configuration = data)
            this.modification = [];
        },
        getModification(paramId) {
            api.post('modifications', this.createFormData('configurationId',paramId)).then(data => this.modification = data)
        },
        createFormData( name,  value){
            let f=new FormData();
            f.append(name,value)
            return f;
        }
    }
})