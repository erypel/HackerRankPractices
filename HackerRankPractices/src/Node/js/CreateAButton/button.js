/**
 * 
 */
var button = document.createElement("button");
button.id = "btn";
button.innerHTML = 0;

button.onclick = function() {
    this.innerHTML++;
}

document.body.appendChild(button);