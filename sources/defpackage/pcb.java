package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: pcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pcb implements awdt {
    private final bapu a;
    private final bapu b;

    public pcb(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    /* renamed from: b */
    public final afif a() {
        Context context = (Context) this.a.a();
        aoru aoru = (aoru) this.b.a();
        afic afic = new afic(ryl.a(context), aoru);
        qvr qvr = new qvr(Looper.getMainLooper());
        qvr.getClass();
        ryj ryj = new ryj(qvr);
        qvr.getClass();
        afif afif = new afif(afic, new rzb(context, ryj, new ryk(qvr)), context.getApplicationContext(), aoru);
        awdx.a((Object) afif, "Cannot return null from a non-@Nullable @Provides method");
        return afif;
    }
}
