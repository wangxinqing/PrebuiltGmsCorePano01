package defpackage;

import android.os.SystemClock;

/* renamed from: qnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qnr implements acvs {
    final /* synthetic */ int a;
    final /* synthetic */ ansz b;
    final /* synthetic */ long c;

    public qnr(int i, ansz ansz, long j) {
        this.a = i;
        this.b = ansz;
        this.c = j;
    }

    public final void a(Exception exc) {
        qoi.a(exc, "Apps indexing failed.", new Object[0]);
        qoh.a().a(this.a);
        ansz ansz = this.b;
        aucd aucd = (aucd) ansz.c(5);
        aucd.a((aucj) ansz);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ansz ansz2 = ansz.k;
        ((ansz) aucd.b).h = ansx.a(4);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ((ansz) aucd.b).i = elapsedRealtime;
        qoh.a().a((ansz) aucd.i());
    }
}
