package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: als  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class als extends Handler {
    final /* synthetic */ alv a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public als(alv alv, Looper looper) {
        super(looper);
        this.a = alv;
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
        } else {
            this.a.a();
        }
    }
}
