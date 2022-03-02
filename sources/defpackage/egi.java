package defpackage;

import java.lang.reflect.Array;

/* renamed from: egi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class egi {
    public volatile transient Object[] a;
    private final Class b;

    public egi(Class cls) {
        this.b = cls;
        this.a = (Object[]) Array.newInstance(cls, 0);
    }

    private final int c(Object obj) {
        Object[] objArr = this.a;
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public final synchronized void a(int i) {
        Object obj = this.a[i];
        int i2 = i + 1;
        Object[] objArr = (Object[]) Array.newInstance(this.b, this.a.length - (i2 - i));
        System.arraycopy(this.a, 0, objArr, 0, i);
        System.arraycopy(this.a, i2, objArr, i, this.a.length - i2);
        this.a = objArr;
    }

    public final synchronized boolean b(Object obj) {
        boolean z;
        int c = c(obj);
        if (c != -1) {
            a(c);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final boolean a() {
        return this.a.length == 0;
    }

    public final synchronized boolean a(Object obj) {
        if (obj == null) {
            throw null;
        } else if (c(obj) != -1) {
            return false;
        } else {
            Object[] objArr = (Object[]) Array.newInstance(this.b, this.a.length + 1);
            System.arraycopy(this.a, 0, objArr, 0, this.a.length);
            objArr[this.a.length] = obj;
            this.a = objArr;
            return true;
        }
    }
}
