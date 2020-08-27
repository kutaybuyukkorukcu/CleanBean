package com.cleanbean;

import com.cleanbean.max.Max;
import com.cleanbean.min.Min;

public class Bean {

        @Max(max = 10)
        private int max;

        @Min(min = 6)
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

}
