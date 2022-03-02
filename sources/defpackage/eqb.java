package defpackage;

/* renamed from: eqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqb {
    public static final enx a = new eqe();
    public static final enx b = new eqa("parent_aid");
    public static final enx c = new eqg("GoogleUserId");
    public static final enx d = new eqg("DeviceManagementStatus");
    public static final enx e = new eqd("com.google.android.gms.auth.email_check_time");
    public static final enx f = new eqf("services");
    public static final enx g = new eqg("firstName");
    public static final enx h = new eqg("lastName");
    public static final enx i = new eqc("oauthAccessToken");
    public static final enx j = new eqg("com.google.android.gms.auth.confirm.CredentialsState");
    public static final enx k = new epy("com.google.android.gms.auth.visibilityWhitelist");
    public static final eqd l = new eqd("lastDroidguardPeriodicRun");
    public static final eqd m = new eqd("runDroidGuard");
    public static final enx n = new eqg("lstBindingKeyAlias");
    public static final eqd o = new eqd("hideDmNotificationsUntil");
    public static final enx[] p = {a, b, c, d, e, f, g, h, i, j, k, l, m, n};
    public static final anaf q;

    static {
        String str;
        anab anab = new anab();
        enx[] enxArr = p;
        int length = enxArr.length;
        for (int i2 = 0; i2 < 14; i2++) {
            enx enx = enxArr[i2];
            if (enx instanceof eqi) {
                str = ((eqi) enx).a;
            } else if (enx instanceof eqe) {
                eqe eqe = (eqe) enx;
                str = "password";
            } else {
                str = null;
            }
            iva.c(str);
            anab.a(str, enx);
        }
        q = anab.a();
    }
}
