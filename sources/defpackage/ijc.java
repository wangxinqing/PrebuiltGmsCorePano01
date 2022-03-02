package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ijc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ijc {
    public static acwa a(acwa acwa, long j, TimeUnit timeUnit) {
        jfc a = jfm.a(1, 10);
        acwd acwd = new acwd();
        acwa.a((acvp) new ijb(acwd, ((jfv) a).schedule((Runnable) new ija(acwd, j, timeUnit), j, timeUnit)));
        return acwd.a;
    }
}
