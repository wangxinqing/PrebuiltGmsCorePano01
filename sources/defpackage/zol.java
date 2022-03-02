package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.util.regex.Pattern;

/* renamed from: zol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zol extends nis {
    private static final Pattern c = Pattern.compile("[!-~&&[^ \",;\\\\]]*");
    private final zod a;
    private final PseudonymousIdToken b;

    public zol(zod zod, PseudonymousIdToken pseudonymousIdToken) {
        super(38, "SetToken");
        iva.a((Object) zod);
        this.a = zod;
        this.b = pseudonymousIdToken;
    }

    private static void a(hph hph, String str) {
        if (hph != null) {
            hph.c(str).a();
        }
    }

    public static boolean a(PseudonymousIdToken pseudonymousIdToken, Context context) {
        hph hph = new hph(new hol(ihs.b(), "PSEUDONYMOUS_ID_COUNTERS", (String) null), "PSEUDONYMOUS_ID_COUNTERS", 16);
        boolean a2 = a(pseudonymousIdToken, context, hph);
        hph.d();
        return a2;
    }

    public static boolean a(PseudonymousIdToken pseudonymousIdToken, Context context, hph hph) {
        String str;
        if (pseudonymousIdToken == null || (str = pseudonymousIdToken.a) == null || a(str)) {
            synchronized ("PseudonymousIdService") {
                SharedPreferences.Editor edit = context.getSharedPreferences("PseudonymousIdIntentService", 0).edit();
                if (pseudonymousIdToken != null) {
                    String str2 = pseudonymousIdToken.a;
                    if (str2 != null) {
                        edit.putString("pseudonymousId", str2);
                        zom.b = pseudonymousIdToken;
                        a(hph, "SetPseudonymousID");
                        edit.apply();
                    }
                }
                edit.remove("pseudonymousId");
                edit.putLong("wallTimeMillisLastPseudonymousIdReset", System.currentTimeMillis());
                zom.b = zom.a;
                a(hph, "UnsetPseudonymousID");
                edit.apply();
            }
            return true;
        }
        a(hph, "SetInvalidPseudonymousId");
        String valueOf = String.valueOf(pseudonymousIdToken.a);
        Log.i("PseudonymousIdService", valueOf.length() == 0 ? new String("invalid cookie: ") : "invalid cookie: ".concat(valueOf));
        return false;
    }

    private static boolean a(String str) {
        if (str.length() > 1 && str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1);
        }
        return c.matcher(str).matches();
    }

    public static boolean a(zoa zoa, Context context) {
        hph hph = new hph(new hol(ihs.b(), "PSEUDONYMOUS_ID_COUNTERS", (String) null), "PSEUDONYMOUS_ID_COUNTERS", 16);
        boolean a2 = a(zoa, context, hph);
        hph.d();
        return a2;
    }

    public static boolean a(zoa zoa, Context context, hph hph) {
        znr znr = (znr) zoa;
        String str = znr.a;
        boolean z = false;
        if (str != null && !a(str)) {
            a(hph, "SetInvalidPseudonymousId");
            String valueOf = String.valueOf(znr.a);
            Log.i("PseudonymousIdService", valueOf.length() == 0 ? new String("invalid cookie: ") : "invalid cookie: ".concat(valueOf));
            return false;
        }
        synchronized ("PseudonymousIdService") {
            SharedPreferences.Editor edit = context.getSharedPreferences("PseudonymousIdIntentService", 0).edit();
            if (zom.b == null) {
                zom.b = new PseudonymousIdToken(context.getSharedPreferences("PseudonymousIdIntentService", 0).getString("pseudonymousId", (String) null));
            }
            if (new PseudonymousIdToken(((znr) zoa).b).equals(zom.b)) {
                String str2 = ((znr) zoa).a;
                if (str2 == null) {
                    edit.remove("pseudonymousId");
                    edit.putLong("wallTimeMillisLastPseudonymousIdReset", System.currentTimeMillis());
                    zom.b = zom.a;
                    a(hph, "UnsetPseudonymousID");
                    z = true;
                } else {
                    edit.putString("pseudonymousId", str2);
                    zom.b = new PseudonymousIdToken(((znr) zoa).a);
                    a(hph, "CompareAndSetPseudonymousID");
                    z = true;
                }
            }
            edit.apply();
        }
        return z;
    }

    public final void a(Context context) {
        this.a.a(!a(this.b, context) ? Status.c : Status.a);
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
