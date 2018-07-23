package com.adhamenaya.mosaiclayout;

import com.adhamenaya.mosaiclayout.model.Container;
import com.adhamenaya.mosaiclayout.ui.Pattern;

import org.junit.Test;
import org.junit.experimental.categories.Categories;

import java.util.Arrays;
import java.util.List;

import static com.adhamenaya.mosaiclayout.ui.Pattern.BIG;
import static com.adhamenaya.mosaiclayout.ui.Pattern.HORIZONTAL;
import static com.adhamenaya.mosaiclayout.ui.Pattern.SMALL;
import static com.adhamenaya.mosaiclayout.ui.Pattern.VERTICAL;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void create_pattern_8small() {
        PatternHelper helper = new PatternHelper();
        Pattern[] patterns = {SMALL, SMALL, SMALL, SMALL, SMALL, SMALL, SMALL, SMALL};
        try {
            List<Container> containers = helper.generate(Arrays.asList(patterns));
            assertEquals(containers.size(), 8);
        } catch (Exception ex) {

        }
    }

    @Test
    public void create_pattern_2big() {
        PatternHelper helper = new PatternHelper();
        Pattern[] patterns = {BIG, BIG};
        try {
            List<Container> containers = helper.generate(Arrays.asList(patterns));
            assertEquals(containers.size(), 2);
        } catch (Exception ex) {

        }
    }

    @Test
    public void create_pattern_4vertical() {
        PatternHelper helper = new PatternHelper();
        Pattern[] patterns = {VERTICAL, VERTICAL, VERTICAL, VERTICAL};
        try {
            List<Container> containers = helper.generate(Arrays.asList(patterns));
            assertEquals(containers.size(), 4);
            assertEquals(containers.get(2).cells.size(), 2);
        } catch (Exception ex) {

        }
    }

    @Test
    public void create_pattern_4horizontal() {
        PatternHelper helper = new PatternHelper();
        Pattern[] patterns = {HORIZONTAL, HORIZONTAL, HORIZONTAL, HORIZONTAL};
        try {
            List<Container> containers = helper.generate(Arrays.asList(patterns));
            assertEquals(containers.get(0).cells.size(), 2);
        } catch (Exception ex) {

        }
    }

    @Test
    public void create_pattern_mix2() {
        PatternHelper helper = new PatternHelper();
        Pattern[] patterns = {VERTICAL, VERTICAL, SMALL, SMALL, SMALL, SMALL};
        try {
            List<Container> containers = helper.generate(Arrays.asList(patterns));
            assertEquals(containers.size(), 6);
            assertEquals(containers.get(0).cells.size(), 2);
            assertEquals(containers.get(1).cells.size(), 2);
            assertEquals(containers.get(3).cells.size(), 1);
        } catch (Exception ex) {

        }
    }

    @Test
    public void create_pattern_1small() {
        PatternHelper helper = new PatternHelper();
        Pattern[] patterns = {SMALL};
        try {
            List<Container> containers = helper.generate(Arrays.asList(patterns));
            assertEquals(containers.size(), 8);
        } catch (Exception ex) {

        }
    }

    @Test
    public void create_pattern_1vertical() {
        PatternHelper helper = new PatternHelper();
        Pattern[] patterns = {SMALL};
        try {
            List<Container> containers = helper.generate(Arrays.asList(patterns));
            assertEquals(containers.size(), 4);
        } catch (Exception ex) {

        }
    }


    @Test
    public void create_pattern_1big() {
        PatternHelper helper = new PatternHelper();
        Pattern[] patterns = {SMALL};
        try {
            List<Container> containers = helper.generate(Arrays.asList(patterns));
            assertEquals(containers.size(), 2);
        } catch (Exception ex) {

        }
    }
}