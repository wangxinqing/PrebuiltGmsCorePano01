package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* renamed from: aaoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaoc {
    private final SimpleDateFormat a;
    private final Context b;

    static {
        aaoc.class.getSimpleName();
    }

    public aaoc(Context context) {
        this.b = context;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateTimeInstance();
        this.a = simpleDateFormat;
        simpleDateFormat.applyPattern("MM-dd HH:mm:ss.SSS");
    }

    /* access modifiers changed from: package-private */
    public final long a(String str) {
        return this.a.parse(str.substring(0, 18)).getTime();
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x00d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6 A[Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0115 A[Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }, LOOP:2: B:54:0x00fc->B:58:0x0115, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012a A[Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014e A[Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map a() {
        /*
            r18 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<aaub> r1 = defpackage.aaub.class
            r0.<init>(r1)
            aaoa r1 = new aaoa
            r2 = r18
            r1.<init>(r2)
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.String r5 = "logcat -d"
            java.lang.Process r4 = r4.exec(r5)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r4 == 0) goto L_0x0029
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x022f
        L_0x002c:
            java.lang.String r4 = r5.readLine()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r4 != 0) goto L_0x0048
            aaob r3 = r1.a
            int r4 = r3.a
            if (r4 <= 0) goto L_0x0047
            java.util.Map r3 = r3.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0047
            aaub r3 = defpackage.aaub.NEW_ACTIVITY_AFTER_SCREEN_OFF
            aaob r1 = r1.a
            r0.put(r3, r1)
        L_0x0047:
            return r0
        L_0x0048:
            java.lang.String r6 = "android.intent.action.SCREEN_OFF"
            boolean r6 = r4.contains(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r9 = -1000(0xfffffffffffffc18, double:NaN)
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x0056
            goto L_0x0159
        L_0x0056:
            java.lang.String r6 = "LockScreenReceiver: OFF"
            boolean r6 = r4.contains(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r6 != 0) goto L_0x0159
            java.lang.String r6 = "DisplayManagerService: Display device changed state: \"Built-in Screen\", OFF"
            boolean r6 = r4.contains(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r6 != 0) goto L_0x0159
            java.lang.String r6 = "ActivityManager"
            boolean r6 = r4.contains(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r6 == 0) goto L_0x002c
            java.lang.String r6 = "START"
            boolean r6 = r4.contains(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r6 == 0) goto L_0x002c
            aaoc r6 = r1.d     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r13 = r6.a(r4)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.String r6 = ""
            java.lang.String r15 = "cmp="
            int r15 = r4.indexOf(r15)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r3 = -1
            if (r15 == r3) goto L_0x0096
            r7 = 125(0x7d, float:1.75E-43)
            int r7 = r4.indexOf(r7, r15)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r7 != r3) goto L_0x0097
            r7 = 32
            int r7 = r4.indexOf(r7, r15)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x0097
        L_0x0096:
            r7 = -1
        L_0x0097:
            if (r15 != r3) goto L_0x009a
            goto L_0x00c1
        L_0x009a:
            if (r7 != r3) goto L_0x009d
            goto L_0x00c1
        L_0x009d:
            if (r7 <= r15) goto L_0x00c0
            r3 = 47
            amsk r3 = defpackage.amsk.a((char) r3)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.String r4 = r4.substring(r15, r7)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.List r3 = r3.c(r4)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r4 = r3.size()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r7 = 2
            if (r4 != r7) goto L_0x00c0
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r4 = 4
            java.lang.String r6 = r3.substring(r4)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
        L_0x00c0:
        L_0x00c1:
            java.util.SortedSet r3 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            boolean r3 = r3.isEmpty()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r3 != 0) goto L_0x00d2
            java.util.SortedSet r3 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r3 = r3.first()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            if (r3 != 0) goto L_0x00d6
            goto L_0x00f6
        L_0x00d6:
            long r7 = r3.longValue()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r16 = r13 + r9
            int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x00f6
            java.util.SortedSet r4 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r4.remove(r3)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.SortedSet r3 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            boolean r3 = r3.isEmpty()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r3 != 0) goto L_0x00d2
            java.util.SortedSet r3 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r3 = r3.first()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x00d3
        L_0x00f6:
            java.util.SortedSet r3 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
        L_0x00fc:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r4 == 0) goto L_0x011d
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r7 = r4.longValue()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r7 = r7 - r13
            long r7 = java.lang.Math.abs(r7)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x011d
            aaoc r4 = r1.d     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            aaob r7 = r1.a     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r4.a(r6, r7)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x00fc
        L_0x011d:
            java.util.SortedMap r3 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r3 = r3.size()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r3 = (long) r3     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r7 = 10
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x014e
            java.util.SortedMap r3 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r3 = r3.firstKey()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r3 = r3.longValue()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r7 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x002c
            java.util.SortedMap r3 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r4 = r3.firstKey()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r3.remove(r4)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.SortedMap r3 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r4 = java.lang.Long.valueOf(r13)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r3.put(r4, r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x002c
        L_0x014e:
            java.util.SortedMap r3 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r4 = java.lang.Long.valueOf(r13)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r3.put(r4, r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x002c
        L_0x0159:
            aaoc r3 = r1.d     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r3 = r3.a(r4)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.SortedSet r6 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            boolean r6 = r6.isEmpty()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r6 == 0) goto L_0x0168
        L_0x0167:
            goto L_0x017f
        L_0x0168:
            java.util.SortedSet r6 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r6 = r6.last()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r6 = r6.longValue()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r6 = r3 - r6
            long r6 = java.lang.Math.abs(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x002c
            goto L_0x0167
        L_0x017f:
            aaob r6 = r1.a     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r7 = r6.a     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r7 = r7 + 1
            r6.a = r7     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.SortedMap r6 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            boolean r6 = r6.isEmpty()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r6 != 0) goto L_0x0198
            java.util.SortedMap r6 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r6 = r6.firstKey()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x0199
        L_0x0198:
            r6 = 0
        L_0x0199:
            if (r6 == 0) goto L_0x01bd
            long r7 = r6.longValue()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r13 = r3 + r9
            int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x01bd
            java.util.SortedMap r7 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r7.remove(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.SortedMap r6 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            boolean r6 = r6.isEmpty()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r6 != 0) goto L_0x01bb
            java.util.SortedMap r6 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r6 = r6.firstKey()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x0199
        L_0x01bb:
            r6 = 0
            goto L_0x0199
        L_0x01bd:
            if (r6 == 0) goto L_0x01f3
            long r7 = r6.longValue()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r7 = r7 - r3
            long r7 = java.lang.Math.abs(r7)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x01f3
            aaoc r7 = r1.d     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.SortedMap r8 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            aaob r9 = r1.a     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r7.a(r8, r9)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.SortedMap r7 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r7.remove(r6)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.SortedMap r6 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            boolean r6 = r6.isEmpty()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            if (r6 != 0) goto L_0x01f1
            java.util.SortedMap r6 = r1.c     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r6 = r6.firstKey()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x01bd
        L_0x01f1:
            r6 = 0
            goto L_0x01bd
        L_0x01f3:
            java.util.SortedSet r6 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r6 = r6.size()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r6 = (long) r6     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r8 = 10
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0224
            java.util.SortedSet r6 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r6 = r6.first()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            long r6 = r6.longValue()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x002c
            java.util.SortedSet r6 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Object r7 = r6.first()     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r6.remove(r7)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.util.SortedSet r6 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r6.add(r3)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x002c
        L_0x0224:
            java.util.SortedSet r6 = r1.b     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            r6.add(r3)     // Catch:{ IOException -> 0x0233, ParseException -> 0x0231 }
            goto L_0x002c
        L_0x022f:
            r1 = 0
            return r1
        L_0x0231:
            r0 = move-exception
            goto L_0x022f
        L_0x0233:
            r0 = move-exception
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaoc.a():java.util.Map");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, aaob aaob) {
        if (!TextUtils.isEmpty(str)) {
            aanz aanz = (aanz) aaob.b.get(str);
            if (aanz == null) {
                aanz = new aanz();
                byte[] b2 = aans.b(aans.a(str, this.b));
                if (b2 != null) {
                    aanz.a = b2;
                }
                aaob.b.put(str, aanz);
            }
            aanz.b++;
        }
    }
}
