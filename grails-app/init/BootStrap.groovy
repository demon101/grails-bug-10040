import test.Test

class BootStrap {

    def init = { servletContext ->

        new Test(username: '1111').save(flush:true)
    }
    def destroy = {
    }
}
