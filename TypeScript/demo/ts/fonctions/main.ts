// Les fonction ts son définie 
// Avec l'ajout des types pour les params et le retour

function add(a: number, b: number): number {
    return a + b;
}

let result: number = add(2, 3);

//Paramètres avec valeur par défaut

function add2(a: number, b: number = 15): number {
    return a + b;
}

// fonction fléchée 

let maFonction = (x: number, y: number): number => {
    return x + y
}

// Fonction générique 

function test<T>(arg: T) : T {
    return arg
}