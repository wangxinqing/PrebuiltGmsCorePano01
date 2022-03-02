package defpackage;

import com.google.android.gms.nearby.messages.Message;

/* renamed from: cib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cib implements Runnable {
    final /* synthetic */ Message a;
    final /* synthetic */ cie b;

    public cib(cie cie, Message message) {
        this.b = cie;
        this.a = message;
    }

    public final void run() {
        this.b.b.add(this.a);
    }
}
