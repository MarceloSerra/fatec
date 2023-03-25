public final class CustomConverter {

    private CustomDynamicStack<Integer> fillStack(Integer arg) {
        CustomDynamicStack<Integer> stack = new CustomDynamicStack<>();

        while(arg > 0){
            Integer module = arg % 2;
            stack.push(module);
            arg /= 2;
        }

        return stack;
    }

    private String unstack(CustomDynamicStack<Integer> stack) {
        StringBuilder buffer = new StringBuilder(stack.size());

        while(!stack.isEmpty()) {
             buffer.append(stack.pop());
        }

        return buffer.reverse().toString();
    }

    public String decimalToBinary(Integer arg) {
        CustomDynamicStack<Integer> filledStack = this.fillStack(arg);
        return this.unstack(filledStack);
    }
}
