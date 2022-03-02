package defpackage;

/* renamed from: emz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class emz extends emg {
    public static final emy a = new emf("accountId");
    public static final emy b = new emx();
    private static final iwd d = ehv.a("Account", "ValidateAccountResponse");
    public final gei c;

    public emz(String str) {
        super(str);
        gei gei;
        String str2 = (String) this.r.get("Error");
        String str3 = (String) this.r.get("accountId");
        if (str2 == null) {
            gei = str3 == null ? gei.SERVICE_UNAVAILABLE : gei.SUCCESS;
        } else if ("badauth".equals(str2)) {
            gei = gei.BAD_AUTHENTICATION;
        } else {
            gei c2 = gei.c(str2);
            if (c2 == null) {
                d.d("error status: %s", str2);
                gei = gei.UNKNOWN;
            } else {
                gei = c2;
            }
        }
        this.c = gei;
    }
}
