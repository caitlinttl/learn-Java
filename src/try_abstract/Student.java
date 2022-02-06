package try_abstract;

interface Student {
    public void goToSchool();
    public void takeExam();
    // 只含有抽象方法，這些方法中是沒有任何邏輯代碼的。
    // 如果要使用接口的方法，那麼具體的類必須實現（implements）其接口。
    // 只要被實現，具體的類必須將接口方法的具體邏輯全部實現
}