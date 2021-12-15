var title = document.getElementById("title");
var content = document.getElementById("content");
var btn = document.getElementById("btn");
var list = document.getElementById("list");

btn.addEventListener("click", function(){
    list.innerHTML = list.innerHTML + `
    <div class = "article";>
    <h2>${title.value}</h2>
    <p>${content.value}</p>
    </div>
;`   
title.value = "";
content.value = "";
})

function handle_click(){
    alert("叫你按就按阿?");
}
var img = document.getElementById("img");
img.addEventListener("mouseover", function(){
    this.src = "smile.jpg";
})
img.addEventListener("mouseout", function(){
    this.src = "hotpot1.jpg";
})
