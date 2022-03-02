package defpackage;

import java.io.PrintWriter;

/* renamed from: aicm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aicm extends aicl {
    public aicm(aico aico, long j, String str, Object obj, int i, int i2, int i3) {
        super(aico, j, str, obj, i, i2, i3);
    }

    public final void a(PrintWriter printWriter) {
        String str;
        Object obj = this.i;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = "";
        }
        String str2 = this.k;
        if (str2 != null) {
            printWriter.print(String.format(str2, new Object[]{str, Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h)}));
            return;
        }
        printWriter.print(str);
    }
}
