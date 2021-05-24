function deleteSpelling(spelling) {
	$.ajax({
		url: "/delete_spelling",
		type: "POST",
		async: true,
		cache: false,
		contentType: 'application/json',
		dataType: 'json',
		timeout: 10000,
		moreTries: 15,
		data: JSON.stringify({
            "spelling": spelling,
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
		},
		success: function (result) {
			console.log(result);
            location.reload();
		}
	})
    return false;
}