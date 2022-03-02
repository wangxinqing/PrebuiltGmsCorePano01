package defpackage;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;

/* renamed from: cgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgo extends qvr {
    final /* synthetic */ cgp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cgo(cgp cgp, Looper looper) {
        super(looper);
        this.a = cgp;
    }

    private final void a() {
        if (this.a.e) {
            this.a.a.startScan();
            this.a.f = SystemClock.uptimeMillis();
            removeCallbacksAndMessages((Object) null);
            sendMessageDelayed(obtainMessage(2), 4000);
        }
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            a();
        } else if (i == 2) {
            Log.w("IndoorOutdoorPredictor", "WiFi scan timed out");
            this.a.g++;
            a();
        } else {
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Unknown message ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
