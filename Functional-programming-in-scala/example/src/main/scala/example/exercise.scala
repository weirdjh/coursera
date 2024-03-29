package example

object experimanet {

	def quickSort[T](xs: List[T])(p: (T,T) => Boolean) : List[T] = {
		xs match{
			case Nil => Nil
			case _ =>
				val x = xs.head
				val (left, right) = xs.tail.partition(p(_,x))
				val left_sorted = quickSort(left)(p)
				val right_sorted = quickSort(right)(p)
				left_sorted ::: (x :: right_sorted)
		}

	}

}

