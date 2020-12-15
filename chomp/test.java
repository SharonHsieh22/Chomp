public class test {
    
    public static void main (String[] args) {
        CharMatrix charlie = new CharMatrix(2,3,'F');
        charlie.fillRect(1,2,3,4,'F');
        System.out.println(charlie.numRows());
        charlie.printMatrix();
    }

}
