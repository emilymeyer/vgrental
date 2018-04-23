package vgrental

class SearchController {
	GameService gameService

    def index() {
    	String url = gameService.buildUrl()
    	[url: url]
    }

    def search() {
    	Game game = gameService.search(params.name)
    	[game: game]
    }
}
