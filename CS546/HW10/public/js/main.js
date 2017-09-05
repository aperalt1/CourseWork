(function($) {
  const theForm = $("#email-form");
  const theEmail = $("#the-email");
  const theMessage = $("#the-message");
  const theResult = $("#the-result");

  theForm.submit(e => {
    e.preventDefault();
    const formData = {
      email: theEmail.val(),
      message: theMessage.val()
    };

    $.ajax({
      type: "POST",
      url: "http://localhost:3000/",
      data: JSON.stringify(formData),
      success: function(data) {
        theResult.text(data.reply);
      },
      contentType: "application/json",
      dataType: "json"
    });
  });
})(jQuery); // jQuery is exported as $ and jQuery
