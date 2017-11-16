val l: List[String] = List("a", "b", "a", "b", "b", "a", "c")
val m: Map[String, Int] = Map()

l.map(string => (string, 1)).foldLeft(m)(
  (map, tuple) => map.get(tuple._1) match {
    case Some(element) => map ++ Map(tuple._1 -> (element + 1))
    case None => map ++ Map(tuple._1 -> 1)
  }
)


