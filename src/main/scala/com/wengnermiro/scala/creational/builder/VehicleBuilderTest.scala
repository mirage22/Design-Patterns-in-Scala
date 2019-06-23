/*
 * Copyright (c) 2019,  Miroslav Wengner
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.wengnermiro.scala.creational.builder

import org.slf4j.LoggerFactory

/**
  *
  * @author Miroslav Wengner (@miragemiko)
  */
object VehicleBuilderTest {

  private val logger = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]): Unit = {
    logger.info("... Builder pattern ...")
    val sportVehicle1:Vehicle = new VehicleBuilder().addName("sport car").addVin("123A").build
    val sportVehicle2:Vehicle = new VehicleBuilder().addName("sport car").addVin("123A").build
    val truckVehicle:Vehicle = new VehicleBuilder().addName("truck car").addVin("1234B").build
    val notCompleteVehicle:Vehicle = new VehicleBuilder().addVin("8888").build

    logger.info(s"SPORT CAR1: ${sportVehicle1.hashCode()}")
    logger.info(s"SPORT CAR2: ${sportVehicle2.hashCode()}")
    logger.info(s"TRUCK CAR: ${truckVehicle.hashCode()}")
    logger.info(s"NOT COMPLETE CAR: $notCompleteVehicle")


  }
}
