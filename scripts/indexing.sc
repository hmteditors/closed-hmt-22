
import scala.io.Source

val idxFile = "indices/venA-folioToImage.cex"

val lns = Source.fromFile(idxFile).getLines.toVector.filter(_.nonEmpty)

val idxV = lns.map(_.split("#")).filter(_.size == 3)

val idx = scala.collection.mutable.Map[String,String]()
for (arr <- idxV) {
  idx += (arr(0) -> arr(2))
}


def imgForPage(s: String): String = {
  idx(s)
}
