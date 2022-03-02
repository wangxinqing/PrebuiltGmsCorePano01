package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: agdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agdn implements awdt {
    private final bapu a;

    public agdn(bapu bapu) {
        this.a = bapu;
    }

    /* renamed from: b */
    public final ConcurrentHashMap a() {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((agfr) this.a.a()).c.a((Object) new ConcurrentHashMap());
        awdx.a((Object) concurrentHashMap, "Cannot return null from a non-@Nullable @Provides method");
        return concurrentHashMap;
    }
}
