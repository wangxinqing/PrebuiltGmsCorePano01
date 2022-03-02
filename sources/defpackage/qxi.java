package defpackage;

import android.util.Log;

/* renamed from: qxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qxi extends qxw {
    public long a = -1;
    public long b = -1;

    public qxi() {
        this.n = true;
    }

    /* renamed from: a */
    public final qxj b() {
        super.d();
        long j = this.a;
        if (j == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        } else if (j > 0) {
            long j2 = this.b;
            if (j2 == -1) {
                double d = (double) j;
                double c = axbn.a.a().c();
                if (c <= 0.0d || c > 1.0d) {
                    Log.e("PeriodicTask.Builder", "Read invalid value for flex from Phenotype, so returning hardcoded flex.");
                    c = 0.10000000149011612d;
                }
                Double.isNaN(d);
                this.b = (long) (d * c);
            } else if (j2 > j) {
                this.b = j;
            }
            c();
            return new qxj(this);
        } else {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Period set cannot be less than or equal to 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void a(long j, long j2, qxr qxr) {
        iva.a((Object) qxr);
        if (j < 1) {
            throw new IllegalArgumentException("Must set period to a value > 0.");
        } else if (j2 >= 1) {
            this.a = j;
            this.b = j2;
        } else {
            throw new IllegalArgumentException("Must set flex to a value > 0.");
        }
    }

    public final void a(qxe qxe) {
        long j = qxe.r;
        double h = axbn.h();
        double d = (double) j;
        Double.isNaN(d);
        this.b = (long) (h * d);
        this.a = j;
    }
}
