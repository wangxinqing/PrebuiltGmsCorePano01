package defpackage;

import android.os.SystemClock;

/* renamed from: qnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qnq implements acvv {
    final /* synthetic */ ansz a;
    final /* synthetic */ long b;

    public qnq(ansz ansz, long j) {
        this.a = ansz;
        this.b = j;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        ansz ansz = this.a;
        aucd aucd = (aucd) ansz.c(5);
        aucd.a((aucj) ansz);
        int i = ((ansz) aucd.b).b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ansz ansz2 = (ansz) aucd.b;
        ansz ansz3 = ansz.k;
        ansz2.c = i;
        ansz2.e = ansz2.d;
        ansz2.h = ansx.a(3);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ((ansz) aucd.b).i = elapsedRealtime;
        qoh.a().a((ansz) aucd.i());
    }
}
