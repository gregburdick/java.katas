import spock.lang.Specification

class testRandomNumberMethod extends Specification {

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "test RandomNumberGenerator exists and returns a non-null value"() {
        given:

        when: "object is instantiated"
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator()

        then:
        randomNumberGenerator.hasProperty("randomNumberGenerator")
    }
}