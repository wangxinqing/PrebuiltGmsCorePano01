package defpackage;

import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: tnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tnl {
    public static final ausy a = ausy.a;
    public final ScheduledExecutorService b = tid.a();
    public final aoru c = tid.b();
    public final aoru d = tid.b();

    public static void a(String str, auta auta, tnk tnk) {
        byte[] a2 = auta.a(32);
        tnk.a(str, auta, jhy.d(a2).substring(0, 5).toUpperCase(Locale.US), a2);
    }
}
