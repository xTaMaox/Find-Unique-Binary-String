object Solution {
  def findDifferentBinaryString(nums: Array[String]): String = {
    val set = nums.iterator.map(Integer.parseUnsignedInt(_, 2)).toSet
    val binary = (0 to 1 << nums.length).find(!set.contains(_)).get.toBinaryString
    f"${"0" * (nums.length - binary.length)}$binary"
  }
}