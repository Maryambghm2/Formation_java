const contentDiv = document.getElementById("content");
const changerTextBtn = document.getElementById("changeTextBtn");
changerTextBtn.addEventListener("click", () => {
    contentDiv.textContent = "le texte a changé";
});
