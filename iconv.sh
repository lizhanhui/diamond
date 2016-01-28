#!/usr/bin/env bash
find . -name \*.java -type f | \
    (while read file; do
     iconv -f GBK -t UTF-8 "$file" > "${file}.utf8";
     mv ${file}.utf8 ${file}
     done);
