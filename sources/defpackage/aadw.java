package defpackage;

import android.util.Log;

/* renamed from: aadw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aadw implements aora {
    final /* synthetic */ aadx a;

    public aadw(aadx aadx) {
        this.a = aadx;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aado aado = (aado) obj;
        String valueOf = String.valueOf(this.a.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("nts:reachability:result_success:");
        sb.append(valueOf);
        qye qye = new qye(sb.toString());
        try {
            this.a.a(aado);
            this.a.b();
            qye.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(Throwable th) {
        String valueOf = String.valueOf(this.a.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("nts:reachability:result_failure:");
        sb.append(valueOf);
        qye qye = new qye(sb.toString());
        try {
            String valueOf2 = String.valueOf(th);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb2.append("Exception in reachability check: ");
            sb2.append(valueOf2);
            Log.e("UriObserver", sb2.toString());
            this.a.b();
            qye.close();
            return;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }
}
