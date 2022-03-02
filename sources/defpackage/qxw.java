package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collection;
import java.util.Set;

/* renamed from: qxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qxw {
    public int c = 0;
    public int d = -1;
    public int e = 0;
    public int f = -1;
    public int g;
    public int h = 0;
    public String i;
    public int j;
    public String k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Set q = anfv.a;
    public qxl r = qxl.a;
    public Bundle s;

    private final qyi a() {
        qyh qyh = new qyh();
        qyh.d = this.i;
        qyh.e = this.k;
        return qyh.a();
    }

    public final void a(int i2) {
        this.c = i2;
        this.d = i2;
    }

    public final void a(int i2, int i3) {
        this.e = i2;
        this.f = i3;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        this.o = z;
    }

    public final void a(boolean z) {
        this.p = z;
        this.g = z ? 1 : 0;
        this.h = z;
    }

    public abstract qxx b();

    public final void b(int i2) {
        this.m = i2;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        this.l = z;
    }

    public final void b(int i2, int i3) {
        this.c = i2;
        this.d = i3;
    }

    @Deprecated
    public final void b(boolean z) {
        this.m = z ? 1 : 0;
        this.l = z;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        int i2;
        int i3 = 1;
        if (this.f == -1) {
            if (!axbn.a.a().o() || !qxx.c.a(a())) {
                i2 = this.e;
            } else {
                i2 = 1;
            }
            this.f = i2;
        }
        if (this.d == -1) {
            if (!axbn.a.a().p() || !qxx.d.a(a())) {
                i3 = this.c;
            }
            this.d = i3;
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        boolean z;
        if (this.i != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Must provide an endpoint for this task by calling setService(ComponentName).");
        qwq.b(this.k);
        qxl qxl = this.r;
        qyj qyj = qxx.c;
        if (qxl != null) {
            int i2 = qxl.b;
            if (i2 == 1 || i2 == 0) {
                int i3 = qxl.c;
                int i4 = qxl.d;
                if (i2 == 0 && i3 < 0) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("InitialBackoffSeconds can't be negative: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                } else if (i2 == 1 && i3 < 10) {
                    throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                } else if (i4 < i3) {
                    StringBuilder sb2 = new StringBuilder(77);
                    sb2.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                    sb2.append(i4);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder(45);
                sb3.append("Must provide a valid RetryPolicy: ");
                sb3.append(i2);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        if (this.n) {
            qxx.b(this.s);
        }
        if (!this.q.isEmpty() && this.c == 2) {
            throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
        }
        for (Uri a : this.q) {
            qxx.a(a);
        }
    }

    public final void e() {
        this.e = 0;
        this.f = 0;
        this.o = false;
    }

    public final void a(Set set) {
        this.q = new ob((Collection) set);
    }
}
