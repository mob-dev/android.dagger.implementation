
public class MainActivity extends DaggerBaseActivity {
    @Inject
    @ActivityContext
    Context activityContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
        * Inject activity context into dagger
        */
        MainApplication.get(this).injectActivityContext(this);
    }
}
