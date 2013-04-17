#rm -rf target/doxygen
#mkdir target/doxygen
doxygen Doxyfile
cd target/doxygen/latex
make
cp refman.pdf ../busbuddy.pdf
