
  $(document).ready(function(){
  
	 
	  
	  
  $("#weightEnter").hide()
    $("#weightEnter2").hide()
	var cluster;
	var loose;
	var regex = /^[0-9\b]+$/;
  $("#button").bind("click",function(){
		  
		$("#form1").hide(); 	
		$("#weightEnter").show()
		  cluster=$("#cluster").val();
		 // alert(cluster);
		   loose=$("#loose").val();
		  
		 var inner="";
		 for(var i=1; i<=cluster;i++){
		 
		inner=inner+"<p><input type='text' name='clustertray"+i+"'  placeholder='Cluster Tomato Tray "+i+"'></input></p>";
		}
		$("#textField").html(inner);
});
	
	
$("#clusterButton").bind("click",function(){
	  $("#weightEnter").hide();
	  $("#weightEnter2").show();
	  
	  //alert(cluster);
	   
	 var inner="";
	 for(var i=1; i<=loose;i++){
	inner=inner+"<p><input type='text' name='loosetray"+i+"' placeholder='Loose Tomato Tray "+i+"'></input></p>";
	}
	$("#textField2").html(inner);
}); 



	
	var clusterJavaVal=clusterSize;
	var clusterPot=[];
	
	var inner="";
	for(var i=0; i<clusterJavaVal;i++){
		var j=i+1;
		clusterPot[i]=0;
			
	inner=inner+"<p><h2>Block "+j+" (max size) "+clusterTrayMax[i]+"</h2><h2 id='h2"+j+"'>Contains 0</h2><input type='button' id='clustertraymain"+j+"' value='Put in "+j+"'></input></p>";
	
	}
	
	$("#clusterMain").html(inner);

	var loosePot=[];
	var looseJavaVal=looseSize;
	var inner="";
	for(var i=0; i<looseJavaVal;i++){
		
		var j=i+1;
		loosePot[i]=0;
	inner=inner+"<p><h3>Block "+j+"  (max size) "+looseTrayMax[i]+"</h3><h3>Contains "+loosePot[i]+"</h3><input type='button' id='loosetraymain"+j+"' value='Put in "+j+"'></input></p>";
	}
	$("#looseMain").html(inner);
	//alert(document.getElementById("clusterGenerate"));
	
	
	
	
	
	
	
	//inserting value in cluster pots
	

		$("#clustertraymain1").on("click",function(){
				
			
			insertCluster(0);
		});
	
		$("#clustertraymain2").bind("click",function(){
			
			insertCluster(1);
		});
		
		$("#clustertraymain3").bind("click",function(){
			
			insertCluster(2);
		});
		
		$("#clustertraymain4").bind("click",function(){
			
			insertCluster(3);
		});
		
		$("#clustertraymain5").bind("click",function(){
			
			insertCluster(4);
		});
		
		$("#clustertraymain6").bind("click",function(){
			
			insertCluster(5);
		});
		
	
		
		function insertCluster(index){
			var clusterTrayMaxVal=clusterTrayMax[index];
			var clusterGenerate=samplex;
			
			if((clusterTrayMaxVal-clusterPot[index])>clusterGenerate){

				clusterPot[index]=clusterGenerate;
				var inner2="";
				for(var val1=0;val1<clusterJavaVal;val1++){
					var index2=val1+1;
					inner2=inner2+"<p><h2>Block "+j+"  (max size) "+clusterTrayMax[val1]+"</h2><h2>Contains "+clusterPot[val1]+"</h2><input type='button' id='clustertraymain"+index2+"' value='Put in "+index2+"'></input></p>";
					$("#clusterMain").html(inner2);
					
				}
				var inner3=0.0;
				$("#clusterGenerate").html(inner3);
			}
			else{
				alert("Over Flow");
			}
		}

		
		//inserting in loose
		$("#loosetraymain1").on("click",function(){

			alert("clickl");
			insertloose(0);
		});
		$("#loosetraymain2").bind("click",function(){
			
			insertloose(1);
		});
		$("#loosetraymain3").bind("click",function(){
	
			insertloose(2);
		});
		$("#loosetraymain4").bind("click",function(){
			
			insertloose(3);
		});
		$("#loosetraymain5").bind("click",function(){
			
			insertloose(4);
		});
		$("#loosetraymain6").bind("click",function(){
			
			insertloose(5);
		});
		$("#loosetraymain7").bind("click",function(){
			
			insertloose(6);
		});
	
		function insertloose(index){
			var looseTrayMaxVal=looseTrayMax[index];
			var looseGenerate=samplex;
			
			if((looseTrayMaxVal-loosePot[index])>looseGenerate){
				var innerx="";
				
				loosePot[index]=looseGenerate;
				for(var val1=0;val1<looseJavaVal;val1++){
					
					var index2=val1+1;
					innerx=innerx+"<p><h3>Block "+j+"  (max size) "+looseTrayMax[val1]+"</h3><h3>Contains "+loosePot[val1]+"</h3><input type='button' id='loosetraymain"+index2+"' value='Put in "+index2+"'></input></p>";
					
					$("#looseMain").html(innerx);

				}
				var inner3=0.0;
				$("#looseGenerate").html(inner3);
			}
			else{
				alert("Over Flow");
			}
		} 
			
		$("#commit").bind("click",function(){
			  $("#mainform").hide();
			  
			
		});
		
		
		
		
  });
