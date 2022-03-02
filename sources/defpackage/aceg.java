package defpackage;

import com.google.android.chimera.Activity;

/* renamed from: aceg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aceg {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.sr a(android.content.Context r4) {
        /*
            java.lang.String r0 = "setupwizard.theme"
            java.lang.String r1 = "glif_light"
            java.lang.String r0 = defpackage.jli.a(r0, r1)
            int r1 = r0.hashCode()
            r2 = -1241052239(0xffffffffb6070bb1, float:-2.0123373E-6)
            r3 = 1
            if (r1 == r2) goto L_0x0022
            r2 = 115650330(0x6e4af1a, float:8.6021356E-35)
            if (r1 == r2) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            java.lang.String r1 = "glif_v3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x0022:
            java.lang.String r1 = "glif_v3_light"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002c
            r0 = 0
            goto L_0x002d
        L_0x002c:
            r0 = -1
        L_0x002d:
            if (r0 == 0) goto L_0x0040
            if (r0 == r3) goto L_0x0037
            sr r0 = new sr
            r0.<init>(r4)
            return r0
        L_0x0037:
            sr r0 = new sr
            r1 = 2132017987(0x7f140343, float:1.9674268E38)
            r0.<init>(r4, r1)
            return r0
        L_0x0040:
            sr r0 = new sr
            r1 = 2132017988(0x7f140344, float:1.967427E38)
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aceg.a(android.content.Context):sr");
    }

    public static void a(Activity activity) {
        String a = jli.a("setupwizard.theme", "glif_light");
        aljk aljk = new aljk(aljl.a());
        aljk.a = 2132018089;
        aljk.b = false;
        int a2 = aljk.a().a(a);
        aljk aljk2 = new aljk(aljl.a());
        aljk2.a = a2;
        aljk2.b = false;
        activity.setTheme(aljk2.a().a(activity.getIntent()));
    }
}
