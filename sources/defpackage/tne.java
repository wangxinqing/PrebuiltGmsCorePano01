package defpackage;

import java.io.IOException;

/* renamed from: tne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tne extends tly {
    private final upc b;

    private tne(upc upc) {
        super(upc.a, upc.c.getInputStream(), upc.c.getOutputStream());
        this.b = upc;
    }

    static tne a(upc upc) {
        try {
            return new tne(upc);
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
            anih.a("Failed to close underlying socket for BluetoothEndpointChannel %s", (Object) this.a);
        }
    }

    public final int k() {
        return (int) aymi.a.a().r();
    }

    public final asoe l() {
        return asoe.BLUETOOTH;
    }
}
