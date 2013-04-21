sh createDocument.sh
tmpDir=$(mktemp -dt 'gh-pages')
echo $tmpDir

cp target/doxygen/busbuddy.pdf $tmpDir/

git checkout gh-pages

cp $tmpDir/busbuddy.pdf downloads/

rm -rf $tmpDir

git add .
git commit -m "Updated documentation."

git checkout master
