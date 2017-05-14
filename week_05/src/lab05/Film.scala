package lab05

class Film(val name: String, val yearOfRelease: Int,
           val imdbRating: Double, val director: Director) {
  def directorsAge() = {
    director.yearOfBirth - yearOfRelease
  }
  def isDirectedBy(director: Director): Boolean = {
    (director.firstName == this.director.firstName &&
      director.lastName == this.director.lastName &&
      director.yearOfBirth == this.director.yearOfBirth)
  }

  def copy(newName: String = name, releaseYear: Int = yearOfRelease, rating: Double = imdbRating,
           directorPerson: Director = director): Film =
    new Film(newName, releaseYear, rating, directorPerson)

}

object Film {
  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
  def oldestDirectorAtTheTime(f1: Film, f2: Film)  = {
    if (f1.directorsAge() > f2.directorsAge()) f1.director else f2.director
  }
  def highestRating(f1: Film, f2: Film) = {
    if (f1.imdbRating > f2.imdbRating) f1.imdbRating else f2.imdbRating
  }

}