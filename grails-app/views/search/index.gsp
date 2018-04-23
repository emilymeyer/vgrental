<html>
	<head>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	</head>
	<body>
		<p>Emily's Video Game Emporium</p>
		<form id="searchform" method="post">
			<input id="query" type="text" name="name" value="" placeholder="Enter the name of a game" />
			<input id="searchbutton" type="button" value="Search"/>
		</form>
		<script type="text/javascript">
			var url="${url}";
			$("#searchbutton").click(function (e) {
				var searchTerm = $("#query").val();
				url = url + "&query=" + searchTerm;
				$.get(url).done(function(data){
					console.log(data);
				});
			});
		</script>
	</body>
</html>
