package vgrental

import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import org.grails.web.json.JSONElement


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
		return "${gbUrl}/api/search/?api_key=${apiKey}&field_list=name&resources=game"
	}

	//Implement this
	Game search(def searchTerm){
        return new Game()
	}
}
