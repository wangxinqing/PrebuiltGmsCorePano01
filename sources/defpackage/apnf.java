package defpackage;

import android.net.Uri;
import java.util.Set;

/* renamed from: apnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apnf {
    public final String a;
    public final String b;
    private final String c;
    private final String d;

    static {
        anab h = anaf.h();
        h.a("recoverEmail", 2);
        h.a("resetPassword", 0);
        h.a("signIn", 4);
        h.a("verifyEmail", 1);
        h.a("verifyBeforeChangeEmail", 5);
        h.a("revertSecondFactorAddition", 6);
        h.a();
    }

    private apnf(String str) {
        this.c = a(str, "apiKey");
        this.a = a(str, "oobCode");
        String a2 = a(str, "mode");
        this.d = a2;
        if (this.c == null || this.a == null || a2 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        a(str, "continueUrl");
        a(str, "languageCode");
        this.b = a(str, "tenantId");
    }

    public static apnf a(String str) {
        iva.c(str);
        try {
            return new apnf(str);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private static final String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(parse.getQueryParameter("link")).getQueryParameter(str2);
            }
            return null;
        } catch (UnsupportedOperationException e) {
            return null;
        }
    }
}
