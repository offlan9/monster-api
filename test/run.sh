#!/bin/sh
cd $(dirname $0)

cd ..

./gradlew build
ret=$?
if [ $ret -ne 0 ]; then
exit $ret
fi
rm -rf build
