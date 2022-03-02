package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: cni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cni implements awdt {
    private final bapu a;
    private final bapu b;

    public cni(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    /* renamed from: b */
    public final coe a() {
        cns b2 = cnh.b();
        cpr.b();
        int i = Build.VERSION.SDK_INT;
        cnm cnm = new cnm((Context) ((awdu) this.a).a, (coh) this.b.a(), b2);
        awdx.a((Object) cnm, "Cannot return null from a non-@Nullable @Provides method");
        return cnm;
    }
}
