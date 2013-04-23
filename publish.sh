sh createDocument.sh
tmpDir=$(mktemp -dt 'gh-pages')
echo $tmpDir

cp target/doxygen/busbuddy.pdf $tmpDir/
cp -r target/doxygen/html $tmpDir/

git checkout gh-pages

cp -r $tmpDir/* downloads/

rm -rf $tmpDir

#git add .
#git commit -m "Updated documentation."

#git checkout master
