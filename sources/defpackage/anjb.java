package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: anjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anjb extends ankl implements ankh {
    public static final Locale a = Locale.ROOT;
    public final Object[] b;
    public final StringBuilder c = new StringBuilder();
    public int d = 0;

    private anjb(anjd anjd, Object[] objArr) {
        super(anjd);
        this.b = (Object[]) ankq.a(objArr, "log arguments");
    }

    public static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                return String.valueOf(obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            return Arrays.toString((Object[]) obj);
        } catch (RuntimeException e) {
            return a(obj, e);
        }
    }

    private static String a(Object obj, RuntimeException runtimeException) {
        String str;
        try {
            str = runtimeException.toString();
        } catch (RuntimeException e) {
            str = e.getClass().getSimpleName();
        }
        String name = obj.getClass().getName();
        int identityHashCode = System.identityHashCode(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 16 + String.valueOf(str).length());
        sb.append("{");
        sb.append(name);
        sb.append("@");
        sb.append(identityHashCode);
        sb.append(": ");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.anir r10, defpackage.anja r11) {
        /*
            aniv r0 = r10.k()
            anif r1 = defpackage.anhs.a
            java.lang.Object r1 = r0.b((defpackage.anif) r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            int r2 = r0.a()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0020
            int r2 = r0.a()
            if (r2 == r4) goto L_0x001c
            r2 = 0
            goto L_0x0021
        L_0x001c:
            if (r1 != 0) goto L_0x0020
            r2 = 0
            goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            anjd r5 = r10.g()
            if (r5 == 0) goto L_0x0099
            anjb r5 = new anjb
            anjd r6 = r10.g()
            java.lang.Object[] r7 = r10.h()
            r5.<init>(r6, r7)
            ankm r6 = r5.a()
            r6.a(r5)
            int r6 = r5.e
            int r7 = r6 + 1
            r7 = r7 & r6
            r8 = -1
            if (r7 != 0) goto L_0x007f
            int r7 = r5.f
            r9 = 31
            if (r7 > r9) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            if (r6 != r8) goto L_0x007f
        L_0x004c:
            ankm r3 = r5.a()
            java.lang.StringBuilder r6 = r5.c
            java.lang.String r7 = r5.b()
            int r8 = r5.d
            java.lang.String r9 = r5.b()
            int r9 = r9.length()
            r3.a(r6, r7, r8, r9)
            java.lang.StringBuilder r3 = r5.c
            java.lang.Object[] r6 = r10.h()
            int r6 = r6.length
            int r5 = r5.f
            int r5 = r5 + r4
            if (r6 <= r5) goto L_0x0074
            java.lang.String r4 = " [ERROR: UNUSED LOG ARGUMENTS]"
            r3.append(r4)
        L_0x0074:
            if (r2 == 0) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            a((java.lang.StringBuilder) r3, (defpackage.aniv) r0)
        L_0x007a:
            java.lang.String r0 = r3.toString()
            goto L_0x00b5
        L_0x007f:
            r10 = r6 ^ -1
            int r10 = java.lang.Integer.numberOfTrailingZeros(r10)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11[r3] = r10
            java.lang.String r10 = "unreferenced arguments [first missing index=%d]"
            java.lang.String r10 = java.lang.String.format(r10, r11)
            ankn r11 = new ankn
            r11.<init>(r10)
            throw r11
        L_0x0099:
            java.lang.Object r0 = r10.i()
            java.lang.String r0 = a(r0)
            if (r2 != 0) goto L_0x00b4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            aniv r0 = r10.k()
            a((java.lang.StringBuilder) r2, (defpackage.aniv) r0)
            java.lang.String r0 = r2.toString()
            goto L_0x00b5
        L_0x00b4:
        L_0x00b5:
            java.util.logging.Level r10 = r10.c()
            r11.a(r10, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anjb.a(anir, anja):void");
    }

    private static void a(StringBuilder sb, long j, boolean z) {
        String str;
        if (j == 0) {
            sb.append("0");
            return;
        }
        if (!z) {
            str = "0123456789abcdef";
        } else {
            str = "0123456789ABCDEF";
        }
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & -4; numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    private static void a(StringBuilder sb, aniv aniv) {
        anip anip = new anip("[CONTEXT ", " ]", sb);
        anjc anjc = null;
        for (int i = 0; i < aniv.a(); i++) {
            anif a2 = aniv.a(i);
            if (!a2.equals(anhs.a)) {
                if (a2.equals(anhs.f)) {
                    anjc = (anjc) anhs.f.a(aniv.b(i));
                } else {
                    anip.a(a2.a, aniv.b(i));
                }
            }
        }
        if (anjc != null) {
            anjc.a(anip);
        }
        anip.a();
    }

    public static void a(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(a(obj));
        sb.append("]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if ((r8 instanceof java.math.BigDecimal) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        if ((r8 instanceof java.math.BigInteger) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0056, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r8, defpackage.anim r9, defpackage.anin r10) {
        /*
            r7 = this;
            anio r0 = r9.m
            int r0 = r0.ordinal()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r4) goto L_0x0054
            if (r0 == r3) goto L_0x0038
            if (r0 == r2) goto L_0x0023
            if (r0 != r1) goto L_0x0021
            boolean r0 = r8 instanceof java.lang.Double
            if (r0 != 0) goto L_0x0060
            boolean r0 = r8 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0060
            boolean r0 = r8 instanceof java.math.BigDecimal
            if (r0 != 0) goto L_0x0060
            goto L_0x0058
        L_0x0021:
            r8 = 0
            throw r8
        L_0x0023:
            boolean r0 = r8 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0060
            boolean r0 = r8 instanceof java.lang.Long
            if (r0 != 0) goto L_0x0060
            boolean r0 = r8 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x0060
            boolean r0 = r8 instanceof java.lang.Short
            if (r0 != 0) goto L_0x0060
            boolean r0 = r8 instanceof java.math.BigInteger
            if (r0 != 0) goto L_0x0060
            goto L_0x0058
        L_0x0038:
            boolean r0 = r8 instanceof java.lang.Character
            if (r0 != 0) goto L_0x0060
            boolean r0 = r8 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0048
            boolean r0 = r8 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x0048
            boolean r0 = r8 instanceof java.lang.Short
            if (r0 == 0) goto L_0x0058
        L_0x0048:
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = java.lang.Character.isValidCodePoint(r0)
            goto L_0x0056
        L_0x0054:
            boolean r0 = r8 instanceof java.lang.Boolean
        L_0x0056:
            if (r0 != 0) goto L_0x0060
        L_0x0058:
            java.lang.StringBuilder r10 = r7.c
            java.lang.String r9 = r9.o
            a((java.lang.StringBuilder) r10, (java.lang.Object) r8, (java.lang.String) r9)
            return
        L_0x0060:
            java.lang.StringBuilder r0 = r7.c
            anim r5 = defpackage.anim.STRING
            int r5 = r9.ordinal()
            r6 = 0
            if (r5 == 0) goto L_0x0149
            if (r5 == r4) goto L_0x013f
            if (r5 == r3) goto L_0x0118
            if (r5 == r2) goto L_0x013f
            r1 = 5
            if (r5 == r1) goto L_0x0076
            goto L_0x015b
        L_0x0076:
            boolean r1 = r10.a()
            if (r1 != 0) goto L_0x0098
            int r1 = r10.b
            r2 = r1 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x0085
            anin r1 = defpackage.anin.a
            goto L_0x009a
        L_0x0085:
            r3 = -1
            if (r2 == r1) goto L_0x0089
            goto L_0x0092
        L_0x0089:
            int r1 = r10.c
            if (r1 != r3) goto L_0x0092
            int r1 = r10.d
            if (r1 != r3) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            anin r1 = new anin
            r1.<init>(r2, r3, r3)
            goto L_0x009a
        L_0x0098:
            r1 = r10
        L_0x009a:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x015b
            java.lang.Number r8 = (java.lang.Number) r8
            boolean r9 = r10.b()
            long r1 = r8.longValue()
            boolean r10 = r8 instanceof java.lang.Long
            if (r10 == 0) goto L_0x00b2
            a((java.lang.StringBuilder) r0, (long) r1, (boolean) r9)
            return
        L_0x00b2:
            boolean r10 = r8 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x00c0
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            a((java.lang.StringBuilder) r0, (long) r1, (boolean) r9)
            return
        L_0x00c0:
            boolean r10 = r8 instanceof java.lang.Byte
            if (r10 == 0) goto L_0x00cb
            r3 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r3
            a((java.lang.StringBuilder) r0, (long) r1, (boolean) r9)
            return
        L_0x00cb:
            boolean r10 = r8 instanceof java.lang.Short
            if (r10 == 0) goto L_0x00d7
            r3 = 65535(0xffff, double:3.23786E-319)
            long r1 = r1 & r3
            a((java.lang.StringBuilder) r0, (long) r1, (boolean) r9)
            return
        L_0x00d7:
            boolean r10 = r8 instanceof java.math.BigInteger
            if (r10 == 0) goto L_0x00ef
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            r10 = 16
            java.lang.String r8 = r8.toString(r10)
            if (r9 == 0) goto L_0x00eb
            java.util.Locale r9 = a
            java.lang.String r8 = r8.toUpperCase(r9)
        L_0x00eb:
            r0.append(r8)
            return
        L_0x00ef:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r10 = r10 + 25
            r0.<init>(r10)
            java.lang.String r10 = "unsupported number type: "
            r0.append(r10)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L_0x0118:
            boolean r1 = r10.a()
            if (r1 == 0) goto L_0x015b
            boolean r9 = r8 instanceof java.lang.Character
            if (r9 == 0) goto L_0x0126
            r0.append(r8)
            return
        L_0x0126:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            boolean r9 = java.lang.Character.isBmpCodePoint(r8)
            if (r9 == 0) goto L_0x0137
            char r8 = (char) r8
            r0.append(r8)
            return
        L_0x0137:
            char[] r8 = java.lang.Character.toChars(r8)
            r0.append(r8)
            return
        L_0x013f:
            boolean r1 = r10.a()
            if (r1 == 0) goto L_0x015b
            r0.append(r8)
            return
        L_0x0149:
            boolean r2 = r8 instanceof java.util.Formattable
            if (r2 != 0) goto L_0x0190
            boolean r1 = r10.a()
            if (r1 == 0) goto L_0x015b
            java.lang.String r8 = a(r8)
            r0.append(r8)
            return
        L_0x015b:
            java.lang.String r1 = r9.o
            boolean r2 = r10.a()
            if (r2 != 0) goto L_0x0182
            char r9 = r9.l
            boolean r1 = r10.b()
            if (r1 != 0) goto L_0x016c
            goto L_0x0170
        L_0x016c:
            r1 = 65503(0xffdf, float:9.1789E-41)
            r9 = r9 & r1
        L_0x0170:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "%"
            r1.<init>(r2)
            r10.a((java.lang.StringBuilder) r1)
            char r9 = (char) r9
            r1.append(r9)
            java.lang.String r1 = r1.toString()
        L_0x0182:
            java.util.Locale r9 = a
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r6] = r8
            java.lang.String r8 = java.lang.String.format(r9, r1, r10)
            r0.append(r8)
            return
        L_0x0190:
            java.util.Formattable r8 = (java.util.Formattable) r8
            int r9 = r10.b
            r9 = r9 & 162(0xa2, float:2.27E-43)
            if (r9 == 0) goto L_0x01af
            r2 = r9 & 32
            if (r2 == 0) goto L_0x019d
            goto L_0x019e
        L_0x019d:
            r4 = 0
        L_0x019e:
            r2 = r9 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x01a3
            goto L_0x01a4
        L_0x01a3:
            r3 = 0
        L_0x01a4:
            r2 = r4 | r3
            r9 = r9 & 2
            if (r9 == 0) goto L_0x01ab
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            r9 = r2 | r1
            goto L_0x01b0
        L_0x01af:
        L_0x01b0:
            int r1 = r0.length()
            java.util.Formatter r2 = new java.util.Formatter
            java.util.Locale r3 = a
            r2.<init>(r0, r3)
            int r3 = r10.c     // Catch:{ RuntimeException -> 0x01c3 }
            int r10 = r10.d     // Catch:{ RuntimeException -> 0x01c3 }
            r8.formatTo(r2, r9, r3, r10)     // Catch:{ RuntimeException -> 0x01c3 }
            return
        L_0x01c3:
            r9 = move-exception
            r0.setLength(r1)
            java.lang.Appendable r10 = r2.out()     // Catch:{ IOException -> 0x01d3 }
            java.lang.String r8 = a((java.lang.Object) r8, (java.lang.RuntimeException) r9)     // Catch:{ IOException -> 0x01d3 }
            r10.append(r8)     // Catch:{ IOException -> 0x01d3 }
            return
        L_0x01d3:
            r8 = move-exception
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anjb.a(java.lang.Object, anim, anin):void");
    }
}
