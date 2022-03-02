package defpackage;

import java.io.IOException;

/* renamed from: trx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class trx extends tly {
    private final tph b;
    private final uwf c;

    public trx(tph tph, uwf uwf) {
        super(uwf.a, uwf.c.getInputStream(), uwf.c.getOutputStream());
        this.b = tph;
        this.c = uwf;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        tph tph;
        try {
            this.c.close();
            tph = this.b;
        } catch (IOException e) {
            anih anih = (anih) tky.a.d();
            anih.a((Throwable) e);
            anih.a("Failed to close underlying socket for WifiHotspotEndpointChannel %s", (Object) this.a);
            tph = this.b;
        } catch (Throwable th) {
            this.b.d();
            throw th;
        }
        tph.d();
    }

    public final asoe l() {
        return asoe.WIFI_HOTSPOT;
    }
}
