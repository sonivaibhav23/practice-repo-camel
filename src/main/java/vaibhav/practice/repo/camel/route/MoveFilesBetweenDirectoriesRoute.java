package vaibhav.practice.repo.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MoveFilesBetweenDirectoriesRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("file:data/input?noop=true").to("file:data/output");
	}

}
