package defpackage;

import android.os.Message;
import android.os.SystemClock;

/* renamed from: akhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akhc extends qvr {
    int a = 0;
    int b = -1;
    int c;
    final /* synthetic */ akhg d;

    public akhc(akhg akhg) {
        this.d = akhg;
    }

    public final void handleMessage(Message message) {
        if (message.what != 0) {
            if (this.c < akhg.a.length - 1) {
                this.c++;
            }
            this.d.a(SystemClock.uptimeMillis(), 0, 0, 0, 0);
            sendEmptyMessageDelayed(this.b, akhg.a[this.c]);
            return;
        }
        this.a = 0;
        this.b = -1;
    }
}
