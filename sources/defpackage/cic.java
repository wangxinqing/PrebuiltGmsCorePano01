package defpackage;

import com.google.android.gms.nearby.messages.Message;

/* renamed from: cic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cic implements Runnable {
    final /* synthetic */ Message a;
    final /* synthetic */ cie b;

    public cic(cie cie, Message message) {
        this.b = cie;
        this.a = message;
    }

    public final void run() {
        this.b.b.remove(this.a);
    }
}
