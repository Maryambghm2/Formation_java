const citations = [
    "Tel un loup qui veille sur sa meute, tu avances avec prudence mais détermination. Tu sais quand agir et quand observer. La loyauté est ta plus grande force.",
    "À l’image du tigre qui bondit avec grâce et puissance, tu sais saisir ta chance au bon moment. Charismatique et audacieux, tu n’as pas peur de tracer ton propre chemin.",
    "Comme une chouette perchée dans le silence de la nuit, tu analyses chaque situation avec recul. Curieux et réfléchi, tu trouves des solutions là où les autres voient des obstacles."
];

export function getRandomQuote() {
    const index = Math.floor(Math.random() * citations.length);
    return citations[index];
}