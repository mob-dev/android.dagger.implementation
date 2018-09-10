### What is this repository for? ###

* Dagger2 implementation in android application.
* Add Activity context into dagger while activity created.
* Use application and activity context throughout the application.
* Better approach of injection strategy in Class/Fragment/Activity.

### Dependencies

* Dagger2

### How do I get set up? ###

* Add dagger2 dependency in app/build.gradle.
```
implementation 'com.google.dagger:dagger:2.1x'
annotationProcessor 'com.google.dagger:dagger-compiler:2.1x'
```
* Create Scope interface i.e. ActivityScope(Behave same as singleton).
* Create Qualifier for Application and Activity context i.e. ApplicationContext, ActivityContext.
* Create Module i.e. ContextModule, ActivityContextModule.
* Create BaseActivity class.
* Create AppComponent class.
* Create ActivityComponent class.
* Update MainApplication class.
* Create DaggerBaseActivity class.
* Create DaggerDependencyInjector class.
* Create MainActivity class.