# KLibAPNG
*A fully-managed APNG Parser*

## Introduction
This is a Kotlin port of [xupefei's APNG.NET project](https://github.com/xupefei/APNG.NET).

## PNG and APNG specification support status

*   For simple PNG, All chunks but `IHDR`, `IDAT` and `IEND` are **unsupported**, and will be **ignored** during the parsing.
*   For APNG, the library **can only** parse `IHDR`, `acTL`, `fcTL`, `IDAT`, `fdAT` and `IEND` chunks.
*   Multiple frame sizes are **supported**. This means you can reduce the file size by using *Differential Frames*.
*   All `DISPOSE_OP`s and `BLEND_OP`s are **supported**.

## About the code

>   A simple library that handles parsing APNG files.
>   This library is *backward-compatible*: It means you can use this library to read an simple PNG image, with no error produced.
>   The APNGSplitter object allows you to split the parsed APNG's frames with or without ops applied, and with or without the delays, 
>   into byte arrays (paired with ints if with delays)

## Useful links

*   [http://en.wikipedia.org/wiki/APNG](http://en.wikipedia.org/wiki/APNG)
*   [PNG (Portable Network Graphics) Specification](http://www.libpng.org/pub/png/spec/1.2/png-1.2-pdg.html)
*   [APNG (Animated Portable Network Graphics) Specification](https://wiki.mozilla.org/APNG_Specification)
