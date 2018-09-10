import javax.inject.Singleton;

import dagger.Component;

/**
 * Components are a way of telling Dagger what dependencies should be bundled
 * together and made available to a given instance so they can be used.
 * <p>
 * By calling inject on the component it will tell the framework to go through
 * the class and inject everything with the @Inject annotation.
 */
@Singleton
@Component(modules = {ContextModule.class})
public interface AppComponent {
    MainApplication application();

    /**
    * A Qualifier @ApplicationContext is used to identify the context of Application
    */
    @ApplicationContext
    Context context();

    /**
    * DaggerBaseActivity is dependency(s) injected abstract Activity class.
    * This is used as super class as not needed to inject an Activity class,
    * if this is extended.
    */
    void inject(DaggerBaseActivity daggerBaseActivity);
    
    /**
    * DaggerDependencyInjector is dependency(s) injected abstract class.
    * This class may be used as super class as this class already has injected dependency(s).
    */
    void inject(DaggerDependencyInjector daggerDependencyInjector);
}
