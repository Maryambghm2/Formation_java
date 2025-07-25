const contentDiv = document.getElementById("content") as HTMLDivElement
const changerTextBtn = document.getElementById("changeTextBtn") as HTMLButtonElement

changerTextBtn.addEventListener("click", () => {
    contentDiv.textContent = "le texte a changé";

})