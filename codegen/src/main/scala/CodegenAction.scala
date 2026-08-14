package net.scalax.simple.adt.codegen

import java.nio.file.Paths

object CodegenAction {
  def main(arr: Array[String]): Unit = {
    val pathImpl = Paths.get("").toAbsolutePath
    val pathRoot = os.Path(pathImpl) / "adt" / "src" / "main" / "scala" / "codegen" / "net" / "scalax" / "simple" / "induction"
    os.write.over(target = pathRoot / "CoProductX.scala", data = net.scalax.txt.CoProductX(22).body, createFolders = true)
    os.write.over(target = pathRoot / "FoldApply.scala", data = net.scalax.txt.FoldApply(22).body, createFolders = true)
  }
}
