package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abuw implements Runnable {
    final /* synthetic */ abux a;

    public abuw(abux abux) {
        this.a = abux;
    }

    public final void run() {
        abux abux = this.a;
        abvc abvc = abux.b;
        abxq abxq = abux.c;
        abxn abxn = abux.a;
        abvc.a.c(2);
        acal.a(abvc.a, 8);
        abug abug = abvc.b;
        iva.a((Object) abxn);
        if (abug.j && abug.g != null) {
            try {
                abtm abtm = abug.h;
                iva.a(abtm.i, (Object) "Bootstrap needs to first be paused before it can be resumed.");
                abtm.i = false;
                abtm.f();
            } finally {
                abug.c(abxq, new Status(0));
            }
        } else {
            abug.c(abxq, new Status(10552));
        }
    }
}
