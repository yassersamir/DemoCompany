$(document).ready( function () {
	var table = $('#emp-table').DataTable({
		 "ajax": {
	            "url": "http://localhost:8080/allEmployee",
	            "dataSrc": ""
	        },
			 columns: [
		        { data: 'id' },
		        { data: 'name' },
		        { data: 'email' },
		        { data: 'phone' },
		        { data: 'dept_id' }
		    ]
	 }
			 	 
	 );
    $("#btn").click(function(){
    	
     $.ajax({
    	    type: 'POST',
    	    url: "http://localhost:8080/employee",
    	    data: '{"name":'+'"'+$("#name").val().toString()+'"'+' ,"email":'+'"'+ $("#email").val().toString()+'"'+', "phone":'+'"'+$("#phone").val().toString()+'"'+' , "dept_id":'+ '"'+$("#department").val().toString()+'"'+' }',
    	    success: function(data) { alert('data: ' + data); },
    	    contentType: "application/json",
    	    dataType: 'json'
    	})
    	table.destroy();
    	$('#emp-table').DataTable({
   		 "ajax": {
   	            "url": "http://localhost:8080/allEmployee",
   	            "dataSrc": ""
   	        },
   			 columns: [
   		        { data: 'id' },
   		        { data: 'name' },
   		        { data: 'email' },
   		        { data: 'phone' },
   		        { data: 'dept_id' }
   		    ]
   	 }
   			 	 
   	 );
     });
} );
  