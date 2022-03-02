package defpackage;

import java.util.Arrays;

/* renamed from: tha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tha {
    final String a;
    final int b;

    public tha(int i) {
        this.a = null;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tha) {
            tha tha = (tha) obj;
            return ius.a(this.a, tha.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(tha.b));
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[2];
        int i = this.a;
        if (i == null) {
            i = 0;
        }
        objArr[0] = i;
        objArr[1] = Integer.valueOf(this.b);
        return Arrays.hashCode(objArr);
    }

    public tha(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
