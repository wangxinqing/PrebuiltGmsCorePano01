package defpackage;

import java.io.IOException;

/* renamed from: tqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tqd implements Runnable {
    private final tqe a;
    private final usa b;

    public tqd(tqe tqe, usa usa) {
        this.a = tqe;
        this.b = usa;
    }

    public final void run() {
        tqe tqe = this.a;
        usa usa = this.b;
        String str = usa.a;
        tpi a2 = tpi.a(usa);
        if (a2 != null) {
            jjg jjg = tky.a;
            tky.a(tqe.b);
        } else {
            try {
                usa.close();
            } catch (IOException e) {
                anih anih = (anih) tky.a.b();
                anih.a((Throwable) e);
                anih.a("Failed to close NFC socket with device %s", (Object) str);
            }
        }
        tqe.c.a(tqe.a, str, (tnm) a2, asoe.NFC);
    }
}
