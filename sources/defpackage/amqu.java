package defpackage;

import java.io.Serializable;

/* renamed from: amqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amqu extends amqw implements Serializable {
    public static final amqu a = new amqu();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    /* access modifiers changed from: protected */
    public final int a(Object obj) {
        return obj.hashCode();
    }

    /* access modifiers changed from: protected */
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
