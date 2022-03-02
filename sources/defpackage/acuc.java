package defpackage;

import android.app.StatsManager;

/* renamed from: acuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acuc {
    public static int[] a(hph hph) {
        if (!jkr.h()) {
            return new int[0];
        }
        try {
            long[] registeredExperimentIds = ((StatsManager) ihs.b().getSystemService("stats")).getRegisteredExperimentIds();
            if (registeredExperimentIds == null) {
                hph.c("NullExperimentsList").a();
                return new int[0];
            }
            int length = registeredExperimentIds.length;
            if (length != 0) {
                hph.c("NonEmptyExperimentsList").a();
            } else {
                hph.c("EmptyExperimentsList").a();
            }
            int[] iArr = new int[length];
            for (int i = 0; i < registeredExperimentIds.length; i++) {
                iArr[i] = (int) registeredExperimentIds[i];
            }
            return iArr;
        } catch (StatsManager.StatsUnavailableException e) {
            hph.c("StatsManagerError").a();
            return new int[0];
        }
    }
}
