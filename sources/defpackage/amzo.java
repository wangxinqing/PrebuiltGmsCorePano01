package defpackage;

import java.io.Serializable;

/* renamed from: amzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzo extends amwv implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object b;

    public amzo(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
