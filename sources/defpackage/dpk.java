package defpackage;

import android.util.Log;
import java.util.Map;

/* renamed from: dpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpk extends dma {
    public static dpk a;

    public dpk(dmd dmd) {
        super(dmd);
    }

    protected static final String a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))) + "..." + str + Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
    }

    public final void b(int i, String str, Object obj, Object obj2, Object obj3) {
        String str2 = (String) doz.b.a();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, dlz.b(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            c(i, str, obj, obj2, obj3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(int r7, java.lang.String r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r6 = this;
            monitor-enter(r6)
            defpackage.iva.a((java.lang.Object) r8)     // Catch:{ all -> 0x00fc }
            dmy r0 = r6.f()     // Catch:{ all -> 0x00fc }
            boolean r0 = r0.a()     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x0014
            r6.f()     // Catch:{ all -> 0x00fc }
            r0 = 80
            goto L_0x0019
        L_0x0014:
            r6.f()     // Catch:{ all -> 0x00fc }
            r0 = 112(0x70, float:1.57E-43)
        L_0x0019:
            java.lang.String r1 = "01VDIWEA?"
            char r7 = r1.charAt(r7)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = defpackage.dmb.a     // Catch:{ all -> 0x00fc }
            java.lang.String r9 = a(r9)     // Catch:{ all -> 0x00fc }
            java.lang.String r10 = a(r10)     // Catch:{ all -> 0x00fc }
            java.lang.String r11 = a(r11)     // Catch:{ all -> 0x00fc }
            java.lang.String r8 = defpackage.dlz.b(r8, r9, r10, r11)     // Catch:{ all -> 0x00fc }
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00fc }
            int r9 = r9.length()     // Catch:{ all -> 0x00fc }
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00fc }
            int r10 = r10.length()     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            int r9 = r9 + 4
            int r9 = r9 + r10
            r11.<init>(r9)     // Catch:{ all -> 0x00fc }
            java.lang.String r9 = "3"
            r11.append(r9)     // Catch:{ all -> 0x00fc }
            r11.append(r7)     // Catch:{ all -> 0x00fc }
            r11.append(r0)     // Catch:{ all -> 0x00fc }
            r11.append(r1)     // Catch:{ all -> 0x00fc }
            java.lang.String r7 = ":"
            r11.append(r7)     // Catch:{ all -> 0x00fc }
            r11.append(r8)     // Catch:{ all -> 0x00fc }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x00fc }
            int r8 = r7.length()     // Catch:{ all -> 0x00fc }
            r9 = 1024(0x400, float:1.435E-42)
            if (r8 > r9) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            r8 = 0
            java.lang.String r7 = r7.substring(r8, r9)     // Catch:{ all -> 0x00fc }
        L_0x0071:
            dmd r8 = r6.d     // Catch:{ all -> 0x00fc }
            dpp r9 = r8.g     // Catch:{ all -> 0x00fc }
            r10 = 0
            if (r9 == 0) goto L_0x0081
            boolean r9 = r9.p()     // Catch:{ all -> 0x00fc }
            if (r9 == 0) goto L_0x0081
            dpp r10 = r8.g     // Catch:{ all -> 0x00fc }
            goto L_0x0082
        L_0x0081:
        L_0x0082:
            if (r10 == 0) goto L_0x00f7
            dpo r8 = r10.b     // Catch:{ all -> 0x00fc }
            long r9 = r8.b()     // Catch:{ all -> 0x00fc }
            r0 = 0
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x0093
            r8.a()     // Catch:{ all -> 0x00fc }
        L_0x0093:
            if (r7 != 0) goto L_0x0098
            java.lang.String r7 = ""
            goto L_0x0099
        L_0x0098:
        L_0x0099:
            monitor-enter(r8)     // Catch:{ all -> 0x00fc }
            dpp r9 = r8.b     // Catch:{ all -> 0x00f9 }
            android.content.SharedPreferences r9 = r9.a     // Catch:{ all -> 0x00f9 }
            java.lang.String r10 = r8.c()     // Catch:{ all -> 0x00f9 }
            long r9 = r9.getLong(r10, r0)     // Catch:{ all -> 0x00f9 }
            r2 = 1
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x00dd
            java.util.UUID r11 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x00f9 }
            long r0 = r11.getLeastSignificantBits()     // Catch:{ all -> 0x00f9 }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0 & r4
            long r9 = r9 + r2
            long r4 = r4 / r9
            dpp r11 = r8.b     // Catch:{ all -> 0x00f9 }
            android.content.SharedPreferences r11 = r11.a     // Catch:{ all -> 0x00f9 }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x00f9 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x00c9
            goto L_0x00d0
        L_0x00c9:
            java.lang.String r0 = r8.d()     // Catch:{ all -> 0x00f9 }
            r11.putString(r0, r7)     // Catch:{ all -> 0x00f9 }
        L_0x00d0:
            java.lang.String r7 = r8.c()     // Catch:{ all -> 0x00f9 }
            r11.putLong(r7, r9)     // Catch:{ all -> 0x00f9 }
            r11.apply()     // Catch:{ all -> 0x00f9 }
            monitor-exit(r8)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
            return
        L_0x00dd:
            dpp r9 = r8.b     // Catch:{ all -> 0x00f9 }
            android.content.SharedPreferences r9 = r9.a     // Catch:{ all -> 0x00f9 }
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch:{ all -> 0x00f9 }
            java.lang.String r10 = r8.d()     // Catch:{ all -> 0x00f9 }
            r9.putString(r10, r7)     // Catch:{ all -> 0x00f9 }
            java.lang.String r7 = r8.c()     // Catch:{ all -> 0x00f9 }
            r9.putLong(r7, r2)     // Catch:{ all -> 0x00f9 }
            r9.apply()     // Catch:{ all -> 0x00f9 }
            monitor-exit(r8)     // Catch:{ all -> 0x00f9 }
        L_0x00f7:
            monitor-exit(r6)
            return
        L_0x00f9:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00f9 }
            throw r7     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpk.c(int, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (dpk.class) {
            a = this;
        }
    }

    public final void a(dpc dpc, String str) {
        d(str.length() == 0 ? new String("Discarding hit. ") : "Discarding hit. ".concat(str), dpc == null ? "no hit data" : dpc.toString());
    }

    public final void a(Map map, String str) {
        String str2;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append((String) entry.getValue());
            }
            str2 = sb.toString();
        } else {
            str2 = "no hit data";
        }
        d(str.length() == 0 ? new String("Discarding hit. ") : "Discarding hit. ".concat(str), str2);
    }
}
