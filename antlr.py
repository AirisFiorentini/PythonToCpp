# # open python_code file
# import sys, os, re, shutil
# from antlr4 import *
# from Python3Lexer import Python3Lexer
# from Python3Parser import Python3Parser
# from Python3ParserListener import Python3ParserListener



# with open('python_code.txt', 'r') as f:
#     input = f.read()
#     lexer = Python3Lexer(input)
#     stream = CommonTokenStream(lexer)
#     parser = Python3Parser(stream)
#     tree = parser.file_input()  # ??? parser.chat()
#     output = open("output.txt", "w")

#     smth = Python3ParserListener(output)
#     walker = ParseTreeWalker()
#     walker.walk(smth, tree)

from antlr4 import FileStream, CommonTokenStream
from Python3Lexer import Python3Lexer
from Python3Parser import Python3Parser
from Python3ParserListener import Python3ParserListener
from PythonToCppVisitor import PythonToCppVisitor

# Считываем входной файл
input_stream = FileStream("python_code.txt")

# Создаем лексер и парсер
lexer = Python3Lexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = Python3Parser(token_stream)

# Парсим входные данные и получаем корневой узел дерева разбора
tree = parser.file_input()  # замените "startRule" на ваше начальное правило

# Создаем и запускаем посетителя
visitor = PythonToCppVisitor()
visitor.visit(tree)


    
