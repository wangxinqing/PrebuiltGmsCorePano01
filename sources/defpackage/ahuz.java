package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/* renamed from: ahuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahuz {
    public int a = 0;
    public int b = 0;
    public int c;
    public int d;
    public int e;
    private final boolean f;

    public ahuz(boolean z) {
        this.f = z;
    }

    public static int a(BufferedReader bufferedReader) {
        String readLine = bufferedReader.readLine();
        if (readLine != null) {
            return Integer.parseInt(readLine);
        }
        throw new IOException("missing data");
    }

    public static File b(String str) {
        return new File(str, "sessionSummary");
    }

    public final synchronized int a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        this.e = i;
    }

    public final synchronized int b() {
        return this.b;
    }

    public final synchronized boolean c() {
        return this.f;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        boolean z = this.f;
        StringBuilder sb = new StringBuilder(157);
        sb.append("SessionSummary [gpsCount=");
        sb.append(i);
        sb.append(", gpsMeasurementsCount=");
        sb.append(i2);
        sb.append(", gpsNavigationMessagesCount=");
        sb.append(i3);
        sb.append(", wifiScanCount=");
        sb.append(i4);
        sb.append(", forceUpload=");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(aqek aqek) {
        int j = aqek.j(4);
        if (j > 0) {
            for (int i = 0; i < j; i++) {
                aqek f2 = aqek.f(4, i);
                if (f2.i(9)) {
                    aqek e2 = f2.e(9);
                    int i2 = this.a;
                    int j2 = e2.j(8);
                    int i3 = 0;
                    for (int i4 = 0; i4 < j2; i4++) {
                        aqek f3 = e2.f(8, i4);
                        if (f3.i(8)) {
                            if (f3.b(8) == 0) {
                                i3++;
                            }
                        }
                    }
                    this.a = i2 + i3;
                    this.b += e2.j(7);
                    int i5 = this.c;
                    int j3 = e2.j(19);
                    int i6 = 0;
                    for (int i7 = 0; i7 < j3; i7++) {
                        if (e2.f(19, i7).i(3)) {
                            i6++;
                        }
                    }
                    this.c = i5 + i6;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str) {
        PrintWriter printWriter = new PrintWriter(b(str));
        printWriter.println(4);
        printWriter.println(this.a);
        printWriter.println(this.b);
        printWriter.println(!this.f ? "0" : "1");
        printWriter.println(this.c);
        printWriter.println(this.d);
        printWriter.println(this.e);
        printWriter.close();
    }
}
