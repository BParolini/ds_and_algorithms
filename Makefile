all:
	make go
	make java
	make python

go:
	cd go
	go test .../.
	cd ..

java:
	cd java
	gradle test
	cd ..

python:
	cd python
	python -m pytest -s -c tests/pytest.ini ./src
	cd ..
