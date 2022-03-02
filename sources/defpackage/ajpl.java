package defpackage;

import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: ajpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajpl {
    public static long a(boolean z) {
        if (!axxg.b()) {
            return 0;
        }
        if (z) {
            return axxg.a.a().flpBackgroundBatchRequestMinIntervalMs();
        }
        return axxg.c();
    }

    public static long b(boolean z) {
        if (!axxg.b()) {
            return 0;
        }
        if (z) {
            return axxg.a.a().flpBackgroundBatchRequestMinWaitMs();
        }
        return axxg.c();
    }

    public static boolean a(String str, LocationRequestInternal locationRequestInternal) {
        if (!axxg.b()) {
            return false;
        }
        if (a(axxg.a.a().flpForcedBackgroundApps(), str) || (a(axxg.a.a().flpForcedBackgroundExceptHighAccuracyApps(), str) && locationRequestInternal.b.a != 100)) {
            return true;
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        return jhx.a((Object[]) str.split(","), (Object) str2);
    }
}
