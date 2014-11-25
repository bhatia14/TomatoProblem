
var samplex;

function createRequestObject() {
    var tmpXmlHttpObject;
    
    //depending on what the browser supports, use the right way to create the XMLHttpRequest object
    if (window.XMLHttpRequest) { 
        // Mozilla, Safari would use this method ...
        tmpXmlHttpObject = new XMLHttpRequest();
	
    } else if (window.ActiveXObject) { 
        // IE would use this method ...
        tmpXmlHttpObject = new ActiveXObject("Microsoft.XMLHTTP");
    }
    
    return tmpXmlHttpObject;
}

//call the above function to create the XMLHttpRequest object
var http = createRequestObject();

function makeGetRequest(a) {
	
	sample=a;
    //make a connection to the server ... specifying that you intend to make a GET request 
    //to the server. Specifiy the page name and the URL parameters to send
	if(a==1){
    http.open('get', 'test.jsp');
	
    //assign a handler for the response
    http.onreadystatechange = processResponse;
	}
	if(a==2){
		http.open('get', 'loose.jsp');
		
	    //assign a handler for the response
	    http.onreadystatechange = processResponse;
	}
    //actually send the request to the server
    http.send(null);
}

function processResponse() {
    //check if the response has been received from the server
    if(http.readyState == 4){
	
        //read and assign the response from the server
        var response = http.responseText;
	
        //do additional parsing of the response, if needed
        
        
        //in this case simply assign the response to the contents of the <div> on the page.
        if(sample==1){
        	document.getElementById('clusterGenerate').innerHTML = response;
        	samplex=document.getElementById('clusterGenerate').innerHTML;
        }
		if(sample==2){
			document.getElementById('looseGenerate').innerHTML = response;
			samplex=document.getElementById('looseGenerate').innerHTML;
		}
        //If the server returned an error message like a 404 error, that message would be shown within the div tag!!. 
        //So it may be worth doing some basic error before setting the contents of the <div>
		
    }

    
}

