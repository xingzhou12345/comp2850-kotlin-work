// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    "不及格" - {
        "0分应该返回Fail"{
            grade(0) shouldBe "Fail"        }
        "25分应该返回Fail"{
        grade(25) shouldBe "Fail"}
        "39分应该返回Fail"{
            grade(39)shouldBe "Fail"
        }
    }
    "及格" - {"69分应该返回Pass"{
        grade(69) shouldBe "Pass"
    }
        
        "40分应该返回Pass"{
        grade(40) shouldBe "Pass"    }}
    "优秀" - {"70分应该返回Distinction"{
        grade(70) shouldBe "Distinction"
    }
              "100分应该返回Distinction"{
        grade(100) shouldBe "Distinction"
              }}
    "无效分数应该返回问号"{
        assertSoftly{
           withClue("检查负数 -1"){
            grade(-1) shouldBe "?"
           }
            withClue("检查超过满分的101"){
                grade(101) shouldBe "?"
            }
        }
    }
})
