package defpackage;

import java.io.IOException;

/* renamed from: trs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class trs extends tly {
    private final uvz b;

    private trs(uvz uvz) {
        super(uvz.a, uvz.c.getInputStream(), uvz.c.getOutputStream());
        this.b = uvz;
    }

    static trs a(uvz uvz) {
        try {
            return new trs(uvz);
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void f() {
        try {
            this.b.close();
        } catch (IOException e) {
            anih anih = (anih) tky.a.d();
            anih.a((Throwable) e);
            anih.a("Failed to close underlying Socket for WifiAwareEndpointChannel %s", (Object) this.a);
        }
    }

    public final asoe l() {
        return asoe.WIFI_AWARE;
    }
}
