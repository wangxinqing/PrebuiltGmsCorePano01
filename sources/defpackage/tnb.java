package defpackage;

import java.io.IOException;

/* renamed from: tnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tnb extends tly {
    private final uqe b;

    private tnb(uqe uqe) {
        super(uqe.a, uqe.a(), uqe.b());
        this.b = uqe;
    }

    static tnb a(uqe uqe) {
        try {
            return new tnb(uqe);
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
            anih.a("Failed to close underlying socket for BleEndpointChannel %s", (Object) this.a);
        }
    }

    public final int k() {
        return this.b.e();
    }

    public final asoe l() {
        return asoe.BLE;
    }
}
