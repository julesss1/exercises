package part_c

case class Film(val name: String, val yearOfRelease: Int,
           val imdbRating: Double, val director: Director) {
  def directorsAge() = {
    director.yearOfBirth - yearOfRelease
  }
  def isDirectedBy(director: Director): Boolean = {
    (director.firstName == this.director.firstName &&
      director.lastName == this.director.lastName &&
      director.yearOfBirth == this.director.yearOfBirth)
  }
}

object File {
  def oldestDirectorAtTheTime(f1: Film, f2: Film)  = {
    if (f1.directorsAge() > f2.directorsAge()) f1.director else f2.director
  }
  def highestRating(f1: Film, f2: Film) = {
    if (f1.imdbRating > f2.imdbRating) f1.imdbRating else f2.imdbRating
  }

}