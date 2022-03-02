package defpackage;

import java.util.HashMap;

/* renamed from: g  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class g extends n {
    public final HashMap a = new HashMap();

    public final j a(Object obj) {
        return (j) this.a.get(obj);
    }

    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.a.remove(obj);
        return b;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
