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
		python3.13 -m venv .venv && \
		source .venv/bin/activate && \
		python -m pip install -U pipenv && \
		pipenv install --dev

python_test: python_install
	@echo "Running Python tests"
	@cd python && \
		source .venv/bin/activate && \
		python -m pytest -s -c tests/pytest.ini
	@echo
