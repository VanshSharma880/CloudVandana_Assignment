
const prompt = require ("prompt-sync")();
function reverseWord(word) {
    return word.split('').reverse().join('');
  }
  
  function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(reverseWord);
    return reversedWords.join(' ');
  }
   
  const inputSentence = prompt("Enter a sentence:");
  
  const reversedSentence = reverseWordsInSentence(inputSentence);
  
  console.log("Original Sentence: " + inputSentence);
  console.log("Reversed Sentence: " + reversedSentence);
  