package defpackage;

import android.content.Context;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: skw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class skw implements awdt {
    private final bapu a;
    private final bapu b;

    public skw(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        bapu bapu = this.a;
        bapu bapu2 = this.b;
        rbi a2 = rbi.a();
        a2.b((Context) bapu.a());
        a2.a(sku.a);
        anab h = anaf.h();
        Iterator it = EnumSet.complementOf(EnumSet.of(slq.UNKNOWN)).iterator();
        while (it.hasNext()) {
            slq slq = (slq) it.next();
            h.a(slq, rav.a("com.google.android.gms.mdisync.service.MdiSyncBackgroundTaskService", sls.a(slq, slr.PERIODIC).c(), sls.a(slq, slr.ONEOFF).c()));
        }
        a2.a(h.a());
        a2.a((amsv) new skt(bapu));
        aoru b2 = jfm.b(10);
        awdx.a((Object) b2, "Cannot return null from a non-@Nullable @Provides method");
        a2.a((Executor) b2);
        aekn b3 = aeko.b();
        amrl.a((Object) b3);
        a2.g = b3;
        a2.a("mdisync");
        a2.a((ahei) bapu2.a());
        a2.b((rbk) new skv());
        qyp a3 = a2.a(sew.l);
        awdx.a((Object) a3, "Cannot return null from a non-@Nullable @Provides method");
        return a3;
    }
}
