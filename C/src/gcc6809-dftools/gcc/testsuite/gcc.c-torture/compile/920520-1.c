/* { dg-do compile } */
/* { dg-xfail-if "" { m6811-*-* m6812-*-* } { "*" } { "" } } */
/* { dg-skip-if "float in register" { m6809-*-* m6811-*-* m6812-*-* } { "*" } { "" } } */

f(){asm("%0"::"r"(1.5F));}g(){asm("%0"::"r"(1.5));}