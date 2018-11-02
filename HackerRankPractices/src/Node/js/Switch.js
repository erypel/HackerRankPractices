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

function getLetter(s) {
    let letter;
    let aSet = ["a", "e", "i", "o", "u"];
    let bSet = ["b", "c", "d", "f", "g"];
    let cSet = ["h", "j", "k", "l", "m"];
    switch(true) {
        case aSet.includes(s[0]):
            letter = "A";
            break;
        case bSet.includes(s[0]):
            letter = "B";
            break;
        case cSet.includes(s[0]):
            letter = "C";
            break;
        case 'npqrstvwxyz'.includes(s[0]):
            letter = "D";
            break;
    }
        
        
    
    return letter;
}

function main() {
    const s = readLine();
    
    console.log(getLetter(s));
}