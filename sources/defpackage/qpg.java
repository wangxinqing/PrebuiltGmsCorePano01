package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: qpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpg extends awem {
    private final awef b;
    private final awef c;

    public qpg(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(qpg.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        qrf qrf;
        List list = (List) obj;
        Long l = (Long) list.get(1);
        Long a = ((qrg) list.get(0)).a();
        if (axvz.h()) {
            qrf = new qrf(a, l);
        } else {
            qrf = new qrf(a, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())));
        }
        return aorl.a((Object) qrf);
    }
}
