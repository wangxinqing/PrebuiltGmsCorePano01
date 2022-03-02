package defpackage;

import java.util.List;

/* renamed from: ddg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ddg implements ax {
    private final ddp a;

    public ddg(ddp ddp) {
        this.a = ddp;
    }

    public final void a(Object obj) {
        ddp ddp = this.a;
        amzy amzy = (amzy) obj;
        aqsr aqsr = ddp.c;
        if (!anbs.b((Iterable) amzy, (amrm) new ddi(aqsr))) {
            ddp.f = amzy.a((Object) ddp.a(aqsr));
            ddp.d.setVisibility(8);
            return;
        }
        ddp.d.setVisibility(0);
        if (cyd.a(ddp.getContext())) {
            amzy = amzy.g();
        }
        if (!anda.a((List) amzy, (Object) ddp.f)) {
            ddp.a(amzy);
        }
    }
}
