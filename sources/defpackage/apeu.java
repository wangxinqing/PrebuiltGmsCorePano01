package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: apeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apeu extends apep {
    public final void a(Throwable th) {
        th.printStackTrace();
    }

    public final void a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }

    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
