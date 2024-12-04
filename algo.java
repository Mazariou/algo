function analyzeSentence(sentence) {
    // Variables pour compter les éléments
    let length = 0;      // Compteur pour la longueur de la phrase
    let wordCount = 0;   // Compteur pour le nombre de mots
    let vowelCount = 0;  // Compteur pour le nombre de voyelles

    // Liste des voyelles pour la comparaison
    const vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'];

    // Parcours de chaque caractère de la phrase
    for (let i = 0; i < sentence.length; i++) {
        // Mettre à jour le compteur de longueur
        length++;

        // Vérifier si le caractère est une voyelle
        if (vowels.includes(sentence[i])) {
            vowelCount++;
        }

        // Vérifier si le caractère est un espace (pour compter les mots)
        if (sentence[i] === ' ' && i > 0 && sentence[i - 1] !== ' ') {
            wordCount++;
        }
    }

    // Si la phrase n'est pas vide, ajouter 1 au compteur de mots pour le dernier mot
    if (sentence.length > 0 && sentence[sentence.length - 2] !== ' ') {
        wordCount++;
    }

    // Affichage des résultats
    console.log("Longueur de la phrase : " + length);
    console.log("Nombre de mots : " + wordCount);
    console.log("Nombre de voyelles : " + vowelCount);
}

// Exemple d'utilisation
let sentence = "Bonjour tout le monde.";  // La phrase se termine par un point
analyzeSentence(sentence);
