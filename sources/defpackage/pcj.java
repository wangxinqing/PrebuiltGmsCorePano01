package defpackage;

import android.content.Context;

/* renamed from: pcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pcj implements awdt {
    private final bapu a;

    public pcj(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Context context = (Context) this.a.a();
        pdg a2 = pbu.a();
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
