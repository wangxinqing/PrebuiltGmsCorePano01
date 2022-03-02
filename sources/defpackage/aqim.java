package defpackage;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: aqim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqim {
    public final Deque a = new ArrayDeque();
    private final String b;
    private final int c;
    private final double d;
    private final boolean e;

    public aqim(String str, int i, double d2, boolean z) {
        this.b = str;
        this.c = i;
        this.d = d2;
        this.e = z;
    }

    private final void a(double d2) {
        while (!this.a.isEmpty() && d2 - ((aqjb) this.a.peekFirst()).d >= this.d) {
            this.a.removeFirst();
        }
    }

    public final void a(long j, PrintWriter printWriter) {
        int i;
        if (printWriter != null) {
            a(aqjs.a(j));
            double a2 = aqjs.a(j);
            double d2 = a2 - this.d;
            StringBuilder sb = new StringBuilder();
            Iterator it = this.a.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                aqjb aqjb = (aqjb) it.next();
                double d3 = aqjb.d;
                if (d3 > d2 && d3 <= a2) {
                    sb.append(String.format("%.9f,%s", new Object[]{Double.valueOf(d3), Integer.valueOf(aqjb.c)}));
                    int i3 = 0;
                    while (true) {
                        double[] dArr = aqjb.e;
                        if (dArr != null) {
                            i = dArr.length;
                        } else {
                            i = 0;
                        }
                        if (i3 >= i) {
                            break;
                        }
                        sb.append(String.format(",%s", new Object[]{Double.valueOf(aqjb.a(i3))}));
                        i3++;
                    }
                    sb.append("\n");
                } else {
                    it.remove();
                    i2++;
                }
            }
            String a3 = anml.e.a(sb.toString().getBytes(amqn.c));
            printWriter.println();
            printWriter.println(String.format("### start %s log ###", new Object[]{this.b}));
            printWriter.println(a3);
            printWriter.println(String.format("###  end %s log  ###", new Object[]{this.b}));
            if (i2 > 0) {
                printWriter.printf("#evidence dropped: %s%n", new Object[]{Integer.valueOf(i2)});
            }
            printWriter.println();
        }
    }

    public final void a(aqjb aqjb) {
        if (aqjb != null) {
            if (this.e) {
                aqjb = new aqjb(aqjb.c, aqjb.d, aqjb.e);
            }
            if (this.c == this.a.size()) {
                this.a.removeFirst();
            }
            a(aqjb.d);
            this.a.add(aqjb);
        }
    }
}
