function deleteSpelling(spelling) {
	return new Promise(function(resolve,reject) {
		$.ajax({
		url: "/delete_spelling",
		type: "POST",
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
					reject(error);
				}
				else {
					console.log(error);
					$('button').prop("disabled", false);
					reject(error);
				}
			}
			else {
				console.log(error);
				reject(error);
			}
		},
		success: function (result) {
			console.log(result);
            location.reload();
			resolve(result);
		}
	})
});
}