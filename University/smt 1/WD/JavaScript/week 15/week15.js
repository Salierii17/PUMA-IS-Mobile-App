// string methods
function getvalue(){
    let v1=document.getElementById("value1").value;
    let v2=document.getElementById("value2").value;
    document.getElementById("result").value=v1+" "+v2;
}
function getlenght(){
    let v1=document.getElementById("value1").value;
    let v2=document.getElementById("value2").value;
    document.getElementById("result").value=v1.length + v2.length;
}
function getx(){
    let v1=document.getElementById("value1").value;
    let x =v1.length
    
    if (x<4){
        document.getElementById("result").value="negative input";
    }
    else{
        document.getElementById("result").value=x;
    }
}
function getchar() {
    var v1 = document.getElementById("value1").value;
    var x = v1.length;
    if (x < 8){
        document.getElementById("result").value = "Input 8 Character";
    }
    else if (x > 8) {
        document.getElementById("result").value = "Character that you input more than 8";
    }
    else{
        document.getElementById("result").value = x;
    }
}
function uppervar(){
    let v1=document.getElementById("value1").value;
    document.getElementById("result").value=v1.toUpperCase();
}
function lowervar(){
    let v1=document.getElementById("value1").value;
    document.getElementById("result").value=v1.toLowerCase();
}

function countvar(){
    let v1=document.getElementById("value1").value;
    let v2=document.getElementById("value2").value;
    let x = v1.length
    let count = 0

    for(let i=0; i<x; i++){
        if(v2[i] == 'a'){
            count += 1;
        }
        else if(v2[i] == 'i'){
            count += 1;
        }
        else if(v2[i] == 'u'){
            count += 1;
        }
        else if(v2[i] == 'e'){
            count += 1;
        }
        else if(v2[i] == 'o'){
            count += 1;
        }
    if(count>0){ 
    document.getElementById("result").value=count;
    }
    else{ 
    document.getElementById("result").value="try again";
    }
    }
}
//number methods
function plus(){
    let v1=parseInt(document.getElementById("value1").value);
    let v2=parseInt(document.getElementById("value2").value);
    let count_result= v1 + v2 ;
    return document.getElementById('result').value=count_result;
}
function minus(){
    let v1=document.getElementById("value1").value;
    let v2=document.getElementById("value2").value;
    let count_result= v1 - v2 ;
    document.getElementById('result').value=count_result;
}
function times(){
    let v1=document.getElementById("value1").value;
    let v2=document.getElementById("value2").value;
    let count_result= v1 * v2 ;
    document.getElementById('result').value=count_result;
}
function divide(){
    let v1=document.getElementById("value1").value;
    let v2=document.getElementById("value2").value;
    let count_result= v1 / v2 ;
    document.getElementById('result').value=count_result;
}
function getnumber(){


}
function pusharray(){
    const myarray = new array();
    myarray.push(document.getElementById("value1").value);

    return document.getElementById('demo').innerHTML=myarray;

}
function poparray(){
    const myarray = new array();
    myarray.pop(document.getElementById("value1").value);

    return document.getElementById('demo').innerHTML=myarray;

}






