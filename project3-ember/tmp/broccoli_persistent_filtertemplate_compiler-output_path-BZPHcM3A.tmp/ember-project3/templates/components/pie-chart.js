export default Ember.HTMLBars.template({"id":"jspNsjqb","block":"{\"symbols\":[\"&default\"],\"statements\":[[7,\"center\"],[9],[7,\"h1\"],[9],[0,\"Week 10\"],[10],[10],[0,\"\\n\"],[7,\"br\"],[9],[10],[0,\"\\n\"],[7,\"h4\"],[9],[0,\"             \\n    \"],[7,\"b\"],[9],[0,\"Batch ID:\"],[10],[0,\" 1234\"],[7,\"br\"],[9],[10],[0,\"\\n    \"],[7,\"b\"],[9],[0,\"Batch Name:\"],[10],[0,\" ArlingtonJava\"],[7,\"br\"],[9],[10],[0,\"\\n    \"],[7,\"b\"],[9],[0,\"Trainer:\"],[10],[0,\" Mehrab Rahman\"],[7,\"br\"],[9],[10],[0,\"\\n\"],[10],[0,\" \\n\"],[7,\"br\"],[9],[10],[0,\"\\n\"],[7,\"br\"],[9],[10],[0,\"   \\n\"],[7,\"div\"],[11,\"class\",\"container\"],[9],[0,\"\\n    \"],[7,\"center\"],[9],[0,\"\\n    \"],[7,\"div\"],[11,\"class\",\"row\"],[9],[0,\"\\n        \"],[7,\"div\"],[11,\"class\",\"col\"],[9],[0,\"\\n            \"],[7,\"h1\"],[9],[0,\"QC Result\"],[10],[0,\"\\n            \"],[7,\"canvas\"],[11,\"id\",\"QCChart\"],[11,\"width\",\"400\"],[11,\"height\",\"400\"],[9],[10],[0,\"\\n            \"],[7,\"br\"],[9],[10],[0,\"\\n            \"],[7,\"h3\"],[9],[0,\"QC Score: 80\"],[10],[0,\"\\n        \"],[10],[0,\"\\n        \"],[7,\"div\"],[11,\"class\",\"col\"],[9],[0,\"\\n            \"],[7,\"h1\"],[9],[0,\"Survey Result\"],[10],[0,\"\\n            \"],[7,\"canvas\"],[11,\"id\",\"SurveyChart\"],[11,\"width\",\"400\"],[11,\"height\",\"400\"],[9],[10],[0,\"\\n            \"],[7,\"br\"],[9],[10],[0,\"\\n            \"],[7,\"h3\"],[9],[0,\"Survey Score: 100\"],[10],[0,\"\\n        \"],[10],[0,\"\\n    \"],[10],[0,\"\\n    \"],[10],[0,\"\\n    \"],[7,\"br\"],[9],[10],[0,\"\\n    \"],[7,\"br\"],[9],[10],[0,\"\\n    \"],[7,\"div\"],[11,\"class\",\"row\"],[9],[0,\"\\n        \"],[7,\"div\"],[11,\"class\",\"col\"],[9],[0,\"\\n            \"],[7,\"h4\"],[9],[0,\"\\n                \"],[7,\"b\"],[9],[0,\"Associate:\"],[10],[0,\" \"],[7,\"br\"],[9],[10],[0,\"\\n                \"],[7,\"b\"],[9],[0,\"Location:\"],[10],[0,\" Arlington\"],[7,\"br\"],[9],[10],[0,\"\\n                \"],[7,\"b\"],[9],[0,\"Skill Type:\"],[10],[0,\" Java\"],[7,\"br\"],[9],[10],[0,\"\\n                \"],[7,\"b\"],[9],[0,\"End Date:\"],[10],[0,\" 2018-09-14\"],[7,\"br\"],[9],[10],[0,\"\\n                \"],[7,\"b\"],[9],[0,\"Weeks:\"],[10],[0,\"b>10\"],[7,\"br\"],[9],[10],[0,\"\\n                \"],[7,\"b\"],[9],[0,\"Category:\"],[10],[0,\" Devops\"],[7,\"br\"],[9],[10],[0,\"\\n                \"],[7,\"b\"],[9],[0,\"Report Time:\"],[10],[0,\" \"],[7,\"br\"],[9],[10],[0,\"               \\n            \"],[10],[0,\"\\n        \"],[10],[0,\"\\n        \"],[7,\"div\"],[11,\"class\",\"col\"],[9],[0,\"\\n           \\n        \"],[10],[0,\"\\n    \"],[10],[0,\"    \\n\"],[10],[0,\"\\n\\n\"],[7,\"script\"],[9],[0,\"\\nvar ctx = document.getElementById(\\\"QCChart\\\").getContext('2d');\\nvar myChart = new Chart(ctx, {\\n   type: 'pie',\\n   data: {\\n       labels: [\\\"Red\\\", \\\"Green\\\", \\\"Yellow\\\"],\\n       datasets: [{\\n           label: '# of Votes',\\n            //data: [12, 19, 3],\\n           data: [12,12 ,5],\\n           backgroundColor: [\\n               'rgba(255, 99, 132, 0.2)',\\n               'rgba(75, 192, 192, 0.2)',\\n               'rgba(255, 206, 86, 0.2)',\\n               'rgba(255, 159, 64, 0.2)'\\n           ],\\n           borderColor: [\\n               'rgba(255,99,132,1)',\\n               'rgba(75, 192, 192, 1)',\\n               'rgba(255, 206, 86, 1)',\\n               'rgba(255, 159, 64, 1)'\\n           ],\\n           borderWidth: 1\\n       }]\\n   },\\n   options: {\\n       scales: {\\n       }\\n   }\\n});\\n\"],[10],[0,\"\\n\"],[7,\"script\"],[9],[0,\"\\nvar ctx = document.getElementById(\\\"SurveyChart\\\").getContext('2d');\\nvar myChart = new Chart(ctx, {\\n   type: 'pie',\\n   data: {\\n       labels: [\\\"Red\\\", \\\"Green\\\", \\\"Yellow\\\"],\\n       datasets: [{\\n           label: '# of Votes',\\n           data: [12,12 ,5],\\n           backgroundColor: [\\n               'rgba(255, 99, 132, 0.2)',\\n               'rgba(75, 192, 192, 0.2)',\\n               'rgba(255, 206, 86, 0.2)',\\n               'rgba(255, 159, 64, 0.2)'\\n           ],\\n           borderColor: [\\n               'rgba(255,99,132,1)',\\n               'rgba(75, 192, 192, 1)',\\n               'rgba(255, 206, 86, 1)',\\n               'rgba(255, 159, 64, 1)'\\n           ],\\n           borderWidth: 1\\n       }]\\n   },\\n   options: {\\n       scales: {\\n       }\\n   }\\n});\\n\"],[10],[0,\"\\n\"],[14,1]],\"hasEval\":false}","meta":{"moduleName":"ember-project3/templates/components/pie-chart.hbs"}});