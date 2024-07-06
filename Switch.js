if (new Date().getHours() < 20) {
    document.getElementById("demo").innerHTML = "Good day!";
  }
  else{
     document.getElementById("demo").innerHTML = "not a good day!";
  }
   
  var v =[34,35,36,74,36];
  let text = "";
  for(let i=0;i<v.length;i++)
  {
     text = text + v[i]+"<br>";
  }
  document.getElementById("d").innerHTML = text;
  
  var c = 0;
  while(c<6){
  text = text+"<b> While loop <br>"+c
   c++;
  
  }
  document.getElementById("de").innerHTML = text;
  let g;
  console.log("...."+c);
  switch(c){
  
  case 0:
  text ="zero";
  break;
  case 1:
  text = "one";
  break;
  case 5:
  text = "five";
  break;
  case 6:
  text = "six";
  
  }
  document.getElementById("dem").innerHTML = "number - "+text;
  
  function funadd(a,b){
   return a+b;
  }
  
  text = funadd(10,25);
  document.getElementById("dex").innerHTML = "Function for add "+text;
  