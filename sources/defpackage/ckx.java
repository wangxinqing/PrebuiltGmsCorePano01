package defpackage;

import java.io.PrintWriter;

/* renamed from: ckx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckx {
    public static boolean a(PrintWriter printWriter, String str, String str2, boolean z, String str3, boolean z2) {
        if (!z) {
            return false;
        }
        if (z2) {
            printWriter.print(str3);
        }
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        printWriter.print(sb.toString());
        return true;
    }
}
