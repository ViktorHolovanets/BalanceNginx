import {createStore} from "vuex";

const store = createStore({
    state() {
        return {
            isAuth: localStorage.getItem('isAuth') === 'true' ? true: false,
            token: localStorage.getItem('token'),
            albums:[],
            artist:[],
            tracks:[],
        }
    },
    mutations: {
        CHANGE_TOKEN(state,token){
            state.token = token
        },
        CHANGE_TRACKS(state,tracks){
            state.tracks = tracks
        }
    },
    actions: {
        async TOGGLE_TOKEN({commit},token){
            commit('CHANGE_TOKEN',token)
        },
        async TOGGLE_TRACKS({commit},tracks){
            commit('CHANGE_TRACKS',tracks)
        },
        async TOGGLE_LOGAUT(state){
            state.isAuth = false;
        },
        async TOGGLE_LOGIN(state){
            console.log("TOGGLE_LOGIN");
            state.isAuth = true;
        },
    },
    getters: {
        STATE_AUTH(state) {
            return state.isAuth;
        },
        STATE_TOKEN(state) {
            return state.token;
        },
        STATE_TRACKS(state) {
            return state.tracks;
        }
    }
})
export default store