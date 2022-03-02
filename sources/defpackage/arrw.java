package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: arrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arrw implements arqz {
    private long a = 0;
    private long[] b;
    private long c = 0;
    private long d = 0;
    private final ArrayList e = new ArrayList();

    public final long a() {
        return this.a;
    }

    public final void a(long j) {
        this.a = j;
    }

    public final void b(long j) {
        this.d = j;
    }

    public final void c(long j) {
        this.e.add(Long.valueOf(j));
    }

    public final void d(long j) {
        this.c += j;
    }

    public final void a(aqek aqek) {
        int j = aqek.j(1);
        this.b = new long[j];
        for (int i = 0; i < j; i++) {
            this.b[i] = aqek.d(1, i);
        }
    }

    public final void a(PrintWriter printWriter) {
        printWriter.print("{outcome=");
        if (this.d == 0) {
            printWriter.print("pending");
        } else {
            printWriter.print("received in ");
            printWriter.print(this.d - this.a);
            printWriter.print("ms");
        }
        printWriter.print("; requestedMacs=[");
        long[] jArr = this.b;
        if (jArr != null) {
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                printWriter.printf("%012X, ", new Object[]{Long.valueOf(jArr[i])});
            }
        }
        printWriter.print("]; receivedTileS2CellIds=[");
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            printWriter.printf("0x%016X, ", new Object[]{(Long) arrayList.get(i2)});
        }
        printWriter.print("]; clearedMacsCount=");
        printWriter.print(this.c);
        printWriter.println("}");
    }
}
