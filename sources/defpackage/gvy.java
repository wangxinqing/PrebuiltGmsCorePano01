package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: gvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gvy {
    public final Context a;
    public amri b = ampu.a;
    public boolean c;
    protected aucd d;

    public gvy(Context context) {
        this.a = context;
    }

    public static long a(String str, amsn amsn) {
        long a2 = amsn.a(TimeUnit.MILLISECONDS);
        if (!amsn.a) {
            gwa.a.e("Trying to restart stopwatch that is not running.", new Object[0]);
        }
        amsn.c();
        amsn.d();
        gwa.a.b("Generate data event:%s time: %d ms.", str, Long.valueOf(a2));
        return a2;
    }
}
