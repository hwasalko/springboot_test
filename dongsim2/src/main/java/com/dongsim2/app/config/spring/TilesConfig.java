package com.dongsim2.app.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration


public class TilesConfig {


	@Bean(name="tilesConfigure")
	public TilesConfigurer tilesConfigurer() {

		final TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions(new String[] { "/WEB-INF/tiles/tiles.xml" });
		configurer.setCheckRefresh(true);

		return configurer;
	}


	@Bean(name="viewResolver")
	public TilesViewResolver tilesViewResolver() {
		TilesViewResolver resolver = new TilesViewResolver();
		resolver.setViewClass(TilesView.class);
		resolver.setOrder(1);

		return resolver;

	}



}

