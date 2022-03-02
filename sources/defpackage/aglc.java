package defpackage;

import android.os.Build;

/* renamed from: aglc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aglc implements awdt {
    private final bapu a;
    private final bapu b;

    public aglc(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Object obj;
        aggp aggp = (aggp) this.a.a();
        bapu bapu = this.b;
        if (Build.VERSION.SDK_INT < 23) {
            int i = Build.VERSION.SDK_INT;
        } else if (aggp.l().a() && ((agha) aggp.l().b()).a.a() && ((aghn) ((agha) aggp.l().b()).a.b()).a) {
            obj = anax.a((Object) (agkv) bapu.a());
            awdx.a(obj, "Cannot return null from a non-@Nullable @Provides method");
            return obj;
        }
        obj = anfv.a;
        awdx.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
