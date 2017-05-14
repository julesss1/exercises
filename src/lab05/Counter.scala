package lab05

class Counter(var count: Int) {

  def inc(x:Int=1) ={
    count += x
    this
  }
  def dec(x:Int=1) ={
    count -= x
    this
  }
  def adjust(adder:Adder)={
    adder.add(count)
    this
  }
  
}