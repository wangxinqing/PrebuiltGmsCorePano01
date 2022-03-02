package defpackage;

import android.os.Message;

/* renamed from: ixv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ixv extends jfo {
    final jfp a;

    public ixv(jfp jfp) {
        super(jfp);
        this.a = jfp;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            agfu.a().a.a(ixn.a.a);
            this.a.quit();
        }
    }
}
