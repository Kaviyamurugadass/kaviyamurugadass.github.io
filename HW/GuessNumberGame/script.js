const rand = Math.floor(Math.random()*11)

var chance = 10;
// var userInput = document.getElementById('userInput').value;

document.querySelector(".restart").addEventListener('click', function(){
    window.location.reload();
   
});

text="";
function check(){
    chance = chance-1;
    
    var a=document.getElementById("num").value;
    // console.log(a);
    // document.getElementById("m").innerHTML = a;
    
    if(a<rand){
        text = "Sad,☹️ Your guess is too low";
    }
    if(a>rand){
        text = "Sad,☹️ Your guess is too High";
    }
    if(a==(rand-1)||a==(rand+1)){
        text = "😀 You're guess nearly close";
    }
    if(a==null || a==""){
        text = "🥴Please enter the valid input";
    }
    if(a==rand){
        // document.getElementById("displayOutput").innerHTML = rand;
        
        document.getElementById("output").innerHTML =  "🤩 You won the match 🥳<br>The random number is: "+rand;
        document.getElementById("output1").innerHTML ="";
        document.getElementById("ans").innerHTML = rand;
        document.getElementById("score").innerHTML = "Your Score:"+chance+"<br>High Score:9";


        return;
    }
    if(chance<=0){
        document.getElementById("output").innerHTML = "🤕 YOU LOST THE GAME 👎🏻<br>The random number is: "+rand;
        document.getElementById("output1").innerHTML = "No More try :(";
        document.getElementById("ans").innerHTML = rand;
        return;
    }

   document.getElementById("output").innerHTML = text;
//    document.getElementById("demo").innerHTML = "a="+a;

   document.getElementById("output1").innerHTML = "Now You Have "+chance+" More Try";
  

}

function clue(){
    
    document.querySelector(".clue").innerHTML = "//Number between 0 to 10//";
    //    document.getElementById("demo").innerHTML = "The random number is: "+rand;

}
