.PHONY: all go_test java_test python_install python_test

all: go_test java_test python_test

go_test:
	@echo "Running Go tests"
	@cd go && go test ./...
	@echo

java_test:
	@echo "Running Java tests"
	@cd java && ./gradlew test
	@echo

python_install:
	@cd python && \
		python3.13 -m pip install --upgrade pip pipenv "pipenv==2024.2.0" wheel setuptools && \
		python3.13 -m pipenv install --system --dev

python_test: python_install
	@echo "Running Python tests"
	@cd python && \
		python -m pytest -s -c tests/pytest.ini
	@echo
