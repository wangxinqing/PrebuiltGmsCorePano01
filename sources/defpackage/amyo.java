package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: amyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amyo extends amyq implements ConcurrentMap {
    protected amyo() {
    }

    /* access modifiers changed from: protected */
    public abstract ConcurrentMap a();

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Map b() {
        throw null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        return a().putIfAbsent(obj, obj2);
    }

    public final boolean remove(Object obj, Object obj2) {
        return a().remove(obj, obj2);
    }

    public final Object replace(Object obj, Object obj2) {
        return a().replace(obj, obj2);
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return a().replace(obj, obj2, obj3);
    }
}
