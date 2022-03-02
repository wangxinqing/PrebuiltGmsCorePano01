package defpackage;

import android.os.Build;
import android.os.StrictMode;

/* renamed from: agmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agmw implements awdt {
    private final bapu a;

    public agmw(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        amri b = ((agef) this.a).a();
        if (Build.VERSION.SDK_INT >= 28 && StrictMode.ThreadPolicy.LAX.equals(StrictMode.getThreadPolicy()) && StrictMode.VmPolicy.LAX.equals(StrictMode.getVmPolicy()) && b.a()) {
            amri amri = ((agha) b.b()).b;
        }
        anfv anfv = anfv.a;
        awdx.a((Object) anfv, "Cannot return null from a non-@Nullable @Provides method");
        return anfv;
    }
}
