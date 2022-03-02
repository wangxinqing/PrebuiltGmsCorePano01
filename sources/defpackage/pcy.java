package defpackage;

import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.SyncSubPolicy;

/* renamed from: pcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pcy {
    public static aesl a(SyncPolicy syncPolicy) {
        aesk i = aesl.i();
        i.a(syncPolicy.a);
        i.a(a(syncPolicy.d));
        i.b(a(syncPolicy.e));
        i.c(a(syncPolicy.b));
        i.d(a(syncPolicy.c));
        i.a = syncPolicy.f;
        i.a(syncPolicy.g);
        i.b(syncPolicy.h);
        return i.a();
    }

    public static aeso a(SyncSubPolicy syncSubPolicy) {
        aesn c = aeso.c();
        c.a(syncSubPolicy.a);
        c.a(syncSubPolicy.b);
        return c.a();
    }

    public static SyncStatus a(aesm aesm) {
        return new SyncStatus(aesm.a(), aesm.b(), aesm.c());
    }
}
