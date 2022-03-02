package defpackage;

import android.util.EventLog;
import com.google.android.gms.gcm.GcmChimeraService;

/* renamed from: nuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nuo {
    private static final anaf a = anaf.a(-1, "UNKNOWN_NETWORK", 0, "MOBILE", 1, "WIFI");

    private static String a(int i) {
        return (String) a.getOrDefault(Integer.valueOf(i), "UNMAPPED_NETWORK_TYPE");
    }

    public static void a(audw audw) {
        if (audw instanceof amnb) {
            GcmChimeraService.a("Sent %s", ((amnc) ((amnb) audw).b).e);
        } else if (audw instanceof amni) {
            GcmChimeraService.a("Sent Client HB", new Object[0]);
        } else if (audw instanceof amnf) {
            GcmChimeraService.a("Sent Server HB Ack", new Object[0]);
        } else if (audw instanceof ammz) {
            GcmChimeraService.a("Sent Close", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if ("subscribedfeeds".equals(r5.c) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.audx r8) {
        /*
            boolean r0 = r8 instanceof defpackage.amnc
            r1 = 0
            if (r0 == 0) goto L_0x008a
            amnc r8 = (defpackage.amnc) r8
            java.lang.String r0 = r8.e
            java.lang.String r2 = "GSYNC_TICKLE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0042
            java.lang.String r2 = r8.e
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0041
            aucx r2 = r8.g
            int r3 = r2.size()
            r4 = 0
        L_0x0022:
            if (r4 >= r3) goto L_0x0041
            java.lang.Object r5 = r2.get(r4)
            ammv r5 = (defpackage.ammv) r5
            int r4 = r4 + 1
            java.lang.String r6 = r5.b
            java.lang.String r7 = "gcms"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0022
            java.lang.String r2 = r5.c
            java.lang.String r3 = "subscribedfeeds"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            goto L_0x007a
        L_0x0042:
            int r0 = r8.q
            r2 = 17
            if (r0 == r2) goto L_0x004b
            java.lang.String r2 = ""
            goto L_0x004d
        L_0x004b:
            java.lang.String r2 = " reduced"
        L_0x004d:
            java.lang.String r3 = r8.f
            int r4 = r2.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 23
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "GSync (p="
            r6.append(r4)
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = "): "
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = r6.toString()
        L_0x007a:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r8 = r8.h
            r0 = 1
            r2[r0] = r8
            java.lang.String r8 = "Received %s %s"
            com.google.android.gms.gcm.GcmChimeraService.a(r8, r2)
            return
        L_0x008a:
            boolean r8 = r8 instanceof defpackage.amnj
            if (r8 == 0) goto L_0x0095
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r0 = "Received Server HB"
            com.google.android.gms.gcm.GcmChimeraService.a(r0, r8)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuo.a(audx):void");
    }

    public static void a(nsb nsb, int i) {
        EventLog.writeEvent(204002, 0);
        GcmChimeraService.a("Connected", new Object[0]);
        nsb.a.a().a(a(i), "NO_ERROR", true);
    }

    public static void a(nsb nsb, int i, int i2) {
        EventLog.writeEvent(204002, (i << 8) + 16777216 + (i2 & 255));
        nsb.a.a().a(a(i2), auic.a(i), false);
    }

    public static void a(nsb nsb, int i, int i2, int i3) {
        Integer valueOf = Integer.valueOf(i3);
        EventLog.writeEvent(204003, new Object[]{Integer.valueOf((i2 << 8) + i), valueOf});
        GcmChimeraService.a("Close err:%s time:%d", Integer.valueOf(i), valueOf);
        ((ahgv) nsb.a.a().c.a()).a((double) ((long) i3), a(i2), auic.a(i));
    }

    public static void a(boolean z, int i, audx audx, int i2, int i3) {
        String str;
        if (audx instanceof amnc) {
            amnc amnc = (amnc) audx;
            String str2 = amnc.e;
            String str3 = amnc.h;
            int indexOf = str3.indexOf(37);
            if (indexOf > 0) {
                str3 = str3.substring(0, indexOf);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
            sb.append(str2);
            sb.append(":");
            sb.append(str3);
            str = sb.toString();
        } else {
            str = "";
        }
        Object[] objArr = new Object[4];
        if (z) {
            i = -i;
        }
        objArr[0] = Integer.valueOf(i);
        objArr[1] = str;
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        EventLog.writeEvent(204005, objArr);
    }
}
