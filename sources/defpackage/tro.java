package defpackage;

import java.io.IOException;

/* renamed from: tro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tro extends tly {
    private final usx b;

    private tro(usx usx) {
        super(usx.a, usx.e, usx.g);
        this.b = usx;
    }

    static tro a(usx usx) {
        return new tro(usx);
    }

    /* access modifiers changed from: protected */
    public final void f() {
        try {
            this.b.close();
        } catch (IOException e) {
            anih anih = (anih) tky.a.d();
            anih.a((Throwable) e);
            anih.a("Failed to close underlying socket for WebRtcEndpointChannel %s", (Object) this.a);
        }
    }

    public final asoe l() {
        return asoe.WEB_RTC;
    }
}
