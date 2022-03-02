package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: arrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arrx implements arrc {
    private long a = 0;
    private int b = 0;
    private long[] c;
    private long[] d;
    private float[] e;
    private List f;
    private short[] g;
    private short[] h;
    private float[] i;
    private float[] j;
    private int k = 0;
    private boolean l = false;
    private long m = 0;
    private aibe n = null;
    private aibe o = null;
    private long p;

    private static void a(PrintWriter printWriter, aibe aibe) {
        if (aibe != null) {
            printWriter.print("[");
            printWriter.print(aibe.b);
            printWriter.print(", ");
            printWriter.print(aibe.c);
            printWriter.print(", ");
            printWriter.print(aibe.d);
            printWriter.print(", ");
            if (aibe.b()) {
                printWriter.print(aibe.g());
            }
            printWriter.print(", ");
            if (aibe.c()) {
                printWriter.print(String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(aibe.h())}));
            }
            printWriter.print(", ");
            if (aibe.f()) {
                printWriter.print(aibe.k());
            }
            printWriter.print(", ");
            if (aibe.d()) {
                printWriter.print(aibe.i());
            }
            printWriter.print("]");
            return;
        }
        printWriter.print("null");
    }

    public final long a() {
        return this.a;
    }

    public final void a(int i2, long j2) {
        if (this.b == 0) {
            this.m = j2 - this.a;
            this.b = i2;
        }
    }

    public final void a(long j2) {
        this.a = j2;
    }

    public final void a(aibe aibe) {
        this.n = aibe;
    }

    public final void b(long j2) {
        this.p = j2;
    }

    public final void b(aibe aibe) {
        this.o = aibe;
    }

    public final void a(int i2) {
        this.c = new long[i2];
        this.d = new long[i2];
        this.e = new float[i2];
        this.h = new short[i2];
        this.i = new float[i2];
        this.j = new float[i2];
        this.f = new ArrayList();
        this.g = new short[i2];
    }

    public final void a(long j2, int i2, int i3, long j3, float f2, int i4, float f3, arqq arqq) {
        int i5;
        long[] jArr;
        float[] fArr;
        int i6;
        arqq arqq2 = arqq;
        long[] jArr2 = this.c;
        if (jArr2 == null || (i5 = this.k) >= jArr2.length || (jArr = this.d) == null || i5 >= jArr.length || (fArr = this.e) == null || i5 >= fArr.length) {
            this.l = true;
            return;
        }
        long j4 = (long) (-i2);
        long j5 = j2 & 281474976710655L;
        long j6 = 255 & j4;
        long j7 = (long) i3;
        long j8 = 15 & j7;
        long j9 = 1;
        if (j6 == j4 && j5 == j2 && j8 == j7) {
            j9 = 0;
        }
        jArr2[i5] = (j6 << 48) | j5 | (j8 << 56) | (j9 << 63);
        jArr[i5] = j3;
        fArr[i5] = f2;
        if (arqq2 != null) {
            if (!this.f.contains(arqq2)) {
                this.f.add(arqq2);
            }
            i6 = this.f.indexOf(arqq2);
        } else {
            i6 = -1;
        }
        short[] sArr = this.h;
        int i7 = this.k;
        sArr[i7] = (short) i4;
        this.i[i7] = f3;
        this.j[i7] = f3;
        this.g[i7] = (short) i6;
        this.k = i7 + 1;
    }

    public final void a(PrintWriter printWriter) {
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        PrintWriter printWriter2 = printWriter;
        printWriter2.print("{outcome=");
        switch (this.b) {
            case 0:
                printWriter2.print("not_finished");
                break;
            case 1:
                printWriter2.print("success");
                break;
            case 2:
                printWriter2.print("too_few_aps");
                break;
            case 3:
                printWriter2.print("null_scan");
                break;
            case 4:
                printWriter2.print("bad_best_cell");
                break;
            case 5:
                printWriter2.print("null_position");
                break;
            case 6:
                printWriter2.print("weak_wifi");
                break;
            case 7:
                printWriter2.print("cache_miss");
                break;
            default:
                printWriter2.print("unknown");
                break;
        }
        printWriter2.print("; position=");
        a(printWriter2, this.n);
        printWriter2.print("; lastPosition=");
        a(printWriter2, this.o);
        printWriter2.print("; runMillis=");
        printWriter2.print(this.m);
        printWriter2.print("; scanTsMsSinceBoot=");
        printWriter2.print(this.p);
        printWriter2.print("; macData=[");
        int i3 = 0;
        while (i3 < this.k) {
            long j2 = this.c[i3];
            long j3 = this.d[i3];
            float f2 = this.e[i3];
            short s = this.h[i3];
            float f3 = this.i[i3];
            float f4 = this.j[i3];
            short s2 = this.g[i3];
            Locale locale = Locale.US;
            Object[] objArr = new Object[10];
            int i4 = i3;
            objArr[0] = Integer.valueOf((int) ((j2 >> 56) & 15));
            objArr[1] = Integer.valueOf(-((int) ((j2 >> 48) & 255)));
            objArr[2] = Long.valueOf(j2 & 281474976710655L);
            String str7 = "";
            if (((j2 >> 63) & 1) != 0) {
                str = "-sufferedDataLoss";
            } else {
                str = str7;
            }
            objArr[3] = str;
            if (j3 != 0) {
                str2 = String.format("0x%016x", new Object[]{Long.valueOf(j3)});
            } else {
                str2 = str7;
            }
            objArr[4] = str2;
            if (f2 != Float.NEGATIVE_INFINITY) {
                str3 = String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(f2)});
            } else {
                str3 = str7;
            }
            objArr[5] = str3;
            if (s != 0) {
                str4 = Integer.toString(s);
            } else {
                str4 = str7;
            }
            objArr[6] = str4;
            if (s != 0) {
                str5 = String.format(Locale.US, "%.2f", new Object[]{Float.valueOf(f3)});
            } else {
                str5 = str7;
            }
            objArr[7] = str5;
            if (s != 0) {
                str6 = String.format(Locale.US, "%.2f", new Object[]{Float.valueOf(f4)});
            } else {
                str6 = str7;
            }
            objArr[8] = str6;
            if (s2 != -1) {
                str7 = Integer.toString(s2);
            }
            objArr[9] = str7;
            printWriter2.print(String.format(locale, "%d:%d:%012X%s:%s:%s:%s:%s:%s:%s", objArr));
            printWriter2.print(", ");
            i3 = i4 + 1;
        }
        int i5 = 0;
        printWriter2.print("]; droppedMacsCount=");
        long[] jArr = this.c;
        if (jArr != null) {
            i2 = jArr.length;
        } else {
            i2 = 0;
        }
        printWriter2.print(i2 - this.k);
        if (this.l) {
            printWriter2.print("; ERROR: Some macs might be missing");
        }
        printWriter2.print("; floors=[");
        List list = this.f;
        for (int size = list.size(); i5 < size; size = size) {
            arqq arqq = (arqq) list.get(i5);
            String str8 = arqq.a;
            long j4 = arqq.b;
            long j5 = arqq.c;
            long j6 = arqq.d;
            List list2 = list;
            long j7 = arqq.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 84);
            sb.append(str8);
            sb.append(":");
            sb.append(j4);
            sb.append(":");
            sb.append(j5);
            sb.append(":");
            sb.append(j6);
            sb.append(":");
            sb.append(j7);
            printWriter2.print(sb.toString());
            printWriter2.print(", ");
            i5++;
            list = list2;
        }
        printWriter2.print("]");
        printWriter2.println("}");
    }
}
