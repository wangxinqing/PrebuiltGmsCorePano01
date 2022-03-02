package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.location.fused.StationaryThrottlingEngine$AlarmListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aigg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aigg extends aics implements aiew, jlc {
    private final jgy a;
    private final Handler b;
    private final jld c;
    private long d;
    final StationaryThrottlingEngine$AlarmListener f = new StationaryThrottlingEngine$AlarmListener(this);
    private long g;
    private boolean h;
    private aiew i;

    public aigg(aiex aiex, jld jld, jgy jgy, Looper looper) {
        super(aiex);
        this.c = jld;
        this.b = new qvr(looper);
        this.a = jgy;
        this.i = null;
        jld.a = this;
    }

    private final void b(List list) {
        aiew aiew = this.i;
        if (aiew != null) {
            aiew.e(list);
        }
        if (this.h) {
            j();
        }
    }

    private final void j() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + g();
        if (elapsedRealtime > 0) {
            this.a.a("com.google.android.gms.location.fused.SEND_LOCATION_IN_STATIONARY_MODE_ALARM", 3, elapsedRealtime, (jgw) this.f, this.b, isb.a(d()));
        }
    }

    public final Location a(boolean z) {
        long j;
        long j2;
        Location a2 = this.e.a(z);
        if (a2 == null) {
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        long elapsedRealtimeNanos = a2.getElapsedRealtimeNanos();
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.d);
        if (this.h) {
            j2 = SystemClock.elapsedRealtime();
            j = System.currentTimeMillis();
        } else if (elapsedRealtimeNanos > nanos) {
            return a2;
        } else {
            j2 = this.d;
            j = this.g;
        }
        Location location = new Location(a2);
        location.setTime(j);
        int i3 = Build.VERSION.SDK_INT;
        location.setElapsedRealtimeNanos(TimeUnit.MILLISECONDS.toNanos(j2));
        return location;
    }

    /* access modifiers changed from: protected */
    public abstract void a(List list);

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract Collection d();

    public final void e(List list) {
        b(list);
        a(list);
    }

    /* access modifiers changed from: protected */
    public abstract boolean e();

    public boolean f() {
        if (this.h == e()) {
            return false;
        }
        boolean e = e();
        this.h = e;
        if (e) {
            j();
            return true;
        }
        this.d = SystemClock.elapsedRealtime();
        this.g = System.currentTimeMillis();
        this.a.a((jgw) this.f);
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract long g();

    /* access modifiers changed from: protected */
    public abstract String h();

    public final void i() {
        Location a2 = a(false);
        if (a2 != null) {
            b(Collections.singletonList(a2));
        }
    }

    public void b() {
        this.e.b();
        this.a.a((jgw) this.f);
        this.c.b();
        this.d = 0;
        this.g = 0;
    }

    public void a() {
        this.e.a();
        this.c.a();
        this.d = 0;
        this.g = 0;
    }

    public final void a(aiew aiew) {
        this.i = aiew;
        this.e.a((aiew) this);
    }

    public final void a(LocationAvailability locationAvailability) {
        aiew aiew = this.i;
        if (aiew != null) {
            aiew.a(locationAvailability);
        }
    }

    public final void a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.e.a(fileDescriptor, printWriter, strArr);
        String h2 = h();
        String str = !this.h ? "moving" : "stationary";
        StringBuilder sb = new StringBuilder(String.valueOf(h2).length() + 15 + str.length());
        sb.append("  ");
        sb.append(h2);
        sb.append(" throttling: ");
        sb.append(str);
        printWriter.println(sb.toString());
    }

    public final void a(boolean z, boolean z2) {
        if (!e()) {
            return;
        }
        if ((!z || !z2) && a(false) == null) {
            c();
        }
    }
}
