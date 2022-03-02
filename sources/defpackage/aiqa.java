package defpackage;

import android.os.Handler;

/* renamed from: aiqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aiqa implements Runnable {
    private final aiqo a;
    private final Long b;
    private final arnb c;
    private final Handler d;
    private final boolean e;

    public aiqa(aiqo aiqo, Long l, arnb arnb, Handler handler, boolean z) {
        this.a = aiqo;
        this.b = l;
        this.c = arnb;
        this.d = handler;
        this.e = z;
    }

    public final void run() {
        aiqo aiqo = this.a;
        Long l = this.b;
        arnb arnb = this.c;
        Handler handler = this.d;
        boolean z = this.e;
        aiqn aiqn = new aiqn(l.longValue(), arnb, handler);
        aiqo.a.a((Object) l, (Object) aiqn);
        aiqo.b.put(arnb, aiqn);
        Object[] objArr = {"Manager:", l};
        if (aiqo.c() && !aiqo.d) {
            handler.post(new aiqb(arnb));
        } else if (!z) {
            handler.post(new aiqd(arnb));
        } else {
            handler.post(new aiqc(arnb));
        }
    }
}
