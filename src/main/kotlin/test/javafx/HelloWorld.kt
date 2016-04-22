package test.javafx

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.scene.Scene

class HelloWorld : Application()  {

	override fun start(primaryStage: Stage) {
		val btn = Button()
		btn.text = "Say 'Hello, World!'"
		btn.setOnAction {
			println("Hello, World!")
		}

		val root = StackPane()
		root.children.add(btn)
		val scene = Scene(root, 300.0, 250.0)
		
		primaryStage.title = "hello, world!"
		primaryStage.scene = scene
		primaryStage.show()
	}

	companion object {
		@JvmStatic
		public fun main(args: Array<String>) {
			launch(HelloWorld::class.java, *args)
		}
	}
}
