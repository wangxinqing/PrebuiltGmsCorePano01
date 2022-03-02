package defpackage;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: ajja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajja {
    public final hph a;
    private final hol b;
    private final hol c;
    private final Context d;
    private long e;
    private long f;
    private Boolean g;
    private Boolean h;
    private long i = SystemClock.elapsedRealtime();

    public ajja(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.b = hol.a(applicationContext, "LE");
        this.c = new hol(this.d, "ULR", (String) null);
        this.a = new hph(this.b, "LE_ULR_COUNTERS", 1024);
    }

    private final void a(Boolean bool, Boolean bool2) {
        int i2;
        int i3;
        String valueOf = String.valueOf(bool);
        String valueOf2 = String.valueOf(bool2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(valueOf2).length());
        sb.append("Clearcut event: reportingEnabled=");
        sb.append(valueOf);
        sb.append(" locationEnabled=");
        sb.append(valueOf2);
        sb.toString();
        aucd o = aofz.d.o();
        boolean booleanValue = bool2.booleanValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofz aofz = (aofz) o.b;
        aofz.a |= 2;
        aofz.c = booleanValue;
        if (bool != null) {
            boolean booleanValue2 = bool.booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofz aofz2 = (aofz) o.b;
            aofz2.a |= 1;
            aofz2.b = booleanValue2;
        }
        aucd o2 = aofy.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aofy aofy = (aofy) o2.b;
        aofz aofz3 = (aofz) o.i();
        aofz3.getClass();
        aofy.b = aofz3;
        aofy.a |= 1;
        hoi a2 = this.c.a((audx) (aofy) o2.i());
        if (!bool2.booleanValue()) {
            i2 = 21110004;
        } else {
            i2 = 21110003;
        }
        a2.a(i2);
        if (bool != null) {
            if (!bool.booleanValue()) {
                i3 = 21110002;
            } else {
                i3 = 21110001;
            }
            a2.a(i3);
        }
        if (bool != null) {
            if (bool2.booleanValue() && bool.booleanValue()) {
                a2.a(21110227);
            } else if (!bool2.booleanValue() && bool.booleanValue()) {
                a2.a(21110228);
            } else if (!bool2.booleanValue() || bool.booleanValue()) {
                a2.a(21110230);
            } else {
                a2.a(21110229);
            }
        }
        a2.b();
        this.g = bool2;
        this.h = bool;
        this.i = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        this.f++;
    }

    public final synchronized void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f > aztb.a.a().R() || elapsedRealtime - this.e > aztb.a.a().Q()) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c() {
        long j = this.f;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Clearcut uploadCounters numEvents=");
        sb.append(j);
        sb.toString();
        if (this.f != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f;
            long j3 = this.e;
            StringBuilder sb2 = new StringBuilder(94);
            sb2.append("Clearcut sending ");
            sb2.append(j2);
            sb2.append(" Counter events ");
            sb2.append(elapsedRealtime - j3);
            sb2.append("ms since last upload.");
            sb2.toString();
            new ajiz(this).start();
            this.e = elapsedRealtime;
            this.f = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(boolean z) {
        boolean z2;
        boolean b2 = rns.b(this.d);
        Boolean bool = this.g;
        boolean z3 = false;
        if (bool == null || bool.booleanValue() != b2) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool2 = this.h;
        if (bool2 == null || bool2.booleanValue() != z) {
            z3 = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.i;
        long T = aztb.a.a().T();
        if (z3 || z2 || elapsedRealtime > T) {
            a(Boolean.valueOf(z), Boolean.valueOf(b2));
        }
    }

    public final synchronized void a(boolean z) {
        a(this.h, Boolean.valueOf(z));
    }
}
