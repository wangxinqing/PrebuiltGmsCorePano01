package defpackage;

import com.google.android.ulr.ApiBleRate;
import com.google.android.ulr.ApiRate;

/* renamed from: ajoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajoa {
    public static ApiRate a(long j) {
        return a(aztb.B(), "default", j);
    }

    public static ApiRate b(long j) {
        return a(aztb.a.a().aX(), "stationary", j);
    }

    public static ApiRate a(long j, String str, long j2) {
        return new ApiRate((ApiBleRate) null, str, true, Long.valueOf(j), str, "internal", Long.valueOf(j2), (Long) null, (String) null, (String) null);
    }
}
