package test

class Test {

    String username

    static constraints = {
        username blank: false, unique: true, email: true
    }

    def setUsername(String username) {
        this.username = username
    }
}
