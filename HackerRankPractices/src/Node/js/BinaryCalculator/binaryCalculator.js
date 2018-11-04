/**
 * 
 */
var res = document.getElementById('res');

function clickZero() { res.innerHTML += '0'; }

function clickOne() { res.innerHTML += '1'; }

function clickClr() { res.innerHTML = ''; }

function clickEql() {
    var expr = res.innerHTML;
    var nums = /(\d+)/g;
    // Replace all base 2 nums with base 10 equivs
    expr = expr.replace(nums, function(match) {
        return parseInt(match, 2);
    })
    // eval in base 10 and convert to base 2
    res.innerHTML = eval(expr).toString(2);
}

function clickSum() { res.innerHTML += '+'; }

function clickSub() { res.innerHTML += '-'; }

function clickMul() { res.innerHTML += '*'; }

function clickDiv() { res.innerHTML += '/'; }
