package defpackage;

import android.content.Context;
import com.google.android.gms.drive.events.DriveEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: kth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kth {
    private final Context a;
    private final HashMap b = new HashMap();
    private final ScheduledExecutorService c;
    private final Runnable d = new ktg(this);

    public kth(Context context) {
        ScheduledExecutorService c2 = qvj.b.c(2);
        this.a = context;
        this.c = c2;
    }

    private final void a() {
        this.c.schedule(this.d, ((Long) jzq.U.c()).longValue(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public final synchronized ktc a(String str) {
        return (ktc) this.b.get(str);
    }

    public final synchronized void a(String str, DriveEvent driveEvent) {
        iva.a(!this.c.isShutdown());
        ktc a2 = a(str);
        if (a2 == null) {
            if (this.b.isEmpty()) {
                a();
            } else {
                a(false, str);
            }
            a2 = new ktc(this.a, str);
            this.b.put(str, a2);
        }
        a2.a(driveEvent);
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(boolean z, String str) {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((String) entry.getKey()).equals(str) && ((ktc) entry.getValue()).a()) {
                it.remove();
            }
        }
        if (z && !this.b.isEmpty()) {
            a();
        }
    }
}
