# Generated from GP.g4 by ANTLR 4.12.0
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,20,126,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,
        19,1,0,1,0,1,0,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,
        4,1,4,1,4,1,4,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,
        7,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,11,1,12,1,12,1,13,1,13,1,14,1,
        14,1,15,1,15,1,16,1,16,5,16,92,8,16,10,16,12,16,95,9,16,1,17,4,17,
        98,8,17,11,17,12,17,99,1,18,1,18,5,18,104,8,18,10,18,12,18,107,9,
        18,1,18,1,18,1,18,5,18,112,8,18,10,18,12,18,115,9,18,1,18,3,18,118,
        8,18,1,19,4,19,121,8,19,11,19,12,19,122,1,19,1,19,2,105,113,0,20,
        1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,
        27,14,29,15,31,16,33,17,35,18,37,19,39,20,1,0,4,3,0,65,90,95,95,
        97,122,4,0,48,57,65,90,95,95,97,122,1,0,48,57,3,0,9,10,13,13,32,
        32,131,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,
        0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,
        0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,
        0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,
        0,1,41,1,0,0,0,3,44,1,0,0,0,5,46,1,0,0,0,7,51,1,0,0,0,9,56,1,0,0,
        0,11,60,1,0,0,0,13,63,1,0,0,0,15,69,1,0,0,0,17,73,1,0,0,0,19,75,
        1,0,0,0,21,77,1,0,0,0,23,79,1,0,0,0,25,81,1,0,0,0,27,83,1,0,0,0,
        29,85,1,0,0,0,31,87,1,0,0,0,33,89,1,0,0,0,35,97,1,0,0,0,37,117,1,
        0,0,0,39,120,1,0,0,0,41,42,5,105,0,0,42,43,5,102,0,0,43,2,1,0,0,
        0,44,45,5,58,0,0,45,4,1,0,0,0,46,47,5,101,0,0,47,48,5,108,0,0,48,
        49,5,105,0,0,49,50,5,102,0,0,50,6,1,0,0,0,51,52,5,101,0,0,52,53,
        5,108,0,0,53,54,5,115,0,0,54,55,5,101,0,0,55,8,1,0,0,0,56,57,5,102,
        0,0,57,58,5,111,0,0,58,59,5,114,0,0,59,10,1,0,0,0,60,61,5,105,0,
        0,61,62,5,110,0,0,62,12,1,0,0,0,63,64,5,119,0,0,64,65,5,104,0,0,
        65,66,5,105,0,0,66,67,5,108,0,0,67,68,5,101,0,0,68,14,1,0,0,0,69,
        70,5,100,0,0,70,71,5,101,0,0,71,72,5,102,0,0,72,16,1,0,0,0,73,74,
        5,40,0,0,74,18,1,0,0,0,75,76,5,44,0,0,76,20,1,0,0,0,77,78,5,41,0,
        0,78,22,1,0,0,0,79,80,5,61,0,0,80,24,1,0,0,0,81,82,5,43,0,0,82,26,
        1,0,0,0,83,84,5,45,0,0,84,28,1,0,0,0,85,86,5,42,0,0,86,30,1,0,0,
        0,87,88,5,47,0,0,88,32,1,0,0,0,89,93,7,0,0,0,90,92,7,1,0,0,91,90,
        1,0,0,0,92,95,1,0,0,0,93,91,1,0,0,0,93,94,1,0,0,0,94,34,1,0,0,0,
        95,93,1,0,0,0,96,98,7,2,0,0,97,96,1,0,0,0,98,99,1,0,0,0,99,97,1,
        0,0,0,99,100,1,0,0,0,100,36,1,0,0,0,101,105,5,34,0,0,102,104,9,0,
        0,0,103,102,1,0,0,0,104,107,1,0,0,0,105,106,1,0,0,0,105,103,1,0,
        0,0,106,108,1,0,0,0,107,105,1,0,0,0,108,118,5,34,0,0,109,113,5,39,
        0,0,110,112,9,0,0,0,111,110,1,0,0,0,112,115,1,0,0,0,113,114,1,0,
        0,0,113,111,1,0,0,0,114,116,1,0,0,0,115,113,1,0,0,0,116,118,5,39,
        0,0,117,101,1,0,0,0,117,109,1,0,0,0,118,38,1,0,0,0,119,121,7,3,0,
        0,120,119,1,0,0,0,121,122,1,0,0,0,122,120,1,0,0,0,122,123,1,0,0,
        0,123,124,1,0,0,0,124,125,6,19,0,0,125,40,1,0,0,0,7,0,93,99,105,
        113,117,122,1,6,0,0
    ]

class GPLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    T__8 = 9
    T__9 = 10
    T__10 = 11
    T__11 = 12
    T__12 = 13
    T__13 = 14
    T__14 = 15
    T__15 = 16
    ID = 17
    INT = 18
    STRING = 19
    WS = 20

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'if'", "':'", "'elif'", "'else'", "'for'", "'in'", "'while'", 
            "'def'", "'('", "','", "')'", "'='", "'+'", "'-'", "'*'", "'/'" ]

    symbolicNames = [ "<INVALID>",
            "ID", "INT", "STRING", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "T__10", "T__11", "T__12", "T__13", 
                  "T__14", "T__15", "ID", "INT", "STRING", "WS" ]

    grammarFileName = "GP.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


