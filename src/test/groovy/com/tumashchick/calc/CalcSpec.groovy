package com.tumashchick.calc

import spock.lang.Specification

class CalcSpec extends Specification {

    def "test calc" (){

        setup:"setup"
        Calc calc = new Calc()
        calc.first = 2
        calc.second = 3

        when: "call plus"
        def sum = calc.plus()

        then: "Sum"
        sum == 5
    }


}
