#!/bin/sh

echo "Generating configure files... may take a while."

# Silent warning about missing directory
mkdir -p m4

autoreconf --install --force && \
  echo "Preparing was successful if there was no error messages above." && \
  echo "Now type:" && \
  echo "  ./configure && make"  && \
  echo "Run './configure --help' for more information"
