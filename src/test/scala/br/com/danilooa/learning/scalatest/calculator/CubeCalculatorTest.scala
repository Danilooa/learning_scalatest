package br.com.danilooa.learning.scalatest.calculator

class CubeCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
}
