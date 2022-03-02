package defpackage;

import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.SyncSubPolicy;
import java.util.concurrent.TimeUnit;

/* renamed from: afia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afia {
    public static aepk a(SyncStatus syncStatus) {
        return new aepd(syncStatus.a, syncStatus.b, syncStatus.c);
    }

    public static SyncSubPolicy a(aepm aepm) {
        aepe aepe = (aepe) aepm;
        if (aepe.a) {
            ryq a = SyncSubPolicy.a();
            int i = aepe.b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            a.a = true;
            a.b = (int) timeUnit.toSeconds((long) i);
            return a.a();
        }
        ryq a2 = SyncSubPolicy.a();
        a2.a = false;
        a2.b = 0;
        return a2.a();
    }
}
