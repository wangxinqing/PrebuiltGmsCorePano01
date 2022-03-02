package defpackage;

import com.google.android.gms.nearby.messages.Message;

/* renamed from: tsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tsh extends arwm {
    final /* synthetic */ Message a;
    final /* synthetic */ tsj b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tsh(tsj tsj, String str, Message message) {
        super(str);
        this.b = tsj;
        this.a = message;
    }

    public final void run() {
        this.b.a.a.a(this.a);
    }
}
