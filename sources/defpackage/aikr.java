package defpackage;

import java.io.PrintWriter;

/* renamed from: aikr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikr extends aikn {
    private final boolean c;
    private final String d;

    public aikr(int i, boolean z, String str) {
        super(i);
        this.c = z;
        this.d = str;
    }

    public final void a(PrintWriter printWriter) {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = a();
        objArr[1] = Integer.valueOf(this.a);
        objArr[2] = this.d;
        if (!this.c) {
            str = "disconnected";
        } else {
            str = "connected";
        }
        objArr[3] = str;
        printWriter.printf("%s WifiConnectionChanged(%08x): %s %s%n", objArr);
    }
}
