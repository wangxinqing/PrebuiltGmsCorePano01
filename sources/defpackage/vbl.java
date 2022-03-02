package defpackage;

import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: vbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vbl implements uys {
    final /* synthetic */ vbp a;

    public vbl(vbp vbp) {
        this.a = vbp;
    }

    public final void a(uyq uyq) {
        if (aync.i()) {
            for (avae a2 : this.a.d.a(this.a.e.a(uyq)).a()) {
                vbp vbp = this.a;
                vdx vdx = new vdx();
                vdx.b = this.a.a(a2);
                vdx.c();
                vbp.a(vdx.a(), uyq);
            }
        }
        if (aync.d()) {
            for (vai vai : this.a.f.a()) {
                NearbyDevice a3 = vbp.a(vai);
                vbp vbp2 = this.a;
                vdx vdx2 = new vdx();
                vdx2.c();
                vdx2.a(a3);
                vbp2.a(vdx2, a3, vai.b(), vai.c(), vai.d(), uyq);
            }
        }
    }

    public final void b() {
        this.a.d.a().retainAll(this.a.e.c());
    }
}
