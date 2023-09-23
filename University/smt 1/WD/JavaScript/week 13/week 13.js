//addition on javascript//
let x = addition(3,5);
document.getElementById('demo1').innerHTML=x;
function addition(x,y){
    return x+y;
    }
//substraction on javascript//
let y = substraction(3,5);
document.getElementById('demo2').innerHTML=y;
function substraction(x,y){
    return x-y;
}
//Mutliple on javascript//
let z = mutliple(3,5);
document.getElementById('demo3').innerHTML=z;
function mutliple(x,y){
    return x*y;
}
//division on javascript//
let w = Division(3,5);
document.getElementById('demo4').innerHTML=w;
function Divided(x,y){
    return x/y;
    }

//alerts methods//
alert('Welcome back master');

//let methods//
let FirstName,SecondName,ThirdName;
    FirstName='Sulthan';
    SecondName='Zimran';
    ThirdName='Alrazzaq';
let FullName=FirstName+' '+SecondName+' '+ThirdName

document.getElementById('name1').innerHTML='Good Morning mastah'+' '+FullName
document.getElementById('name2').innerHTML=FullName; 

//var methods//
var Fname,Sname,Tname;
var Fname="Sulthan";
var Sname="Zimran";
var Tname="Alrazzaq";
function callMyName(a,b,c){
    var name="Hi my name is"+" "+a+b+c;
    return name;
}
document.getElementById('name3').innerHTML=callMyName(Fname,Sname,Tname);

//let and function methods//
let a= callMyName(Sulthan,Zimran,Alrazzaq);
function callMyName(f,s,t){
    let name = "My name is"+' '+f+ " "+s+" "+t
    return name;
}
document.getElementById('call').innerHTML=a;
