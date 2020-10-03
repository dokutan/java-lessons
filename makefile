all:
	mkdir -p ./bin
	javac src/*/*.java -d ./bin

clean:
	rm -r ./bin
