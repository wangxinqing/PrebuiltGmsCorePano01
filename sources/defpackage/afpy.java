package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: afpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpy implements aoqb {
    private final afqn a;
    private final PrintWriter b;

    public afpy(afqn afqn, PrintWriter printWriter) {
        this.a = afqn;
        this.b = printWriter;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        PrintWriter printWriter = this.b;
        Void voidR = (Void) obj;
        afqr afqr = afqn.f;
        printWriter.println("==== MDD_SHARED_FILES ====");
        List a2 = afqr.c.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            aflh aflh = (aflh) a2.get(i);
            afli a3 = afqr.c.a(aflh);
            if (a3 == null) {
                afsh.a("%s: Unable to read sharedFile from shared preferences.", (Object) "SharedFileManager");
            } else {
                printWriter.format("FileKey: %s\nFileName: %s\nSharedFile: %s\n", new Object[]{aflh, a3.b, a3.toString()});
                Context context = afqr.a;
                int a4 = afkq.a(aflh.e);
                if (a4 == 0) {
                    a4 = 1;
                }
                Uri a5 = afsp.a(context, a4, a3.b, afqr.b, afqr.j);
                if (a5 != null) {
                    printWriter.format("Checksum downloaded file: %s\n", new Object[]{afru.a(afqr.e, a5)});
                }
            }
        }
        return aorl.a((Object) null);
    }
}
