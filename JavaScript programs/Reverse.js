function reverseWordsInSentence(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}
let sentence = "This is a sunny day";
let reversed = reverseWordsInSentence(sentence);
console.log(reversed); 
