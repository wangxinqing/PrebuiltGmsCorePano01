package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: asjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asjx implements Handler.Callback {
    final /* synthetic */ askc a;

    public asjx(askc askc) {
        this.a = askc;
    }

    public final boolean handleMessage(Message message) {
        if (this.a.b()) {
            return false;
        }
        int i = message.what;
        if (i == 1) {
            this.a.h.set(true);
            this.a.g = SystemClock.elapsedRealtime();
            synchronized (this.a.a) {
                int size = this.a.a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jjg jjg = asil.a;
                    this.a.a.keyAt(i2);
                    ((asis) this.a.a.valueAt(i2)).b();
                }
                this.a.d.shutdownNow();
                try {
                    this.a.d.awaitTermination(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                }
                jjg jjg2 = asil.a;
                askc askc = this.a;
                askc.c.c(askc.j);
            }
        } else if (i == 2) {
            asis asis = (asis) message.obj;
            if (this.a.h.get()) {
                this.a.a(Integer.valueOf(asis.k));
            } else {
                asis.a();
            }
        } else if (i == 3) {
            ((asis) message.obj).b();
        } else if (i == 4 || i == 5) {
            ((asiu) message.obj).a();
        } else {
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(53);
            sb.append("NearbyDirectService Unknown message type: ");
            sb.append(i3);
            throw new RuntimeException(sb.toString());
        }
        return true;
    }
}
