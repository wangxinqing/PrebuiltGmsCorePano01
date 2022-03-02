package defpackage;

/* renamed from: or  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class or {
    private final Object[] a;
    private int b;

    public or(int i) {
        this.a = new Object[i];
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i2;
        return obj;
    }

    public boolean a(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                Object[] objArr = this.a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.b = i2 + 1;
                return true;
            } else if (this.a[i] != obj) {
                i++;
            } else {
                throw new IllegalStateException("Already in the pool!");
            }
        }
    }
}
