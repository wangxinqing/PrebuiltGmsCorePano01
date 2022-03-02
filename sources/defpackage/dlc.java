package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: dlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dlc extends dma {
    public final Map a = new HashMap();
    public final dpg b;
    public final dlb c;
    private final Map e = new HashMap();

    public dlc(dmd dmd, String str) {
        super(dmd);
        if (str != null) {
            this.a.put("&tid", str);
        }
        this.a.put("useSecure", "1");
        this.a.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.b = new dpg("tracking", c());
        this.c = new dlb(this, dmd);
    }

    private static String a(Map.Entry entry) {
        String str = (String) entry.getKey();
        if (!str.startsWith("&") || str.length() < 2) {
            return null;
        }
        return ((String) entry.getKey()).substring(1);
    }

    private static void a(Map map, Map map2) {
        iva.a((Object) map2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String a2 = a(entry);
                if (a2 != null) {
                    map2.put(a2, (String) entry.getValue());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.c.r();
        String s = k().s();
        if (s != null) {
            a("&an", s);
        }
        String b2 = k().b();
        if (b2 != null) {
            a("&av", b2);
        }
    }

    public final void a(String str, String str2) {
        iva.a((Object) str, (Object) "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.a.put(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map r11) {
        /*
            r10 = this;
            jiq r0 = r10.c()
            long r5 = r0.a()
            dkh r0 = r10.h()
            r0.b()
            dkh r0 = r10.h()
            boolean r7 = r0.e
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Map r0 = r10.a
            a((java.util.Map) r0, (java.util.Map) r3)
            a((java.util.Map) r11, (java.util.Map) r3)
            java.util.Map r11 = r10.a
            java.lang.String r0 = "useSecure"
            java.lang.Object r11 = r11.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L_0x0064
            java.lang.String r2 = "true"
            boolean r2 = r11.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0064
            java.lang.String r2 = "yes"
            boolean r2 = r11.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0064
            java.lang.String r2 = "1"
            boolean r2 = r11.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0064
            java.lang.String r2 = "false"
            boolean r2 = r11.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0062
            java.lang.String r2 = "no"
            boolean r2 = r11.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0062
            java.lang.String r2 = "0"
            boolean r11 = r11.equalsIgnoreCase(r2)
            if (r11 != 0) goto L_0x0062
            r8 = 1
            goto L_0x0065
        L_0x0062:
            r8 = 0
            goto L_0x0065
        L_0x0064:
            r8 = 1
        L_0x0065:
            java.util.Map r11 = r10.e
            defpackage.iva.a((java.lang.Object) r3)
            if (r11 == 0) goto L_0x0096
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0074:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.String r2 = a((java.util.Map.Entry) r0)
            if (r2 == 0) goto L_0x0074
            boolean r4 = r3.containsKey(r2)
            if (r4 != 0) goto L_0x0074
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.put(r2, r0)
            goto L_0x0074
        L_0x0096:
            java.util.Map r11 = r10.e
            r11.clear()
            java.lang.String r11 = "t"
            java.lang.Object r11 = r3.get(r11)
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 == 0) goto L_0x00b4
            dpk r11 = r10.e()
            java.lang.String r0 = "Missing hit type parameter"
            r11.a((java.util.Map) r3, (java.lang.String) r0)
            return
        L_0x00b4:
            java.lang.String r11 = "tid"
            java.lang.Object r11 = r3.get(r11)
            r9 = r11
            java.lang.String r9 = (java.lang.String) r9
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 != 0) goto L_0x0119
            monitor-enter(r10)
            java.lang.String r11 = "screenview"
            boolean r11 = r11.equalsIgnoreCase(r4)     // Catch:{ all -> 0x0116 }
            if (r11 == 0) goto L_0x00ce
            goto L_0x00e4
        L_0x00ce:
            java.lang.String r11 = "pageview"
            boolean r11 = r11.equalsIgnoreCase(r4)     // Catch:{ all -> 0x0116 }
            if (r11 != 0) goto L_0x00e4
            java.lang.String r11 = "appview"
            boolean r11 = r11.equalsIgnoreCase(r4)     // Catch:{ all -> 0x0116 }
            if (r11 != 0) goto L_0x00e4
            boolean r11 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0116 }
            if (r11 == 0) goto L_0x0106
        L_0x00e4:
            java.util.Map r11 = r10.a     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "&a"
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0116 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0116 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ all -> 0x0116 }
            int r11 = r11 + r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r11 >= r0) goto L_0x00fa
            r1 = r11
            goto L_0x00fb
        L_0x00fa:
        L_0x00fb:
            java.util.Map r11 = r10.a     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "&a"
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0116 }
            r11.put(r0, r1)     // Catch:{ all -> 0x0116 }
        L_0x0106:
            monitor-exit(r10)     // Catch:{ all -> 0x0116 }
            dkw r11 = r10.g()
            dla r0 = new dla
            r1 = r0
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r7, r8, r9)
            r11.a((java.lang.Runnable) r0)
            return
        L_0x0116:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0116 }
            throw r11
        L_0x0119:
            dpk r11 = r10.e()
            java.lang.String r0 = "Missing tracking id parameter"
            r11.a((java.util.Map) r3, (java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlc.a(java.util.Map):void");
    }
}
