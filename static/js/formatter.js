function format() {
	var input = document.getElementById("code_form").elements[0].value;
	$('button').prop("disabled", true)
	console.log(document.getElementById("HTML_STUFF").innerText);
	document.getElementById("HTML_STUFF").innerHTML = "";
	$.ajax({
		url: "/format",
		type: "POST",
		async: true,
		cache: false,
		contentType: 'application/json',
		dataType: 'json',
		timeout: 30000,
		moreTries: 2,
		data: JSON.stringify({
			"text": input,
		}),
		error: function (xhr, textStatus, error) {
			console.log("trial = " + this.moreTries);
			if (textStatus == 'timeout') {
				this.moreTries--;
				if (this.moreTries > 0) {
					console.log("Trying again.")
					$.ajax(this);
					return;
				}
				else {
					console.log(error);
					$('button').prop("disabled", false);
				}
			}
			else {
				console.log(error);
			}
		},
		success: function (result) {
			console.log(result);
	        document.getElementById("HTML_STUFF").innerHTML = result;
			$('button').prop("disabled", false);
		}
	})
}