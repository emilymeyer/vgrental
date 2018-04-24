package vgrental

import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import org.grails.web.json.JSONElement
import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse


@CompileStatic
class GameService implements GrailsConfigurationAware {

	String apiKey
	String gbUrl

	@Override
	void setConfiguration(Config co){
		apiKey = co.getProperty("giantBomb.apiKey")
		gbUrl = co.getProperty("giantBomb.url")
	}

	String buildUrl(){
		return "${gbUrl}/api/search/?api_key=${apiKey}"
	}

	//Implement this
	Game search(def searchTerm){
		RestBuilder rest = new RestBuilder()
		String url = "https://www.giantbomb.com/api/search/?api_key=42613e6f81a3747a5f0220586588cae83ae76f95&format=jsonp&query=mario&field_list=name&resource_type=game&json_callback=gamesCallback"
        System.out.println(url)
        RestResponse response = rest.get(url)
        System.out.println(response.statusCode.value());
        return new Game()
	}
}
