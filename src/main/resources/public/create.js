function myFunction() {
    var inpObj = document.getElementById("id1");
	var error = document.getElementById("errorOne");
	
	
  if (inpObj.value  === "") {
        error.innerHTML= "please Enter a phone number";
		console.log("please Enter a phone number");
	}
	else if(isNaN(inpObj.value)){
		error.innerHTML= "please only enter digits";
		console.log("please only enter digits");
	}
     else {
       	error.innerHTML= "Input Validated";
		console.log("Input Validated");
    } 

    inpObj = document.getElementById("id2");
	error = document.getElementById("errorTwo");
	
  if (inpObj.value  === "") {
        error.innerHTML= "please Enter a First Name";
		console.log("please Enter a First Name");
	}
   else if (inpObj.value.length >= 2){
       	error.innerHTML= "Input Validated";
		console.log("Input Validated");
    }
else{
	error.innerHTML= "Please Enter at least 2 Letters for your name";
	console.log("Please Enter at least 2 Letters for your name");
	}	


     inpObj = document.getElementById("id3");
	error = document.getElementById("errorThree");
	
  if (inpObj.value  === "") {
        error.innerHTML= "Please Enter a Birth Year";
		console.log("Please Enter at least 2 Letters for your name");
	}
   else if ((inpObj.value.length === 4)&& ( !isNaN(inpObj.value))){
       	error.innerHTML="Input Validated";
		console.log("Input Validated");
    }
else{
	error.innerHTML= "Please Enter a 4 digit year";
	console.log("Please Enter a 4 digit year");
	}	
}

function testFunction(){
	var testObj = document.getElementById("test");
	var error = document.getElementById("errorFour");
	
	if(testObj.value === ""){
		error.innerHTML = "Please Enter a Value";
		console.log("Please Enter a Value");
		}
	else{
		error.innerHTML = "Thank you for your input";
		console.log("Thank you");
		}
}