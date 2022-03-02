package defpackage;

import java.util.Arrays;

/* renamed from: ckv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckv {
    public final Object a;
    public final Object b;

    public ckv(Object obj, Object obj2) {
        iva.a(obj);
        this.a = obj;
        iva.a(obj2);
        this.b = obj2;
    }

    public static ckv a(Object obj, Object obj2) {
        return new ckv(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ckv) {
            ckv ckv = (ckv) obj;
            return ckv.a.equals(this.a) && ckv.b.equals(this.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
