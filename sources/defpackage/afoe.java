package defpackage;

import android.util.Pair;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: afoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afoe implements amqy {
    private final PrintWriter a;

    public afoe(PrintWriter printWriter) {
        this.a = printWriter;
    }

    public final Object a(Object obj) {
        PrintWriter printWriter = this.a;
        for (Pair pair : (List) obj) {
            printWriter.format("GroupName: %s\nDataFileGroup:\n %s\n\n", new Object[]{((aflf) pair.first).b, ((afkr) pair.second).toString()});
        }
        return null;
    }
}
