// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus

object QueueImpl {
  def main(args: Array[String]): Unit = {
    val doubleQueue = new DoubleQueue()
    val squareQueue = new SquareQueue()

    println("Existing List ...")
    val list:List[Int] = List(1,2,3,5,6,8)
    println(list)

    println("Enqueue an double element in the list")
    val newList1 = doubleQueue.enqueue(list,3)
    println("New List ...")
    println(newList1)

    println("Dequeue an element from the list")
    val newList2 = doubleQueue.dequeue(newList1)
    println("New List ...")
    println(newList2)

    println("Enqueue an square element in the list")
    val newList3 = squareQueue.enqueue(newList2,5)
    println("New List ...")
    println(newList3)

    println("Dequeue an element from the list")
    val newList4 = doubleQueue.dequeue(newList3)
    println("New List ...")
    println(newList4)
  }
}
