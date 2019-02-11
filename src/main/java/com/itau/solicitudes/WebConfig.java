package com.itau.solicitudes;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itau.solicitudes.data.entities.Cliente;
import com.itau.solicitudes.data.entities.Solicitud;

@Configuration
public class WebConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		
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
		
		
		modelMapper.addMappings(new PropertyMap<com.itau.solicitudes.model.Cliente, Cliente>() {
	        @Override
	        protected void configure() {
	        }
	    });

		modelMapper.getTypeMap(com.itau.solicitudes.model.Cliente.class, Cliente.class)
			.setPostConverter(context -> {
				Cliente target = context.getDestination();
				
				if (target != null && target.getIdCliente() != null && target.getIdCliente() == 0) target.setIdCliente(null);
				
	            return target;
	        });
		
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		return modelMapper;
	}
}
