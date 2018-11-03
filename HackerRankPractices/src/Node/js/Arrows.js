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
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 * 
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    for(let i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
                {
                   let double = a => {return a * 2;}
                   nums[i] = double(nums[i]);
                }
            else
                {
                   let triple = a => {return a * 3;}
                   nums[i] = triple(nums[i]);
                }
        }
    return nums;
}

function main() {
    const n = +(readLine());
    const a = readLine().split(' ').map(Number);
    
    console.log(modifyArray(a).toString().split(',').join(' '));
}