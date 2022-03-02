package defpackage;

import java.io.IOException;

/* renamed from: tpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tpi extends tly {
    private final usa b;

    private tpi(usa usa) {
        super(usa.a, usa.d, usa.e);
        this.b = usa;
    }

    static tpi a(usa usa) {
        try {
            return new tpi(usa);
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
            anih.a("Failed to close underlying socket for NearFieldCommunicationEndpointChannel %s", (Object) this.a);
        }
    }

    public final int k() {
        return (int) aymi.a.a().av();
    }

    public final asoe l() {
        return asoe.NFC;
    }
}
