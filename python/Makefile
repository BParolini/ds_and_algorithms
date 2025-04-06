.PHONY: python_install python_test

python_test: python_install
	@echo "Running Python tests"
	@pipenv run pytest -s -c tests/pytest.ini
	@echo

python_install:
	@python3.13 -m pip install --upgrade pip pipenv wheel setuptools
	ls
	@pipenv install --dev
