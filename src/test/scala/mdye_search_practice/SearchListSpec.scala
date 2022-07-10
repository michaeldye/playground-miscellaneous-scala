package mdye_search_practice

import org.scalatest.flatspec.AnyFlatSpec

class SearchListSpec extends AnyFlatSpec {

  "SearchList.elementRelativeToTarget" should "find trivial n present in given even-qty seq" in {
    assert(5 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9), 5))
  }

  "SearchList.elementRelativeToTarget" should "find trivial n present in given odd-qty seq" in {
    assert(5 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9, 12), 5))
  }

  "SearchList.elementRelativeToTarget" should "find trivial n present in first half of given seq" in {
    assert(3 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9, 12), 3))
  }

  "SearchList.elementRelativeToTarget" should "find n present at min in given seq" in {
    assert(1 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9, 12), 1))
  }

  "SearchList.elementRelativeToTarget" should "find n present at max in given seq" in {
    assert(12 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9, 12), 12))
  }

  "SearchList.elementRelativeToTarget" should "find n present in last half of given seq" in {
    assert(9 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9, 12), 9))
  }

  "SearchList.elementRelativeToTarget" should "return -1 if empty seq is given" in {
    assert(-1 == SearchList.elementRelativeToTarget(Seq.empty[Int], 12))
  }

  "SearchList.elementRelativeToTarget" should "return -1 if null seq is given" in {
    assert(-1 == SearchList.elementRelativeToTarget(null, 12))
  }

  "SearchList.elementRelativeToTarget" should "return -1 if small, invalid n is given" in {
    assert(-1 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9), -3))
  }

  "SearchList.elementRelativeToTarget" should "find nearest value less than n in first half of given seq" in {
    assert(3 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9), 4))
  }

  "SearchList.elementRelativeToTarget" should "find nearest value less than n in last half of given seq" in {
    assert(8 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 12), 11))
  }

  "SearchList.elementRelativeToTarget" should "find min closest in given seq" in {
    assert(1 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9), 2))
  }

  "SearchList.elementRelativeToTarget" should "find max closest in given seq" in {
    assert(9 == SearchList.elementRelativeToTarget(Seq[Int](1, 3, 3, 5, 8, 9), 99))
  }

}
