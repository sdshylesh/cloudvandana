function reverseSentence(sentence) {
    var splittedWords = sentence.split(" ");

    var reversedWords = [];

    for (var i = 0; i < splittedWords.length; i++) {
        var splittedWord = splittedWords[i];
        var reversedWord = reverseWord(splittedWord);
        reversedWords.push(reversedWord);
    }

    var reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

function reverseWord(word) {
    console.log(word.split(""))
    return word.split("").reverse().join("");
}


var sentenceInput = "this is javaScript code";
var reversedSentence = reverseSentence(sentenceInput);
console.log(reversedSentence);
