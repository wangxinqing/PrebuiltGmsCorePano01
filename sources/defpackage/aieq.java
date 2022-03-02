package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: aieq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aieq {
    public final Map a = new HashMap();
    public final aicy b;
    public long c;
    public boolean d;
    private final Random e = new Random();

    public aieq(aicy aicy) {
        this.b = aicy;
        a();
    }

    public final void a() {
        boolean z;
        if (((double) this.e.nextFloat()) < aydf.a.a().gnssStatusStatsSamplingRate()) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        this.c = SystemClock.elapsedRealtime();
    }
}
