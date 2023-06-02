from antlr4 import FileStream, CommonTokenStream
# from antlr4 import parser 
from GPLexer import GPLexer
from GPParser import GPParser
# from my_grammarListener import my_grammarListener
from GPVisitor import GPVisitor

# Считываем входной файл
input_stream = FileStream("python_code.txt")

# Создаем лексер и парсер
lexer = GPLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = GPParser(token_stream)

# Парсим входные данные и получаем корневой узел дерева разбора
tree = parser.program()

# Создаем и запускаем посетителя
visitor = GPVisitor()
result = visitor.visit(tree)

# результат будет содержать код на C++
print(result)
