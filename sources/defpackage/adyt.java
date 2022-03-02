package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: adyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adyt extends qvr {
    final /* synthetic */ adze a;
    private boolean b;
    private final adys c = new adys();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adyt(adze adze, Looper looper) {
        super(looper);
        this.a = adze;
    }

    private final synchronized void b() {
        if (!this.b) {
            adze adze = this.a;
            adze.bindService(adze.b, this.c, 1);
            this.b = true;
        }
    }

    public final synchronized void a() {
        if (this.b) {
            try {
                this.a.unbindService(this.c);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.b = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Message message) {
        b();
        try {
            super.a(message);
            if (!hasMessages(0)) {
                a();
            }
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                a();
            }
            throw th;
        }
    }
}
