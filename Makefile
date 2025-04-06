.PHONY: all go_test java_test python_test

all: go_test java_test python_test

go_test:
	@echo "Running Go tests"
	@cd go && go test ./...
	@echo

java_test:
	@echo "Running Java tests"
	@cd java && ./gradlew test
	@echo

python_test:
	@echo "Running Python tests"
	@cd python && pipenv install --dev && source .venv/bin/activate && python -m pytest -s -c tests/pytest.ini
	@echo
