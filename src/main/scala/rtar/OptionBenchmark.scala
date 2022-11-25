package rtar

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Param
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State

@State(Scope.Benchmark)
class OptionBenchmark {

  @Param(Array("4"))
  var param: java.lang.Long = null

  @Benchmark
  def testOptionOriginal(): Any = {
    val value: java.lang.Long = 4L
    Option(value).map(_ * 2).getOrElse(1L)
  }

  @Benchmark
  def testNullOriginal(): Any = {
    val value: java.lang.Long = 4L
    if (value != null) value * 2 else 1L
  }

  @Benchmark
  def testPlusOriginal(): Any = {
    val value: java.lang.Long = 4L
    if (value != null) (value + 1) * 2 else 1L
  }

  @Benchmark
  def testOptionWithParameter(): Any = {
    Option(param).map(_ * 2).getOrElse(1L)
  }

  @Benchmark
  def testNullWithParameter(): Any = {
    if (param != null) param * 2 else 1L
  }

  @Benchmark
  def testPlusWithParameter(): Any = {
    if (param != null) (param + 1) * 2 else 1L
  }

}
