<html>
	<head>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	</head>
	<body>
		<p>Emily's Video Game Emporium</p>
		<form id="searchform" action="/search/search" method="get">
			<input id="query" type="text" name="name" value="" placeholder="Enter the name of a game" />
			<input id="searchbutton" type="submit" value="Search"/>
		</form>
		<script type="text/javascript">
			//var url="${url}";
			//function filterGames(result){
			//	return result.resource_type == 'game'
			//}

			/*$("#searchbutton").click(function (e) {
				var searchTerm = $("#query").val();
				url = url + "&query=" + searchTerm;

				$.ajax ({
				    type: 'GET',
				    dataType: 'jsonp',
				    crossDomain: true,
				    jsonp: 'json_callback',
				    url: 'https://www.giantbomb.com/api/search/?format=jsonp&api_key=42613e6f81a3747a5f0220586588cae83ae76f95&query=mario&field_list=name&resource_type=game,id',
				    complete: function() {
				        console.log('done');
				    },
				    success: function(data) {
				    	var results = data.results;
				    	var games = results.filter(filterGames);
				        console.log(games);

				    }
				});
			});*/
		</script>
	</body>
</html>
