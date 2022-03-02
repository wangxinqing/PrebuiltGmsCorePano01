package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: zsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsn {
    private static final Random a = new Random();
    private final Context b;

    static {
        zsg.a("SilentFeedback");
    }

    public zsn(Context context) {
        this.b = context;
    }

    public final void a(Throwable th, double d) {
        if (azfa.h() && a.nextDouble() < d) {
            iby iby = new iby(this.b, (byte[]) null);
            mwd mwd = new mwd(th);
            mwd.i = "com.google.android.gms.romanesco";
            mwd.c = "com.google.android.gms.romanesco.SILENT_FEEDBACK";
            mwd.b();
            iby.b(mwd.a());
        }
    }
}
