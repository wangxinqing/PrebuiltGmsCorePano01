package defpackage;

import java.io.PrintWriter;

/* renamed from: afof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afof implements amqy {
    private final afpf a;
    private final PrintWriter b;

    public afof(afpf afpf, PrintWriter printWriter) {
        this.a = afpf;
        this.b = printWriter;
    }

    public final Object a(Object obj) {
        afpf afpf = this.a;
        PrintWriter printWriter = this.b;
        Void voidR = (Void) obj;
        printWriter.println("MDD_STALE_FILE_GROUPS:");
        for (afkr afkr : afpf.d.c()) {
            printWriter.format("GroupName: %s\nDataFileGroup:\n%s\n", new Object[]{afkr.c, afkr.toString()});
        }
        return null;
    }
}
