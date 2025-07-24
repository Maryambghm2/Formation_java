let number = 5;

const age = 14;
alert('Hello World');

let isTrue = true;


let string = "Coucou";

const formule = `le result de ${1+5}`;

console.log(string, formule)

function sayHelloToSomeone(name){
    console.log(`Hello ${name}`);
}

sayHelloToSomeone("Eric");

// Paramètre par défaut
function sayHelloMessage(from, message = "pas de message") {
    console.log(`${from}: ${message}`);
}

sayHelloMessage("Benoit")
sayHelloMessage("Benoit", "Bonjour");

// Retourner un résultat 
function premierLettre(word){
    return word.charAt(0);
}
console.log(premierLettre("Toto"));

// Expression de fonction 
const estPair = function (nombre){
    return nombre % 2 === 0;
}

// console.log(estPair(12));
// console.log(estPair("14"));
// console.log(estPair("toto"));

function calculator(number1, number2, callback){
    return callback(number1, number2);
}

function addition(number1, number2){
    return number1 + number2;
}

console.log(calculator(1, 1, addition));

console.log(calculator(2, 2, (number1, number2) => number1 - number2));

// Fonction fléchées 

// Return implicite lorsq'uon est sur la meme ligne 
const division = (number1, number2) => number1 / number2;

// Omission des parenthèses lorsq'uil ny'a qu'un seul paramètre 

const logName = name => console.log(name);

let jourSemaine = [];

// AJout un élément en fin de tableau
jourSemaine.push("Lundi");

// Ajout de plusieurs éléments
jourSemaine.push('Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi', "Dimanche");

console.table(jourSemaine);

// Trouver l'index d"un élémént 
let indexMardi = jourSemaine.indexOf("Mardi");
console.log(indexMardi);

// Découpe d'un tableau (début, fin)
console.table(jourSemaine.splice(3, 5));

delete jourSemaine[1];

console.table(jourSemaine);

// La propriete length renvoie la taille 
console.log(jourSemaine.length);

// Ajout d'un élément à l'index 100
jourSemaine[100] = "toto";