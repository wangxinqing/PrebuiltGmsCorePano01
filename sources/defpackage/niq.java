package defpackage;

import com.google.android.gms.common.apiservice.LifecycleSynchronizer;

/* renamed from: niq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class niq implements awdt {
    private final bapu a;

    public niq(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        LifecycleSynchronizer lifecycleSynchronizer = ((nio) this.a.a()).e;
        awdx.a((Object) lifecycleSynchronizer, "Cannot return null from a non-@Nullable @Provides method");
        return lifecycleSynchronizer;
    }
}
