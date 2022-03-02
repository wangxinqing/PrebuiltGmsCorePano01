package defpackage;

import java.io.PrintWriter;

/* renamed from: aaec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aaec {
    public static void a(PrintWriter printWriter, int i) {
        boolean z;
        printWriter.append("Waiting for: ");
        if (i != 0) {
            if ((i & 2) == 2) {
                printWriter.append("ANY_DATA");
                z = false;
            } else {
                z = true;
            }
            if ((i & 1) == 1) {
                if (!z) {
                    printWriter.append(" | ");
                }
                printWriter.append("UNMETERED_DATA");
            }
            printWriter.append("\n");
            return;
        }
        printWriter.append("nothing\n");
    }
}
