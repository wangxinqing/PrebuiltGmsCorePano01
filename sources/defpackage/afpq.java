package defpackage;

import java.io.PrintWriter;

/* renamed from: afpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class afpq implements aoqb {
    private final afqn a;
    private final PrintWriter b;

    public afpq(afqn afqn, PrintWriter printWriter) {
        this.a = afqn;
        this.b = printWriter;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        PrintWriter printWriter = this.b;
        Void voidR = (Void) obj;
        afpf afpf = afqn.d;
        printWriter.println("==== MDD_FILE_GROUP_MANAGER ====");
        printWriter.println("MDD_FRESH_FILE_GROUPS:");
        return aopr.a(aopr.a(aopr.a(afpf.d.b(), (amqy) new afoe(printWriter), afpf.h), (amqy) new afof(afpf, printWriter), afpf.h), (aoqb) new afpy(afqn, printWriter), afqn.n);
    }
}
