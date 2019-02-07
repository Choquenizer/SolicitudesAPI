package com.itau.solicitudes;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itau.solicitudes.data.entities.Solicitud;

@Configuration
public class WebConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		
		/*PropertyMap<Solicitud, com.itau.solicitudes.model.Solicitud> idSolicitudMap = new PropertyMap<Solicitud, com.itau.solicitudes.model.Solicitud>() {
		  protected void configure() {
		    map().getCliente().forEach(c -> c.setIdSolicitud(source.getIdSolicitud()));
		  }
		};
		modelMapper.addMappings(idSolicitudMap);*/
		
		modelMapper.addMappings(new PropertyMap<Solicitud, com.itau.solicitudes.model.Solicitud>() {
	        @Override
	        protected void configure() {
	        }
	    });

		modelMapper.getTypeMap(Solicitud.class, com.itau.solicitudes.model.Solicitud.class)
			.setPostConverter(context -> {
				com.itau.solicitudes.model.Solicitud target = context.getDestination();
				
				if (target.getCliente() != null) {
					target.getCliente().forEach(c -> c.setIdSolicitud(target.getIdSolicitud()));
				}
				
	            return target;
	        });
		
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		return modelMapper;
	}
}
