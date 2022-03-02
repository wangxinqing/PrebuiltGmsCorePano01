package defpackage;

import java.io.IOException;

/* renamed from: trv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class trv extends tly {
    private final uwd b;

    private trv(uwd uwd) {
        super(uwd.a, uwd.c.getInputStream(), uwd.c.getOutputStream());
        this.b = uwd;
    }

    public static trv a(uwd uwd) {
        try {
            return new trv(uwd);
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
            anih.a("Failed to close underlying socket for WifiDirectEndpointChannel %s", (Object) this.a);
        }
    }

    public final asoe l() {
        return asoe.WIFI_DIRECT;
    }
}
