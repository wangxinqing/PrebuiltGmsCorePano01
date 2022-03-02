package defpackage;

import java.util.LinkedHashMap;

/* renamed from: agxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agxv {
    public final int a = 100;
    private final LinkedHashMap b = new agxu(this);

    public final synchronized Object a(Object obj) {
        return this.b.get(obj);
    }

    public final synchronized void a(Object obj, Object obj2) {
        this.b.put(obj, obj2);
    }
}
