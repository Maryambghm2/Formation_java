// Function utilitaire : retourner une promess qui se résout après un certain délai

function attendre(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}



// Fonction d'animation de nos barres 
function animerProgress(id, duree) {
    var progress = document.querySelector(`#${id} progress`);
    progress.value = 0;

    const increment = 5;
    const interval = duree / (100 / increment);

    return new Promise(resolve => {
        const timer = setInterval(() => {
            progress.value += increment;

            if (progress.value >= 100) {
                clearInterval(timer);
                resolve();
            }

        }, interval)
    });
}

// Fonction principale = lancer les 3 étapes de la mission

async function lancerMission() {
    // Réinitialisation des messages et barres de progression
    document.getElementById("resultat").textContent = "";


    resetEtapes();
    // TODO Reset étapes
    try {

        // Etape 1 : Préparation 
        await animerProgress("preparation", 2000);
        document.querySelector("#preparation p").textContent = "Colis préparé avec succès."

        // Etape 2 : Expédition 
        await animerProgress("expedition", 1200);
        document.querySelector("#expedition p ").textContent = "Colis expédié."

        // Etape 3 : Livraison
        await animerProgress("livraison", 2500);
        document.querySelector("#livraison p").textContent = "Colis livré avec succès."

        // Résultat final
        document.getElementById("resultat").textContent = "Livraison terminé avec succès";
    } catch (error) {
        document.getElementById("resultat").textContent = "Erreur lors de la mission : " + error;
    }

}

// Lancement de la mission au clic 

document.getElementById("go").addEventListener("click", lancerMission);


// Function utilitaire pour réinitialiser les textes et barres de progression
function resetEtapes() {
    const etapes = [
        { id: "preparation", texte: "Préparation du colis" },
        { id: "expedition", texte: "Expédition en cours..." },
        { id: "livraison", texte: "Livraison en cours..." },
    ]

    etapes.forEach(etape => {
        const section = document.getElementById(etape.id);
        section.querySelector(".status").textContent = etape.texte;
        section.querySelector("progress").value = 0;
    })
}