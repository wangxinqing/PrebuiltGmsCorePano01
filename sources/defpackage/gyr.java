package defpackage;

import android.os.Bundle;

/* renamed from: gyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gyr {
    protected static boolean a(Bundle bundle) {
        if (!bundle.getBoolean("CheckinService_forceCheckin", false) || bundle.getInt("checkin_retry_count", 0) > 0) {
            return false;
        }
        return true;
    }

    public abstract long a(long j, Bundle bundle);

    public abstract String a();

    public abstract void a(long j, gvx gvx);

    public abstract void b();
}
