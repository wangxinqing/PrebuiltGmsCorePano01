package defpackage;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;

/* renamed from: vfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vfy extends arwm {
    final /* synthetic */ UnpublishRequest a;
    final /* synthetic */ vgh b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfy(vgh vgh, String str, UnpublishRequest unpublishRequest) {
        super(str);
        this.b = vgh;
        this.a = unpublishRequest;
    }

    public final void run() {
        uxy a2 = this.b.a(this.a.g);
        UnpublishRequest unpublishRequest = this.a;
        if (a2.e.c(unpublishRequest.c)) {
            Message message = unpublishRequest.b.b;
            String a3 = uyg.a(a2.b, message);
            jjg jjg = tgc.a;
            uyb uyb = new uyb(a2.b, 3);
            uyc uyc = a2.d;
            aucd o = auwz.n.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwz auwz = (auwz) o.b;
            auwz.b = 2;
            auwz.a |= 1;
            aucd o2 = auwt.c.o();
            auxm a4 = uyc.a(message);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auwt auwt = (auwt) o2.b;
            a4.getClass();
            auwt.b = a4;
            auwt.a |= 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwz auwz2 = (auwz) o.b;
            auwt auwt2 = (auwt) o2.i();
            auwt2.getClass();
            auwz2.f = auwt2;
            auwz2.a |= 16;
            uyc.a(uyb, (auwz) o.i());
            a2.f.a(vdo.a(vdt.a(a2.b, a3), a2.a(unpublishRequest.c, uyb)), a2.b(unpublishRequest.c), a2.b);
            a2.h.a(a3);
        }
    }
}
