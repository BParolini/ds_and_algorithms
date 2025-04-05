.PHONY: all go_test java_test python_test

all: go_test java_test python_test

go_test:
	cd go && go test ./...

java_test:
	cd java && ./gradlew test

python_test:
	cd python && python -m pytest -s -c tests/pytest.ini ./src
