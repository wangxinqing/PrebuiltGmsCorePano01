package defpackage;

import android.os.SystemClock;

/* renamed from: akjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akjh implements Runnable {
    private final akjj a;
    private final akhy b;

    public akjh(akjj akjj, akhy akhy) {
        this.a = akjj;
        this.b = akhy;
    }

    public final void run() {
        akjj akjj = this.a;
        akhy akhy = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = akjj.b;
        if (j >= 0) {
            akjj.c = elapsedRealtime - j;
        }
        akjj.b = elapsedRealtime;
        akjj.b(akhy);
    }
}
