// Types primitifs 

// number
// TS utilise le type number pour les nombres, à virgule ou entier.

//let age: number = "test"
let age : number = 40

// string 
let firstanem: string = "Toto"


//boolean
let isDone: boolean = false;

// any 
// Le type any permet de désactiver le typage d'une variable 
// Cela peut être  utile quand on veut utiliser une variable sans connaitre son type exacte à l'avance

let randomValue: any = 10;
randomValue = "Hello"

// null et undefined 
// Ces deux types représentent l'absence de valeur.

let a: undefined = undefined
let b: null = null

// array

let list: number[] = [1, 2, 3, 4, 5, 6]
let fruit: string[] = ["Pomme", "Poire"]

let autreList: Array<number> = [1, 2]

//tuple 
// Les tuples permettent de créer des tableaux de taille fixe

let person: [string, number, string]
person = ["Toto", 20, "Tata"]