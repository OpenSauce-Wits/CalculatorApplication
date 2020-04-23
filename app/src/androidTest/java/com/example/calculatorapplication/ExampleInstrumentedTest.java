package com.example.calculatorapplication;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkNumericButton () {
        onView(withId(R.id.button_0)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("0")));
    }

    @Test
    public void checkOperationButton () {
        onView(withId(R.id.button_2)).perform(click());
        onView(withId(R.id.button_multiply)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("2.0*")));
    }

    @Test
    public void checkClearButton () {
        onView(withId(R.id.button_9)).perform(click());
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_backspace)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("")));
    }

    @Test
    public void checkAddition () {
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_plus)).perform(click());
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_equals)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("2.0")));
    }

    @Test
    public void checkSubtration () {
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_minus)).perform(click());
        onView(withId(R.id.button_1)).perform(click());
        onView(withId(R.id.button_equals)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("0.0")));
    }

    @Test
    public void checkMultiplication () {
        onView(withId(R.id.button_4)).perform(click());
        onView(withId(R.id.button_multiply)).perform(click());
        onView(withId(R.id.button_4)).perform(click());
        onView(withId(R.id.button_equals)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("16.0")));
    }

    @Test
    public void checkDivision () {
        onView(withId(R.id.button_9)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button_4)).perform(click());
        onView(withId(R.id.button_equals)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("2.25")));
    }


}
