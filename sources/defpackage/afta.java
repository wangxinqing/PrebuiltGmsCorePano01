package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: afta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afta implements afmh {
    private static final Random a = new Random();
    private final Context b;

    public afta(Context context) {
        this.b = context;
    }

    public final void a(String str, Throwable th) {
        if (axsv.a.a().l()) {
            int g = (int) axtc.a.a().g();
            if (g > 0) {
                if (a.nextInt(g) == 0) {
                    mwd mwd = new mwd(th);
                    mwd.i = "com.google.android.gms.icing";
                    mwd.c = "com.google.android.gms.icing.SILENT_FEEDBACK";
                    mwd.b = str;
                    mwd.b();
                    mvd.a(this.b).b(mwd.a());
                }
            } else if (g < 0) {
                afsh.a("Bad sample interval: %d", (Object) Integer.valueOf(g));
            }
        }
    }
}
