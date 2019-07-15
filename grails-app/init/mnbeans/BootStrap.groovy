package mnbeans

import grails.ExampleService

class BootStrap {

    ExampleService exampleService

    def init = { servletContext ->
        exampleService.something()
    }

    def destroy = {
    }
}
