package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: pet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pet implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public pet(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    /* renamed from: b */
    public final pes a() {
        amsv b2 = pfn.b();
        aelh aelh = pba.Y;
        awdx.a((Object) aelh, "Cannot return null from a non-@Nullable @Provides method");
        aelh aelh2 = pba.u;
        awdx.a((Object) aelh2, "Cannot return null from a non-@Nullable @Provides method");
        return new pes((Context) this.a.a(), ((pcb) this.b).a(), awds.b(this.c), (Executor) this.d.a(), b2, aelh, aelh2);
    }
}
