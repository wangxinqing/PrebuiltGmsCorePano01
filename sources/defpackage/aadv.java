package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: aadv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aadv implements Callable {
    private final aadx a;

    public aadv(aadx aadx) {
        this.a = aadx;
    }

    public final Object call() {
        aadx aadx = this.a;
        String valueOf = String.valueOf(aadx.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("nts:reachability:check:");
        sb.append(valueOf);
        qye qye = new qye(sb.toString());
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aado aado = new aado(elapsedRealtime, aadx.d.a(aadx.c, aadx.a), SystemClock.elapsedRealtime() - elapsedRealtime);
            qye.close();
            return aado;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
