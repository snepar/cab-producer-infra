import producer.{EventProducer}

import scala.util.Random

object App {

  def startProducer(): Unit = {
    println("starting producer")
    val statuses = List("accepted", "rejected")
    val status = statuses(Random.nextInt(statuses.length))
    while (true) {
      val topic = "ride"
      val r = scala.util.Random
      val id = r.nextInt(10000000)
      val tour_value = r.nextDouble() * 100
      val id_driver = r.nextInt(10)
      val id_passenger = r.nextInt(100)
      val event_date = System.currentTimeMillis
      val payload =
        s"""{"id":$id,"event_date":$event_date,"tour_value":$tour_value,"id_driver":$id_driver,"id_passenger":$id_passenger,"tour_status":"$status"}""".stripMargin

      EventProducer.send(topic, payload)
      Thread.sleep(1000)
    }
  }

  def main(args: Array[String]): Unit = {
          startProducer()
  }
}
