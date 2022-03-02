package defpackage;

import android.os.Message;

/* renamed from: ajew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajew implements Runnable {
    private final ajex a;
    private final Message b;

    public ajew(ajex ajex, Message message) {
        this.a = ajex;
        this.b = message;
    }

    public final void run() {
        this.a.h.b.a(8, this.b.getData());
    }
}
