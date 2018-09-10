import android.content.Context;

import javax.inject.Inject;

public class DaggerDependencyInjector {
    @Inject
    protected MainApplication mainApplication;
    @Inject
    @ApplicationContext
    protected Context context;

    public DaggerDependencyInjector() {
        MainApplication.instance.getAppComponent().inject(this);
    }
}
