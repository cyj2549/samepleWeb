package com.iinnoinc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {

    @Bean
    public TilesConfigurer tilesConfigurer() {
        final TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions(new String[] { 
           	"WEB-INF/config/tiles/tiles-config.xml"		,
           	
           	"WEB-INF/config/tiles/memo.xml"				,
           	"WEB-INF/config/tiles/main.xml"   			,
           	"WEB-INF/config/tiles/userinfo.xml"			,
          	"WEB-INF/config/tiles/board.xml"			,
                                   	
        });
        configurer.setCheckRefresh(true);
        return configurer;
    }

    @Bean
    public TilesViewResolver tilesViewResolver() {
        final TilesViewResolver resolver = new TilesViewResolver();
        resolver.setViewClass(TilesView.class);
        return resolver;
    }
}
