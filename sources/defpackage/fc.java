package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: fc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fc {
    public final Object[] a = new Object[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public int b;

    public final Object a() {
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

    public final void a(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < 256) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }
}
