<?php
<html lang="en">
<head>
    
    <link rel="stylesheet" href="/assets/style.css">
    <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta charset="utf-8">
    <script>async function run(){
  document.getElementById("text").innerHTML = "Fatal Accident";
    }
    </script>
    
    <script>
        window.addEventListener('load', function(){
            document.querySelector('input[type="file"]').addEventListener('change',function(){
                if(this.files && this.files[0]){
                    var img=document.querySelector('img');
                    img.src=URL.createObjectURL(this.files[0]);
                    img.onload=loadedimage;
                }
            });
        });
        
        function loadedimage(){
            alert("Image Successfully Uploaded");
        }</script>
        
    <script>
        window.addEventListener('load', function(){
            document.querySelector('input[type="file"]').addEventListener('change',function(){
                if(this.files && this.files[0]){
                    var img=document.querySelector('img');
                    img.src=URL.createObjectURL(this.files[0]);
                    img.onload=loadedimage;
                }
            });
        });
        
        function loadedimage(){
            alert("Image Successfully Uploaded");
        }
    </script>

</head>

<body>
    
    <div class="jumbotron">
        <p>Warehouse Accident Detection</p>   
        <img id="img" src="#" width="300px" height="300px">
        <p></p>
        <input type="file"> <button onclick="run()">Detect</button>
        <h3>Image Detected as : <h5 id="text" style="display:inline;"></h5> </h3>
    </div>    
    


    </body>
    </html>

?>
