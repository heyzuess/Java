public class Dog {
    int Size;
    String Name;

    private String BarkType;

    void Bark() {
        if (this.Size > 60) {
            this.BarkType = "Wooof! Wooof!";
        } else
        if (this.Size > 14) {
            this.BarkType = "Ruff! Ruff!";
        } else {
            this.BarkType = "Yip! Yip!";
        }

        System.out.println(this.BarkType);
    }

    @Override
    public String toString() {
        String strTemp = "Size: " + this.Size + "\n" + 
                         "Name: " + this.Name;
        return strTemp;
    }
}
