package defpackage;

import android.util.Property;

/* renamed from: alf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alf extends Property {
    public alf(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((alg) obj).b);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        alg alg = (alg) obj;
        alg.b = ((Integer) obj2).intValue();
        alg.invalidate();
    }
}
