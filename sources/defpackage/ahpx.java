package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: ahpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpx {
    public static final Collection a = Arrays.asList(new String[]{"com.google.android.location"});
    public static Context b = null;
    public static boolean c = false;
    private static dlc d;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.dlc a() {
        /*
            java.lang.Class<ahpx> r0 = defpackage.ahpx.class
            monitor-enter(r0)
            android.content.Context r1 = b     // Catch:{ all -> 0x0052 }
            dlc r2 = d     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x000d
            dlc r1 = d     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)
            return r1
        L_0x000d:
            r2 = 0
            if (r1 == 0) goto L_0x0050
            ayap r3 = defpackage.ayap.a     // Catch:{ all -> 0x0052 }
            ayaq r3 = r3.a()     // Catch:{ all -> 0x0052 }
            boolean r3 = r3.analyticsEnabled()     // Catch:{ all -> 0x0052 }
            if (r3 == 0) goto L_0x0050
            dkh r1 = defpackage.dkh.a((android.content.Context) r1)     // Catch:{ all -> 0x0052 }
            ayap r2 = defpackage.ayap.a     // Catch:{ all -> 0x0052 }
            ayaq r2 = r2.a()     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = r2.analyticsTrackingId()     // Catch:{ all -> 0x0052 }
            dlc r1 = r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0052 }
            d = r1     // Catch:{ all -> 0x0052 }
            dlb r1 = r1.c     // Catch:{ all -> 0x0052 }
            r2 = -1000(0xfffffffffffffc18, double:NaN)
            r1.a = r2     // Catch:{ all -> 0x0052 }
            dkh r2 = r1.h()     // Catch:{ all -> 0x0052 }
            dlc r1 = r1.b     // Catch:{ all -> 0x0052 }
            dlb r1 = r1.c     // Catch:{ all -> 0x0052 }
            java.util.Set r2 = r2.d     // Catch:{ all -> 0x0052 }
            r2.remove(r1)     // Catch:{ all -> 0x0052 }
            dlc r1 = d     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "&dr"
            java.lang.String r3 = "location"
            r1.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0052 }
            dlc r1 = d     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)
            return r1
        L_0x0050:
            monitor-exit(r0)
            return r2
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpx.a():dlc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r3) {
        /*
            java.lang.Class<ahpx> r0 = defpackage.ahpx.class
            monitor-enter(r0)
            android.content.Context r1 = b     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0047
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0049 }
            b = r3     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0047
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0049 }
            boolean r1 = defpackage.ayap.j()     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0026
            iby r3 = defpackage.adrz.b(r3)     // Catch:{ all -> 0x0049 }
            acwa r3 = r3.o()     // Catch:{ all -> 0x0049 }
            acvv r1 = defpackage.ahpv.a     // Catch:{ all -> 0x0049 }
            r3.a((defpackage.acvv) r1)     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)
            return
        L_0x0026:
            ibz r1 = new ibz     // Catch:{ all -> 0x0049 }
            r1.<init>(r3)     // Catch:{ all -> 0x0049 }
            ibq r3 = defpackage.adrz.a     // Catch:{ all -> 0x0049 }
            r1.a((defpackage.ibq) r3)     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "Location-AnalyticsUtils"
            r1.c = r3     // Catch:{ all -> 0x0049 }
            icc r3 = r1.b()     // Catch:{ all -> 0x0049 }
            r3.e()     // Catch:{ all -> 0x0049 }
            icf r1 = defpackage.adsz.a(r3)     // Catch:{ all -> 0x0049 }
            ahpw r2 = new ahpw     // Catch:{ all -> 0x0049 }
            r2.<init>(r3)     // Catch:{ all -> 0x0049 }
            r1.a((defpackage.icm) r2)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r0)
            return
        L_0x0049:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpx.a(android.content.Context):void");
    }

    public static void a(String str, String str2, String str3, long j) {
        dlc a2 = a();
        if (a2 == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 42 + String.valueOf(str3).length());
            sb.append("location analytics disabled, can't send ");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.toString();
        } else if (!c && str.equals("ar")) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 36 + String.valueOf(str3).length());
            sb2.append("Ar analytics disabled, can't send ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str3);
            sb2.toString();
        } else {
            String p = axwx.p();
            int length = String.valueOf(str).length();
            int length2 = String.valueOf(str2).length();
            StringBuilder sb3 = new StringBuilder(length + 58 + length2 + String.valueOf(str3).length() + String.valueOf(p).length());
            sb3.append("Event ");
            sb3.append(str);
            sb3.append(".");
            sb3.append(str2);
            sb3.append("=");
            sb3.append(str3);
            sb3.append(": ");
            sb3.append(j);
            sb3.append(". AnalyticsUtil userDomain: ");
            sb3.append(p);
            sb3.toString();
            dkj dkj = new dkj((byte[]) null);
            dkj.a(j);
            dkj.a("utm_source=location");
            dkj.b(str2);
            dkj.c(str);
            dkj.d(str3);
            dkj.a(1, p);
            a2.a(dkj.a());
        }
    }
}
