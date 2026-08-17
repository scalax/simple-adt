package net.scalax.simple.adt.codegen

import java.nio.file.Paths

object CodegenAction {
  def main(arr: Array[String]): Unit = {
    val pathImpl = Paths.get("").toAbsolutePath
    val pathRoot = os.Path(pathImpl) / "adt" / "src" / "main" / "scala" / "codegen" / "net" / "scalax" / "simple"

    val instanceRoot = pathRoot / "instance"
    val typedRoot    = pathRoot / "typedadt"

    os.write.over(target = typedRoot / "CoProductX.scala", data = net.scalax.txt.CoProductX(22).body, createFolders = true)
    os.write.over(target = instanceRoot / "FoldApply.scala", data = net.scalax.txt.FoldApply(22).body, createFolders = true)
    os.write.over(
      target = instanceRoot / s"CoProductApplyHelper.scala",
      data = net.scalax.txt.CoProductApplyHelper(22).body,
      createFolders = true
    )
  }
}
