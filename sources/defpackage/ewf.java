package defpackage;

import android.os.SystemClock;

/* renamed from: ewf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ewf implements ax {
    private final ewj a;

    public ewf(ewj ewj) {
        this.a = ewj;
    }

    public final void a(Object obj) {
        ewj ewj = this.a;
        amri amri = (amri) obj;
        if (amri.a() && ((Boolean) amri.b()).booleanValue()) {
            long elapsedRealtime = ewj.f.s - (SystemClock.elapsedRealtime() - ewj.k);
            if (elapsedRealtime <= 0) {
                ewj.f.a();
                return;
            }
            ewj.a();
            ewj.i = new ewh(ewj, elapsedRealtime);
            ewj.i.start();
        }
    }
}
