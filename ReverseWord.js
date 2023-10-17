var input = prompt("Please enter a sentence:");
var reversedWords = input
  .split(' ')
  .map(word => word.split('').reverse().join(''))
  .join(' ');

console.log(reversedWords);


