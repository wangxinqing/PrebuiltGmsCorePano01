package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abuk implements Runnable {
    final /* synthetic */ abul a;

    public abuk(abul abul) {
        this.a = abul;
    }

    public final void run() {
        abtz abtz;
        abul abul = this.a;
        abvc abvc = abul.a;
        abxq abxq = abul.b;
        abvc.a.c(2);
        acal.a(abvc.a, 12);
        abug abug = abvc.b;
        if (abug.j && (abtz = abug.g) != null) {
            abtz.a().a((acvp) new abuf(abug, abxq));
        } else {
            abug.d(abxq, new Status(10552));
        }
    }
}
