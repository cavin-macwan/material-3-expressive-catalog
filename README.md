# Jetpack Boilerplate

A boilerplate project for modern Android application development using Jetpack libraries.

## 🌟 Features

*   **Jetpack Compose:** Built with a modern declarative UI toolkit.
*   **Hilt:** For dependency injection.
*   **Navigation 3:** For navigating between composable screens.
*   **MVVM Architecture** 

## 🛠️ Tech Stack & Libraries

*   [Kotlin](https://kotlinlang.org/)
*   [Jetpack Compose](https://developer.android.com/jetpack/compose)
*   [Hilt (for Dependency Injection)](https://developer.android.com/training/dependency-injection/hilt-android)
*   [Navigation Compose](https://developer.android.com/guide/navigation/navigation-3)
*   [AndroidX Libraries](https://developer.android.com/jetpack/androidx)

## 🚀 Getting Started

### Prerequisites

*   Android Studio (latest canary version recommended)
*   Kotlin (configured with Android Studio)

### Installation

1.  Clone the repository:
    ```bash
    git clone https://github.com/cavin-macwan/jetpack-boilerplate.git
    ```
2.  Open the project in Android Studio.
3.  Let Android Studio sync the Gradle files and download the necessary dependencies.
4.  Build and run the application on an emulator or a physical device.

## 🏗️ Project Structure

```
Jetpack Boilerplate/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/meticha/jetpackboilerplate/  # Main application code
│   │   │   │   ├── di/                               # Hilt dependency injection modules
│   │   │   │   ├── navigation/                       # Navigation graph and setup
│   │   │   │   ├── ui/                               # UI components (themes)
│   │   │   │   ├── feature/                          # Screens, ViewModels
│   │   │   │   └── MyApplication.kt                  # Application class
│   │   │   └── res/                                  # Resources (layouts, drawables, strings)
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts                            # App-level Gradle file
├── gradle/
│   └── libs.versions.toml                          # Version catalog
└── build.gradle.kts                                # Project-level Gradle file
```


## 🧑‍💻 Usage

This project serves as a starting point for building Android applications with a modern tech stack.
You can extend it by:
*   Adding new screens (Composables).
*   Implementing new features and business logic.
*   Integrating more Jetpack libraries or third-party dependencies as needed.

## 🤝 Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:
1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/your-feature-name`).
3.  Make your changes.
4.  Commit your changes (`git commit -m 'Add some feature'`).
5.  Push to the branch (`git push origin feature/your-feature-name`).
6.  Open a Pull Request.

## 📝 License

This project is licensed under the [MIT License](LICENSE.md) - see the LICENSE.md file for details

---