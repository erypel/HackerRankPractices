/**
 * 
 */
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    var vowels = ["a", "e", "i", "o", "u"];
    
    var i = 0;
    while(i < s.length)
    {
       if(vowels.includes(s.charAt(i)))
           {
               console.log(s.charAt(i));
           }
        i++;
    }
    
    i = 0;
    while(i < s.length)
    {
       if(!vowels.includes(s.charAt(i)))
           {
               console.log(s.charAt(i));
           }
        i++;
    }
}

function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}