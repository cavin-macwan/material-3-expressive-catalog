# Contributing to Material 3 Expressive Catalog

First off, thank you for considering contributing to TriggerX! It's people like you that make
TriggerX such a great tool.

## Where do I go from here?

If you've noticed a bug or have a feature
request, [make one!](https://github.com/cavin-macwan/material-3-expressive-catalog/issues/new) It's
generally best if you get confirmation of your bug or approval for your feature request this way
before starting to code.

If you have a general question, feel free to ask on the project's issues page as well.

## Fork & create a branch

If you've decided to contribute code, the first step is to fork the repository and create a new
branch for your work. A good branch name would be something like `feature/your-new-feature` or
`fix/bug-description`.

```bash
git checkout -b feature/your-awesome-feature
```

## Setting up the project

1. Clone your fork locally:
   ```bash
   git clone https://github.com/<YOUR_USERNAME>/triggerx.git
   ```
2. Open the project in Android Studio.
3. Let Android Studio download all the necessary dependencies and sync the project.
4. You should be able to build the project and run the sample app.

## Coding Guidelines

* **Consistency:** Try to maintain consistency with the existing codebase. This includes code style,
  naming conventions, and project structure.
* **Kotlin:** Write new code in Kotlin, following modern Android development practices.
* **Comments:** Add KDoc comments for all public APIs and clarify complex logic with inline comments
  where necessary.
* **Testing:** While not strictly enforced for all contributions yet, adding unit tests for new
  logic is highly encouraged.
* **Commit Messages:** Write clear and concise commit messages. A good commit message should briefly
  explain the "what" and "why" of the change.

## Making a Pull Request

When you're ready to submit your contribution, please follow these steps:

1. **Test your changes:** Ensure your changes work as expected and don't introduce any new issues.
   Build the project and run the sample if applicable.
2. Apply spotless:
3. ```bash
   ./gradlew spotlessApply
   ```
4. **Commit your changes:** Make sure your commit messages are clear.
5. **Push your branch:**
   ```bash
   git push origin feature/your-awesome-feature
   ```
6**Open a Pull Request (PR):**
* Navigate to the original TriggerX repository on GitHub.
* You should see a prompt to create a PR from your recently pushed branch.
* Provide a clear title and a detailed description of your changes in the PR.
* Reference any relevant issues (e.g., "Fixes #123").
* Ensure your PR is made against the `main` branch (or the relevant development branch).

## Code of Conduct

By contributing to TriggerX, you agree to abide by
the [Contributor Covenant Code of Conduct](CODE_OF_CONDUCT.md). Please ensure you are familiar with
its terms.

## Getting Help

If you get stuck or have any questions while contributing, don't hesitate to ask for help by opening
an issue.

Thank you again for your contribution!

## Security Issues

For security vulnerabilities, please email cavin@meticha.com instead of opening a public issue.