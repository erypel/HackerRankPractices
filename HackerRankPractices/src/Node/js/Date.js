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

//The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
function getDayName(dateString) {
    let dayName;
    // Write your code here
    let date = new Date(dateString);
    let millisSince1970 = date.getTime();
    let secondsSince1970 = millisSince1970/1000;
    let minutesSince1970 = secondsSince1970/60;
    let hoursSince1970 = minutesSince1970/60;
    let daysSince1970 = hoursSince1970/24;
    
    //January 1, 1970 was a thursday
    let dayNumber = daysSince1970 % 7;
    switch (dayNumber){
        case 0:
            dayName = "Thursday";
            break;
        case 1:
            dayName = "Friday";
            break;
        case 2:
            dayName = "Saturday";
            break;
        case 3:
            dayName = "Sunday";
            break;
        case 4:
            dayName = "Monday";
            break;
        case 5:
            dayName = "Tuesday";
            break;
        case 6:
            dayName = "Wednesday";
            break;
    }
    
    return dayName;
}

function main() {
    const d = +(readLine());
    
    for (let i = 0; i < d; i++) {
        const date = readLine();
        
        console.log(getDayName(date));
    }
}