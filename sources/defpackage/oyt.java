package defpackage;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: oyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyt {
    static final Random a = new Random();
    public static final /* synthetic */ int b = 0;
    private final String c;
    private final iby d;

    public oyt(Context context) {
        this(context, "Icing");
    }

    private static int a(long j) {
        if (j >= 0 && j <= 2147483647L) {
            return (int) j;
        }
        oso.b("Invalid silent feedback sampling interval (%d)", (Object) Long.valueOf(j));
        return 0;
    }

    public oyt(Context context, String str) {
        iby a2 = mvd.a(context);
        this.c = str;
        this.d = a2;
    }

    private final void a(String str, Throwable th) {
        mwd mwd = new mwd(th);
        mwd.i = "com.google.android.gms.icing";
        mwd.c = "com.google.android.gms.icing.SILENT_FEEDBACK";
        mwd.b = str;
        mwd.b();
        this.d.b(mwd.a()).a(oyr.a);
    }

    public final void a(String str, Throwable th, long j) {
        int a2;
        oso.a(this.c, "%s", str);
        if (((Boolean) ozx.o.c()).booleanValue() && (a2 = a(j)) != 0 && a.nextInt(a2) == 0) {
            a(str, th);
        }
    }

    public final void a(String str, Throwable th, oys oys, long j, agvx agvx, TimeUnit timeUnit) {
        int a2;
        oso.a(this.c, "%s", str);
        if (((Boolean) ozx.o.c()).booleanValue() && (a2 = a(j)) != 0 && oys.a(1.0f / ((float) a2), ((Long) agvx.c()).longValue(), timeUnit)) {
            a(str, th);
        }
    }
}
