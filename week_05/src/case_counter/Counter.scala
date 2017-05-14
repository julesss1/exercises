package case_counter

case class Counter (var count:Int=0){
  def inc(x:Int=1) ={
    count += x
    this
  }
  def dec(x:Int=1) ={
    count -= x
    this
  }
}