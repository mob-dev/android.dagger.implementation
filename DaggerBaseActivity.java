import javax.inject.Inject;

public abstract class DaggerBaseActivity extends BaseActivity {
    @Inject
    protected MainApplication mainApplication;
    @Inject
    @ApplicationContext
    protected Context applicationContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getAppComponent().inject(this);
    }
}
