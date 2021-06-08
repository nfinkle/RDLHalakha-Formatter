function deleteSpelling() {
    var data = $('form').serializeArray().reduce(function(obj, item) {
    obj[item.name] = item.value;
    return obj;
}, {});
    console.log(data);
	var word = data["word"];
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
            "spelling": word
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
                alert("There is no " + word + " in the database");
            }
		},
		success: function (result) {
			console.log(result);
            window.location.replace("http://rdlhalakha-formatter.herokuapp.com/words#" + word);
		}
	})
    return false;
}