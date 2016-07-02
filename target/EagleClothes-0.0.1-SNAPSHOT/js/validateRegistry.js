var req;
var target;
var isIE;

function initRequest(url) {
	if (window.XMLHttpRequest) {
		req = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		isIE = true;
		req = new ActiveXObject("Microsoft.XMLHTTP");
	}
}
function validateEmail() {
	if (!target)
		target = document.getElementById("email");
	var url = "validateEmail?email=" + escape(target.value);

	initRequest(url);
	req.onreadystatechange = processRequest;
	req.open("GET", url, true);
	req.send(null);
}
function isValidPhone(phone) {
	var phoneRe = "^\\+?[0-9. ()-]{10,25}$";
	// var digits = phone.replace(/\D/g, "");
	return (phone.match(phoneRe) !== null);
}
function isValidEmail(email) {
	var pattern = new RegExp(
			/^[+a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i);
	return pattern.test(email);
	// var phoneRe = "^\\+?[0-9. ()-]{10,25}$";
	// var digits = phone.replace(/\D/g, "");
	// return (email.match(emailRe) !== null);
}
// fields required login-submit
$(document).ready(
		function() {
			$("#register-submit").click(
					function() {
						console.info("run");

						if ($("#phone").val() == ""
								|| !isValidPhone($("#phone").val())) {
							$("#phone").css("border", "red 2px solid")

						} else {

							if ($("#email").val() == ""
									|| !isValidEmail($("#email").val())) {
								$("#email").css("border", "red 2px solid");

							} else {
								if ($("#password").val() == ""
										|| ($("#password").val() != $(
												"#pre_password").val())) {
									$("#password").css("border",
											"red 2px solid");
								} else {
									$("#registration_form").submit();
								}
							}
						}

					});
		});
$(document)
		.ready(
				function() {
					$("#login-submit")
							.click(
									function() {
										console.info("run");
										console.info(!isValidPhone($(
												"#username").val()));
										console.info(!isValidEmail($(
												"#username").val()));
										if ($("#username").val() == ""
												|| (!isValidPhone($("#username")
														.val()) && !isValidEmail($(
														"#username").val()))) {
											$("#username").css("border",
													"red 2px solid")

										} else {
											if ($("#password_login").val() == "") {
												$("#password_login").css(
														"border",
														"red 2px solid");
											} else {
												$("#login_form").submit();
											}
										}

									});
				});
$(document)
		.ready(
				function() {
					$("#checkout_btn")
							.click(
									function() {
										console.info("run");
										var today = new Date();
										var dd = today.getDate();
										var mm = today.getMonth() + 1; // January
										// is 0!
										var yyyy = today.getFullYear();
										if (dd < 10) {
											dd = '0' + dd
										}
										if (mm < 10) {
											mm = '0' + mm
										}
										today = mm + '/' + dd + '/' + yyyy;
										var dateDeliver = new Date();
										deliver
										var dateDeliver = end_date.setDate(date
												.getDate()
												+ days);

										if ($("#dateReceice").val() == ""
												|| new Date($("#dateReceice")
														.val()).getTime() < dateDeliver
														.getTime()) {
											$("#dateReceice").val(
													dateDeliver.val());
										} else {

											if ($("#phoneReceice").val() == ""
													|| !isValidPhone($(
															"phoneReceice")
															.val())) {
												$("phoneReceice").css("border",
														"red 2px solid")

											} else {

												if ($("nameReceice").val() == "") {
													$("nameReceice").css(
															"border",
															"red 2px solid");
												} else {
													if ($("addressReceice")
															.val() == "") {
														$("addressReceice")
																.css("border",
																		"red 2px solid");
													} else {
														$("#checkout_form")
																.submit();
													}
												}
											}

										}

									});
				});
function processRequest() {
	if (req.readyState == 4) {
		if (req.status == 200) {
			var message = req.responseXML.getElementsByTagName("valid")[0].childNodes[0].nodeValue;
			setMessageUsingDOM(message);
			var submitBtn = document.getElementById("register-submit");
			if (message == "false") {
				submitBtn.disabled = true;
				} else {
					submitBtn.disabled = false;
				}
		}
	}
}
function setMessageUsingInline(message) {
	mdiv = document.getElementById("emailMessage");
	if (message == "false") {
		mdiv.innerHTML = "<div style=\"color:red\">Invalid User Id</div>";
	} else {
		mdiv.innerHTML = "<div style=\"color:green\">Valid User Id</div>";
	}
}
function setMessageUsingDOM(message) {
	var userMessageElement = document.getElementById("emailMessage");
	var messageText;
	if (message == "false") {
		userMessageElement.style.color = "red";
		messageText = "Invalid User Id";
	} else {
		userMessageElement.style.color = "green";
		messageText = "Valid User Id";
	}
	var messageBody = document.createTextNode(messageText);
	if (userMessageElement.childNodes[0]) {
		userMessageElement.replaceChild(messageBody,
				userMessageElement.childNodes[0]);
	} else {
		userMessageElement.appendChild(messageBody);
	}
}
function disableSubmitBtn() {
	var submitBtn = document.getElementById("submit_btn");
	submitBtn.disabled = true;
}