package defpackage;

import android.os.SystemClock;
import android.os.WorkSource;

/* renamed from: bvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bvp {
    public String a;
    public final WorkSource b;
    public long c;
    public boolean d;
    public boolean e;
    public int f;
    public String g;
    private long h;
    private long i;

    public bvp(String str, WorkSource workSource, long j, long j2, long j3, String str2) {
        this.a = str;
        this.b = workSource;
        this.c = j;
        this.h = j2;
        this.i = j3;
        this.f = 0;
        this.g = str2;
        this.d = false;
        this.e = false;
    }

    public final void a() {
        if (this.c > this.h) {
            bxl.a("WorkInfo", "Attribution was already enqueued %s.", (Object) toString());
            this.f |= 8;
        }
        this.c = SystemClock.elapsedRealtime();
    }

    public final void b() {
        if (this.h > this.i) {
            bxl.a("WorkInfo", "Attribution was already started %s.", (Object) toString());
            this.f |= 1;
        }
        this.h = SystemClock.elapsedRealtime();
    }

    public final void c() {
        if (this.h == -1) {
            bxl.a("WorkInfo", "Attribution was never started %s.", (Object) toString());
            this.f |= 2;
        }
        if (this.i > this.h) {
            bxl.a("WorkInfo", "Attribution was already stopped %s.", (Object) toString());
            this.f |= 4;
        }
        this.i = SystemClock.elapsedRealtime();
    }

    public final long d() {
        return this.i - this.h;
    }

    public final long e() {
        return this.h - this.c;
    }

    public final void f() {
        this.d = true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f != 0) {
            sb.append("errorCode=");
            sb.append(this.f);
            sb.append(", ");
        }
        sb.append("pkg=");
        sb.append(this.g);
        sb.append(", lbl=");
        sb.append(this.a);
        sb.append(", start=");
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        long j = this.h;
        String str2 = "unspec";
        if (j != -1) {
            str = cku.a(j + currentTimeMillis);
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(", stop=");
        long j2 = this.i;
        if (j2 != -1) {
            str2 = cku.a(j2 + currentTimeMillis);
        }
        sb.append(str2);
        if (!(this.h == -1 || this.i == -1)) {
            sb.append(", durtn=");
            sb.append(d());
            sb.append("ms");
        }
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public bvp(String str, String str2, WorkSource workSource) {
        this(str, workSource, -1, -1, -1, str2);
        iva.c(str);
    }
}
