;; This table defines the possible hit location of the ball on the paddle.
;; The insed is one of 64 possible angles (which correspond to the Ball
;; movement possibilities).
l_PaddleHit:
        DB 0, 130,  140,  000	;#032
        DB 0, 134,  144,  000	;#033
        DB 0, 138,  148,  000	;#034
        DB 0, 142,  152,  000	;#035
        DB 0, 146,  156,  000	;#036
        DB 0, 150,  160,  000	;#037
        DB 0, 154,  164,  000	;#038
        DB 0, 158,  168,  000	;#039

        DB 0, 162,  172,  000	;#040
        DB 0, 166,  176,  000	;#041
        DB 0, 170,  180,  000	;#042
        DB 0, 174,  184,  000	;#043
        DB 0, 179,  188,  000	;#044
        DB 0, 182,  192,  000	;#045
        DB 0, 186,  196,  000	;#046
        DB 0, 190,  200,  000	;#047
        DB 0, 194,  204,  000	;#048
        DB 0, 198,  208,  000	;#049

        DB 0, 202,  212,  000	;#050
        DB 0, 206,  216,  000	;#051
        DB 0, 210,  220,  000	;#052
        DB 0, 214,  224,  000	;#053
        DB 0, 218,  228,  000	;#054
        DB 0, 222,  232,  000	;#055
        DB 0, 226,  236,  000	;#056
        DB 0, 230,  240,  000	;#057
        DB 0, 234,  244,  000	;#058
        DB 0, 238,  248,  000	;#059

        DB 0, 242,  252,  000	;#060
        DB 1, 246,  000,  000	;#061
        DB 1, 250,  004,  000	;#062
        DB 1, 254,  008,  000	;#063
l_PaddleHitEntry:
        DB 0, 000,  010,  000	;#000
        DB 0, 004,  014,  000   ;#001
        DB 0, 008,  018,  000	;#002
        DB 0, 012,  022,  000   ;#003
        DB 0, 016,  026,  000	;#004
        DB 0, 020,  030,  000	;#005
        DB 0, 024,  034,  000	;#006
        DB 0, 028,  038,  000	;#007
        DB 0, 032,  042,  000	;#008
        DB 0, 036,  046,  000	;#009
        DB 0, 040,  050,  000	;#010

        DB 0, 044,  054,  000	;#011
        DB 0, 048,  058,  000	;#012
        DB 0, 052,  062,  000	;#013
        DB 0, 056,  066,  000	;#014
        DB 0, 060,  070,  000	;#015
        DB 0, 064,  074,  000	;#016
        DB 0, 068,  078,  000	;#017
        DB 0, 072,  082,  000	;#018
        DB 0, 076,  086,  000	;#019
        DB 0, 080,  090,  000	;#020
        DB 0, 084,  094,  000	;#021
        DB 0, 088,  098,  000	;#022

        DB 0, 092,  102,  000	;#023
        DB 0, 096,  106,  000	;#024
        DB 0, 102,  112,  000	;#025
        DB 0, 106,  116,  000	;#026
        DB 0, 110,  120,  000	;#027
        DB 0, 114,  124,  000	;#028
        DB 0, 118,  128,  000	;#029
        DB 0, 122,  132,  000	;#030
        DB 0, 126,  136,  000	;#031
