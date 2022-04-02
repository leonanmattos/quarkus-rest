package br.com.leonan.resource.config;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

	@Override
	public Response toResponse(ConstraintViolationException exception) {
		List<CustomConstraintViolation> response = exception.getConstraintViolations()
				.stream()
				.map(CustomConstraintViolation::new)
				.collect(Collectors.toList());

		return Response.status(Status.BAD_REQUEST)
				.entity(response)
				.build();
	}

}
