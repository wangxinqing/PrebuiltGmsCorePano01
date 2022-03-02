package defpackage;

import android.util.Log;

/* renamed from: aach  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aach implements Runnable {
    private final aacm a;

    public aach(aacm aacm) {
        this.a = aacm;
    }

    public final void run() {
        aacm aacm = this.a;
        synchronized (aacm.h.a) {
            if (!aacm.e) {
                String valueOf = String.valueOf(aacm.b.c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Enforcing binder timeout for ");
                sb.append(valueOf);
                Log.w("NetworkScheduler.TED", sb.toString());
                aacm.b();
            }
        }
    }
}
