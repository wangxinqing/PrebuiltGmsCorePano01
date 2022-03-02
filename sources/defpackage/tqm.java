package defpackage;

import java.util.Arrays;

/* renamed from: tqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqm implements Runnable {
    private final tqo a;
    private final uvy b;
    private final byte[] c;

    public tqm(tqo tqo, uvy uvy, byte[] bArr) {
        this.a = tqo;
        this.b = uvy;
        this.c = bArr;
    }

    public final void run() {
        tqo tqo = this.a;
        uvy uvy = this.b;
        byte[] bArr = this.c;
        if (!tqo.a.k()) {
            ((anih) tky.a.c()).a("Skipping discovery of %s because we are no longer discovering.", (Object) uvy);
            return;
        }
        trt a2 = trt.a(bArr);
        if (a2 == null) {
            jjg jjg = tky.a;
            tky.a(bArr);
        } else if (a2.b != 3) {
            jjg jjg2 = tky.a;
            tky.a(bArr);
        } else if (!Arrays.equals(a2.d, tqo.c)) {
            jjg jjg3 = tky.a;
            tky.a(bArr);
            tky.a(tqo.c);
            tky.a(a2.d);
        } else {
            ((anih) tky.a.d()).a("Found WifiAwareServiceInfo %s (with EndpointId %s and EndpointInfo %s)", (Object) bArr, (Object) a2.c, (Object) tky.a(a2.e));
            tqr tqr = new tqr(uvy, a2.c, a2.e, tqo.b);
            tqo.d.put(uvy, tqr);
            tqo.e.b(tqo.a, (tms) tqr);
        }
    }
}
