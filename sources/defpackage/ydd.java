package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: ydd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydd {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();
    private final iby c;

    public ydd(Context context) {
        this.c = mvd.a(context);
    }

    public final void a(Throwable th, double d) {
        xip.a();
        if (Boolean.valueOf(aywy.a.a().cF()).booleanValue() && b.nextDouble() < d) {
            mwd mwd = new mwd(th);
            mwd.i = "com.google.android.gms.people";
            mwd.c = "com.google.android.gms.people.SILENT_FEEDBACK";
            mwd.b();
            this.c.b(mwd.a()).a(ydc.a);
        }
    }
}
