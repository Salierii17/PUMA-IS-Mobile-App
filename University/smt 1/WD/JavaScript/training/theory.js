// string,number,array js //

// string js //

function strlen(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    document.getElementById("result").value=v1.length+v2.length;
}
function slc(){
    let v1=document.getElementById("value1").value;
    let v2=document.getElementById("value2").value;
    document.getElementById("result").value=v1.slice(4,7)+" "+v2.slice(3,6);
}
function replace(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    document.getElementById("result").value=v1.replace(v1,"master"+" "+v1+" "+v2);
}
function toUpperCase(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    document.getElementById("result").value=v1.toUpperCase()+" "+ v2.toUpperCase();
}
function toLowerCase(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    document.getElementById("result").value=v1.toLowerCase()+" "+ v2.toLowerCase();
}
function trim(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    document.getElementById("result").value=v1.trim()+' '+v2.trim();
}
function padStart(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    document.getElementById("result").value=v1.padStart(6,'master')+v2;
}
function charAt(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    let x=v1.charAt(0)+" "+ v2.charAt(0)+" "+v3.charAt(0);
    let big=x.toUpperCase()
    document.getElementById("result").value=big;
}
//string search//
function indexof(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    document.getElementById("result").value=v1.indexOf("sulthan");
}
function lastindexof(){
    let v1=document.getElementById('value1').value;
    let x=v1.toString()
    let v2=document.getElementById('value2').value;
    document.getElementById("result").value=v1.lastIndexOf('sulthan');
}
function search(){
    let v1=document.getElementById('value1').value;
    let x=v1.toString()
    document.getElementById("result").value=x.search('sulthan');
}
function match(){
    let v1=document.getElementById('value1').value;
    document.getElementById("result").value=v1.match(/tan/i);
}
function matchall(){
    let v1=document.getElementById('value1').innerHTML;
    document.getElementById("demo").innerHTML=v1.matchAll(/Cats/g);
}
function includes(){
    let v1=document.getElementById('value1').value;
    document.getElementById("result").value=v1.includes("sulthan");
}
function startswith(){
    let v1=document.getElementById('value1').value;
    document.getElementById("result").value=v1.startsWith("sulthan");
}
function endswith(){
    let v1=document.getElementById('value1').value;
    document.getElementById("result").value=v1.endsWith(".");
}

//JS number methods //

function Addition(){
    v1=parseInt(document.getElementById("value1").value);
    v2=parseInt(document.getElementById("value2").value);
    x=v1+v2;
    document.getElementById("result").value=x;
}
function Subtraction(){
    v1=document.getElementById("value1").value;
    v2=document.getElementById("value2").value;
    x=v1-v2;
    document.getElementById("result").value=x;
}
function Multiplication(){
    v1=document.getElementById("value1").value;
    v2=document.getElementById("value2").value;
    x=v1*v2;
    document.getElementById("result").value=x;
}
function Division(){
    v1=document.getElementById("value1").value;
    v2=document.getElementById("value2").value;
    x=v1/v2;
    document.getElementById("result").value=x;
}
function Exponentiation(){
    let v1=document.getElementById("value1").value;
    let v2=document.getElementById("value2").value;
    x=v1**v2 
      
    document.getElementById("result").value=x;
}
function Modulus(){
    v1=document.getElementById("value1").value;
    v2=document.getElementById("value2").value;
    x=v1%v2;
    document.getElementById("result").value=x;
}
function tostring(){
    v1=document.getElementById("value1").value;
    v2=document.getElementById("value2").value;
    document.getElementById("result").value=v1.toString()+v2.toString();
}
function toexponential(){
    let v1=parseFloat(document.getElementById("value1").value);
    let v2=parseFloat(document.getElementById("value2").value);
    document.getElementById("result").value=v1.toExponential()+v2.toExponential();
}
function tofixed(){
    let v1=parseFloat(document.getElementById("value1").value);
    let v2=parseFloat(document.getElementById("value2").value);
    document.getElementById("result").value=v1.toFixed(0)+v2.toFixed(0);
}
//membulatkan//
function toprecision(){ 
    let v1=parseFloat(document.getElementById("value1").value);
    document.getElementById("result").value=v1.toPrecision(2);
}
function valueof(){
    let v1=parseFloat(document.getElementById("value1").value);
    document.getElementById("result").value=v1.valueOf();
}
function date(){
    let v1=document.getElementById("value1").value;
    let x= new Date(v1)
    document.getElementById("result").value=Number(x);
}
function infinite(){
    let v1=document.getElementById("value1").value;
    let txt= ""
    while(v1 !=Infinity){
        v1=v1*v1
        txt= txt + v1+" "
    }
    document.getElementById("result").value=txt;
}
function getnumber(){
    if(document.getElementById("one").value ==1){
    x=document.getElementById("value1").value == "test";
    }
    document.getElementById("value1").value == "test";
    }
    if(document.getElementById("two").value == 2){
    document.getElementById("value2").value == "no";
}


// Number.isInteger()	Returns true if the argument is an integer
// Number.isSafeInteger()	Returns true if the argument is a safe integer
// Number.parseFloat()	Converts a string to a number
// Number.parseInt()	Converts a string to a whole number

// array js //
function newArray(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    document.getElementById("demo").value=name;
}
function loopArray(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    let Nlen=name.lenght;
    let text="<ul>";
    for(let i=0; i < Nlen; i++){
        text+="<li>"+name[i]+"</li>";
    }
    text+="</ul>";
    document.getElementById("demo").value=text;
}
function tostring(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    document.getElementById('demo').value=name.toString();
}
function join(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    document.getElementById('demo').value=name.join(" "); 
}
function pushArray(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2);
    name.push(v3);
    document.getElementById("demo").value=name;
}
function popArray(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    name.pop(v2);
    document.getElementById("demo").value=name;
}
function shft(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    return document.getElementById('demo').value=name.shift("zimran"); 
}
function unshft(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    document.getElementById('demo').value=name.unshift(name[0]); 
}
function changeArray(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    name[0]="Master"
    document.getElementById("demo").value=name;
}
function lenArray(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    document.getElementById("demo").value=name.length;
}
function concat(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name1 =new Array(v1,v3);
    const name2 = new Array(v2);
    const allname=name1.concat(name2);
    document.getElementById("demo").value=allname;
}
function type(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3);
    document.getElementById("demo").value=typeof name;
}
function splice(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3)
    document.getElementById("demo").value=name.splice(1, 0, "mastah");
}
function slice(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    let v3=document.getElementById('value3').value;
    const name =new Array(v1,v2,v3)
    document.getElementById("demo").value=name.slice(1);
}
