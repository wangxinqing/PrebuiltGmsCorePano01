package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zzc {
    private static zzc a = null;
    private final AtomicInteger b = new AtomicInteger(0);

    private zzc() {
    }

    static synchronized zzc a() {
        zzc zzc;
        synchronized (zzc.class) {
            if (a == null) {
                a = new zzc();
            }
            zzc = a;
        }
        return zzc;
    }

    /* access modifiers changed from: package-private */
    public final zzb a(Context context) {
        return new zzb(context, this.b.getAndIncrement());
    }
}
