package mdye_search_practice

import scala.annotation.tailrec

object SearchList {

  /**
   *  This function returns n from seq (if present) or the next element less than n. If the element doesn't exist, -1 is returned.
   *
   *  Problem is from https://www.linkedin.com/pulse/my-simple-coding-interview-question-wil-wen/ .
   *
   * @param n Int
   * @param seq Sorted ints with every element >= 0
   * @return n or next closest element in value that is less than n; -1 is returned if no qualifying element is present
   */
  def elementRelativeToTarget(seq: Seq[Int], n: Int): Int = {

    @tailrec
    def elementRelativeToTarget0(sub: Seq[Int]): Int = {
      if (sub == null || sub.isEmpty) -1
      else {
        val sel = sub(sub.size/2)
        if (n == sel) sel
        else if (sub.size == 1 && sub.head <= n) sub.head // necessary to get us the next smaller element to n if n isn't in seq
        else if (n <= sel) elementRelativeToTarget0(sub.slice(0, sub.size/2))
        else elementRelativeToTarget0(sub.slice(sub.size/2, sub.size+1))
      }
    }

    elementRelativeToTarget0(seq)
  }
}
