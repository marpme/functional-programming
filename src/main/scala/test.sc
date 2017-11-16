val l: List[(Int, String)] = List((1, "sa ns iafos ma a"), (2, "ijfs a a fg e"), (3, "fa asf gea"))

l.flatMap(k => k._2.split(' ')
  .map(word => (k._1, word)))
  .foldLeft(Map[String, List[Int]]())((map, word) =>
    map.get(word._2) match {
      case Some(element) => map ++ Map(word._2 -> (List(word._1) ++ element))
      case None => map ++ Map(word._2 -> List(word._1))
    }
  )
