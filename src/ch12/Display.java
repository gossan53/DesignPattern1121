package ch12;

public abstract class Display {
    public abstract int getColumns();               // ���̕������𓾂�
    public abstract int getRows();                  // �c�̍s���𓾂�
    public abstract String getRowText(int row);     // row�Ԗڂ̕�����𓾂�
    public void show() {                            // �S���\������
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}