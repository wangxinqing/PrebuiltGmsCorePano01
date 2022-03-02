package defpackage;

import android.text.TextUtils;

/* renamed from: ema  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ema extends emg {
    public static final elz a = new emf("accountId");
    public static final elz b = new emf("CaptchaToken");
    public static final elz c = new emf("CaptchaUrl");
    public static final elz d = new emf("DmStatus");
    public static final elz e = new emf("Email");
    public static final elz f = new emf("ErrorDetail");
    public static final elz g = new emf("firstName");
    public static final elz h = new emf("lastName");
    public static final elz i = new emf("Token");
    public static final elz j = new emf("PicasaUser");
    public static final elz k = new emf("RopRevision");
    public static final elz l = new emf("RopText");
    public static final elz m = new emf("Url");
    public static final elz n = new emc("GooglePlusUpgrade");
    public static final elz o = new emd("services");
    public static final elz p = new ely();
    public final gei q;

    public ema(String str) {
        super(str);
        gei gei;
        if (!TextUtils.isEmpty((String) this.r.get("Token"))) {
            gei = gei.SUCCESS;
        } else {
            String str2 = (String) this.r.get("Error");
            if (str2 == null) {
                gei = gei.SERVICE_UNAVAILABLE;
            } else if ("badauth".equals(str2)) {
                gei = gei.BAD_AUTHENTICATION;
            } else {
                gei = gei.c(str2);
                if (gei != null) {
                    String str3 = (String) this.r.get("Info");
                    if (gei == gei.BAD_AUTHENTICATION && gei.NEEDS_2F.ac.equals(str3)) {
                        gei = gei.NEEDS_2F;
                    }
                } else {
                    gei = gei.UNKNOWN;
                }
            }
        }
        this.q = gei;
    }
}
