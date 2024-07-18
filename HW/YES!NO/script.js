let spinButton = document.querySelector(".spinBtn");
let wheel = document.querySelector(".wheel");
// console.log(Math.floor(Math.random()*3600));
var value = Math.floor(Math.random()*3600);

spinButton.addEventListener("click",()=>{
    wheel.style.transform = "rotate(" +value+ "deg)";
    console.log(value)
    value += Math.floor(Math.random()*3600);
    console.log(value)
});

