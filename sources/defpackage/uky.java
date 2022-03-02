package defpackage;

import android.content.Context;
import java.io.IOException;

/* renamed from: uky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uky extends urq {
    public final uqo a;
    private final Context b;
    private uqd c;

    public uky(Context context, uqo uqo) {
        super(32);
        this.b = context;
        this.a = uqo;
    }

    public final void a() {
        uqd uqd = this.c;
        if (uqd != null) {
            try {
                uqd.close();
                this.c = null;
            } catch (IOException e) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("uky", "a", 2089, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close the existing BLE server socket.");
                this.c = null;
            } catch (Throwable th) {
                this.c = null;
                ukz.e();
                throw th;
            }
            ukz.e();
            return;
        }
        jjg jjg = ulh.a;
    }

    public final int b() {
        uqd a2 = uqd.a(this.b);
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("uky", "b", 2042, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create a BLE server socket.");
            return 4;
        }
        new ukx(this, a2).start();
        this.c = a2;
        ukz.e();
        return 2;
    }
}
