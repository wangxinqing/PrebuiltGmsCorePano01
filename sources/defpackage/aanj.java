package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: aanj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aanj implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ aank b;

    public aanj(aank aank, int i) {
        this.b = aank;
        this.a = i;
    }

    public final void run() {
        int i = this.a;
        if (i == 1) {
            this.b.a.a(new Status(0), 1);
        } else if (i == 3) {
            this.b.b.a(new Status(0), 0);
        }
        this.b.a();
    }
}
