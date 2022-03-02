package defpackage;

/* renamed from: aito  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aito {
    public static void a(aicn aicn, int i, long j, boolean z) {
        long j2 = j;
        aicn aicn2 = aicn;
        aicn.a((aicl) new aitg(aico.ALARM_RESET, aicn.b(), i, (int) j2, z ^ true ? 1 : 0, i, j2, z));
    }

    public static void b(aicn aicn, boolean z) {
        aicn.b(aico.SCREEN_STATE_CHANGED, z);
    }

    public static void c(aicn aicn, boolean z) {
        aicn.a(aico.WIFI_STATE_CHANGED, z);
    }

    public static void d(aicn aicn, boolean z) {
        aicn.b(aico.POWER_SAVE_MODE_CHANGED, z);
    }

    public static void e(aicn aicn, boolean z) {
        aicn.b(aico.DEEP_IDLE_MODE_CHANGED, z);
    }

    public static void a(aicn aicn, aiaj aiaj) {
        long d = aiaj != null ? aiaj.d() : -1;
        aicn.a((aicl) new aicm(aico.CELL_SCAN_RESULTS, aicn.b(), (String) null, aiaj, (int) (d >> 32), (int) d, -1));
    }

    public static void a(aicn aicn, aiwz aiwz) {
        aicn.a((aicl) new aicm(aico.GPS_LOCATION, aicn.b(), (String) null, aiwz, aell.b(aiwz.b()), aell.b(aiwz.c()), Math.round(aiwz.a())));
    }

    public static void a(aicn aicn, boolean z) {
        aicn.a(aico.AIRPLANE_MODE_CHANGED, z);
    }

    public static void a(aicn aicn, boolean z, boolean z2, int i) {
        aicn.a((aicl) new aitc(aico.NETWORK_CHANGED, aicn.b(), z ? 1 : 0, z2 ? 1 : 0, i, z, z2, i));
    }
}
