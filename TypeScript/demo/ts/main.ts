// // Interfaces 
// // Une interface est un contrat qui définit la forme d'un objet, elle spécifie les propriétés et leur types 
// // Certaine propriétés peuvent être marquées comme optionelles en utilisant '?'
// // readonly => empêche la modification après l'intialisation

// interface User {
//     readonly id: number,
//     name: string,
//     email?: string,
//     isActivate: boolean
// }

// let user : User = {
// id: 1,
// name : "Toto",
// email: "toto@gmail.fr",
// isActivate : true
// }

// // type alias => permet de créer un type perso

// type UserOrNull = User | null

// let user2 : UserOrNull = null

// let user3 : UserOrNull = {
//     id: 1,
//     name : "Toto",
//     email: "toto@gmail.fr",
//     isActivate : true
// }

// type Status = "active" | "inactive" | "suspendu"

// let userStatus : Status = "suspendu"

// type Admin = {
//     adminLevel : number,
//     mdp : string

// }

// type AdminUser = User & Admin

// let admin : AdminUser = {
//     id: 1,
//     name : "Toto",
//     email: "toto@gmail.fr",
//     isActivate : true,
//     adminLevel : 3,
//     mdp : "test"
// }
