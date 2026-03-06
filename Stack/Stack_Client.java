public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack();
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.Display();
        System.out.println();
        System.out.println(st.isEmpty());
    } 
}
