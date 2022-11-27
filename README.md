# option-benchmark

The idea of this repository is to check if benchmark mentioned in http://blog.vorona.ca/scala-option-performance-cost.html is built wrongly. It moves a parameters into JMH parameter to ensure it is not eliminated by JIT when the code is compiled. I have no idea if what I am doing is a correct way to do this though.

See https://twitter.com/abstract_artem/status/1596080570865713152 for more details.

My first run on a totally unscientific setup shows that, while version with parameter is slower, it is slower for all benchmarks, hence the original point stated by the author of that blog post is not disproved.
