# Smart wristband bluetooth app
<br>
<p align="center">A smart wristband app designed for the visually impaired, connected to aurdino with H-05 Bluetooth Module, ultrasonic sensor measures distance and transmits data via bluetooth. If distance is so close this app will notificate to you.</p>
 <br>

<p align="center">
<a href="https://opensource.org/licenses/Apache-2.0"><img src="https://img.shields.io/badge/License-Apache%202.0-red.svg"></a>
<a href="https://github.com/ErenMlg"><img src="https://img.shields.io/badge/github-ErenMlg-blue"></a>
</p>

## Tech Stack
<ul>
 <li>This project developed with %100 with <a href="https://developer.android.com/kotlin?hl=tr">Kotlin</a></li>
 <li>This project developer with <a href="https://developer.android.com/develop/ui/compose?hl=tr">Compose</a></li>
 <li>Made with <a href="https://developer.android.com/topic/architecture?hl=tr">Android Architecture Components</a> for the Collection of libraries that help you design robust, testable, and maintainable apps.</li>
 <li><a href="https://developer.android.com/topic/libraries/architecture/viewmodel?hl=tr">ViewModel</a>: The ViewModel class is a business logic or screen level state holder. It exposes state to the UI and encapsulates related business logic. Its principal advantage is that it caches state and persists it through configuration changes. This means that your UI doesn’t have to fetch data again when navigating between activities, or following configuration changes, such as when rotating the screen.</li>
 <li><a href="https://developer.android.com/kotlin/coroutines"">Kotlin Coroutine</a>On Android, coroutines help to manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive. Over 50% of professional developers who use coroutines have reported seeing increased productivity. This topic describes how you can use Kotlin coroutines to address these problems, enabling you to write cleaner and more concise app code.</li>
 <li><a href="https://developer.android.com/training/dependency-injection/hilt-android">Dependency Injection with Hilt</a>: Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project. Doing manual dependency injection requires you to construct every class and its dependencies by hand, and to use containers to reuse and manage dependencies.</li>
 <li><a href="https://kotlinlang.org/docs/ksp-overview.html">Kotlin KSP</a>: Kotlin Symbol Processing (KSP) is an API that you can use to develop lightweight compiler plugins</li>
 <li><a href="https://developer.android.com/topic/architecture/data-layer">Repository</a>: This located in data layer that contains application data and business logic. </li>
</ul>

## Architecture
This app uses <a href="https://developer.android.com/topic/architecture?hl=tr#recommended-app-arch"> MVVM (Model View View-Model)</a> architecture structure.
<img src="https://camo.githubusercontent.com/fbd92f5206e4fdf48b0827b9aa91211446eed9d9d0e2d2464156fe064b8b4e8c/68747470733a2f2f692e737461636b2e696d6775722e636f6d2f637233516b2e706e67">

## Api Structure
<ul>
  <li>Data: The data layer holds the data related stuff and implements the interfaces in the domain layer.</li>
  <li>Di: The di layer hold the class and objects for the dependecy injection.</li>
  <li>Domain: The domain layer hold the use-cases and skeleton of the app structure(Interfaces, etc.).</li>
  <li>Presentation: The presentation layer hold the all of things related by ui.</li>
</ul>



## License
<pre>
Designed and developed by 2024 ErenMlg (Eren Mollaoğlu)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>

## End Note
I may have mistakes, you can contact me for your feedback. 👉 📫 **eren.mollaoglu@outlook.com**<br>
