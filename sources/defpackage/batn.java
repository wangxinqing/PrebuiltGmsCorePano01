package defpackage;

import java.io.OutputStream;

/* renamed from: batn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class batn implements batz {
    final /* synthetic */ bauc a;
    final /* synthetic */ OutputStream b;

    public batn(bauc bauc, OutputStream outputStream) {
        this.a = bauc;
        this.b = outputStream;
    }

    public final void a(batd batd, long j) {
        baud.a(batd.b, 0, j);
        while (j > 0) {
            this.a.e();
            batw batw = batd.a;
            int min = (int) Math.min(j, (long) (batw.c - batw.b));
            this.b.write(batw.a, batw.b, min);
            int i = batw.b + min;
            batw.b = i;
            long j2 = (long) min;
            j -= j2;
            batd.b -= j2;
            if (i == batw.c) {
                batd.a = batw.b();
                batx.a(batw);
            }
        }
    }

    public final bauc bu() {
        return this.a;
    }

    public final void close() {
        this.b.close();
    }

    public final void flush() {
        this.b.flush();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
        sb.append("sink(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
