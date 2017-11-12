val l: List[String] = List("a", "b", "a", "b", "b", "a", "c")

/*l.foldRight[List[(String, Int)]](List[(String, Int)]()) ((s, c) => c.exists(w => s == w._1) {
  case true =>
})*/

l groupBy(w => w) map(x => (x._1, x._2.count(t => true)))
