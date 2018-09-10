import android.content.Context;

import dagger.Component;
/**
 * Components are a way of telling Dagger what dependencies should be bundled
 * together and made available to a given instance so they can be used.
 * <p>
 * By calling inject on the component it will tell the framework to go through
 * the class and inject everything with the @Inject annotation.
 */
@ActivityScope
@Component(
        modules = {ActivityContextModule.class},
        dependencies = {AppComponent.class}
)
public interface ActivityComponent {
    /**
    * A Qualifier @ActivityContext is used to identify the context of an Activity.
    */
    @ActivityContext
    Context getContext();

    /**
    * MainActivity is injected as the ActivityComponent initiated .
    * MainActivity context is added into dagger while activity created.
    */
    void inject(MainActivity mainActivity);
}