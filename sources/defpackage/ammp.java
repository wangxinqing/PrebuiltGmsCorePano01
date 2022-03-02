package defpackage;

import java.io.IOException;

/* renamed from: ammp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ammp implements Runnable {
    final /* synthetic */ ammq a;
    final /* synthetic */ baca b;

    public ammp(ammq ammq, baca baca) {
        this.a = ammq;
        this.b = baca;
    }

    public final void run() {
        ammq ammq = this.a;
        baca baca = this.b;
        try {
            baca.a(ammq.a());
        } catch (Throwable th) {
            if (th instanceof IOException) {
                baca.a.a(babj.o.a("Credentials failed to obtain metadata").b(th));
            } else {
                baca.a.a(babj.j.a("Failed computing credential metadata").b(th));
            }
        }
    }
}
