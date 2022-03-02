package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: aqgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgp extends aqfd {
    private static final long c = TimeUnit.SECONDS.toNanos(12);
    public final aqgk b;
    private final aqgg d;

    public aqgp() {
        this(new aqgk());
    }

    public final int a(long j, int i) {
        return this.d.a(j, i);
    }

    public final long b() {
        return this.d.b();
    }

    public aqgp(aqgk aqgk) {
        this.b = aqgk;
        aqgj aqgj = new aqgj();
        this.d = new aqfg(new aqgn(new aqfe()), new aqfg(new aqgl(new aqfh(new aqge(new aqgh(aqgj, 3000), c), 2), new aqfh(new aqfe(), 2)), new aqfh(new aqgm(), 3)));
        this.a = new aqgg[]{this.d, new aqgo(this), aqgj};
    }

    public final aqey a() {
        return this.d.a();
    }

    public final void a(long j, aqey aqey) {
        this.b.a(aqey);
        super.a(j, aqey);
    }

    public final void a(long j, aqgf aqgf) {
        this.b.a(aqgf);
        super.a(j, this.b.a);
    }

    public final void a(long j, PrintWriter printWriter) {
        String valueOf = String.valueOf(this.b.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("ViterbiSensorFusion: Activity{");
        sb.append(valueOf);
        sb.append("}");
        printWriter.println(sb.toString());
        super.a(j, printWriter);
    }
}
