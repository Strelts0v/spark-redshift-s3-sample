package com.itechart.spark.internals

import com.itechart.spark.TestSparkApi.spark
import org.scalatest.FunSpec

class RddLineageAppSpec extends FunSpec {

  describe("RDD Lineage App Tests") {

    it("test run") {

      RddLineageApp.mainTestable(spark)
    }
  }
}
