package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: bsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bsi extends Handler {
    final /* synthetic */ bso a;

    public bsi(bso bso) {
        this.a = bso;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.c();
        }
    }
}
