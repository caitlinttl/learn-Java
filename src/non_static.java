public class non_static {

    public int sum2(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) { 
        non_static calculator = new non_static();
        // 創建實例
        
        System.out.println(calculator.sum2(1, 2)); 
        // 調用方法
    }    
}

        // static 修飾符可以讓方法的適用範圍變為"全局"
        // 不需要通過具體的實例（實例是一個類的具體對象）來使用此方法。
        // 如果沒有static修飾符，我們則需要創建實例來調用方法。

