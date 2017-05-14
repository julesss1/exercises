package part_c

case class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name() = {
    firstName + "  " + lastName
  }
}
object Director {
  def older(d1: Director, d2: Director) = {
    if (d1.yearOfBirth < d2.yearOfBirth) d1 else d2
  }
}