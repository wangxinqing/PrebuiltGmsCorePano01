package defpackage;

import java.io.IOException;

/* renamed from: trz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class trz extends tly {
    private final uwh b;

    private trz(uwh uwh) {
        super(uwh.a, uwh.c.getInputStream(), uwh.c.getOutputStream());
        this.b = uwh;
    }

    static trz a(uwh uwh) {
        try {
            return new trz(uwh);
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
            anih.a("Failed to close underlying socket for WifiLanEndpointChannel %s", (Object) this.a);
        }
    }

    public final asoe l() {
        return asoe.WIFI_LAN;
    }
}
