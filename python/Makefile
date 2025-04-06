.PHONY: python_install python_test

python_test: python_install
	@echo "Running Python tests"
	@python -m pytest -s -c tests/pytest.ini
	@echo

python_install:
	@python3.13 -m pip install --upgrade pip pipenv "pipenv==2024.2.0" wheel setuptools
	@python3.13 -m pipenv install --system --dev
