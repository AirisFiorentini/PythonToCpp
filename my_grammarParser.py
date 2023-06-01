# Generated from my_grammar.g4 by ANTLR 4.13.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,67,500,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,
        7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,39,7,39,
        2,40,7,40,2,41,7,41,2,42,7,42,2,43,7,43,2,44,7,44,1,0,1,0,5,0,93,
        8,0,10,0,12,0,96,9,0,1,0,1,0,1,1,1,1,3,1,102,8,1,1,2,1,2,1,2,5,2,
        107,8,2,10,2,12,2,110,9,2,1,2,3,2,113,8,2,1,2,1,2,1,3,1,3,1,4,1,
        4,5,4,121,8,4,10,4,12,4,124,9,4,1,5,1,5,1,5,1,6,1,6,3,6,131,8,6,
        1,6,1,6,1,6,3,6,136,8,6,5,6,138,8,6,10,6,12,6,141,9,6,1,6,3,6,144,
        8,6,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,3,8,154,8,8,1,8,3,8,157,8,8,
        1,9,1,9,1,9,5,9,162,8,9,10,9,12,9,165,9,9,1,10,1,10,1,10,5,10,170,
        8,10,10,10,12,10,173,9,10,1,11,1,11,1,11,3,11,178,8,11,1,12,1,12,
        1,12,1,12,5,12,184,8,12,10,12,12,12,187,9,12,1,13,1,13,1,13,1,13,
        1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,3,13,202,8,13,1,14,
        1,14,1,14,1,15,1,15,1,15,5,15,210,8,15,10,15,12,15,213,9,15,1,16,
        1,16,1,16,5,16,218,8,16,10,16,12,16,221,9,16,1,17,1,17,1,17,5,17,
        226,8,17,10,17,12,17,229,9,17,1,18,1,18,1,18,5,18,234,8,18,10,18,
        12,18,237,9,18,1,19,1,19,1,19,5,19,242,8,19,10,19,12,19,245,9,19,
        1,20,1,20,1,20,5,20,250,8,20,10,20,12,20,253,9,20,1,21,1,21,1,21,
        3,21,258,8,21,1,22,1,22,1,22,3,22,263,8,22,1,23,1,23,3,23,267,8,
        23,1,23,5,23,270,8,23,10,23,12,23,273,9,23,1,24,1,24,3,24,277,8,
        24,1,24,1,24,1,24,1,24,1,24,1,24,1,24,3,24,286,8,24,1,25,1,25,1,
        25,5,25,291,8,25,10,25,12,25,294,9,25,1,25,3,25,297,8,25,1,26,1,
        26,3,26,301,8,26,1,26,1,26,1,26,1,26,3,26,307,8,26,1,27,1,27,1,27,
        1,27,3,27,313,8,27,1,28,1,28,1,28,1,28,1,28,1,29,1,29,1,29,1,29,
        1,29,1,29,1,29,1,30,1,30,1,30,1,30,1,30,1,30,1,30,3,30,334,8,30,
        3,30,336,8,30,1,30,1,30,1,31,1,31,1,31,1,31,1,31,1,31,1,32,1,32,
        3,32,348,8,32,1,32,1,32,1,33,1,33,1,33,3,33,355,8,33,1,33,1,33,3,
        33,359,8,33,1,33,1,33,1,33,1,33,3,33,365,8,33,1,33,1,33,3,33,369,
        8,33,5,33,371,8,33,10,33,12,33,374,9,33,1,33,1,33,3,33,378,8,33,
        1,33,3,33,381,8,33,1,34,1,34,1,34,1,34,3,34,387,8,34,1,34,1,34,1,
        34,1,34,1,34,3,34,394,8,34,3,34,396,8,34,1,34,1,34,1,34,1,34,3,34,
        402,8,34,3,34,404,8,34,1,35,1,35,1,36,1,36,3,36,410,8,36,1,37,1,
        37,1,37,5,37,415,8,37,10,37,12,37,418,9,37,1,38,1,38,3,38,422,8,
        38,1,38,1,38,1,38,1,39,1,39,1,39,5,39,430,8,39,10,39,12,39,433,9,
        39,1,40,1,40,1,40,1,40,1,40,1,41,1,41,1,41,1,41,1,41,1,41,1,41,1,
        41,1,41,5,41,449,8,41,10,41,12,41,452,9,41,1,41,1,41,1,41,3,41,457,
        8,41,1,42,1,42,1,42,1,42,4,42,463,8,42,11,42,12,42,464,1,42,1,42,
        3,42,469,8,42,1,43,1,43,3,43,473,8,43,1,43,1,43,3,43,477,8,43,1,
        43,1,43,1,43,3,43,482,8,43,1,43,1,43,3,43,486,8,43,3,43,488,8,43,
        1,44,1,44,1,44,4,44,493,8,44,11,44,12,44,494,1,44,3,44,498,8,44,
        1,44,0,0,45,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,
        38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70,72,74,76,78,80,
        82,84,86,88,0,5,1,0,43,55,1,0,41,42,1,0,14,15,2,0,16,16,18,21,2,
        0,14,15,67,67,531,0,94,1,0,0,0,2,101,1,0,0,0,4,103,1,0,0,0,6,116,
        1,0,0,0,8,118,1,0,0,0,10,125,1,0,0,0,12,130,1,0,0,0,14,145,1,0,0,
        0,16,156,1,0,0,0,18,158,1,0,0,0,20,166,1,0,0,0,22,177,1,0,0,0,24,
        179,1,0,0,0,26,201,1,0,0,0,28,203,1,0,0,0,30,206,1,0,0,0,32,214,
        1,0,0,0,34,222,1,0,0,0,36,230,1,0,0,0,38,238,1,0,0,0,40,246,1,0,
        0,0,42,257,1,0,0,0,44,259,1,0,0,0,46,264,1,0,0,0,48,285,1,0,0,0,
        50,287,1,0,0,0,52,306,1,0,0,0,54,312,1,0,0,0,56,314,1,0,0,0,58,319,
        1,0,0,0,60,326,1,0,0,0,62,339,1,0,0,0,64,345,1,0,0,0,66,380,1,0,
        0,0,68,403,1,0,0,0,70,405,1,0,0,0,72,407,1,0,0,0,74,411,1,0,0,0,
        76,419,1,0,0,0,78,426,1,0,0,0,80,434,1,0,0,0,82,439,1,0,0,0,84,468,
        1,0,0,0,86,487,1,0,0,0,88,497,1,0,0,0,90,93,5,6,0,0,91,93,3,2,1,
        0,92,90,1,0,0,0,92,91,1,0,0,0,93,96,1,0,0,0,94,92,1,0,0,0,94,95,
        1,0,0,0,95,97,1,0,0,0,96,94,1,0,0,0,97,98,5,0,0,1,98,1,1,0,0,0,99,
        102,3,4,2,0,100,102,3,54,27,0,101,99,1,0,0,0,101,100,1,0,0,0,102,
        3,1,0,0,0,103,108,3,6,3,0,104,105,5,40,0,0,105,107,3,6,3,0,106,104,
        1,0,0,0,107,110,1,0,0,0,108,106,1,0,0,0,108,109,1,0,0,0,109,112,
        1,0,0,0,110,108,1,0,0,0,111,113,5,40,0,0,112,111,1,0,0,0,112,113,
        1,0,0,0,113,114,1,0,0,0,114,115,5,6,0,0,115,5,1,0,0,0,116,117,3,
        8,4,0,117,7,1,0,0,0,118,122,3,30,15,0,119,121,3,10,5,0,120,119,1,
        0,0,0,121,124,1,0,0,0,122,120,1,0,0,0,122,123,1,0,0,0,123,9,1,0,
        0,0,124,122,1,0,0,0,125,126,5,13,0,0,126,127,3,30,15,0,127,11,1,
        0,0,0,128,131,3,16,8,0,129,131,3,28,14,0,130,128,1,0,0,0,130,129,
        1,0,0,0,131,139,1,0,0,0,132,135,5,38,0,0,133,136,3,16,8,0,134,136,
        3,28,14,0,135,133,1,0,0,0,135,134,1,0,0,0,136,138,1,0,0,0,137,132,
        1,0,0,0,138,141,1,0,0,0,139,137,1,0,0,0,139,140,1,0,0,0,140,143,
        1,0,0,0,141,139,1,0,0,0,142,144,5,38,0,0,143,142,1,0,0,0,143,144,
        1,0,0,0,144,13,1,0,0,0,145,146,7,0,0,0,146,15,1,0,0,0,147,153,3,
        18,9,0,148,149,5,37,0,0,149,150,3,18,9,0,150,151,5,36,0,0,151,152,
        3,16,8,0,152,154,1,0,0,0,153,148,1,0,0,0,153,154,1,0,0,0,154,157,
        1,0,0,0,155,157,3,76,38,0,156,147,1,0,0,0,156,155,1,0,0,0,157,17,
        1,0,0,0,158,163,3,20,10,0,159,160,5,29,0,0,160,162,3,20,10,0,161,
        159,1,0,0,0,162,165,1,0,0,0,163,161,1,0,0,0,163,164,1,0,0,0,164,
        19,1,0,0,0,165,163,1,0,0,0,166,171,3,22,11,0,167,168,5,31,0,0,168,
        170,3,22,11,0,169,167,1,0,0,0,170,173,1,0,0,0,171,169,1,0,0,0,171,
        172,1,0,0,0,172,21,1,0,0,0,173,171,1,0,0,0,174,175,5,32,0,0,175,
        178,3,22,11,0,176,178,3,24,12,0,177,174,1,0,0,0,177,176,1,0,0,0,
        178,23,1,0,0,0,179,185,3,30,15,0,180,181,3,26,13,0,181,182,3,30,
        15,0,182,184,1,0,0,0,183,180,1,0,0,0,184,187,1,0,0,0,185,183,1,0,
        0,0,185,186,1,0,0,0,186,25,1,0,0,0,187,185,1,0,0,0,188,202,5,22,
        0,0,189,202,5,23,0,0,190,202,5,24,0,0,191,202,5,25,0,0,192,202,5,
        26,0,0,193,202,5,27,0,0,194,202,5,28,0,0,195,202,5,34,0,0,196,197,
        5,32,0,0,197,202,5,34,0,0,198,202,5,33,0,0,199,200,5,33,0,0,200,
        202,5,32,0,0,201,188,1,0,0,0,201,189,1,0,0,0,201,190,1,0,0,0,201,
        191,1,0,0,0,201,192,1,0,0,0,201,193,1,0,0,0,201,194,1,0,0,0,201,
        195,1,0,0,0,201,196,1,0,0,0,201,198,1,0,0,0,201,199,1,0,0,0,202,
        27,1,0,0,0,203,204,5,16,0,0,204,205,3,30,15,0,205,29,1,0,0,0,206,
        211,3,32,16,0,207,208,5,29,0,0,208,210,3,32,16,0,209,207,1,0,0,0,
        210,213,1,0,0,0,211,209,1,0,0,0,211,212,1,0,0,0,212,31,1,0,0,0,213,
        211,1,0,0,0,214,219,3,34,17,0,215,216,5,30,0,0,216,218,3,34,17,0,
        217,215,1,0,0,0,218,221,1,0,0,0,219,217,1,0,0,0,219,220,1,0,0,0,
        220,33,1,0,0,0,221,219,1,0,0,0,222,227,3,36,18,0,223,224,5,31,0,
        0,224,226,3,36,18,0,225,223,1,0,0,0,226,229,1,0,0,0,227,225,1,0,
        0,0,227,228,1,0,0,0,228,35,1,0,0,0,229,227,1,0,0,0,230,235,3,38,
        19,0,231,232,7,1,0,0,232,234,3,38,19,0,233,231,1,0,0,0,234,237,1,
        0,0,0,235,233,1,0,0,0,235,236,1,0,0,0,236,37,1,0,0,0,237,235,1,0,
        0,0,238,243,3,40,20,0,239,240,7,2,0,0,240,242,3,40,20,0,241,239,
        1,0,0,0,242,245,1,0,0,0,243,241,1,0,0,0,243,244,1,0,0,0,244,39,1,
        0,0,0,245,243,1,0,0,0,246,251,3,42,21,0,247,248,7,3,0,0,248,250,
        3,42,21,0,249,247,1,0,0,0,250,253,1,0,0,0,251,249,1,0,0,0,251,252,
        1,0,0,0,252,41,1,0,0,0,253,251,1,0,0,0,254,255,7,4,0,0,255,258,3,
        42,21,0,256,258,3,44,22,0,257,254,1,0,0,0,257,256,1,0,0,0,258,43,
        1,0,0,0,259,262,3,46,23,0,260,261,5,17,0,0,261,263,3,42,21,0,262,
        260,1,0,0,0,262,263,1,0,0,0,263,45,1,0,0,0,264,266,5,57,0,0,265,
        267,5,56,0,0,266,265,1,0,0,0,266,267,1,0,0,0,267,271,1,0,0,0,268,
        270,3,48,24,0,269,268,1,0,0,0,270,273,1,0,0,0,271,269,1,0,0,0,271,
        272,1,0,0,0,272,47,1,0,0,0,273,271,1,0,0,0,274,276,5,1,0,0,275,277,
        3,50,25,0,276,275,1,0,0,0,276,277,1,0,0,0,277,278,1,0,0,0,278,286,
        5,2,0,0,279,280,5,3,0,0,280,281,3,78,39,0,281,282,5,4,0,0,282,286,
        1,0,0,0,283,284,5,5,0,0,284,286,5,7,0,0,285,274,1,0,0,0,285,279,
        1,0,0,0,285,283,1,0,0,0,286,49,1,0,0,0,287,292,3,52,26,0,288,289,
        5,38,0,0,289,291,3,52,26,0,290,288,1,0,0,0,291,294,1,0,0,0,292,290,
        1,0,0,0,292,293,1,0,0,0,293,296,1,0,0,0,294,292,1,0,0,0,295,297,
        5,38,0,0,296,295,1,0,0,0,296,297,1,0,0,0,297,51,1,0,0,0,298,300,
        3,16,8,0,299,301,3,80,40,0,300,299,1,0,0,0,300,301,1,0,0,0,301,307,
        1,0,0,0,302,303,3,16,8,0,303,304,5,24,0,0,304,305,3,16,8,0,305,307,
        1,0,0,0,306,298,1,0,0,0,306,302,1,0,0,0,307,53,1,0,0,0,308,313,3,
        82,41,0,309,313,3,56,28,0,310,313,3,58,29,0,311,313,3,62,31,0,312,
        308,1,0,0,0,312,309,1,0,0,0,312,310,1,0,0,0,312,311,1,0,0,0,313,
        55,1,0,0,0,314,315,5,62,0,0,315,316,3,16,8,0,316,317,5,39,0,0,317,
        318,3,84,42,0,318,57,1,0,0,0,319,320,5,63,0,0,320,321,5,7,0,0,321,
        322,5,34,0,0,322,323,3,60,30,0,323,324,5,39,0,0,324,325,3,84,42,
        0,325,59,1,0,0,0,326,327,5,64,0,0,327,328,5,1,0,0,328,335,3,16,8,
        0,329,330,5,38,0,0,330,333,3,16,8,0,331,332,5,38,0,0,332,334,3,16,
        8,0,333,331,1,0,0,0,333,334,1,0,0,0,334,336,1,0,0,0,335,329,1,0,
        0,0,335,336,1,0,0,0,336,337,1,0,0,0,337,338,5,2,0,0,338,61,1,0,0,
        0,339,340,5,61,0,0,340,341,5,7,0,0,341,342,3,64,32,0,342,343,5,39,
        0,0,343,344,3,84,42,0,344,63,1,0,0,0,345,347,5,1,0,0,346,348,3,66,
        33,0,347,346,1,0,0,0,347,348,1,0,0,0,348,349,1,0,0,0,349,350,5,2,
        0,0,350,65,1,0,0,0,351,354,3,70,35,0,352,353,5,39,0,0,353,355,3,
        16,8,0,354,352,1,0,0,0,354,355,1,0,0,0,355,358,1,0,0,0,356,357,5,
        13,0,0,357,359,3,16,8,0,358,356,1,0,0,0,358,359,1,0,0,0,359,372,
        1,0,0,0,360,361,5,38,0,0,361,364,3,70,35,0,362,363,5,39,0,0,363,
        365,3,16,8,0,364,362,1,0,0,0,364,365,1,0,0,0,365,368,1,0,0,0,366,
        367,5,13,0,0,367,369,3,16,8,0,368,366,1,0,0,0,368,369,1,0,0,0,369,
        371,1,0,0,0,370,360,1,0,0,0,371,374,1,0,0,0,372,370,1,0,0,0,372,
        373,1,0,0,0,373,377,1,0,0,0,374,372,1,0,0,0,375,376,5,38,0,0,376,
        378,3,68,34,0,377,375,1,0,0,0,377,378,1,0,0,0,378,381,1,0,0,0,379,
        381,3,68,34,0,380,351,1,0,0,0,380,379,1,0,0,0,381,67,1,0,0,0,382,
        383,5,16,0,0,383,386,5,7,0,0,384,385,5,39,0,0,385,387,3,16,8,0,386,
        384,1,0,0,0,386,387,1,0,0,0,387,395,1,0,0,0,388,389,5,38,0,0,389,
        390,5,17,0,0,390,393,5,7,0,0,391,392,5,39,0,0,392,394,3,16,8,0,393,
        391,1,0,0,0,393,394,1,0,0,0,394,396,1,0,0,0,395,388,1,0,0,0,395,
        396,1,0,0,0,396,404,1,0,0,0,397,398,5,17,0,0,398,401,5,7,0,0,399,
        400,5,39,0,0,400,402,3,16,8,0,401,399,1,0,0,0,401,402,1,0,0,0,402,
        404,1,0,0,0,403,382,1,0,0,0,403,397,1,0,0,0,404,69,1,0,0,0,405,406,
        5,7,0,0,406,71,1,0,0,0,407,409,5,65,0,0,408,410,3,74,37,0,409,408,
        1,0,0,0,409,410,1,0,0,0,410,73,1,0,0,0,411,416,3,16,8,0,412,413,
        5,38,0,0,413,415,3,16,8,0,414,412,1,0,0,0,415,418,1,0,0,0,416,414,
        1,0,0,0,416,417,1,0,0,0,417,75,1,0,0,0,418,416,1,0,0,0,419,421,5,
        66,0,0,420,422,3,66,33,0,421,420,1,0,0,0,421,422,1,0,0,0,422,423,
        1,0,0,0,423,424,5,39,0,0,424,425,3,16,8,0,425,77,1,0,0,0,426,431,
        3,86,43,0,427,428,5,38,0,0,428,430,3,86,43,0,429,427,1,0,0,0,430,
        433,1,0,0,0,431,429,1,0,0,0,431,432,1,0,0,0,432,79,1,0,0,0,433,431,
        1,0,0,0,434,435,5,63,0,0,435,436,3,88,44,0,436,437,5,34,0,0,437,
        438,3,18,9,0,438,81,1,0,0,0,439,440,5,37,0,0,440,441,3,16,8,0,441,
        442,5,39,0,0,442,450,3,84,42,0,443,444,5,35,0,0,444,445,3,16,8,0,
        445,446,5,39,0,0,446,447,3,84,42,0,447,449,1,0,0,0,448,443,1,0,0,
        0,449,452,1,0,0,0,450,448,1,0,0,0,450,451,1,0,0,0,451,456,1,0,0,
        0,452,450,1,0,0,0,453,454,5,36,0,0,454,455,5,39,0,0,455,457,3,84,
        42,0,456,453,1,0,0,0,456,457,1,0,0,0,457,83,1,0,0,0,458,469,3,4,
        2,0,459,460,5,6,0,0,460,462,5,11,0,0,461,463,3,2,1,0,462,461,1,0,
        0,0,463,464,1,0,0,0,464,462,1,0,0,0,464,465,1,0,0,0,465,466,1,0,
        0,0,466,467,5,12,0,0,467,469,1,0,0,0,468,458,1,0,0,0,468,459,1,0,
        0,0,469,85,1,0,0,0,470,488,3,16,8,0,471,473,3,16,8,0,472,471,1,0,
        0,0,472,473,1,0,0,0,473,474,1,0,0,0,474,476,5,39,0,0,475,477,3,16,
        8,0,476,475,1,0,0,0,476,477,1,0,0,0,477,488,1,0,0,0,478,479,3,16,
        8,0,479,481,5,39,0,0,480,482,3,16,8,0,481,480,1,0,0,0,481,482,1,
        0,0,0,482,483,1,0,0,0,483,485,5,39,0,0,484,486,3,16,8,0,485,484,
        1,0,0,0,485,486,1,0,0,0,486,488,1,0,0,0,487,470,1,0,0,0,487,472,
        1,0,0,0,487,478,1,0,0,0,488,87,1,0,0,0,489,490,3,30,15,0,490,491,
        5,38,0,0,491,493,1,0,0,0,492,489,1,0,0,0,493,494,1,0,0,0,494,492,
        1,0,0,0,494,495,1,0,0,0,495,498,1,0,0,0,496,498,3,30,15,0,497,492,
        1,0,0,0,497,496,1,0,0,0,498,89,1,0,0,0,64,92,94,101,108,112,122,
        130,135,139,143,153,156,163,171,177,185,201,211,219,227,235,243,
        251,257,262,266,271,276,285,292,296,300,306,312,333,335,347,354,
        358,364,368,372,377,380,386,393,395,401,403,409,416,421,431,450,
        456,464,468,472,476,481,485,487,494,497
    ]

class my_grammarParser ( Parser ):

    grammarFileName = "my_grammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'['", "']'", "'.'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'='", "'+'", "'-'", "'*'", 
                     "'**'", "'/'", "'%'", "'//'", "'@'", "'<'", "'>'", 
                     "'=='", "'>='", "'<='", "'<>'", "'!='", "'|'", "'^'", 
                     "'&'", "'not'", "'is'", "'in'", "'elif'", "'else'", 
                     "'if'", "','", "':'", "';'", "'<<'", "'>>'", "'+='", 
                     "'-='", "'*='", "'@='", "'/='", "'%='", "'&='", "'|='", 
                     "'^='", "'<<='", "'>>='", "'**='", "'//='", "'await'", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'def'", "'while'", "'for'", "'range'", "'yield'", 
                     "'lambda'", "'~'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "NEWLINE", "NAME", "NUMBER", 
                      "STRING", "COMMENT", "INDENT", "DEDENT", "ASSIGN", 
                      "PLUS", "MINUS", "STAR", "POWER", "DIV", "MOD", "IDIV", 
                      "AT", "LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", 
                      "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "OR", "XOR", "AND", 
                      "NOT", "IS", "IN", "ELIF", "ELSE", "IF", "COMMA", 
                      "COLON", "SEMI_COLON", "LEFT_SHIFT", "RIGHT_SHIFT", 
                      "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", 
                      "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
                      "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
                      "POWER_ASSIGN", "IDIV_ASSIGN", "AWAIT", "ATOM", "DIGIT", 
                      "LETTER", "WHITESPACE", "DEF", "WHILE", "FOR", "RANGE", 
                      "YIELD", "LAMBDA", "TILDE" ]

    RULE_file_input = 0
    RULE_stmt = 1
    RULE_simple_stmt = 2
    RULE_small_stmt = 3
    RULE_expr_stmt = 4
    RULE_assign_expr = 5
    RULE_testlist_star_expr = 6
    RULE_augassign = 7
    RULE_test = 8
    RULE_or_test = 9
    RULE_and_test = 10
    RULE_not_test = 11
    RULE_comparison = 12
    RULE_comp_op = 13
    RULE_star_expr = 14
    RULE_expr = 15
    RULE_xor_expr = 16
    RULE_and_expr = 17
    RULE_shift_expr = 18
    RULE_arith_expr = 19
    RULE_term = 20
    RULE_factor = 21
    RULE_power = 22
    RULE_atom_expr = 23
    RULE_trailer = 24
    RULE_arglist = 25
    RULE_argument = 26
    RULE_compound_stmt = 27
    RULE_while_stmt = 28
    RULE_for_stmt = 29
    RULE_range_func = 30
    RULE_funcdef = 31
    RULE_parameters = 32
    RULE_typedargslist = 33
    RULE_variadicargs = 34
    RULE_tfpdef = 35
    RULE_yield_expr = 36
    RULE_testlist = 37
    RULE_lambdef = 38
    RULE_subscriptlist = 39
    RULE_comp_for = 40
    RULE_if_stmt = 41
    RULE_suite = 42
    RULE_subscript = 43
    RULE_exprlist = 44

    ruleNames =  [ "file_input", "stmt", "simple_stmt", "small_stmt", "expr_stmt", 
                   "assign_expr", "testlist_star_expr", "augassign", "test", 
                   "or_test", "and_test", "not_test", "comparison", "comp_op", 
                   "star_expr", "expr", "xor_expr", "and_expr", "shift_expr", 
                   "arith_expr", "term", "factor", "power", "atom_expr", 
                   "trailer", "arglist", "argument", "compound_stmt", "while_stmt", 
                   "for_stmt", "range_func", "funcdef", "parameters", "typedargslist", 
                   "variadicargs", "tfpdef", "yield_expr", "testlist", "lambdef", 
                   "subscriptlist", "comp_for", "if_stmt", "suite", "subscript", 
                   "exprlist" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    NEWLINE=6
    NAME=7
    NUMBER=8
    STRING=9
    COMMENT=10
    INDENT=11
    DEDENT=12
    ASSIGN=13
    PLUS=14
    MINUS=15
    STAR=16
    POWER=17
    DIV=18
    MOD=19
    IDIV=20
    AT=21
    LESS_THAN=22
    GREATER_THAN=23
    EQUALS=24
    GT_EQ=25
    LT_EQ=26
    NOT_EQ_1=27
    NOT_EQ_2=28
    OR=29
    XOR=30
    AND=31
    NOT=32
    IS=33
    IN=34
    ELIF=35
    ELSE=36
    IF=37
    COMMA=38
    COLON=39
    SEMI_COLON=40
    LEFT_SHIFT=41
    RIGHT_SHIFT=42
    ADD_ASSIGN=43
    SUB_ASSIGN=44
    MULT_ASSIGN=45
    AT_ASSIGN=46
    DIV_ASSIGN=47
    MOD_ASSIGN=48
    AND_ASSIGN=49
    OR_ASSIGN=50
    XOR_ASSIGN=51
    LEFT_SHIFT_ASSIGN=52
    RIGHT_SHIFT_ASSIGN=53
    POWER_ASSIGN=54
    IDIV_ASSIGN=55
    AWAIT=56
    ATOM=57
    DIGIT=58
    LETTER=59
    WHITESPACE=60
    DEF=61
    WHILE=62
    FOR=63
    RANGE=64
    YIELD=65
    LAMBDA=66
    TILDE=67

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class File_inputContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(my_grammarParser.EOF, 0)

        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.NEWLINE)
            else:
                return self.getToken(my_grammarParser.NEWLINE, i)

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.StmtContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.StmtContext,i)


        def getRuleIndex(self):
            return my_grammarParser.RULE_file_input

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFile_input" ):
                listener.enterFile_input(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFile_input" ):
                listener.exitFile_input(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFile_input" ):
                return visitor.visitFile_input(self)
            else:
                return visitor.visitChildren(self)




    def file_input(self):

        localctx = my_grammarParser.File_inputContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_file_input)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 94
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 6)) & ~0x3f) == 0 and ((1 << (_la - 6)) & 2560296390307611393) != 0):
                self.state = 92
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [6]:
                    self.state = 90
                    self.match(my_grammarParser.NEWLINE)
                    pass
                elif token in [14, 15, 37, 57, 61, 62, 63, 67]:
                    self.state = 91
                    self.stmt()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 96
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 97
            self.match(my_grammarParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def simple_stmt(self):
            return self.getTypedRuleContext(my_grammarParser.Simple_stmtContext,0)


        def compound_stmt(self):
            return self.getTypedRuleContext(my_grammarParser.Compound_stmtContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStmt" ):
                listener.enterStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStmt" ):
                listener.exitStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStmt" ):
                return visitor.visitStmt(self)
            else:
                return visitor.visitChildren(self)




    def stmt(self):

        localctx = my_grammarParser.StmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_stmt)
        try:
            self.state = 101
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 15, 57, 67]:
                self.enterOuterAlt(localctx, 1)
                self.state = 99
                self.simple_stmt()
                pass
            elif token in [37, 61, 62, 63]:
                self.enterOuterAlt(localctx, 2)
                self.state = 100
                self.compound_stmt()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Simple_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def small_stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.Small_stmtContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.Small_stmtContext,i)


        def NEWLINE(self):
            return self.getToken(my_grammarParser.NEWLINE, 0)

        def SEMI_COLON(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.SEMI_COLON)
            else:
                return self.getToken(my_grammarParser.SEMI_COLON, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_simple_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSimple_stmt" ):
                listener.enterSimple_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSimple_stmt" ):
                listener.exitSimple_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSimple_stmt" ):
                return visitor.visitSimple_stmt(self)
            else:
                return visitor.visitChildren(self)




    def simple_stmt(self):

        localctx = my_grammarParser.Simple_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_simple_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 103
            self.small_stmt()
            self.state = 108
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 104
                    self.match(my_grammarParser.SEMI_COLON)
                    self.state = 105
                    self.small_stmt() 
                self.state = 110
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

            self.state = 112
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==40:
                self.state = 111
                self.match(my_grammarParser.SEMI_COLON)


            self.state = 114
            self.match(my_grammarParser.NEWLINE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Small_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr_stmt(self):
            return self.getTypedRuleContext(my_grammarParser.Expr_stmtContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_small_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSmall_stmt" ):
                listener.enterSmall_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSmall_stmt" ):
                listener.exitSmall_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSmall_stmt" ):
                return visitor.visitSmall_stmt(self)
            else:
                return visitor.visitChildren(self)




    def small_stmt(self):

        localctx = my_grammarParser.Small_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_small_stmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 116
            self.expr_stmt()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expr_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(my_grammarParser.ExprContext,0)


        def assign_expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.Assign_exprContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.Assign_exprContext,i)


        def getRuleIndex(self):
            return my_grammarParser.RULE_expr_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr_stmt" ):
                listener.enterExpr_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr_stmt" ):
                listener.exitExpr_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr_stmt" ):
                return visitor.visitExpr_stmt(self)
            else:
                return visitor.visitChildren(self)




    def expr_stmt(self):

        localctx = my_grammarParser.Expr_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_expr_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 118
            self.expr()
            self.state = 122
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==13:
                self.state = 119
                self.assign_expr()
                self.state = 124
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Assign_exprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ASSIGN(self):
            return self.getToken(my_grammarParser.ASSIGN, 0)

        def expr(self):
            return self.getTypedRuleContext(my_grammarParser.ExprContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_assign_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssign_expr" ):
                listener.enterAssign_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssign_expr" ):
                listener.exitAssign_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssign_expr" ):
                return visitor.visitAssign_expr(self)
            else:
                return visitor.visitChildren(self)




    def assign_expr(self):

        localctx = my_grammarParser.Assign_exprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_assign_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 125
            self.match(my_grammarParser.ASSIGN)
            self.state = 126
            self.expr()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Testlist_star_exprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TestContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TestContext,i)


        def star_expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.Star_exprContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.Star_exprContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COMMA)
            else:
                return self.getToken(my_grammarParser.COMMA, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_testlist_star_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestlist_star_expr" ):
                listener.enterTestlist_star_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestlist_star_expr" ):
                listener.exitTestlist_star_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestlist_star_expr" ):
                return visitor.visitTestlist_star_expr(self)
            else:
                return visitor.visitChildren(self)




    def testlist_star_expr(self):

        localctx = my_grammarParser.Testlist_star_exprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_testlist_star_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 130
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 15, 32, 57, 66, 67]:
                self.state = 128
                self.test()
                pass
            elif token in [16]:
                self.state = 129
                self.star_expr()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 139
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 132
                    self.match(my_grammarParser.COMMA)
                    self.state = 135
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [14, 15, 32, 57, 66, 67]:
                        self.state = 133
                        self.test()
                        pass
                    elif token in [16]:
                        self.state = 134
                        self.star_expr()
                        pass
                    else:
                        raise NoViableAltException(self)
             
                self.state = 141
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

            self.state = 143
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==38:
                self.state = 142
                self.match(my_grammarParser.COMMA)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AugassignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ADD_ASSIGN(self):
            return self.getToken(my_grammarParser.ADD_ASSIGN, 0)

        def SUB_ASSIGN(self):
            return self.getToken(my_grammarParser.SUB_ASSIGN, 0)

        def MULT_ASSIGN(self):
            return self.getToken(my_grammarParser.MULT_ASSIGN, 0)

        def AT_ASSIGN(self):
            return self.getToken(my_grammarParser.AT_ASSIGN, 0)

        def DIV_ASSIGN(self):
            return self.getToken(my_grammarParser.DIV_ASSIGN, 0)

        def MOD_ASSIGN(self):
            return self.getToken(my_grammarParser.MOD_ASSIGN, 0)

        def AND_ASSIGN(self):
            return self.getToken(my_grammarParser.AND_ASSIGN, 0)

        def OR_ASSIGN(self):
            return self.getToken(my_grammarParser.OR_ASSIGN, 0)

        def XOR_ASSIGN(self):
            return self.getToken(my_grammarParser.XOR_ASSIGN, 0)

        def LEFT_SHIFT_ASSIGN(self):
            return self.getToken(my_grammarParser.LEFT_SHIFT_ASSIGN, 0)

        def RIGHT_SHIFT_ASSIGN(self):
            return self.getToken(my_grammarParser.RIGHT_SHIFT_ASSIGN, 0)

        def POWER_ASSIGN(self):
            return self.getToken(my_grammarParser.POWER_ASSIGN, 0)

        def IDIV_ASSIGN(self):
            return self.getToken(my_grammarParser.IDIV_ASSIGN, 0)

        def getRuleIndex(self):
            return my_grammarParser.RULE_augassign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAugassign" ):
                listener.enterAugassign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAugassign" ):
                listener.exitAugassign(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAugassign" ):
                return visitor.visitAugassign(self)
            else:
                return visitor.visitChildren(self)




    def augassign(self):

        localctx = my_grammarParser.AugassignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_augassign)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 145
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 72048797944905728) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TestContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def or_test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.Or_testContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.Or_testContext,i)


        def IF(self):
            return self.getToken(my_grammarParser.IF, 0)

        def ELSE(self):
            return self.getToken(my_grammarParser.ELSE, 0)

        def test(self):
            return self.getTypedRuleContext(my_grammarParser.TestContext,0)


        def lambdef(self):
            return self.getTypedRuleContext(my_grammarParser.LambdefContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_test

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTest" ):
                listener.enterTest(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTest" ):
                listener.exitTest(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTest" ):
                return visitor.visitTest(self)
            else:
                return visitor.visitChildren(self)




    def test(self):

        localctx = my_grammarParser.TestContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_test)
        self._la = 0 # Token type
        try:
            self.state = 156
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 15, 32, 57, 67]:
                self.enterOuterAlt(localctx, 1)
                self.state = 147
                self.or_test()
                self.state = 153
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==37:
                    self.state = 148
                    self.match(my_grammarParser.IF)
                    self.state = 149
                    self.or_test()
                    self.state = 150
                    self.match(my_grammarParser.ELSE)
                    self.state = 151
                    self.test()


                pass
            elif token in [66]:
                self.enterOuterAlt(localctx, 2)
                self.state = 155
                self.lambdef()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Or_testContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def and_test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.And_testContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.And_testContext,i)


        def OR(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.OR)
            else:
                return self.getToken(my_grammarParser.OR, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_or_test

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOr_test" ):
                listener.enterOr_test(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOr_test" ):
                listener.exitOr_test(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOr_test" ):
                return visitor.visitOr_test(self)
            else:
                return visitor.visitChildren(self)




    def or_test(self):

        localctx = my_grammarParser.Or_testContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_or_test)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 158
            self.and_test()
            self.state = 163
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==29:
                self.state = 159
                self.match(my_grammarParser.OR)
                self.state = 160
                self.and_test()
                self.state = 165
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class And_testContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def not_test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.Not_testContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.Not_testContext,i)


        def AND(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.AND)
            else:
                return self.getToken(my_grammarParser.AND, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_and_test

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAnd_test" ):
                listener.enterAnd_test(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAnd_test" ):
                listener.exitAnd_test(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAnd_test" ):
                return visitor.visitAnd_test(self)
            else:
                return visitor.visitChildren(self)




    def and_test(self):

        localctx = my_grammarParser.And_testContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_and_test)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 166
            self.not_test()
            self.state = 171
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==31:
                self.state = 167
                self.match(my_grammarParser.AND)
                self.state = 168
                self.not_test()
                self.state = 173
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Not_testContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NOT(self):
            return self.getToken(my_grammarParser.NOT, 0)

        def not_test(self):
            return self.getTypedRuleContext(my_grammarParser.Not_testContext,0)


        def comparison(self):
            return self.getTypedRuleContext(my_grammarParser.ComparisonContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_not_test

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNot_test" ):
                listener.enterNot_test(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNot_test" ):
                listener.exitNot_test(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNot_test" ):
                return visitor.visitNot_test(self)
            else:
                return visitor.visitChildren(self)




    def not_test(self):

        localctx = my_grammarParser.Not_testContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_not_test)
        try:
            self.state = 177
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 174
                self.match(my_grammarParser.NOT)
                self.state = 175
                self.not_test()
                pass
            elif token in [14, 15, 57, 67]:
                self.enterOuterAlt(localctx, 2)
                self.state = 176
                self.comparison()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComparisonContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.ExprContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.ExprContext,i)


        def comp_op(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.Comp_opContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.Comp_opContext,i)


        def getRuleIndex(self):
            return my_grammarParser.RULE_comparison

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComparison" ):
                listener.enterComparison(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComparison" ):
                listener.exitComparison(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComparison" ):
                return visitor.visitComparison(self)
            else:
                return visitor.visitChildren(self)




    def comparison(self):

        localctx = my_grammarParser.ComparisonContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_comparison)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 179
            self.expr()
            self.state = 185
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,15,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 180
                    self.comp_op()
                    self.state = 181
                    self.expr() 
                self.state = 187
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,15,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comp_opContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LESS_THAN(self):
            return self.getToken(my_grammarParser.LESS_THAN, 0)

        def GREATER_THAN(self):
            return self.getToken(my_grammarParser.GREATER_THAN, 0)

        def EQUALS(self):
            return self.getToken(my_grammarParser.EQUALS, 0)

        def GT_EQ(self):
            return self.getToken(my_grammarParser.GT_EQ, 0)

        def LT_EQ(self):
            return self.getToken(my_grammarParser.LT_EQ, 0)

        def NOT_EQ_1(self):
            return self.getToken(my_grammarParser.NOT_EQ_1, 0)

        def NOT_EQ_2(self):
            return self.getToken(my_grammarParser.NOT_EQ_2, 0)

        def IN(self):
            return self.getToken(my_grammarParser.IN, 0)

        def NOT(self):
            return self.getToken(my_grammarParser.NOT, 0)

        def IS(self):
            return self.getToken(my_grammarParser.IS, 0)

        def getRuleIndex(self):
            return my_grammarParser.RULE_comp_op

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComp_op" ):
                listener.enterComp_op(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComp_op" ):
                listener.exitComp_op(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComp_op" ):
                return visitor.visitComp_op(self)
            else:
                return visitor.visitChildren(self)




    def comp_op(self):

        localctx = my_grammarParser.Comp_opContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_comp_op)
        try:
            self.state = 201
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,16,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 188
                self.match(my_grammarParser.LESS_THAN)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 189
                self.match(my_grammarParser.GREATER_THAN)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 190
                self.match(my_grammarParser.EQUALS)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 191
                self.match(my_grammarParser.GT_EQ)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 192
                self.match(my_grammarParser.LT_EQ)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 193
                self.match(my_grammarParser.NOT_EQ_1)
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 194
                self.match(my_grammarParser.NOT_EQ_2)
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 195
                self.match(my_grammarParser.IN)
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 196
                self.match(my_grammarParser.NOT)
                self.state = 197
                self.match(my_grammarParser.IN)
                pass

            elif la_ == 10:
                self.enterOuterAlt(localctx, 10)
                self.state = 198
                self.match(my_grammarParser.IS)
                pass

            elif la_ == 11:
                self.enterOuterAlt(localctx, 11)
                self.state = 199
                self.match(my_grammarParser.IS)
                self.state = 200
                self.match(my_grammarParser.NOT)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Star_exprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STAR(self):
            return self.getToken(my_grammarParser.STAR, 0)

        def expr(self):
            return self.getTypedRuleContext(my_grammarParser.ExprContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_star_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStar_expr" ):
                listener.enterStar_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStar_expr" ):
                listener.exitStar_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStar_expr" ):
                return visitor.visitStar_expr(self)
            else:
                return visitor.visitChildren(self)




    def star_expr(self):

        localctx = my_grammarParser.Star_exprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_star_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 203
            self.match(my_grammarParser.STAR)
            self.state = 204
            self.expr()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def xor_expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.Xor_exprContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.Xor_exprContext,i)


        def OR(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.OR)
            else:
                return self.getToken(my_grammarParser.OR, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)




    def expr(self):

        localctx = my_grammarParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 206
            self.xor_expr()
            self.state = 211
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,17,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 207
                    self.match(my_grammarParser.OR)
                    self.state = 208
                    self.xor_expr() 
                self.state = 213
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,17,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Xor_exprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def and_expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.And_exprContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.And_exprContext,i)


        def XOR(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.XOR)
            else:
                return self.getToken(my_grammarParser.XOR, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_xor_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterXor_expr" ):
                listener.enterXor_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitXor_expr" ):
                listener.exitXor_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitXor_expr" ):
                return visitor.visitXor_expr(self)
            else:
                return visitor.visitChildren(self)




    def xor_expr(self):

        localctx = my_grammarParser.Xor_exprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_xor_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 214
            self.and_expr()
            self.state = 219
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 215
                self.match(my_grammarParser.XOR)
                self.state = 216
                self.and_expr()
                self.state = 221
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class And_exprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def shift_expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.Shift_exprContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.Shift_exprContext,i)


        def AND(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.AND)
            else:
                return self.getToken(my_grammarParser.AND, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_and_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAnd_expr" ):
                listener.enterAnd_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAnd_expr" ):
                listener.exitAnd_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAnd_expr" ):
                return visitor.visitAnd_expr(self)
            else:
                return visitor.visitChildren(self)




    def and_expr(self):

        localctx = my_grammarParser.And_exprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_and_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 222
            self.shift_expr()
            self.state = 227
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,19,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 223
                    self.match(my_grammarParser.AND)
                    self.state = 224
                    self.shift_expr() 
                self.state = 229
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,19,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Shift_exprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arith_expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.Arith_exprContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.Arith_exprContext,i)


        def LEFT_SHIFT(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.LEFT_SHIFT)
            else:
                return self.getToken(my_grammarParser.LEFT_SHIFT, i)

        def RIGHT_SHIFT(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.RIGHT_SHIFT)
            else:
                return self.getToken(my_grammarParser.RIGHT_SHIFT, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_shift_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterShift_expr" ):
                listener.enterShift_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitShift_expr" ):
                listener.exitShift_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitShift_expr" ):
                return visitor.visitShift_expr(self)
            else:
                return visitor.visitChildren(self)




    def shift_expr(self):

        localctx = my_grammarParser.Shift_exprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_shift_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 230
            self.arith_expr()
            self.state = 235
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==41 or _la==42:
                self.state = 231
                _la = self._input.LA(1)
                if not(_la==41 or _la==42):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 232
                self.arith_expr()
                self.state = 237
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Arith_exprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def term(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TermContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TermContext,i)


        def PLUS(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.PLUS)
            else:
                return self.getToken(my_grammarParser.PLUS, i)

        def MINUS(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.MINUS)
            else:
                return self.getToken(my_grammarParser.MINUS, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_arith_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArith_expr" ):
                listener.enterArith_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArith_expr" ):
                listener.exitArith_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArith_expr" ):
                return visitor.visitArith_expr(self)
            else:
                return visitor.visitChildren(self)




    def arith_expr(self):

        localctx = my_grammarParser.Arith_exprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_arith_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 238
            self.term()
            self.state = 243
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==14 or _la==15:
                self.state = 239
                _la = self._input.LA(1)
                if not(_la==14 or _la==15):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 240
                self.term()
                self.state = 245
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.FactorContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.FactorContext,i)


        def STAR(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.STAR)
            else:
                return self.getToken(my_grammarParser.STAR, i)

        def AT(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.AT)
            else:
                return self.getToken(my_grammarParser.AT, i)

        def DIV(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.DIV)
            else:
                return self.getToken(my_grammarParser.DIV, i)

        def MOD(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.MOD)
            else:
                return self.getToken(my_grammarParser.MOD, i)

        def IDIV(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.IDIV)
            else:
                return self.getToken(my_grammarParser.IDIV, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_term

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm" ):
                listener.enterTerm(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm" ):
                listener.exitTerm(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTerm" ):
                return visitor.visitTerm(self)
            else:
                return visitor.visitChildren(self)




    def term(self):

        localctx = my_grammarParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_term)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 246
            self.factor()
            self.state = 251
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 3997696) != 0):
                self.state = 247
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 3997696) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 248
                self.factor()
                self.state = 253
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor(self):
            return self.getTypedRuleContext(my_grammarParser.FactorContext,0)


        def PLUS(self):
            return self.getToken(my_grammarParser.PLUS, 0)

        def MINUS(self):
            return self.getToken(my_grammarParser.MINUS, 0)

        def TILDE(self):
            return self.getToken(my_grammarParser.TILDE, 0)

        def power(self):
            return self.getTypedRuleContext(my_grammarParser.PowerContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor" ):
                listener.enterFactor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor" ):
                listener.exitFactor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFactor" ):
                return visitor.visitFactor(self)
            else:
                return visitor.visitChildren(self)




    def factor(self):

        localctx = my_grammarParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_factor)
        self._la = 0 # Token type
        try:
            self.state = 257
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 15, 67]:
                self.enterOuterAlt(localctx, 1)
                self.state = 254
                _la = self._input.LA(1)
                if not(((((_la - 14)) & ~0x3f) == 0 and ((1 << (_la - 14)) & 9007199254740995) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 255
                self.factor()
                pass
            elif token in [57]:
                self.enterOuterAlt(localctx, 2)
                self.state = 256
                self.power()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PowerContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def atom_expr(self):
            return self.getTypedRuleContext(my_grammarParser.Atom_exprContext,0)


        def POWER(self):
            return self.getToken(my_grammarParser.POWER, 0)

        def factor(self):
            return self.getTypedRuleContext(my_grammarParser.FactorContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_power

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPower" ):
                listener.enterPower(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPower" ):
                listener.exitPower(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPower" ):
                return visitor.visitPower(self)
            else:
                return visitor.visitChildren(self)




    def power(self):

        localctx = my_grammarParser.PowerContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_power)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 259
            self.atom_expr()
            self.state = 262
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==17:
                self.state = 260
                self.match(my_grammarParser.POWER)
                self.state = 261
                self.factor()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Atom_exprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ATOM(self):
            return self.getToken(my_grammarParser.ATOM, 0)

        def AWAIT(self):
            return self.getToken(my_grammarParser.AWAIT, 0)

        def trailer(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TrailerContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TrailerContext,i)


        def getRuleIndex(self):
            return my_grammarParser.RULE_atom_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtom_expr" ):
                listener.enterAtom_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtom_expr" ):
                listener.exitAtom_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAtom_expr" ):
                return visitor.visitAtom_expr(self)
            else:
                return visitor.visitChildren(self)




    def atom_expr(self):

        localctx = my_grammarParser.Atom_exprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_atom_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 264
            self.match(my_grammarParser.ATOM)
            self.state = 266
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==56:
                self.state = 265
                self.match(my_grammarParser.AWAIT)


            self.state = 271
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 42) != 0):
                self.state = 268
                self.trailer()
                self.state = 273
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TrailerContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arglist(self):
            return self.getTypedRuleContext(my_grammarParser.ArglistContext,0)


        def subscriptlist(self):
            return self.getTypedRuleContext(my_grammarParser.SubscriptlistContext,0)


        def NAME(self):
            return self.getToken(my_grammarParser.NAME, 0)

        def getRuleIndex(self):
            return my_grammarParser.RULE_trailer

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTrailer" ):
                listener.enterTrailer(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTrailer" ):
                listener.exitTrailer(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTrailer" ):
                return visitor.visitTrailer(self)
            else:
                return visitor.visitChildren(self)




    def trailer(self):

        localctx = my_grammarParser.TrailerContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_trailer)
        self._la = 0 # Token type
        try:
            self.state = 285
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 274
                self.match(my_grammarParser.T__0)
                self.state = 276
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if ((((_la - 14)) & ~0x3f) == 0 and ((1 << (_la - 14)) & 13519594975395843) != 0):
                    self.state = 275
                    self.arglist()


                self.state = 278
                self.match(my_grammarParser.T__1)
                pass
            elif token in [3]:
                self.enterOuterAlt(localctx, 2)
                self.state = 279
                self.match(my_grammarParser.T__2)
                self.state = 280
                self.subscriptlist()
                self.state = 281
                self.match(my_grammarParser.T__3)
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 3)
                self.state = 283
                self.match(my_grammarParser.T__4)
                self.state = 284
                self.match(my_grammarParser.NAME)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArglistContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def argument(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.ArgumentContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.ArgumentContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COMMA)
            else:
                return self.getToken(my_grammarParser.COMMA, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_arglist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArglist" ):
                listener.enterArglist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArglist" ):
                listener.exitArglist(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArglist" ):
                return visitor.visitArglist(self)
            else:
                return visitor.visitChildren(self)




    def arglist(self):

        localctx = my_grammarParser.ArglistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_arglist)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 287
            self.argument()
            self.state = 292
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,29,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 288
                    self.match(my_grammarParser.COMMA)
                    self.state = 289
                    self.argument() 
                self.state = 294
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,29,self._ctx)

            self.state = 296
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==38:
                self.state = 295
                self.match(my_grammarParser.COMMA)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgumentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TestContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TestContext,i)


        def EQUALS(self):
            return self.getToken(my_grammarParser.EQUALS, 0)

        def comp_for(self):
            return self.getTypedRuleContext(my_grammarParser.Comp_forContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_argument

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgument" ):
                listener.enterArgument(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgument" ):
                listener.exitArgument(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgument" ):
                return visitor.visitArgument(self)
            else:
                return visitor.visitChildren(self)




    def argument(self):

        localctx = my_grammarParser.ArgumentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_argument)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 306
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,32,self._ctx)
            if la_ == 1:
                self.state = 298
                self.test()
                self.state = 300
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==63:
                    self.state = 299
                    self.comp_for()


                pass

            elif la_ == 2:
                self.state = 302
                self.test()
                self.state = 303
                self.match(my_grammarParser.EQUALS)
                self.state = 304
                self.test()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Compound_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def if_stmt(self):
            return self.getTypedRuleContext(my_grammarParser.If_stmtContext,0)


        def while_stmt(self):
            return self.getTypedRuleContext(my_grammarParser.While_stmtContext,0)


        def for_stmt(self):
            return self.getTypedRuleContext(my_grammarParser.For_stmtContext,0)


        def funcdef(self):
            return self.getTypedRuleContext(my_grammarParser.FuncdefContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_compound_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCompound_stmt" ):
                listener.enterCompound_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCompound_stmt" ):
                listener.exitCompound_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCompound_stmt" ):
                return visitor.visitCompound_stmt(self)
            else:
                return visitor.visitChildren(self)




    def compound_stmt(self):

        localctx = my_grammarParser.Compound_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_compound_stmt)
        try:
            self.state = 312
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [37]:
                self.enterOuterAlt(localctx, 1)
                self.state = 308
                self.if_stmt()
                pass
            elif token in [62]:
                self.enterOuterAlt(localctx, 2)
                self.state = 309
                self.while_stmt()
                pass
            elif token in [63]:
                self.enterOuterAlt(localctx, 3)
                self.state = 310
                self.for_stmt()
                pass
            elif token in [61]:
                self.enterOuterAlt(localctx, 4)
                self.state = 311
                self.funcdef()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(my_grammarParser.WHILE, 0)

        def test(self):
            return self.getTypedRuleContext(my_grammarParser.TestContext,0)


        def COLON(self):
            return self.getToken(my_grammarParser.COLON, 0)

        def suite(self):
            return self.getTypedRuleContext(my_grammarParser.SuiteContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_while_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile_stmt" ):
                listener.enterWhile_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile_stmt" ):
                listener.exitWhile_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile_stmt" ):
                return visitor.visitWhile_stmt(self)
            else:
                return visitor.visitChildren(self)




    def while_stmt(self):

        localctx = my_grammarParser.While_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_while_stmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 314
            self.match(my_grammarParser.WHILE)
            self.state = 315
            self.test()
            self.state = 316
            self.match(my_grammarParser.COLON)
            self.state = 317
            self.suite()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class For_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(my_grammarParser.FOR, 0)

        def NAME(self):
            return self.getToken(my_grammarParser.NAME, 0)

        def IN(self):
            return self.getToken(my_grammarParser.IN, 0)

        def range_func(self):
            return self.getTypedRuleContext(my_grammarParser.Range_funcContext,0)


        def COLON(self):
            return self.getToken(my_grammarParser.COLON, 0)

        def suite(self):
            return self.getTypedRuleContext(my_grammarParser.SuiteContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_for_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFor_stmt" ):
                listener.enterFor_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFor_stmt" ):
                listener.exitFor_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFor_stmt" ):
                return visitor.visitFor_stmt(self)
            else:
                return visitor.visitChildren(self)




    def for_stmt(self):

        localctx = my_grammarParser.For_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_for_stmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 319
            self.match(my_grammarParser.FOR)
            self.state = 320
            self.match(my_grammarParser.NAME)
            self.state = 321
            self.match(my_grammarParser.IN)
            self.state = 322
            self.range_func()
            self.state = 323
            self.match(my_grammarParser.COLON)
            self.state = 324
            self.suite()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Range_funcContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RANGE(self):
            return self.getToken(my_grammarParser.RANGE, 0)

        def test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TestContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TestContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COMMA)
            else:
                return self.getToken(my_grammarParser.COMMA, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_range_func

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRange_func" ):
                listener.enterRange_func(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRange_func" ):
                listener.exitRange_func(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRange_func" ):
                return visitor.visitRange_func(self)
            else:
                return visitor.visitChildren(self)




    def range_func(self):

        localctx = my_grammarParser.Range_funcContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_range_func)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 326
            self.match(my_grammarParser.RANGE)
            self.state = 327
            self.match(my_grammarParser.T__0)
            self.state = 328
            self.test()
            self.state = 335
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==38:
                self.state = 329
                self.match(my_grammarParser.COMMA)
                self.state = 330
                self.test()
                self.state = 333
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==38:
                    self.state = 331
                    self.match(my_grammarParser.COMMA)
                    self.state = 332
                    self.test()




            self.state = 337
            self.match(my_grammarParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncdefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DEF(self):
            return self.getToken(my_grammarParser.DEF, 0)

        def NAME(self):
            return self.getToken(my_grammarParser.NAME, 0)

        def parameters(self):
            return self.getTypedRuleContext(my_grammarParser.ParametersContext,0)


        def COLON(self):
            return self.getToken(my_grammarParser.COLON, 0)

        def suite(self):
            return self.getTypedRuleContext(my_grammarParser.SuiteContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_funcdef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncdef" ):
                listener.enterFuncdef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncdef" ):
                listener.exitFuncdef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFuncdef" ):
                return visitor.visitFuncdef(self)
            else:
                return visitor.visitChildren(self)




    def funcdef(self):

        localctx = my_grammarParser.FuncdefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_funcdef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 339
            self.match(my_grammarParser.DEF)
            self.state = 340
            self.match(my_grammarParser.NAME)
            self.state = 341
            self.parameters()
            self.state = 342
            self.match(my_grammarParser.COLON)
            self.state = 343
            self.suite()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametersContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typedargslist(self):
            return self.getTypedRuleContext(my_grammarParser.TypedargslistContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_parameters

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParameters" ):
                listener.enterParameters(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParameters" ):
                listener.exitParameters(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParameters" ):
                return visitor.visitParameters(self)
            else:
                return visitor.visitChildren(self)




    def parameters(self):

        localctx = my_grammarParser.ParametersContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_parameters)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 345
            self.match(my_grammarParser.T__0)
            self.state = 347
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 196736) != 0):
                self.state = 346
                self.typedargslist()


            self.state = 349
            self.match(my_grammarParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypedargslistContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tfpdef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TfpdefContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TfpdefContext,i)


        def COLON(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COLON)
            else:
                return self.getToken(my_grammarParser.COLON, i)

        def test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TestContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TestContext,i)


        def ASSIGN(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.ASSIGN)
            else:
                return self.getToken(my_grammarParser.ASSIGN, i)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COMMA)
            else:
                return self.getToken(my_grammarParser.COMMA, i)

        def variadicargs(self):
            return self.getTypedRuleContext(my_grammarParser.VariadicargsContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_typedargslist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypedargslist" ):
                listener.enterTypedargslist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypedargslist" ):
                listener.exitTypedargslist(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypedargslist" ):
                return visitor.visitTypedargslist(self)
            else:
                return visitor.visitChildren(self)




    def typedargslist(self):

        localctx = my_grammarParser.TypedargslistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_typedargslist)
        self._la = 0 # Token type
        try:
            self.state = 380
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 351
                self.tfpdef()
                self.state = 354
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,37,self._ctx)
                if la_ == 1:
                    self.state = 352
                    self.match(my_grammarParser.COLON)
                    self.state = 353
                    self.test()


                self.state = 358
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==13:
                    self.state = 356
                    self.match(my_grammarParser.ASSIGN)
                    self.state = 357
                    self.test()


                self.state = 372
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,41,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 360
                        self.match(my_grammarParser.COMMA)
                        self.state = 361
                        self.tfpdef()
                        self.state = 364
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,39,self._ctx)
                        if la_ == 1:
                            self.state = 362
                            self.match(my_grammarParser.COLON)
                            self.state = 363
                            self.test()


                        self.state = 368
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        if _la==13:
                            self.state = 366
                            self.match(my_grammarParser.ASSIGN)
                            self.state = 367
                            self.test()

                 
                    self.state = 374
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,41,self._ctx)

                self.state = 377
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==38:
                    self.state = 375
                    self.match(my_grammarParser.COMMA)
                    self.state = 376
                    self.variadicargs()


                pass
            elif token in [16, 17]:
                self.enterOuterAlt(localctx, 2)
                self.state = 379
                self.variadicargs()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariadicargsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STAR(self):
            return self.getToken(my_grammarParser.STAR, 0)

        def NAME(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.NAME)
            else:
                return self.getToken(my_grammarParser.NAME, i)

        def COLON(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COLON)
            else:
                return self.getToken(my_grammarParser.COLON, i)

        def test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TestContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TestContext,i)


        def COMMA(self):
            return self.getToken(my_grammarParser.COMMA, 0)

        def POWER(self):
            return self.getToken(my_grammarParser.POWER, 0)

        def getRuleIndex(self):
            return my_grammarParser.RULE_variadicargs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariadicargs" ):
                listener.enterVariadicargs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariadicargs" ):
                listener.exitVariadicargs(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariadicargs" ):
                return visitor.visitVariadicargs(self)
            else:
                return visitor.visitChildren(self)




    def variadicargs(self):

        localctx = my_grammarParser.VariadicargsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_variadicargs)
        self._la = 0 # Token type
        try:
            self.state = 403
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.enterOuterAlt(localctx, 1)
                self.state = 382
                self.match(my_grammarParser.STAR)
                self.state = 383
                self.match(my_grammarParser.NAME)
                self.state = 386
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,44,self._ctx)
                if la_ == 1:
                    self.state = 384
                    self.match(my_grammarParser.COLON)
                    self.state = 385
                    self.test()


                self.state = 395
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==38:
                    self.state = 388
                    self.match(my_grammarParser.COMMA)
                    self.state = 389
                    self.match(my_grammarParser.POWER)
                    self.state = 390
                    self.match(my_grammarParser.NAME)
                    self.state = 393
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,45,self._ctx)
                    if la_ == 1:
                        self.state = 391
                        self.match(my_grammarParser.COLON)
                        self.state = 392
                        self.test()




                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 2)
                self.state = 397
                self.match(my_grammarParser.POWER)
                self.state = 398
                self.match(my_grammarParser.NAME)
                self.state = 401
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,47,self._ctx)
                if la_ == 1:
                    self.state = 399
                    self.match(my_grammarParser.COLON)
                    self.state = 400
                    self.test()


                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TfpdefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NAME(self):
            return self.getToken(my_grammarParser.NAME, 0)

        def getRuleIndex(self):
            return my_grammarParser.RULE_tfpdef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTfpdef" ):
                listener.enterTfpdef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTfpdef" ):
                listener.exitTfpdef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTfpdef" ):
                return visitor.visitTfpdef(self)
            else:
                return visitor.visitChildren(self)




    def tfpdef(self):

        localctx = my_grammarParser.TfpdefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_tfpdef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 405
            self.match(my_grammarParser.NAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Yield_exprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def YIELD(self):
            return self.getToken(my_grammarParser.YIELD, 0)

        def testlist(self):
            return self.getTypedRuleContext(my_grammarParser.TestlistContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_yield_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterYield_expr" ):
                listener.enterYield_expr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitYield_expr" ):
                listener.exitYield_expr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitYield_expr" ):
                return visitor.visitYield_expr(self)
            else:
                return visitor.visitChildren(self)




    def yield_expr(self):

        localctx = my_grammarParser.Yield_exprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_yield_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 407
            self.match(my_grammarParser.YIELD)
            self.state = 409
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if ((((_la - 14)) & ~0x3f) == 0 and ((1 << (_la - 14)) & 13519594975395843) != 0):
                self.state = 408
                self.testlist()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TestlistContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TestContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TestContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COMMA)
            else:
                return self.getToken(my_grammarParser.COMMA, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_testlist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestlist" ):
                listener.enterTestlist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestlist" ):
                listener.exitTestlist(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestlist" ):
                return visitor.visitTestlist(self)
            else:
                return visitor.visitChildren(self)




    def testlist(self):

        localctx = my_grammarParser.TestlistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 74, self.RULE_testlist)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 411
            self.test()
            self.state = 416
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==38:
                self.state = 412
                self.match(my_grammarParser.COMMA)
                self.state = 413
                self.test()
                self.state = 418
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LambdefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LAMBDA(self):
            return self.getToken(my_grammarParser.LAMBDA, 0)

        def COLON(self):
            return self.getToken(my_grammarParser.COLON, 0)

        def test(self):
            return self.getTypedRuleContext(my_grammarParser.TestContext,0)


        def typedargslist(self):
            return self.getTypedRuleContext(my_grammarParser.TypedargslistContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_lambdef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLambdef" ):
                listener.enterLambdef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLambdef" ):
                listener.exitLambdef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLambdef" ):
                return visitor.visitLambdef(self)
            else:
                return visitor.visitChildren(self)




    def lambdef(self):

        localctx = my_grammarParser.LambdefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 76, self.RULE_lambdef)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 419
            self.match(my_grammarParser.LAMBDA)
            self.state = 421
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 196736) != 0):
                self.state = 420
                self.typedargslist()


            self.state = 423
            self.match(my_grammarParser.COLON)
            self.state = 424
            self.test()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SubscriptlistContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def subscript(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.SubscriptContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.SubscriptContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COMMA)
            else:
                return self.getToken(my_grammarParser.COMMA, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_subscriptlist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSubscriptlist" ):
                listener.enterSubscriptlist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSubscriptlist" ):
                listener.exitSubscriptlist(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSubscriptlist" ):
                return visitor.visitSubscriptlist(self)
            else:
                return visitor.visitChildren(self)




    def subscriptlist(self):

        localctx = my_grammarParser.SubscriptlistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 78, self.RULE_subscriptlist)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 426
            self.subscript()
            self.state = 431
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==38:
                self.state = 427
                self.match(my_grammarParser.COMMA)
                self.state = 428
                self.subscript()
                self.state = 433
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comp_forContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(my_grammarParser.FOR, 0)

        def exprlist(self):
            return self.getTypedRuleContext(my_grammarParser.ExprlistContext,0)


        def IN(self):
            return self.getToken(my_grammarParser.IN, 0)

        def or_test(self):
            return self.getTypedRuleContext(my_grammarParser.Or_testContext,0)


        def getRuleIndex(self):
            return my_grammarParser.RULE_comp_for

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComp_for" ):
                listener.enterComp_for(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComp_for" ):
                listener.exitComp_for(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComp_for" ):
                return visitor.visitComp_for(self)
            else:
                return visitor.visitChildren(self)




    def comp_for(self):

        localctx = my_grammarParser.Comp_forContext(self, self._ctx, self.state)
        self.enterRule(localctx, 80, self.RULE_comp_for)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 434
            self.match(my_grammarParser.FOR)
            self.state = 435
            self.exprlist()
            self.state = 436
            self.match(my_grammarParser.IN)
            self.state = 437
            self.or_test()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class If_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(my_grammarParser.IF, 0)

        def test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TestContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TestContext,i)


        def COLON(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COLON)
            else:
                return self.getToken(my_grammarParser.COLON, i)

        def suite(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.SuiteContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.SuiteContext,i)


        def ELIF(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.ELIF)
            else:
                return self.getToken(my_grammarParser.ELIF, i)

        def ELSE(self):
            return self.getToken(my_grammarParser.ELSE, 0)

        def getRuleIndex(self):
            return my_grammarParser.RULE_if_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIf_stmt" ):
                listener.enterIf_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIf_stmt" ):
                listener.exitIf_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf_stmt" ):
                return visitor.visitIf_stmt(self)
            else:
                return visitor.visitChildren(self)




    def if_stmt(self):

        localctx = my_grammarParser.If_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 82, self.RULE_if_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 439
            self.match(my_grammarParser.IF)
            self.state = 440
            self.test()
            self.state = 441
            self.match(my_grammarParser.COLON)
            self.state = 442
            self.suite()
            self.state = 450
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==35:
                self.state = 443
                self.match(my_grammarParser.ELIF)
                self.state = 444
                self.test()
                self.state = 445
                self.match(my_grammarParser.COLON)
                self.state = 446
                self.suite()
                self.state = 452
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 456
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==36:
                self.state = 453
                self.match(my_grammarParser.ELSE)
                self.state = 454
                self.match(my_grammarParser.COLON)
                self.state = 455
                self.suite()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SuiteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def simple_stmt(self):
            return self.getTypedRuleContext(my_grammarParser.Simple_stmtContext,0)


        def NEWLINE(self):
            return self.getToken(my_grammarParser.NEWLINE, 0)

        def INDENT(self):
            return self.getToken(my_grammarParser.INDENT, 0)

        def DEDENT(self):
            return self.getToken(my_grammarParser.DEDENT, 0)

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.StmtContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.StmtContext,i)


        def getRuleIndex(self):
            return my_grammarParser.RULE_suite

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSuite" ):
                listener.enterSuite(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSuite" ):
                listener.exitSuite(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSuite" ):
                return visitor.visitSuite(self)
            else:
                return visitor.visitChildren(self)




    def suite(self):

        localctx = my_grammarParser.SuiteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 84, self.RULE_suite)
        self._la = 0 # Token type
        try:
            self.state = 468
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 15, 57, 67]:
                self.enterOuterAlt(localctx, 1)
                self.state = 458
                self.simple_stmt()
                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 2)
                self.state = 459
                self.match(my_grammarParser.NEWLINE)
                self.state = 460
                self.match(my_grammarParser.INDENT)
                self.state = 462 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 461
                    self.stmt()
                    self.state = 464 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (((((_la - 14)) & ~0x3f) == 0 and ((1 << (_la - 14)) & 10001157774639107) != 0)):
                        break

                self.state = 466
                self.match(my_grammarParser.DEDENT)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SubscriptContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def test(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.TestContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.TestContext,i)


        def COLON(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COLON)
            else:
                return self.getToken(my_grammarParser.COLON, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_subscript

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSubscript" ):
                listener.enterSubscript(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSubscript" ):
                listener.exitSubscript(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSubscript" ):
                return visitor.visitSubscript(self)
            else:
                return visitor.visitChildren(self)




    def subscript(self):

        localctx = my_grammarParser.SubscriptContext(self, self._ctx, self.state)
        self.enterRule(localctx, 86, self.RULE_subscript)
        self._la = 0 # Token type
        try:
            self.state = 487
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,61,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 470
                self.test()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 472
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if ((((_la - 14)) & ~0x3f) == 0 and ((1 << (_la - 14)) & 13519594975395843) != 0):
                    self.state = 471
                    self.test()


                self.state = 474
                self.match(my_grammarParser.COLON)
                self.state = 476
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if ((((_la - 14)) & ~0x3f) == 0 and ((1 << (_la - 14)) & 13519594975395843) != 0):
                    self.state = 475
                    self.test()


                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 478
                self.test()
                self.state = 479
                self.match(my_grammarParser.COLON)
                self.state = 481
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if ((((_la - 14)) & ~0x3f) == 0 and ((1 << (_la - 14)) & 13519594975395843) != 0):
                    self.state = 480
                    self.test()


                self.state = 483
                self.match(my_grammarParser.COLON)
                self.state = 485
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if ((((_la - 14)) & ~0x3f) == 0 and ((1 << (_la - 14)) & 13519594975395843) != 0):
                    self.state = 484
                    self.test()


                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprlistContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(my_grammarParser.ExprContext)
            else:
                return self.getTypedRuleContext(my_grammarParser.ExprContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(my_grammarParser.COMMA)
            else:
                return self.getToken(my_grammarParser.COMMA, i)

        def getRuleIndex(self):
            return my_grammarParser.RULE_exprlist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprlist" ):
                listener.enterExprlist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprlist" ):
                listener.exitExprlist(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprlist" ):
                return visitor.visitExprlist(self)
            else:
                return visitor.visitChildren(self)




    def exprlist(self):

        localctx = my_grammarParser.ExprlistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 88, self.RULE_exprlist)
        self._la = 0 # Token type
        try:
            self.state = 497
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,63,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 492 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 489
                    self.expr()
                    self.state = 490
                    self.match(my_grammarParser.COMMA)
                    self.state = 494 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (((((_la - 14)) & ~0x3f) == 0 and ((1 << (_la - 14)) & 9015995347763203) != 0)):
                        break

                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 496
                self.expr()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





