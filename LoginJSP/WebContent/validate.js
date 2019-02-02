function onvalidate() {
		var uname = document.getElementById('uname').value;
		var pass = document.getElementById('pass').value;
		var cpass = document.getElementById('cpass').value;
		var email = document.getElementById('email').value;
		var contact = document.getElementById('contact').value;

		if (uname=='') {
			alert("Username Invalid!");
			return false;
		}
		else if (pass=='') {
			alert("Password Required!");
			return false;
		}
		else if (pass!=cpass) {
			alert("Password not matched!");
			return false;
		}
		else if (email=='') {
			alert("Email invalid!");
			return false;
		}
		else if (contact=='') {
			alert("Enter valid contact number!");
			return false;
		}
		else {
			return true;
		}
	}
function loginvalidate() {
		var uname = document.getElementById('uname').value;
		var pass = document.getElementById('pass').value;

		if (uname=='') {
			alert("username required");
			return false;
		}
		else if (pass=='') {
			alert("password required");
			return false;
		}
		else{
			return true;
		}
	}
function booksValidate() {
		var sname = document.getElementById('sname').value;
		var sid = document.getElementById('sid').value;
		var bname = document.getElementById('bname').value;
		var bid = document.getElementById('bid').value;
		var bauthor = document.getElementById('bauthor').value;

		if (sname=='') {
			alert("Enter Student name");
			return false;
		}
		else if (sid=='') {
			alert("Enter Student id");
			return false;
		}
		else if (bname=='') {
			alert("Enter the Book name");
			return false;
		}
		else if (bauthor=='') {
			alert("Enter the Author of book");
			return false;
		}
		else if (bid=='') {
			alert("Enter Book id");
			return false;
		}
		else {
			return true;
		}
}
function booksValidate1() {
	var sname = document.getElementById('sname').value;
	var sid = document.getElementById('sid').value;
	var bname = document.getElementById('bname').value;
	var bid = document.getElementById('bid').value;
	var bauthor = document.getElementById('bauthor').value;

	if (sname=='') {
		alert("Enter Student name");
		return false;
	}
	else if (sid=='') {
		alert("Enter Student id");
		return false;
	}
	else if (bname=='') {
		alert("Enter the Book name");
		return false;
	}
	else if (bauthor=='') {
		alert("Enter the Author of book");
		return false;
	}
	else if (bid=='') {
		alert("Enter Book id");
		return false;
	}
	else {
		return true;
	}
}
