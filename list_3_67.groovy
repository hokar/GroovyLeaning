import javax.swing.JFrame
import javax.swing.JButton
import java.awt.event.ActionListener

f = new JFrame()
b = new JButton("hello")

// クロージャを直接インターフェースにasする
handler = { println "hello!" } as ActionListener

assert handler instanceof ActionListener

b.addActionListener handler

f.add b
// ボタンを１つ含むJFrameが表示され、ボタンを押すと"hello!"が出力される
f.show()
