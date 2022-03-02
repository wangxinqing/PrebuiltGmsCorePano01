package defpackage;

import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.PublishRequest;

/* renamed from: vfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vfx extends arwm {
    final /* synthetic */ PublishRequest a;
    final /* synthetic */ vgh b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfx(vgh vgh, String str, PublishRequest publishRequest) {
        super(str);
        this.b = vgh;
        this.a = publishRequest;
    }

    public final void run() {
        uxy a2 = this.b.a(this.a.i);
        PublishRequest publishRequest = this.a;
        uyf uyf = a2.e;
        int a3 = ClientAppContext.a(publishRequest.j, uyf.a.c);
        if (uyf.a(a3, publishRequest.d) && uyf.a(publishRequest.d) && uyf.a(publishRequest.d, publishRequest.c) && uyf.a("publish", publishRequest.d, a3)) {
            int i = publishRequest.c.e;
            vci vci = publishRequest.d;
            if (i != Integer.MAX_VALUE) {
                boolean b2 = publishRequest.b.b.b();
                if (b2 && !publishRequest.c.b()) {
                    uxy.a(new Status(10, "Discovery mode must be BROADCAST or DEFAULT for raw audio publish."), publishRequest.d);
                } else if (uyf.a(publishRequest.c, b2, publishRequest.d)) {
                    Message message = publishRequest.b.b;
                    String a4 = uyg.a(a2.b, message);
                    jjg jjg = tgc.a;
                    Strategy strategy = publishRequest.c;
                    int i2 = strategy.e;
                    int i3 = strategy.f;
                    int i4 = strategy.i;
                    String str = message.c;
                    byte[] bArr = message.b;
                    uyb uyb = new uyb(a2.b, 2);
                    uyc uyc = a2.d;
                    aucd o = auwz.n.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    auwz auwz = (auwz) o.b;
                    auwz.b = 1;
                    auwz.a |= 1;
                    aucd o2 = auwn.c.o();
                    auxm a5 = uyc.a(message);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    auwn auwn = (auwn) o2.b;
                    a5.getClass();
                    auwn.b = a5;
                    auwn.a = 1 | auwn.a;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    auwz auwz2 = (auwz) o.b;
                    auwn auwn2 = (auwn) o2.i();
                    auwn2.getClass();
                    auwz2.d = auwn2;
                    auwz2.a |= 4;
                    uyc.a(uyb, (auwz) o.i());
                    uwr uwr = a2.f;
                    uyg uyg = new uyg(a2.b, message, uxy.a(publishRequest.c, message.b(), false));
                    icm a6 = a2.a(publishRequest.d, uyb);
                    iva.a((Object) uyg);
                    uwr.a(new vdo(1, uyg, (vdt) null, (uyq) null, (vdv) null, a6), a2.b(publishRequest.d), a2.b);
                    var var = a2.h;
                    int i5 = publishRequest.c.e;
                    vcm vcm = publishRequest.k;
                    if (!(vcm == null || i5 == Integer.MAX_VALUE)) {
                        var.a.a(a4, vcm);
                        String valueOf = String.valueOf(a4);
                        var.e.a(new vao(var, valueOf.length() == 0 ? new String("PublishSubscribeCallbackCache.publish:") : "PublishSubscribeCallbackCache.publish:".concat(valueOf), a4), (long) (i5 * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
                    }
                    uyd.a(a2.a);
                }
            } else {
                uxy.a(new Status(10, "TTL_SECONDS_INFINITE is not currently supported for publishes."), vci);
            }
        }
    }
}
