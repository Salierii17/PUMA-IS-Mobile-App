function strlen(){
    let v1=document.getElementById('value1').value;
    let v2=document.getElementById('value2').value;
    x=v1.length;
    y=v2.length;

    if(x==0){
        document.getElementById("result").value=v2+" "+y; 
    }
    if(y==0){
        document.getElementById("result").value=v1+" "+x; 
    }
    if(x&y>0){
        document.getElementById("result").value=v1+" "+x+" "+" "+v2+" "+y; 
    }
    if(x==0 & y==0){
        document.getElementById("result").value="Please type word"; 
    }
}
    function onenumber(){
        let v1=parseInt(document.getElementById('value1').value);
        let v2=parseInt(document.getElementById('value2').value);

        if(v1%2==0 ){
            document.getElementById("result").value=v1 + " "+ "is"+" "+ "even";
        }
        if(v2%2==0){
            document.getElementById("result").value=v2 + " "+ "is"+" "+ "even";
        }
        if(v1>0 & v2>0){
            document.getElementById("result").value="Please click twonumbers button "
        }
        else{
            document.getElementById("result").value=(v1||v2)  + " "+ "is"+" "+ "odd"; 
        }
    }
    function twonumbers(){
        let v1=parseInt(document.getElementById('value1').value);
        let v2=parseInt(document.getElementById('value2').value);
    
        if(v1%2==0 & v2.length==0){
            document.getElementById("result").value=v1 + " "+ "is"+" "+ "even";
        }
        if(v2%2==0 & v1.length==0){
            document.getElementById("result").value=v2 + " "+ "is"+" "+ "even";
        }
        if(v1%2==0 & v2%2==0){
            document.getElementById("result").value=v1 + " "+ "is"+" "+ "even"+" "+"and"+" "+v2+" "+"is"+" "+"even";
        }
        if(v1%2>0 & v2%2>0){
            document.getElementById("result").value=v1 + " "+ "is"+" "+ "odd"+" "+"and"+" "+v2+" "+"is"+" "+"odd";
        }
        if(v1%2>0 & v2%2==0){
            document.getElementById("result").value=v1 + " "+ "is"+" "+ "odd"+" "+"and"+" "+v2+" "+"is"+" "+"even";
        }
        if(v1%2==0 & v2%2>0){
            document.getElementById("result").value=v1 + " "+ "is"+" "+ "even"+" "+"and"+" "+v2+" "+"is"+" "+"odd";
        }
        // else{
        //     document.getElementById("result").value="Please use onenumber button"
        // }
        
    }
   