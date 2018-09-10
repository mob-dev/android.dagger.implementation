public class MainApplication extends Application {
    public static MainApplication application;
    AppComponent appComponent;
    ActivityComponent activityComponent = null;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        appComponent = DaggerAppComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }
    /** This function is used to inject activity context as activity created.
    * This is invoked from an activity
    */
    public void injectActivityContext(MainActivity activityContext) {
        activityComponent = DaggerActivityComponent.builder()
                .activityContextModule(new ActivityContextModule(activityContext))
                .appComponent(appComponent)
                .build();

        activityComponent.inject(activityContext);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    public static MainApplication get(Activity activity){
        return (MainApplication) activity.getApplication();
    }
}