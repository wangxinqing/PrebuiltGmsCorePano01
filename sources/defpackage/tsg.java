package defpackage;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;

/* renamed from: tsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tsg extends arwm {
    final /* synthetic */ Message a;
    final /* synthetic */ tsj b;
    final /* synthetic */ BleSignalImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tsg(tsj tsj, String str, Message message, BleSignalImpl bleSignalImpl) {
        super(str);
        this.b = tsj;
        this.a = message;
        this.c = bleSignalImpl;
    }

    public final void run() {
        this.b.a.a.a(this.a, (String) null, this.c, (byte[]) null);
    }
}
