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
            count = count + 1;
        }
        else if(v2[i] == 'i'){
            count = count + 2;
        }
        else if(v2[i] == 'u'){
            count = count + 2;
        }
        else if(v2[i] == 'e'){
            count = count + 2;
        }
        else if(v2[i] == 'o'){
            count = count + 1;
        }
    if(count>0){ 
    document.getElementById("result").value=count;
    }
    else{ 
    document.getElementById("result").value="try again";
    }
    }
}
    



