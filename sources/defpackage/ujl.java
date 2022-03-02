package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ujl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ujl implements Callable {
    private final ujn a;

    public ujl(ujn ujn) {
        this.a = ujn;
    }

    public final Object call() {
        upc upc;
        ujn ujn = this.a;
        if (!aymi.a.a().s()) {
            upc = ujn.c();
        } else {
            aosh f = aosh.f();
            new jfx(9, new ujm(ujn, f)).start();
            upc = (upc) thr.c("BluetoothClassic.connect", f, aymi.a.a().q());
        }
        if (upc != null) {
            return upc;
        }
        throw new RuntimeException(String.format("Failed to create client Bluetooth socket to %s.", new Object[]{ujn.a}));
    }
}
