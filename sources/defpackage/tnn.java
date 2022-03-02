package defpackage;

import java.io.IOException;

/* renamed from: tnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tnn implements Runnable {
    private final tno a;
    private final String b;

    public tnn(tno tno, String str) {
        this.a = tno;
        this.b = str;
    }

    public final void run() {
        tno tno = this.a;
        String str = this.b;
        try {
            tno.a.a(tpk.a());
            ((anih) tky.a.d()).a("EndpointChannelManager reported the disconnection to endpoint %s.", (Object) str);
        } catch (IOException e) {
        }
    }
}
