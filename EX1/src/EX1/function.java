package EX1;

import java.io.Serializable;

    /** This interface represents a simple EX1.function of type y=f(x), where both y and x are real numbers.
     **/
    public interface function extends Serializable{
        public double f (double x);
        /**
         * return a String representing this complex EX1.function
         */
        public String toString();
        public function initFromString(String s);
        public function copy(); // clone
        public boolean equals(Object obj);

    }

