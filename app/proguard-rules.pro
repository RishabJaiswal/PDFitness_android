# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#To preserve the info Crashlytics needs for readable crash reports
-keepattributes Signature
-keepattributes *Annotation*
-keepattributes SourceFile,LineNumberTable
-keep public class * extends java.lang.Exception

#Source: https://firebase.google.com/docs/crashlytics/get-deobfuscated-reports?platform=android
#For faster builds with ProGuard, exclude Crashlytics
-keep class com.crashlytics.** { *; }
-dontwarn com.crashlytics.**

# Keep custom model classes
-keepclassmembers class com.pune.dance.fitness.api.*.models.** { *; }