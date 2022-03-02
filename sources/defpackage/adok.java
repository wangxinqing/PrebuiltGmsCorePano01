package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: adok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adok implements Handler.Callback {
    final /* synthetic */ adol a;

    public adok(adol adol) {
        this.a = adol;
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            adol.a.d("Unhandled message: %d.", Integer.valueOf(message.what));
        } else {
            this.a.a();
        }
        return true;
    }
}
