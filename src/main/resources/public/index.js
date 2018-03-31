	$(document).ready(function(){
		$.ajax({
			url: '/employees',
			method: 'GET'
		}).then(function(employees) {
			for(var i = 0; i < employees.length; i++) {
				console.log(employees[i]);
						
			var row = "<tr>" +
						  "<td>" + employees[i].employeeId + "</td>" +
						  "<td>" + employees[i].firstName + "</td>" +
						  "<td>" + employees[i].lastName + "</td>" + 
						  "<td>" + employees[i].age + "</td>" + 
						  "<td>" + employees[i].isActive + "</td>"
					  "</tr>";
			
					  $("table").append(row);
		}
	});
	

	
	
	
	});