package defpackage;

import android.os.Message;
import android.view.KeyEvent;

/* renamed from: akep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akep extends qvr {
    final /* synthetic */ akeq a;

    public akep(akeq akeq) {
        this.a = akeq;
    }

    public final void handleMessage(Message message) {
        if (message.what == 0 && this.a.g != null) {
            int i = message.arg1;
            KeyEvent keyEvent = (KeyEvent) message.obj;
        }
    }
}
