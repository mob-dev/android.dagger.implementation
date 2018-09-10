import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityContextModule {
    MainActivity activity;
    Context context;

    public ActivityContextModule(MainActivity activity) {
        this.activity = activity;
        context = activity;
    }

    @Provides
    @ActivityScope
    MainActivity provideActivity() {
        return activity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }
}
