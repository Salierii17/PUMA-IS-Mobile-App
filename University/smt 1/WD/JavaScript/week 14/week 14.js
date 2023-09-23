//String Length//
let text1='sza';
let length=text1.length;
document.getElementById('len').innerHTML=length;

// string slice //
let list="apple, banana, lemon"
let part= list.slice(7,13);
document.getElementById('slice').innerHTML=part;

// string substring //
let part2= list.substring(-7,13)
document.getElementById('substring').innerHTML=part2;

// string substr //
let part3= list.substr(7,6);
document.getElementById('substr').innerHTML=part3;

// replace //
function myfunction(){
    let text = document.getElementById('replace').innerHTML;
    document.getElementById('replace').innerHTML=
    text.replace("Microsoft","Kairosoft");
}
// replaceall //
let text = "I love dogs. Dogs are very easy to love. Dogs are very popular";
text = text.replaceall("Dogs","Cats");
text = text.replaceall("dogs","cats");

document.getElementById("rall").innerHTML=text;



