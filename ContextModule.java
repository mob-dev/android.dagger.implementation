import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    MainApplication application;

    public ContextModule(MainApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    MainApplication provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    @ApplicationContext
    public Context provideContext() {
        return application.getApplicationContext();
    }
}
