// 1. Nombre pair ou impair
function estPair(n){
    if (n % 2 == 0){
        return true;
    } else {
        return false;
    }
}

// console.log(estPair(1));

// console.log(estPair(10));

// 2. Plus grand nombre
function plusGrand(a, b){
    if (a > b) {
        return a
    } else {
        return b
    }
}

// console.log(plusGrand(10, 0))

// 3. Somme d’un tableau
function somme(tab) {
    let result = 0;
    for (i = 0 ; i < tab.length; i++){
        result += tab[i];
    }
return result;
}

const tab1 = [10,400,0.5,3,12]
// console.log(somme(tab1))

// 4. Trouver le plus petit nombre dans un tableau
function plusPetit(tab) {
    let nombre = 100;
    for (i = 0; i< tab.length; i++){
        while (nombre > tab[i]){
nombre = tab[i];
        }
    }
    return nombre;
}

// console.log(plusPetit(tab1));

// 5. Inverser une chaîne
function inverser(chaine){
    return chaine.split("").reverse().join("");
}

// console.log(inverser("Bonjour"))

function tableMultiplication(n){
    let result = 0;
    for (i = 0; i < 10; i++){
      n*i;
    }
    return result;
}

console.log(tableMultiplication(5));
