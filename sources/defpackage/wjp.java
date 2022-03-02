package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.R;

/* renamed from: wjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjp {
    private static final jjg a = jjg.a(iyc.GUNS);

    public static int a(amen amen) {
        amev amev = amen.e;
        if (amev == null) {
            amev = amev.t;
        }
        String str = amev.i;
        if (aynt.a.a().n().equals(str)) {
            return R.drawable.ic_identity_app_security_threat;
        }
        if (aynt.a.a().m().equals(str)) {
            return R.drawable.ic_identity_app_security_notification;
        }
        if (aynt.a.a().l().equals(str)) {
            return R.drawable.ic_identity_app_login_event;
        }
        if (aynt.a.a().i().equals(str)) {
            return 17301543;
        }
        if (aynt.a.a().k().equals(str)) {
            return R.drawable.quantum_ic_google_white_24;
        }
        if (aynt.a.a().j().equals(str)) {
            return R.drawable.ic_google_box_white_24;
        }
        String a2 = aynt.a.a().a();
        amej amej = amen.c;
        if (amej == null) {
            amej = amej.g;
        }
        if (!a2.equals(amej.b)) {
            return -1;
        }
        return R.drawable.ic_identity_app_security_threat;
    }

    public static amew b(Intent intent) {
        if (intent.hasExtra("com.google.android.gms.notifications.intents.target")) {
            return (amew) a(intent.getStringExtra("com.google.android.gms.notifications.intents.target"), (auef) amew.d.c(7));
        }
        ((anih) a.b()).a("Intent did not contain the target key.");
        return null;
    }

    public static boolean c(amen amen) {
        if (amen == null) {
            return false;
        }
        amej amej = amen.c;
        if (amej == null) {
            amej = amej.g;
        }
        if (!amej.c.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean d(amen amen) {
        amev amev = amen.e;
        if (amev == null) {
            amev = amev.t;
        }
        if (!amev.d.isEmpty()) {
            amev amev2 = amen.e;
            if (amev2 == null) {
                amev2 = amev.t;
            }
            if (!amev2.e.isEmpty()) {
                return true;
            }
        }
        ((anih) a.b()).a("Payload contains insufficient data to show the system notification.");
        return false;
    }

    public static boolean b(amen amen) {
        if (amen == null) {
            return false;
        }
        amer amer = amen.b;
        if (amer == null) {
            amer = amer.b;
        }
        if (!amer.a.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean b(amew amew) {
        if (amew == null || (amew.a & 2) == 0) {
            return false;
        }
        amel amel = amew.c;
        if (amel == null) {
            amel = amel.b;
        }
        amek amek = amel.a;
        if (amek == null) {
            amek = amek.g;
        }
        if (a(amek)) {
            return true;
        }
        return false;
    }

    public static amen a(Intent intent) {
        if (!intent.hasExtra("gms.gnots.payload")) {
            ((anih) a.b()).a("Intent did not contain the payload key.");
            return null;
        }
        amen amen = (amen) a(intent.getStringExtra("gms.gnots.payload"), (auef) amen.k.c(7));
        if (!c(amen) || !b(amen)) {
            if (amen != null) {
                amej amej = amen.c;
                if (amej == null) {
                    amej = amej.g;
                }
                if (amej.f.isEmpty()) {
                    return null;
                }
            }
            return null;
        }
        return amen;
    }

    public static audx a(String str, auef auef) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (audx) auef.a(Base64.decode(str, 9));
        } catch (auda | IllegalArgumentException e) {
            anih anih = (anih) a.b();
            anih.a(e);
            anih.a("Failed to parse to lite proto payload string.");
            return null;
        }
    }

    public static String a(audx audx) {
        if (audx != null) {
            return Base64.encodeToString(audx.k(), 9);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r1 = defpackage.amep.a(r1.d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.amek r1) {
        /*
            if (r1 == 0) goto L_0x001e
            java.lang.String r0 = r1.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r1.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001e
            int r1 = r1.d
            int r1 = defpackage.amep.a(r1)
            if (r1 == 0) goto L_0x001e
            r0 = 1
            if (r1 == r0) goto L_0x001e
            return r0
        L_0x001e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjp.a(amek):boolean");
    }

    public static boolean a(amew amew) {
        if (amew == null) {
            return false;
        }
        amex amex = amew.b;
        if (amex == null) {
            amex = amex.c;
        }
        if (!amex.a.isEmpty()) {
            return true;
        }
        return false;
    }
}
