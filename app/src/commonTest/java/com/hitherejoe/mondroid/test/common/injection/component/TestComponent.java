package com.hitherejoe.mondroid.test.common.injection.component;

import com.hitherejoe.mondroid.injection.component.ApplicationComponent;
import com.hitherejoe.mondroid.injection.module.ApplicationTestModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}