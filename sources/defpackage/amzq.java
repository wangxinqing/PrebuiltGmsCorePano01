package defpackage;

import java.util.EnumMap;

/* renamed from: amzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzq extends anad {
    private final transient EnumMap b;

    public amzq(EnumMap enumMap) {
        this.b = enumMap;
        amrl.a(!enumMap.isEmpty());
    }

    public final anhj b() {
        return new aneo(this.b.entrySet().iterator());
    }

    public final anhj bn() {
        return ance.a(this.b.keySet().iterator());
    }

    public final boolean bo() {
        return false;
    }

    public final boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amzq) {
            obj = ((amzq) obj).b;
        }
        return this.b.equals(obj);
    }

    public final Object get(Object obj) {
        return this.b.get(obj);
    }

    public final int size() {
        return this.b.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new amzp(this.b);
    }
}
