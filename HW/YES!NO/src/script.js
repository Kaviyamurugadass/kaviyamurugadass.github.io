
// let spinButton = document.querySelector(".spinBtn");

export default ()=>{
    let wheel = document.querySelector(".wheel");
    var value = Math.floor(Math.random()*3600+3600);

    wheel.style.transform = "rotate(" +value+ "deg)";
    console.log(value)
    // value += Math.floor(Math.random()*5600);
    // console.log(value)
};
export const ARRAY_OBJ = [{
    num: '1',
    color: "#00ff00",
    child: 'YES',
},
{
    num: 2,
    color: 'rgb(255, 64, 0)',
    child: 'NO',
},
{
    num: 3,
    color: '#00ff00',
    child: 'YES',
},
{
    num: 4,
    color: 'rgb(255, 64, 0)',
    child: 'NO',
},
{
    num: 5,
    color: '#00ff00',
    child: 'YES',
},
{
    num: 6,
    color: 'rgb(255, 64, 0)',
    child: 'NO',
},
];

