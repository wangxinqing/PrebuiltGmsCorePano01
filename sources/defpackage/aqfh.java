package defpackage;

import java.io.PrintWriter;

/* renamed from: aqfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aqfh extends aqfd {
    private final aqgg b;
    private final int c;

    public aqfh(aqgg aqgg, int i) {
        this.b = aqgg;
        this.c = i;
        this.a = new aqgg[]{aqgg};
    }

    public final aqey a() {
        return this.b.a();
    }

    public final long b() {
        return this.b.b();
    }

    public final void a(long j, aqey aqey) {
        boolean z;
        int i = this.c - 1;
        if (i == 0) {
            z = aqey.a();
        } else if (i != 1) {
            z = aqey.c();
        } else {
            z = aqey.b();
        }
        if (z) {
            this.b.a(j, aqey);
        }
    }

    public final void a(long j, PrintWriter printWriter) {
        int i = this.c;
        String str = i != 1 ? i != 2 ? "CELL" : "WIFI" : "GPS";
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("FilteringFusion based on ");
        sb.append(str);
        sb.append(" position.");
        printWriter.println(sb.toString());
    }
}
