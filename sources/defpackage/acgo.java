package defpackage;

import android.content.Context;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: acgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acgo extends acha implements niz {
    private final acgh a;
    private final acgh b;
    private final nix c;

    public acgo(LifecycleSynchronizer lifecycleSynchronizer, Context context, String str, boolean z) {
        this.c = nix.a(context, lifecycleSynchronizer, acdx.a());
        acad acad = new acad(context);
        acad.a(str, z);
        this.a = new acgh(context, 200, acad);
        this.b = new acgh(context, 100, acad);
    }

    public final void a(acgz acgz) {
        this.c.a(new acgi(acgz, this.b));
    }

    public final void b(acgz acgz) {
        this.c.a(new acgn(acgz, this.b));
    }

    public final void c(acgz acgz, HandshakeData handshakeData) {
        this.c.a(new acgk(acgz, handshakeData, this.a));
    }

    public final void d(acgz acgz, HandshakeData handshakeData) {
        this.c.a(new acgj(acgz, this.a, handshakeData));
    }

    public final void a(acgz acgz, HandshakeData handshakeData) {
        this.c.a(new acgm(acgz, this.b, handshakeData));
    }

    public final void b(acgz acgz, HandshakeData handshakeData) {
        this.c.a(new acgl(acgz, this.b, handshakeData));
    }
}
