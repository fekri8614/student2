## student2
Used kotlin coroutines components/(androix)

---

### used [back-end](https://github.com/fekri86114/student1/tree/back-end) project of Student1 !

---

## Dependency

*in `build.gradle( :app)`:*

    android {
    ...
    
     buildFeatures {
         viewBinding true
     }
     
    }
    
    dependencies {
    
        ...

        // kotlin coroutines -->
        implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4'

        // RxJava2 -->
        implementation 'io.reactivex.rxjava2:rxandroid:2.1.1'
        implementation 'io.reactivex.rxjava2:rxjava:2.2.21'

        // Retrofit2 ->
        def retrofit2_version = "2.9.0"
        implementation "com.squareup.retrofit2:retrofit:$retrofit2_version"
        implementation "com.squareup.retrofit2:converter-gson:$retrofit2_version"
        implementation "com.squareup.retrofit2:adapter-rxjava2:$retrofit2_version"

        // lifecycle -->
        implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.4.1'
        implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1'
    
    }
    
## Info:
I used `2.4.1` version for lifecycle-runitime/viewmodel. `2.6.1` is avilable but, I couldn't use it (couldn't download and install on dependencies)
    
