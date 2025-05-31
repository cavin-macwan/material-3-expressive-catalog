# Jetpack Boilerplate

A minimal boilerplate project designed to kickstart new Android application development. This boilerplate is pre-configured with a modern tech stack, including Hilt for dependency injection, Jetpack Navigation Compose, and an **alpha version of Jetpack Compose to explore the latest Material 3 expressive features**.

## 🌟 Features

*   **Minimal Setup:** Intentionally lean to provide a clean slate for your project.
*   **Jetpack Compose:** Built with a modern declarative UI toolkit.
*   **Material 3 Expressive (via Alpha Version):** Experiment with the latest Material Design 3 expressive features using an alpha version of Compose BOM.
*   **Hilt:** For robust dependency injection.
*   **Navigation 3:** For navigating between composable screens (leveraging the latest navigation patterns).
*   **MVVM Architecture:** A foundational MVVM pattern to get you started.

## 🛠️ Tech Stack & Libraries

*   [Kotlin](https://kotlinlang.org/)
*   [Jetpack Compose (Alpha version for Material 3 expressive features)](https://developer.android.com/jetpack/compose)
*   [Hilt (for Dependency Injection)](https://developer.android.com/training/dependency-injection/hilt-android)
*   [Navigation Compose](https://developer.android.com/guide/navigation/navigation-3)
*   [AndroidX Libraries](https://developer.android.com/jetpack/androidx)

## 🚀 Getting Started

### Prerequisites

*   Android Studio (latest stable version, or **consider using the latest Canary version of Android Studio for the best compatibility with alpha versions of Jetpack Compose**).

### Installation

1.  Clone the repository:
    ```bash
    git clone https://github.com/cavin-macwan/jetpack-boilerplate.git
    ```
2.  Open the project in Android Studio.
3.  Let Android Studio sync the Gradle files and download the necessary dependencies.
4.  Build and run the application on an emulator or a physical device.

## 🏗️ Project Structure

(Adjust this section if your actual structure differs significantly)
```
Jetpack Boilerplate/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/meticha/jetpackboilerplate/  # Main application code
│   │   │   │   ├── di/                               # Hilt dependency injection modules
│   │   │   │   ├── navigation/                       # Navigation graph and setup
│   │   │   │   ├── ui/                               # UI components (themes, composables)
│   │   │   │   ├── feature/                          # Screens, ViewModels for specific features
│   │   │   │   └── MyApplication.kt                  # Application class
│   │   │   └── res/                                  # Resources (drawables, strings)
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts                            # App-level Gradle file
├── gradle/
│   └── libs.versions.toml                          # Version catalog
└── build.gradle.kts                                # Project-level Gradle file
```

## 🧑‍💻 Usage

This project serves as a starting point. Key benefits include:
*   **Rapid Prototyping:** Quickly test out new ideas with a modern Android setup.
*   **Learning Resource:** Explore how Hilt, Navigation Compose, and Material 3 expressive features work together.
*   **Foundation for New Apps:** Build upon this boilerplate by adding your unique features and business logic.

You can extend it by:
*   Adding new screens (Composables).
*   Implementing new features and business logic.
*   Updating dependencies in `gradle/libs.versions.toml` as new stable versions are released.

## 🤝 Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:
1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/your-feature-name`).
3.  Make your changes.
4.  Commit your changes (`git commit -m 'Add some feature'`).
5.  Push to the branch (`git push origin feature/your-feature-name`).
6.  Open a Pull Request.

## 📝 License

This project is licensed under the [MIT License](LICENSE.md) - see the [LICENSE.md](LICENSE.md) file for details.

---
