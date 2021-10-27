# -JOBB-JAVA-SWING-APPLICATION-USING-NETBEANS-
<br>

JOBB is java swing application which is used in textile manufacturing industry.


# Technologies:

Java<br>
Database: MySQL<br>
Java Applet<br>

# Screenshots:

![image](https://user-images.githubusercontent.com/29841028/139048495-2c7125ab-e21b-4e19-a942-2a91efb1989d.png)


<br>it is divided into 3 category named 
1. Packaging Slip 
2. MeterMade
3. Tax Invoice


![image](https://user-images.githubusercontent.com/29841028/139047749-3e07d508-4188-4489-9a3e-3c2ad09c6473.png)

Packaging slip will keep record of manufactured parsals of sarees containing details of sarees like size in mts 5, 5.5, fold, design no, fresh and damage pieces containing in that parsal with lot number to keep track of raw material used to manufacture exact fresh pieces and damage material will made return.

![image](https://user-images.githubusercontent.com/29841028/139048760-4ed95914-3ab3-4e84-87df-707782dcc960.png)
In Meter-Made new lot is added with total receievd raw material from party to manucfature sarees. it has all necessary fields including gst too.


![image](https://user-images.githubusercontent.com/29841028/139048572-317c934c-645d-4170-8877-2e7c8359720c.png)

Tax-invoice is final step to end the ongoing lot on manufacturing plant. Here we can make final inovoice and print it out including all fields ready and calculated automatically are listed below

Total unused meter 
Total Value of Supply
Net Taxable value
CGSR + IGST + SGST 
Total Bill Amount to be paid


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}
body {font-family: Verdana, sans-serif;}
.mySlides {display: none;}
img {vertical-align: middle;}

/* Slideshow container */
.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
}
</style>
</head>
<body>

<h2>Automatic Slideshow</h2>
<p>Change image every 2 seconds:</p>

<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="img_nature_wide.jpg" style="width:100%">
  <div class="text">Caption Text</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="img_snow_wide.jpg" style="width:100%">
  <div class="text">Caption Two</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="img_mountains_wide.jpg" style="width:100%">
  <div class="text">Caption Three</div>
</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>

</body>
</html> 
