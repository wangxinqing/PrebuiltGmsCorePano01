package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: pfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pfo implements awdt {
    private final bapu a;

    public pfo(bapu bapu) {
        this.a = bapu;
    }

    /* renamed from: b */
    public final PackageManager a() {
        PackageManager packageManager = ((Context) this.a.a()).getPackageManager();
        awdx.a((Object) packageManager, "Cannot return null from a non-@Nullable @Provides method");
        return packageManager;
    }
}
