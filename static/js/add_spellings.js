function addSpellings() {
    var data = $('form').serializeArray().reduce(function(obj, item) {
    obj[item.name] = item.value;
    return obj;
}, {});
    console.log(data);
	var word = data["word"];
	var spellings = data["spellings"].split(",");
    var italicized = document.getElementById("italicized").checked;
	$.ajax({
		url: "/add_word_spellings",
		type: "POST",
		async: true,
		cache: false,
		contentType: 'application/json',
		dataType: 'json',
		timeout: 10000,
		moreTries: 15,
		data: JSON.stringify({
			"word": word,
            "spellings": spellings,
            "italicize": italicized,
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
                alert("You already added " + word + " to the database");
            }
		},
		success: function (result) {
			console.log(result);
            window.location.replace("http://rdl-halakha-formatter.onrender.com/words#" + word);
		}
	})
    return false;
}