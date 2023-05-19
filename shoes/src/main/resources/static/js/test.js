//menu
function adjustMenu() {
    var e, i;
    769 <= ww ? (e = $(document).scrollTop(),
        i = $(".menufix").outerHeight(),
        $(window).scroll(function () {
            var t = $(document).scrollTop();
            i < t ? ($(".menufix").addClass("scroll"),
                $("nav.menu ul li.cart").show()) : ($(".menufix").removeClass("scroll"),
                $("nav.menu ul li.cart").hide()),
                e < t ? $(".menufix").removeClass("no-scroll") : $(".menufix").addClass("no-scroll"),
                e = $(document).scrollTop()
        })) : (e = $(document).scrollTop(),
        i = $(".header").outerHeight(),
        $(window).scroll(function () {
            var t = $(document).scrollTop();
            i < t ? $(".header").addClass("scroll") : $(".header").removeClass("scroll"),
                e < t ? $(".header").removeClass("no-scroll") : $(".header").addClass("no-scroll"),
                e = $(document).scrollTop()
        }))
}

$(document).ready(function () {
    $(".togglemenu").click(function () {
        $(".subnav").slideToggle("slow"),
            $("#over").toggle(),
            $(this).toggleClass("togglechange"),
            "Menu" == $(this).text() ? $(this).text("Đóng") : $(this).text("Menu"),
            $(".subnav").attr("id", "ToggleMenu")
    });
    adjustMenu();
});

// show tinh huyen xa
var citis = document.getElementById("city");
var districts = document.getElementById("district");
var wards = document.getElementById("ward");
var Parameter = {
    url: "https://raw.githubusercontent.com/kenzouno1/DiaGioiHanhChinhVN/master/data.json",
    method: "GET",
    responseType: "application/json",
};
var promise = axios(Parameter);
promise.then(function (result) {
    renderCity(result.data);
});

function renderCity(data) {
    for (const x of data) {
        citis.options[citis.options.length] = new Option(x.Name, x.Id);
    }
    citis.onchange = function () {
        district.length = 1;
        ward.length = 1;
        if (this.value != "") {
            const result = data.filter(n => n.Id === this.value);

            for (const k of result[0].Districts) {
                district.options[district.options.length] = new Option(k.Name, k.Id);
            }
        }
    };
    district.onchange = function () {
        ward.length = 1;
        const dataCity = data.filter((n) => n.Id === citis.value);
        if (this.value != "") {
            const dataWards = dataCity[0].Districts.filter(n => n.Id === this.value)[0].Wards;

            for (const w of dataWards) {
                wards.options[wards.options.length] = new Option(w.Name, w.Id);
            }
        }
    };
}

// info
function updownqty(t) {
    var e = document.Order.quantity.value;
    "up" == t ? parseInt(e) < 30 && e++ : "down" == t && 1 < e && e--,
        $("#qty").val(e)
}






