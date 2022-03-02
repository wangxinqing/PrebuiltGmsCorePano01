package defpackage;

/* renamed from: aide  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aide {
    private final Object[] a;
    private int b = 0;
    private final Object c;
    private Object d;
    private int e;

    public aide(int i, Object obj) {
        this.a = new Object[i];
        this.c = obj;
        this.d = obj;
        this.e = i;
    }

    public final int a(Object obj) {
        if (atiu.a(obj, this.d)) {
            return this.e;
        }
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                Object[] objArr = this.a;
                int length = objArr.length;
                if (i2 == length) {
                    return length;
                }
                objArr[i2] = obj;
                this.d = obj;
                this.e = i2;
                this.b = i2 + 1;
                return i2;
            } else if (i != this.e && atiu.a(obj, this.a[i])) {
                return i;
            } else {
                i++;
            }
        }
    }

    public final Object a(int i) {
        Object[] objArr = this.a;
        return i == objArr.length ? this.c : objArr[i];
    }

    public final void a() {
        for (int i = 0; i < this.b; i++) {
            this.a[i] = null;
        }
        this.b = 0;
        this.d = this.c;
        this.e = this.a.length;
    }
}
