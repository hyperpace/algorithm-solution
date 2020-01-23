package datastructer.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyStackTest {
    @Test
    void name() {
        MyStack stack = new MyStack();

        stack.push(1);
        assertThat(stack.peek()).isEqualTo(1);
    }
}