package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zru {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    static final String[] b = {"android_id"};
    private static final zsg c = zsg.a("CidGenerator");
    private static String d;
    private static final Map e = new HashMap();
    private static volatile boolean f;

    public zru(Context context) {
        synchronized (zru.class) {
            if (d == null) {
                d = aekm.a(b(context));
            }
        }
    }

    public static amri a(Context context) {
        String b2 = b(context);
        if (b2 == null) {
            return ampu.a;
        }
        try {
            return amri.b(Long.valueOf(Long.parseLong(b2)));
        } catch (NumberFormatException e2) {
            if (azfa.g()) {
                c.a((Throwable) e2, "Invalid Android Id");
            } else {
                c.e("CidGenerator", "Invalid Android Id", e2);
            }
            return ampu.a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[SYNTHETIC, Splitter:B:24:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(android.content.Context r9) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ SecurityException -> 0x0033, all -> 0x0030 }
            android.net.Uri r4 = a     // Catch:{ SecurityException -> 0x0033, all -> 0x0030 }
            r5 = 0
            r6 = 0
            java.lang.String[] r7 = b     // Catch:{ SecurityException -> 0x0033, all -> 0x0030 }
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ SecurityException -> 0x0033, all -> 0x0030 }
            if (r9 == 0) goto L_0x002a
            boolean r3 = r9.moveToFirst()     // Catch:{ SecurityException -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            int r3 = r9.getColumnCount()     // Catch:{ SecurityException -> 0x0028 }
            if (r3 < r1) goto L_0x002a
            java.lang.String r0 = r9.getString(r0)     // Catch:{ SecurityException -> 0x0028 }
            r9.close()
            return r0
        L_0x0028:
            r3 = move-exception
            goto L_0x0036
        L_0x002a:
            if (r9 == 0) goto L_0x002f
            r9.close()
        L_0x002f:
            return r2
        L_0x0030:
            r9 = move-exception
            r0 = r9
            goto L_0x005a
        L_0x0033:
            r9 = move-exception
            r3 = r9
            r9 = r2
        L_0x0036:
            boolean r4 = defpackage.azfa.g()     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = "Unable to get android ID"
            if (r4 != 0) goto L_0x004d
            zsg r4 = c     // Catch:{ all -> 0x0058 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0058 }
            r6 = 0
            r1[r6] = r5     // Catch:{ all -> 0x0058 }
            r1[r0] = r3     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "CidGenerator"
            r4.e(r0, r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0052
        L_0x004d:
            zsg r0 = c     // Catch:{ all -> 0x0058 }
            r0.a((java.lang.Throwable) r3, (java.lang.String) r5)     // Catch:{ all -> 0x0058 }
        L_0x0052:
            if (r9 == 0) goto L_0x0057
            r9.close()
        L_0x0057:
            return r2
        L_0x0058:
            r0 = move-exception
            r2 = r9
        L_0x005a:
            if (r2 == 0) goto L_0x005f
            r2.close()
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zru.b(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(java.lang.String r7) {
        /*
            java.lang.Class<zru> r0 = defpackage.zru.class
            monitor-enter(r0)
            java.lang.String r1 = d     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0044
            java.util.Map r1 = e     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0041
            java.lang.String r2 = d     // Catch:{ Exception -> 0x0018 }
            java.lang.String r1 = defpackage.aekm.a(r7, r2)     // Catch:{ Exception -> 0x0018 }
            goto L_0x003b
        L_0x0018:
            r2 = move-exception
            boolean r3 = defpackage.azfa.g()     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x0034
            zsg r3 = c     // Catch:{ all -> 0x0047 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0047 }
            r5 = 0
            java.lang.String r6 = r2.getMessage()     // Catch:{ all -> 0x0047 }
            r4[r5] = r6     // Catch:{ all -> 0x0047 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "CidGenerator"
            r3.e(r2, r4)     // Catch:{ all -> 0x0047 }
            goto L_0x003b
        L_0x0034:
            zsg r3 = c     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "calculate failed"
            r3.a((java.lang.Throwable) r2, (java.lang.String) r4)     // Catch:{ all -> 0x0047 }
        L_0x003b:
            java.util.Map r2 = e     // Catch:{ all -> 0x0047 }
            r2.put(r7, r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return r1
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            r7 = 0
            return r7
        L_0x0047:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zru.a(java.lang.String):java.lang.String");
    }
}
