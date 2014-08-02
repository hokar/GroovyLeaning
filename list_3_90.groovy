import java.util.regex.Pattern

Pattern pat = ~/G....y/	// new Pattern(/G....y/)と等価
pat.compile()			// マッチング前にコンパイル
assert "Groovy" =~ pat

