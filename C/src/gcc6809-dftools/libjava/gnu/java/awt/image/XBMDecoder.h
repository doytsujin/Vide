
// DO NOT EDIT THIS FILE - it is machine generated -*- c++ -*-

#ifndef __gnu_java_awt_image_XBMDecoder__
#define __gnu_java_awt_image_XBMDecoder__

#pragma interface

#include <gnu/java/awt/image/ImageDecoder.h>
#include <gcj/array.h>

extern "Java"
{
  namespace gnu
  {
    namespace java
    {
      namespace awt
      {
        namespace image
        {
            class XBMDecoder;
        }
      }
    }
  }
  namespace java
  {
    namespace awt
    {
      namespace image
      {
          class ColorModel;
      }
    }
    namespace net
    {
        class URL;
    }
  }
}

class gnu::java::awt::image::XBMDecoder : public ::gnu::java::awt::image::ImageDecoder
{

public:
  XBMDecoder(::java::lang::String *);
  XBMDecoder(::java::net::URL *);
  virtual void produce(::java::util::Vector *, ::java::io::InputStream *);
  static JArray< jint > * getScanline(::java::io::Reader *, jint);
public: // actually package-private
  ::java::io::BufferedReader * __attribute__((aligned(__alignof__( ::gnu::java::awt::image::ImageDecoder)))) reader;
  static ::java::awt::image::ColorModel * cm;
  static const jint black = -16777216;
  static const jint transparent = 0;
  static JArray< jint > * masktable;
public:
  static ::java::lang::Class class$;
};

#endif // __gnu_java_awt_image_XBMDecoder__