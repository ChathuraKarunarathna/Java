public class MultipleInterface implements Interface01, Interface02{
        @Override
        public void method01() {
            System.out.println("Method 01 is Overriding");
        }

        @Override
        public void method02() {
            System.out.println("Method 02 is Overriding");
        }
    }

