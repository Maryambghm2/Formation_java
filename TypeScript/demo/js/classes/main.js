class User {
    constructor(id, name, email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    getDetail() {
        return `Id : ${this.id} - Name : ${this.name} - Email : ${this.email}`;
    }
}
let user = new User(4, "Toto", "toto@gmail.fr");
