package defpackage;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: aikl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikl extends aikn {
    private final List c;
    private final String d;
    private final String e;
    private final boolean f;

    public aikl(int i, String str, List list, String str2, boolean z) {
        super(i);
        this.c = list;
        this.e = str2;
        this.d = str;
        this.f = z;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.printf("%s GeofencesChanged(%08x): packageName=%s, message=%s, needFullUpdate=%s, geofences=%s%n", new Object[]{a(), Integer.valueOf(this.a), this.d, this.e, Boolean.valueOf(this.f), this.c});
    }
}
