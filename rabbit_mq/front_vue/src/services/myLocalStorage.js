
export default {
    setItem(name, item, ttl = 3600) {
        const data = {
            value: item,
            time: Date.now(),
            ttl: ttl
        };
        localStorage.setItem(name, JSON.stringify(data));
    },

    getItem(name) {
        const data = JSON.parse(localStorage.getItem(name));
        if (data) {
            const now = Date.now();
            const age = now - data.time;
            if (age > data.ttl) {
                localStorage.removeItem(name);
                return null;
            }
            return data.value;
        }
        return null;
    }
}


