package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ajdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajdm implements ajdo {
    private final ajdp a;
    private final ClientContext b;
    private final auay c;

    public ajdm(ajdp ajdp, ClientContext clientContext, auay auay) {
        this.a = ajdp;
        this.b = clientContext;
        this.c = auay;
    }

    public final void a() {
        ajdp ajdp = this.a;
        ClientContext clientContext = this.b;
        auay auay = this.c;
        rlv rlv = ajdp.g;
        aucd o = arvh.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auay.getClass();
        ((arvh) o.b).a = auay;
        rlv.a(clientContext, (arvh) o.i());
    }
}
