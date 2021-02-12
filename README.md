# Gerolt: A toolkit of FINAL FANTASY XIV for Kotlin

[![Kotlin](https://img.shields.io/badge/Kotlin-1.4.30-blue.svg)](https://kotlinlang.org)
[![GitHub release (latest by date)](https://img.shields.io/github/v/release/StarryBlueSky/Gerolt)](https://github.com/StarryBlueSky/Gerolt/releases)
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/StarryBlueSky/Gerolt/Check)](https://github.com/StarryBlueSky/Gerolt)
[![License](https://img.shields.io/github/license/StarryBlueSky/Gerolt.svg)](https://github.com/StarryBlueSky/Gerolt/blob/master/LICENSE)
[![Issues](https://img.shields.io/github/issues/StarryBlueSky/Gerolt.svg)](https://github.com/StarryBlueSky/Gerolt/issues)
[![Pull Requests](https://img.shields.io/github/issues-pr/StarryBlueSky/Gerolt.svg)](https://github.com/StarryBlueSky/Gerolt/pulls)

* Conversion between Eorzea Time & Earth Time.
* Weather forecasts.

## Quick example

```kotlin
fun main() {
    // Gets current Eorzea Time
    val time = EorzeaTime.now()
    
    // Eorzea Time to Earth Time (java.time.Instant)
    val earthTime = time.toEarthTime()
    
    // Eorzea zones enum
    val zone = EorzeaZone.TheLavenderBeds
    
    // Forecasts the weather at The Lavender Beds at [time].
    val weather = time.weather(zone)
}
```

More examples of Gerolt can be found at [Wiki](https://github.com/StarryBlueSky/Gerolt/wiki/Sample). Please feel free to create [new issue](https://github.com/StarryBlueSky/Gerolt/issues/new/choose) if you have any questions.

## Setup

We moved the repository to Maven Central.

[![GitHub release (latest by date)](https://img.shields.io/github/v/release/StarryBlueSky/Gerolt)](https://github.com/StarryBlueSky/Gerolt/releases)

### Gradle Kotlin DSL

We recommend using Gradle Kotlin DSL instead of classic build.gradle.  

#### build.gradle.kts

```kotlin
dependencies {
    implementation("blue.starry:gerolt:$GeroltVersion")
}
```

## License

Gerolt is provided under MIT license.  

Copyright (c) 2017-2021 StarryBlueSky.
