package defpackage;

import android.os.Message;

/* renamed from: ahvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvb extends qvr {
    final /* synthetic */ ahvc a;

    public ahvb(ahvc ahvc) {
        this.a = ahvc;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                getLooper().quit();
            }
            super.handleMessage(message);
            return;
        }
        synchronized (this.a.f) {
            ahvc ahvc = this.a;
            ajrh ajrh = ahvc.e;
            ahto ahto = ahvc.c;
            aqek aqek = ahvc.b;
            throw null;
        }
    }
}
