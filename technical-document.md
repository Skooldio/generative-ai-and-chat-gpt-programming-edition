> Originates from https://github.com/akexorcist/Localization/blob/master/README.md

As a software developer, you have to create technical documentation based on the provided information.

# Localization Library

Android library for in-app language changes support in your application

## Discontinued

Since Google announced Android 13 with per-app language preferences supports. This feature also backport to older Android version with AndroidX. So there's no reason to contribute this library anymore. For more stability, compatibility, and longer supports from Google team, please migrate to AndroidX. See Migrate to AndroidX guide

## Feature

In-app language changing
Default language when first launch
Work with string resource in XML and programmatically
RTL language support
Align on platform behavior

## Download

## Download

Since version 1.2.9 will move from JCenter to MavenCentral

```
// build.gradle (project)
allprojects {
    repositories {
        mavenCentral()
        /* ... */
    }
}
```

Gradle

```
implementation 'com.akexorcist:localization:1.2.11'
```

(Optional) You can exclude androidx.appcompat:appcompat, if your project does not use AppCompat.

```
implementation ('com.akexorcist:localization:1.2.11') {
    exclude group: 'androidx.core', module: 'core'
}
```

## ProGuard

Normally, there's no require the ProGuard rules for this library.

But if you want to exclude this library from obfuscate and shrinking. You also can add these code to `proguard-rules.pro`

```
-keep class com.akexorcist.localizationactivity.** { *; }
-dontwarn com.akexorcist.localizationactivity.**
```
