  $(document).ready(function(){
      $.getJSON("http://localhost:8080/statics/allEmpDept", function(result){
      $.each(result, function(i, field){
         var markup = "<tr><th scope='row'>"+( i + 1) +"</th><td>"+field.id +"</td><td>" + field.name + "</td><td>" + field.count + "</td></tr>";
            $("#table1").append(markup);
      });
    });
      $.getJSON("http://localhost:8080/statics/empOnlyDept", function(result){
          $.each(result, function(i, field){
             var markup = "<tr><th scope='row'>"+( i + 1) +"</th><td>"+field.id +"</td><td>" + field.name + "</td><td>" + field.count + "</td></tr>";
                $("#table2").append(markup);
          });
        });
      $.getJSON("http://localhost:8080/statics/deptNoneEmp", function(result){
          $.each(result, function(i, field){
             var markup = "<tr><th scope='row'>"+( i + 1) +"</th><td>"+field.id +"</td><td>" + field.name + "</td><td>" + field.count + "</td></tr>";
                $("#table3").append(markup);
          });
        });
    });