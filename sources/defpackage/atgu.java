package defpackage;

import android.os.SystemClock;
import com.android.volley.toolbox.ImageRequest;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: atgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgu {
    private static final String a = atgu.class.getSimpleName();
    private static final long b = TimeUnit.MINUTES.toMillis(1);
    private static final AtomicInteger c = new AtomicInteger(0);
    private int d;
    private final long e = SystemClock.elapsedRealtime();
    private final StringBuilder f;

    public atgu(List list) {
        synchronized (this) {
            this.d = -1;
            StringBuilder sb = new StringBuilder("DRD");
            this.f = sb;
            sb.append("(");
            sb.append(c.incrementAndGet());
            sb.append("): ");
            String str = "";
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f.append(str);
                str = "|";
                this.f.append(((atgo) it.next()).a());
            }
        }
    }

    public final synchronized void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        this.f.append(", ");
        if (elapsedRealtime < 1000) {
            this.f.append("<1s");
            return;
        }
        StringBuilder sb = this.f;
        sb.append(elapsedRealtime / 1000);
        sb.append("s");
    }

    public final synchronized void a(int i, int i2) {
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
        if (i2 >= 8192) {
            if (((long) elapsedRealtime) <= b) {
                this.d = (((int) TimeUnit.SECONDS.toMillis(1)) * i2) / elapsedRealtime;
                if (atfx.a(a, 3)) {
                    int i3 = this.d;
                    StringBuilder sb = new StringBuilder(67);
                    sb.append("Sent ");
                    sb.append(i);
                    sb.append(", Loaded ");
                    sb.append(i2);
                    sb.append(" bytes.  Byte/Sec = ");
                    sb.append(i3);
                    sb.toString();
                }
            }
        }
        this.f.append(", ");
        if (i2 < 1000) {
            this.f.append("<1kb");
        } else {
            StringBuilder sb2 = this.f;
            sb2.append(i2 / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            sb2.append("kb");
        }
        if (atfx.a(a, 3)) {
            this.f.toString();
        }
    }
}
