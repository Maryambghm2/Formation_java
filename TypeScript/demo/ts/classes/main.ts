class User {
    // Propriétés
    readonly id: number
    private name: string
    protected email: string

    constructor(id: number, name: string, email: string) {
        this.id = id
        this.name = name
        this.email = email
    }

    getDetail(): string {
        return `Id : ${this.id} - Name : ${this.name} - Email : ${this.email}`
    }
}

let user = new User(4, "Toto", "toto@gmail.fr");

