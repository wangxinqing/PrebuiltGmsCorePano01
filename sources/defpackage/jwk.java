package defpackage;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: jwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jwk implements Runnable {
    final /* synthetic */ ContextData a;
    final /* synthetic */ jwl b;

    public jwk(jwl jwl, ContextData contextData) {
        this.b = jwl;
        this.a = contextData;
    }

    public final void run() {
        jwl jwl = this.b;
        ContextData contextData = this.a;
        synchronized (jwl.d) {
            jtv jtv = jwl.b;
            if (jtv != null) {
                jtv.a(contextData);
            }
        }
    }
}
