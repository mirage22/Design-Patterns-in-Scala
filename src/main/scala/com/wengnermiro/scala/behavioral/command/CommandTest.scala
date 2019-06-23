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

package com.wengnermiro.scala.behavioral.command

import com.wengnermiro.scala.creational.builder.VehicleBuilderTest.getClass
import org.slf4j.LoggerFactory

/**
  *
  * Command Design pattern is used to encapsulate all information to perform an action or trigger some event at a
  * latter time. Following information contains method name, owner of the method and method values
  *
  * @author Miroslav Wengner (@miragemiko)
  */
object CommandTest {
  private val logger = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]): Unit = {

    val executor = CommandExecutor()
    val cmdConfigure:Command = () => logger.debug("Configure")
    val cmdInitiate:Command = () => logger.debug("Initiate")
    val cmdRun = () => logger.debug("Run")
    val cmdStop = () => logger.debug("Stop")

    executor.process(cmdConfigure)
    executor.process(cmdInitiate, cmdRun, cmdStop);
    logger.debug("DONE: Repeat Again")
    executor.repeat
  }
}
