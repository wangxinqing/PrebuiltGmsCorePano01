package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: akqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqb implements Runnable {
    final /* synthetic */ akqj a;

    public akqb(akqj akqj) {
        this.a = akqj;
    }

    public final void run() {
        akqj akqj = this.a;
        int i = akqj.a;
        if (i == 0) {
            if (akqj.c == null) {
                akqj.c = new iso((int) azbk.c(), azbk.b(), azbk.b(), TimeUnit.MILLISECONDS);
            }
            if (akqj.d == null) {
                akqj.d = new iso((int) azbk.d(), azbk.b(), azbk.b(), TimeUnit.MILLISECONDS);
            }
            akqj.a = 1;
            return;
        }
        akqj.a = i + 1;
    }
}
