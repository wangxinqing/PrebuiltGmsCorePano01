package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: bahx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bahx {
    private static final long a = TimeUnit.SECONDS.toNanos(1);

    public static List a(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", new Object[]{obj, str, map}));
    }

    public static List b(Map map, String str) {
        List a2 = a(map, str);
        if (a2 == null) {
            return null;
        }
        a(a2);
        return a2;
    }

    public static List c(Map map, String str) {
        List a2 = a(map, str);
        if (a2 == null) {
            return null;
        }
        int i = 0;
        while (i < a2.size()) {
            if (a2.get(i) instanceof String) {
                i++;
            } else {
                throw new ClassCastException(String.format("value '%s' for idx %d in '%s' is not string", new Object[]{a2.get(i), Integer.valueOf(i), a2}));
            }
        }
        return a2;
    }

    public static Map d(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", new Object[]{obj, str, map}));
    }

    public static Double e(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Double", new Object[]{obj, str, map}));
    }

    public static Integer f(Map map, String str) {
        Double e = e(map, str);
        if (e == null) {
            return null;
        }
        int intValue = e.intValue();
        if (((double) intValue) == e.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Number expected to be integer: ");
        sb.append(valueOf);
        throw new ClassCastException(sb.toString());
    }

    public static String g(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", new Object[]{obj, str, map}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0110, code lost:
        if (r7 < 0) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0116, code lost:
        if (r7 <= 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0118, code lost:
        r2 = java.util.concurrent.TimeUnit.SECONDS.toNanos(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011e, code lost:
        r10 = r2 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0123, code lost:
        if ((r8 ^ r2) >= 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0125, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0127, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012b, code lost:
        if ((r2 ^ r10) < 0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x012d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0131, code lost:
        if ((r0 | r1) != false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0133, code lost:
        r10 = (1 ^ (r10 >>> 63)) + Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0145, code lost:
        return java.lang.Long.valueOf(r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d1 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e2 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e3 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010f A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0116 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Long h(java.util.Map r12, java.lang.String r13) {
        /*
            java.lang.String r12 = g(r12, r13)
            if (r12 == 0) goto L_0x0187
            boolean r13 = r12.isEmpty()     // Catch:{ ParseException -> 0x0180 }
            java.lang.String r0 = "Invalid duration string: "
            r1 = 0
            if (r13 == 0) goto L_0x0011
        L_0x000f:
            goto L_0x016a
        L_0x0011:
            int r13 = r12.length()     // Catch:{ ParseException -> 0x0180 }
            r2 = -1
            int r13 = r13 + r2
            char r13 = r12.charAt(r13)     // Catch:{ ParseException -> 0x0180 }
            r3 = 115(0x73, float:1.61E-43)
            if (r13 != r3) goto L_0x000f
            char r13 = r12.charAt(r1)     // Catch:{ ParseException -> 0x0180 }
            r3 = 45
            r4 = 1
            if (r13 != r3) goto L_0x002e
            java.lang.String r12 = r12.substring(r4)     // Catch:{ ParseException -> 0x0180 }
            r13 = 1
            goto L_0x002f
        L_0x002e:
            r13 = 0
        L_0x002f:
            int r3 = r12.length()     // Catch:{ ParseException -> 0x0180 }
            int r3 = r3 + r2
            java.lang.String r3 = r12.substring(r1, r3)     // Catch:{ ParseException -> 0x0180 }
            java.lang.String r5 = ""
            r6 = 46
            int r6 = r3.indexOf(r6)     // Catch:{ ParseException -> 0x0180 }
            if (r6 != r2) goto L_0x0044
            goto L_0x004e
        L_0x0044:
            int r2 = r6 + 1
            java.lang.String r5 = r3.substring(r2)     // Catch:{ ParseException -> 0x0180 }
            java.lang.String r3 = r3.substring(r1, r6)     // Catch:{ ParseException -> 0x0180 }
        L_0x004e:
            long r2 = java.lang.Long.parseLong(r3)     // Catch:{ ParseException -> 0x0180 }
            boolean r6 = r5.isEmpty()     // Catch:{ ParseException -> 0x0180 }
            if (r6 != 0) goto L_0x008a
            r6 = 0
            r7 = 0
        L_0x005a:
            r8 = 9
            if (r6 < r8) goto L_0x005f
            goto L_0x008b
        L_0x005f:
            int r7 = r7 * 10
            int r8 = r5.length()     // Catch:{ ParseException -> 0x0180 }
            if (r6 < r8) goto L_0x0068
            goto L_0x007f
        L_0x0068:
            char r8 = r5.charAt(r6)     // Catch:{ ParseException -> 0x0180 }
            r9 = 48
            if (r8 < r9) goto L_0x0082
            char r8 = r5.charAt(r6)     // Catch:{ ParseException -> 0x0180 }
            r9 = 57
            if (r8 > r9) goto L_0x0082
            char r8 = r5.charAt(r6)     // Catch:{ ParseException -> 0x0180 }
            int r8 = r8 + -48
            int r7 = r7 + r8
        L_0x007f:
            int r6 = r6 + 1
            goto L_0x005a
        L_0x0082:
            java.text.ParseException r12 = new java.text.ParseException     // Catch:{ ParseException -> 0x0180 }
            java.lang.String r13 = "Invalid nanoseconds."
            r12.<init>(r13, r1)     // Catch:{ ParseException -> 0x0180 }
            throw r12     // Catch:{ ParseException -> 0x0180 }
        L_0x008a:
            r7 = 0
        L_0x008b:
            r5 = 0
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ab
            java.text.ParseException r13 = new java.text.ParseException     // Catch:{ ParseException -> 0x0180 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ ParseException -> 0x0180 }
            int r2 = r12.length()     // Catch:{ ParseException -> 0x0180 }
            if (r2 != 0) goto L_0x00a3
            java.lang.String r12 = new java.lang.String     // Catch:{ ParseException -> 0x0180 }
            r12.<init>(r0)     // Catch:{ ParseException -> 0x0180 }
            goto L_0x00a7
        L_0x00a3:
            java.lang.String r12 = r0.concat(r12)     // Catch:{ ParseException -> 0x0180 }
        L_0x00a7:
            r13.<init>(r12, r1)     // Catch:{ ParseException -> 0x0180 }
            throw r13     // Catch:{ ParseException -> 0x0180 }
        L_0x00ab:
            if (r13 == 0) goto L_0x00b0
            long r2 = -r2
            int r7 = -r7
            goto L_0x00b1
        L_0x00b0:
        L_0x00b1:
            long r12 = (long) r7
            long r8 = a     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r8 = -r8
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00ba
            goto L_0x00c1
        L_0x00ba:
            long r8 = a     // Catch:{ IllegalArgumentException -> 0x0161 }
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            goto L_0x00cd
        L_0x00c1:
            long r7 = a     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r7 = r12 / r7
            long r2 = defpackage.aont.a(r2, r7)     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r7 = a     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r12 = r12 % r7
            int r7 = (int) r12     // Catch:{ IllegalArgumentException -> 0x0161 }
        L_0x00cd:
            int r12 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r12 > 0) goto L_0x00d2
            goto L_0x00dc
        L_0x00d2:
            if (r7 >= 0) goto L_0x00dc
            long r12 = (long) r7     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r7 = a     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r12 = r12 + r7
            int r7 = (int) r12     // Catch:{ IllegalArgumentException -> 0x0161 }
            r12 = -1
            long r2 = r2 + r12
        L_0x00dc:
            r12 = 1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00e3
            goto L_0x00eb
        L_0x00e3:
            if (r7 <= 0) goto L_0x00eb
            long r7 = (long) r7     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r9 = a     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r7 = r7 - r9
            int r7 = (int) r7     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r2 = r2 + r12
        L_0x00eb:
            r8 = -315576000000(0xffffffb686346200, double:NaN)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0146
            r8 = 315576000000(0x4979cb9e00, double:1.55915260252E-312)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            long r8 = (long) r7     // Catch:{ IllegalArgumentException -> 0x0161 }
            r10 = -999999999(0xffffffffc4653601, double:NaN)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0146
            long r10 = a     // Catch:{ IllegalArgumentException -> 0x0161 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0146
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            if (r7 >= 0) goto L_0x0118
        L_0x0112:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            if (r7 > 0) goto L_0x0146
        L_0x0118:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r2 = r0.toNanos(r2)     // Catch:{ IllegalArgumentException -> 0x0161 }
            long r10 = r2 + r8
            long r8 = r8 ^ r2
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0127
            r0 = 1
            goto L_0x0128
        L_0x0127:
            r0 = 0
        L_0x0128:
            long r2 = r2 ^ r10
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x012f
            r1 = 1
            goto L_0x0130
        L_0x012f:
        L_0x0130:
            r0 = r0 | r1
            if (r0 != 0) goto L_0x0140
            r0 = 63
            long r0 = r10 >>> r0
            long r12 = r12 ^ r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r10 = r12 + r0
            goto L_0x0141
        L_0x0140:
        L_0x0141:
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ ParseException -> 0x0180 }
            return r12
        L_0x0146:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0161 }
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ IllegalArgumentException -> 0x0161 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0161 }
            r13[r1] = r0     // Catch:{ IllegalArgumentException -> 0x0161 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x0161 }
            r13[r4] = r0     // Catch:{ IllegalArgumentException -> 0x0161 }
            java.lang.String r0 = "Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds"
            java.lang.String r13 = java.lang.String.format(r0, r13)     // Catch:{ IllegalArgumentException -> 0x0161 }
            r12.<init>(r13)     // Catch:{ IllegalArgumentException -> 0x0161 }
            throw r12     // Catch:{ IllegalArgumentException -> 0x0161 }
        L_0x0161:
            r12 = move-exception
            java.text.ParseException r12 = new java.text.ParseException     // Catch:{ ParseException -> 0x0180 }
            java.lang.String r13 = "Duration value is out of range."
            r12.<init>(r13, r1)     // Catch:{ ParseException -> 0x0180 }
            throw r12     // Catch:{ ParseException -> 0x0180 }
        L_0x016a:
            java.text.ParseException r13 = new java.text.ParseException     // Catch:{ ParseException -> 0x0180 }
            int r2 = r12.length()     // Catch:{ ParseException -> 0x0180 }
            if (r2 != 0) goto L_0x0178
            java.lang.String r12 = new java.lang.String     // Catch:{ ParseException -> 0x0180 }
            r12.<init>(r0)     // Catch:{ ParseException -> 0x0180 }
            goto L_0x017c
        L_0x0178:
            java.lang.String r12 = r0.concat(r12)     // Catch:{ ParseException -> 0x0180 }
        L_0x017c:
            r13.<init>(r12, r1)     // Catch:{ ParseException -> 0x0180 }
            throw r13     // Catch:{ ParseException -> 0x0180 }
        L_0x0180:
            r12 = move-exception
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            r13.<init>(r12)
            throw r13
        L_0x0187:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bahx.h(java.util.Map, java.lang.String):java.lang.Long");
    }

    public static Boolean i(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", new Object[]{obj, str, map}));
    }

    public static void a(List list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof Map) {
                i++;
            } else {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
    }
}
