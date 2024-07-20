import click from './script.js';
import {ARRAY_OBJ} from './script.js'
function MyHeader(){
    return(
<div className="w3-display-topmiddle ">
        <h1 style={{color:'black',padding:15,fontSize:60,textShadow:'2px 4px 2px black',fontWeight:600}}><span style={{color: '#00ff00'}}>YES</span>/<span style={{color: '#de1212'}}>NO</span>
        </h1>
    <main style={{fontWeight:500,fontSize:15,fontFamily: "system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif"}}>
        "Are you feeling too confused to make a decision? Let's spin the wheel and let it make the decision for you."</main>
</div>);
}
function YesNO({num,color,child}){
    return(
        // <div className="yn" style={{'--num': {num}, '--color': {color}}}><span>{child}</span></div>  

    <div>
      <div className="yn" style={{'--num': 1, '--color': '#00ff00'}}><span>YES</span></div>  
        <div className="yn" style={{'--num':2, '--color':'rgb(255, 64, 0)'}}><span>NO</span></div> 
        <div className="yn" style={{'--num':3, '--color':'#00ff00'}}><span>YES</span> </div>  
        <div className="yn" style={{'--num':4, '--color':'rgb(255, 64, 0)'}}><span>NO</span></div> 
        <div className="yn" style={{'--num':5, '--color':'#00ff00'}}><span>YES</span> </div>
        <div className="yn" style={{'--num':6, '--color':'rgb(255, 64, 0)'}}><span>NO</span></div>  
        </div>
    );
}
export default function App() {
  return (
    <div>
     <MyHeader />
<div className="w3-display-middle">
    
<div className="container">
    <div className="spinBtn" onClick={click}>Spin!</div>
    <div className="wheel">
     <YesNO {...ARRAY_OBJ[0]}/>
     <YesNO {...ARRAY_OBJ[1]}/>
     <YesNO {...ARRAY_OBJ[2]}/>
     <YesNO {...ARRAY_OBJ[3]}/>
     <YesNO {...ARRAY_OBJ[4]}/>
     <YesNO {...ARRAY_OBJ[5]}/>
     </div>
    </div>
</div>
</div>
  );
}