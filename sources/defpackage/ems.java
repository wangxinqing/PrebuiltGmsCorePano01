package defpackage;

import com.google.android.gms.auth.TokenData;

/* renamed from: ems  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ems extends emg {
    public static final emr a = new emf("accountId");
    public static final emr b = new emf("Email");
    public static final emr c = new emf("Token");
    public static final emr d = new emc("storeConsentRemotely");
    public static final emr e = new emd("services");
    public static final emr f = new emf("num_contacted_devices");
    public static final emr g = new emf("Rdg");
    public static final emr h = new eml();
    public static final emr i = new emm();
    public static final emr j = new emn();
    public static final emr k = new emo();
    public static final emr l = new emp();
    private static final iwd o = ehv.a("GetToken", "GetTokenResponse");
    public final TokenData m;
    public final gei n;
    private final String p;
    private final boolean q;

    public ems(String str, String str2, boolean z) {
        super(str);
        TokenData tokenData;
        gei gei;
        iva.c(str2);
        this.p = str2;
        this.q = z;
        String str3 = ("SID".equals(str2) || "LSID".equals(this.p)) ? this.p : "Auth";
        if (this.r.containsKey(str3)) {
            eis eis = new eis();
            eis.a = (String) this.r.get(str3);
            eis.c = false;
            boolean equals = "1".equals(this.r.get("isTokenSnowballed"));
            String str4 = (String) this.r.get("grantedScopes");
            String str5 = (String) this.r.get("Expiry");
            String str6 = (String) this.r.get("scopeData");
            if (str5 != null) {
                eis.b = Long.valueOf(str5);
            }
            if (equals && str4 != null) {
                eis.d = true;
            }
            if (str4 != null) {
                eis.e = anda.a(amsk.a(' ').a((CharSequence) str4));
            }
            if (str6 != null) {
                eis.f = str6;
            }
            tokenData = eis.a();
        } else {
            tokenData = null;
        }
        this.m = tokenData;
        String str7 = (String) this.r.get("issueAdvice");
        if ("consent".equals(str7)) {
            gei = gei.NEED_PERMISSION;
        } else if ("remote_consent".equals(str7)) {
            gei = gei.NEED_REMOTE_CONSENT;
        } else if (tokenData == null) {
            String str8 = (String) this.r.get("Error");
            if (str8 == null) {
                gei = gei.SERVICE_UNAVAILABLE;
            } else if ("badauth".equals(str8)) {
                gei = gei.BAD_AUTHENTICATION;
            } else {
                gei c2 = gei.c(str8);
                if (c2 == null) {
                    o.d("error status: %s", str8);
                    gei = gei.UNKNOWN;
                } else {
                    gei = (c2 != gei.BAD_AUTHENTICATION || !gei.NEEDS_2F.ac.equals((String) this.r.get("Info"))) ? c2 : gei.NEEDS_2F;
                }
            }
        } else {
            gei = (str7 == null && !this.q) ? gei.NEED_PERMISSION : gei.SUCCESS;
        }
        this.n = gei;
    }
}
