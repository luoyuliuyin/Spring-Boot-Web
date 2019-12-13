/**
 * Created by luoyuliuyin on 16-6-15.
 * demo.js
 */

function alert_message() {
    $.ajax({
        url: "demo.json",
        success: function (data) {
            alert(data);
        },
        error: function () {
        }
    });
}