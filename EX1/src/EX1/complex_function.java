package EX1;

/** This interface represents a complex EX1.function of type y=g(f1(x), f2(x)), where both f1, f2 are EX1.functions (or complex EX1.functions),
     * y and x are real numbers and g is an operation: plus, mul, div, max, min, comp (f1(f2(x))).
     **/
    public interface complex_function extends function {

        /** Add to this EX1.complex_function the f1 EX1.complex_function
         *
         * @param f1 the EX1.complex_function which will be added to this EX1.complex_function.
         */
        public void plus(function f1);
        /** Multiply this EX1.complex_function with the f1 EX1.complex_function
         *
         * @param f1 the EX1.complex_function which will be multiply be this EX1.complex_function.
         */
        public void mul(function f1);
        /** Divides this EX1.complex_function with the f1 EX1.complex_function
         *
         * @param f1 the EX1.complex_function which will be divid this EX1.complex_function.
         */
        public void div(function f1);
        /** Computes the maximum over this EX1.complex_function and the f1 EX1.complex_function
         *
         * @param f1 the EX1.complex_function which will be compared with this EX1.complex_function - to compute the maximum.
         */
        public void max(function f1);
        /** Computes the minimum over this EX1.complex_function and the f1 EX1.complex_function
         *
         * @param f1 the EX1.complex_function which will be compared with this EX1.complex_function - to compute the minimum.
         */
        public void min(function f1);
        /**
         * This method wrap the f1 EX1.complex_function with this EX1.function: this.f(f1(x))
         * @param f1 complex EX1.function
         */
        public void comp(function f1);
        /** returns the left side of the complex EX1.function - this side should always exists (should NOT be null).
         * @return a EX1.function representing the left side of this complex funcation
         */
        public function left();
        /** returns the right side of the complex EX1.function - this side might not exists (aka equals null).
         * @return a EX1.function representing the left side of this complex funcation
         */
        public function right();
        /**
         * The EX1.complex_function oparation: plus, mul, div, max, min, comp
         * @return
         */
        public Operation getOp();
    }
