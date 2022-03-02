package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: lj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lj {
    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return a(xmlPullParser, str) ? typedArray.getFloat(i, f) : f;
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (a(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (a(xmlPullParser, str)) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    public static int d(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId == 0 ? i2 : i;
    }

    public static CharSequence b(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static CharSequence[] c(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int a(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return a(xmlPullParser, str) ? typedArray.getInt(i, i2) : i2;
    }

    public static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme != null) {
            return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        return resources.obtainAttributes(attributeSet, iArr);
    }

    public static TypedValue a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (a(xmlPullParser, str)) {
            return typedArray.peekValue(0);
        }
        return null;
    }

    public static String a(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static String a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r18v3, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r13v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r7 = r0.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r10 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r10 == 89650992) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r10 == 1191572447) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r7.equals("selector") == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r7.equals("gradient") == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r10 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r10 == 0) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r10 != 1) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7 = r0.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r7.equals("gradient") == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r7 = a(r4, r1, r6, defpackage.er.d);
        r14 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "startX", 8, 0.0f);
        r15 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "startY", 9, 0.0f);
        r16 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "endX", 10, 0.0f);
        r17 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "endY", 11, 0.0f);
        r10 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "centerX", 3, 0.0f);
        r2 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "centerY", 4, 0.0f);
        r13 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "type", 2, r5);
        r8 = b(r7, r0, "startColor", r5);
        r18 = a(r0, "centerColor");
        r3 = b(r7, r0, "centerColor", 7);
        r11 = b(r7, r0, "endColor", 1);
        r9 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "tileMode", 6, r5);
        r20 = r2;
        r21 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "gradientRadius", 5, 0.0f);
        r7.recycle();
        r2 = r0.getDepth() + 1;
        r5 = new java.util.ArrayList(20);
        r12 = new java.util.ArrayList(20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f3, code lost:
        r7 = r0.next();
        r22 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fa, code lost:
        if (r7 == 1) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fc, code lost:
        r10 = r0.getDepth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
        if (r10 >= r2) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
        if (r7 != 3) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r7 != 2) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010f, code lost:
        if (r10 > r2) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        if (r0.getName().equals("item") == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        r7 = a(r4, r1, r6, defpackage.er.e);
        r15 = r7.hasValue(0);
        r24 = r7.hasValue(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r15 == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012f, code lost:
        if (r24 == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0131, code lost:
        r15 = r7.getColor(0, 0);
        r25 = r7.getFloat(1, 0.0f);
        r7.recycle();
        r12.add(java.lang.Integer.valueOf(r15));
        r5.add(java.lang.Float.valueOf(r25));
        r10 = r22;
        r15 = r23;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0171, code lost:
        r24 = r2;
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0179, code lost:
        r24 = r2;
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0181, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0187, code lost:
        if (r12.size() <= 0) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0189, code lost:
        r0 = new defpackage.lb((java.util.List) r12, (java.util.List) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0190, code lost:
        if (r0 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0193, code lost:
        if (r18 != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0195, code lost:
        r0 = new defpackage.lb(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019b, code lost:
        r0 = new defpackage.lb(r8, r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a1, code lost:
        if (r13 == 1) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a4, code lost:
        if (r13 == 2) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a6, code lost:
        r13 = new android.graphics.LinearGradient(r14, r23, r16, r17, r0.a, r0.b, defpackage.lc.a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bb, code lost:
        r1 = new android.graphics.SweepGradient(r22, r20, r0.a, r0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c9, code lost:
        r4 = r20;
        r3 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d0, code lost:
        if (r21 <= 0.0f) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d2, code lost:
        r18 = new android.graphics.RadialGradient(r3, r4, r21, r0.a, r0.b, defpackage.lc.a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f0, code lost:
        r2 = new defpackage.kv(r1, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f4, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fd, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": invalid gradient color tag " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0239, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": unsupported complex color tag " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023a, code lost:
        r0 = defpackage.ku.a(r4, r0, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0244, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r2 = new defpackage.kv((android.graphics.Shader) null, r0, r0.getDefaultColor());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0259, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0268 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kv a(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            r0 = r26
            r1 = r28
            r2 = r30
            java.lang.String r3 = "centerColor"
            r4 = r27
            r5 = r29
            boolean r4 = a(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0269
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r0.getValue(r2, r4)
            int r6 = r4.type
            r7 = 28
            if (r6 < r7) goto L_0x002f
            int r6 = r4.type
            r7 = 31
            if (r6 <= r7) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            int r0 = r4.data
            kv r0 = defpackage.kv.a((int) r0)
            return r0
        L_0x002f:
            android.content.res.Resources r4 = r26.getResources()
            int r0 = r0.getResourceId(r2, r5)
            android.content.res.XmlResourceParser r0 = r4.getXml(r0)     // Catch:{ Exception -> 0x025b }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r0)     // Catch:{ Exception -> 0x025b }
        L_0x003f:
            int r7 = r0.next()     // Catch:{ Exception -> 0x025b }
            r8 = 2
            r9 = 1
            if (r7 != r8) goto L_0x024a
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x025b }
            int r10 = r7.hashCode()
            r11 = 89650992(0x557f730, float:1.01546526E-35)
            java.lang.String r12 = "gradient"
            if (r10 == r11) goto L_0x0066
            r11 = 1191572447(0x4705f3df, float:34291.87)
            if (r10 == r11) goto L_0x005c
            goto L_0x006e
        L_0x005c:
            java.lang.String r10 = "selector"
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x006e
            r10 = 0
            goto L_0x006f
        L_0x0066:
            boolean r10 = r7.equals(r12)
            if (r10 == 0) goto L_0x006e
            r10 = 1
            goto L_0x006f
        L_0x006e:
            r10 = -1
        L_0x006f:
            if (r10 == 0) goto L_0x023a
            if (r10 != r9) goto L_0x021c
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x025b }
            boolean r10 = r7.equals(r12)     // Catch:{ Exception -> 0x025b }
            if (r10 == 0) goto L_0x01fe
            int[] r7 = defpackage.er.d     // Catch:{ Exception -> 0x025b }
            android.content.res.TypedArray r7 = a((android.content.res.Resources) r4, (android.content.res.Resources.Theme) r1, (android.util.AttributeSet) r6, (int[]) r7)     // Catch:{ Exception -> 0x025b }
            java.lang.String r10 = "startX"
            r11 = 8
            r12 = 0
            float r14 = a((android.content.res.TypedArray) r7, (org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r10, (int) r11, (float) r12)     // Catch:{ Exception -> 0x025b }
            java.lang.String r10 = "startY"
            r11 = 9
            float r15 = a((android.content.res.TypedArray) r7, (org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r10, (int) r11, (float) r12)     // Catch:{ Exception -> 0x025b }
            java.lang.String r10 = "endX"
            r11 = 10
            float r16 = a((android.content.res.TypedArray) r7, (org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r10, (int) r11, (float) r12)     // Catch:{ Exception -> 0x025b }
            java.lang.String r10 = "endY"
            r11 = 11
            float r17 = a((android.content.res.TypedArray) r7, (org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r10, (int) r11, (float) r12)     // Catch:{ Exception -> 0x025b }
            java.lang.String r10 = "centerX"
            r11 = 3
            float r10 = a((android.content.res.TypedArray) r7, (org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r10, (int) r11, (float) r12)     // Catch:{ Exception -> 0x025b }
            java.lang.String r13 = "centerY"
            r2 = 4
            float r2 = a((android.content.res.TypedArray) r7, (org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r13, (int) r2, (float) r12)     // Catch:{ Exception -> 0x025b }
            java.lang.String r13 = "type"
            int r13 = a((android.content.res.TypedArray) r7, (org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r13, (int) r8, (int) r5)     // Catch:{ Exception -> 0x025b }
            java.lang.String r8 = "startColor"
            int r8 = b(r7, r0, r8, r5)     // Catch:{ Exception -> 0x025b }
            boolean r18 = a(r0, r3)     // Catch:{ Exception -> 0x025b }
            r11 = 7
            int r3 = b(r7, r0, r3, r11)     // Catch:{ Exception -> 0x025b }
            java.lang.String r11 = "endColor"
            int r11 = b(r7, r0, r11, r9)     // Catch:{ Exception -> 0x025b }
            java.lang.String r9 = "tileMode"
            r12 = 6
            int r9 = a((android.content.res.TypedArray) r7, (org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r9, (int) r12, (int) r5)     // Catch:{ Exception -> 0x025b }
            java.lang.String r12 = "gradientRadius"
            r5 = 5
            r20 = r2
            r2 = 0
            float r21 = a((android.content.res.TypedArray) r7, (org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r12, (int) r5, (float) r2)     // Catch:{ Exception -> 0x025b }
            r7.recycle()     // Catch:{ Exception -> 0x025b }
            int r2 = r0.getDepth()     // Catch:{ Exception -> 0x025b }
            r5 = 1
            int r2 = r2 + r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x025b }
            r7 = 20
            r5.<init>(r7)     // Catch:{ Exception -> 0x025b }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x025b }
            r12.<init>(r7)     // Catch:{ Exception -> 0x025b }
        L_0x00f3:
            int r7 = r0.next()     // Catch:{ Exception -> 0x025b }
            r22 = r10
            r10 = 1
            if (r7 == r10) goto L_0x0181
            int r10 = r0.getDepth()     // Catch:{ Exception -> 0x025b }
            if (r10 >= r2) goto L_0x0109
            r23 = r15
            r15 = 3
            if (r7 != r15) goto L_0x010c
            goto L_0x0183
        L_0x0109:
            r23 = r15
            r15 = 3
        L_0x010c:
            r15 = 2
            if (r7 != r15) goto L_0x0179
            if (r10 > r2) goto L_0x0179
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x025b }
            java.lang.String r10 = "item"
            boolean r7 = r7.equals(r10)     // Catch:{ Exception -> 0x025b }
            if (r7 == 0) goto L_0x0171
            int[] r7 = defpackage.er.e     // Catch:{ Exception -> 0x025b }
            android.content.res.TypedArray r7 = a((android.content.res.Resources) r4, (android.content.res.Resources.Theme) r1, (android.util.AttributeSet) r6, (int[]) r7)     // Catch:{ Exception -> 0x025b }
            r10 = 0
            boolean r15 = r7.hasValue(r10)     // Catch:{ Exception -> 0x025b }
            r10 = 1
            boolean r24 = r7.hasValue(r10)     // Catch:{ Exception -> 0x025b }
            if (r15 == 0) goto L_0x0156
            if (r24 == 0) goto L_0x0156
            r10 = 0
            int r15 = r7.getColor(r10, r10)     // Catch:{ Exception -> 0x025b }
            r24 = r2
            r2 = 1
            r10 = 0
            float r25 = r7.getFloat(r2, r10)     // Catch:{ Exception -> 0x025b }
            r7.recycle()     // Catch:{ Exception -> 0x025b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x025b }
            r12.add(r2)     // Catch:{ Exception -> 0x025b }
            java.lang.Float r2 = java.lang.Float.valueOf(r25)     // Catch:{ Exception -> 0x025b }
            r5.add(r2)     // Catch:{ Exception -> 0x025b }
            r10 = r22
            r15 = r23
            r2 = r24
            goto L_0x00f3
        L_0x0156:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025b }
            r2.<init>()     // Catch:{ Exception -> 0x025b }
            java.lang.String r0 = r0.getPositionDescription()     // Catch:{ Exception -> 0x025b }
            r2.append(r0)     // Catch:{ Exception -> 0x025b }
            java.lang.String r0 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r2.append(r0)     // Catch:{ Exception -> 0x025b }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x025b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025b }
            throw r1     // Catch:{ Exception -> 0x025b }
        L_0x0171:
            r24 = r2
            r10 = r22
            r15 = r23
            goto L_0x00f3
        L_0x0179:
            r24 = r2
            r10 = r22
            r15 = r23
            goto L_0x00f3
        L_0x0181:
            r23 = r15
        L_0x0183:
            int r0 = r12.size()     // Catch:{ Exception -> 0x025b }
            if (r0 <= 0) goto L_0x018f
            lb r0 = new lb     // Catch:{ Exception -> 0x025b }
            r0.<init>((java.util.List) r12, (java.util.List) r5)     // Catch:{ Exception -> 0x025b }
            goto L_0x0190
        L_0x018f:
            r0 = 0
        L_0x0190:
            if (r0 == 0) goto L_0x0193
            goto L_0x01a0
        L_0x0193:
            if (r18 != 0) goto L_0x019b
            lb r0 = new lb     // Catch:{ Exception -> 0x025b }
            r0.<init>((int) r8, (int) r11)     // Catch:{ Exception -> 0x025b }
            goto L_0x01a0
        L_0x019b:
            lb r0 = new lb     // Catch:{ Exception -> 0x025b }
            r0.<init>(r8, r3, r11)     // Catch:{ Exception -> 0x025b }
        L_0x01a0:
            r1 = 1
            if (r13 == r1) goto L_0x01c9
            r1 = 2
            if (r13 == r1) goto L_0x01bb
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x025b }
            int[] r2 = r0.a     // Catch:{ Exception -> 0x025b }
            float[] r0 = r0.b     // Catch:{ Exception -> 0x025b }
            android.graphics.Shader$TileMode r20 = defpackage.lc.a(r9)     // Catch:{ Exception -> 0x025b }
            r13 = r1
            r15 = r23
            r18 = r2
            r19 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x025b }
            goto L_0x01e9
        L_0x01bb:
            android.graphics.SweepGradient r1 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x025b }
            int[] r2 = r0.a     // Catch:{ Exception -> 0x025b }
            float[] r0 = r0.b     // Catch:{ Exception -> 0x025b }
            r4 = r20
            r3 = r22
            r1.<init>(r3, r4, r2, r0)     // Catch:{ Exception -> 0x025b }
            goto L_0x01e9
        L_0x01c9:
            r4 = r20
            r3 = r22
            r1 = 0
            int r1 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f6
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x025b }
            int[] r2 = r0.a     // Catch:{ Exception -> 0x025b }
            float[] r0 = r0.b     // Catch:{ Exception -> 0x025b }
            android.graphics.Shader$TileMode r24 = defpackage.lc.a(r9)     // Catch:{ Exception -> 0x025b }
            r18 = r1
            r19 = r3
            r20 = r4
            r22 = r2
            r23 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x025b }
        L_0x01e9:
            kv r0 = new kv     // Catch:{ Exception -> 0x025b }
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x01f3 }
            r2 = r0
            goto L_0x0265
        L_0x01f3:
            r0 = move-exception
            r5 = r2
            goto L_0x025d
        L_0x01f6:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025b }
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)     // Catch:{ Exception -> 0x025b }
            throw r0     // Catch:{ Exception -> 0x025b }
        L_0x01fe:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025b }
            r2.<init>()     // Catch:{ Exception -> 0x025b }
            java.lang.String r0 = r0.getPositionDescription()     // Catch:{ Exception -> 0x025b }
            r2.append(r0)     // Catch:{ Exception -> 0x025b }
            java.lang.String r0 = ": invalid gradient color tag "
            r2.append(r0)     // Catch:{ Exception -> 0x025b }
            r2.append(r7)     // Catch:{ Exception -> 0x025b }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x025b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025b }
            throw r1     // Catch:{ Exception -> 0x025b }
        L_0x021c:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025b }
            r2.<init>()     // Catch:{ Exception -> 0x025b }
            java.lang.String r0 = r0.getPositionDescription()     // Catch:{ Exception -> 0x025b }
            r2.append(r0)     // Catch:{ Exception -> 0x025b }
            java.lang.String r0 = ": unsupported complex color tag "
            r2.append(r0)     // Catch:{ Exception -> 0x025b }
            r2.append(r7)     // Catch:{ Exception -> 0x025b }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x025b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025b }
            throw r1     // Catch:{ Exception -> 0x025b }
        L_0x023a:
            android.content.res.ColorStateList r0 = defpackage.ku.a(r4, r0, r6, r1)     // Catch:{ Exception -> 0x025b }
            kv r1 = new kv     // Catch:{ Exception -> 0x025b }
            int r2 = r0.getDefaultColor()     // Catch:{ Exception -> 0x025b }
            r5 = 0
            r1.<init>(r5, r0, r2)     // Catch:{ Exception -> 0x0259 }
            r2 = r1
            goto L_0x0265
        L_0x024a:
            r5 = 0
            r2 = 1
            if (r7 == r2) goto L_0x0251
            r5 = 0
            goto L_0x003f
        L_0x0251:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0259 }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0259 }
            throw r0     // Catch:{ Exception -> 0x0259 }
        L_0x0259:
            r0 = move-exception
            goto L_0x025d
        L_0x025b:
            r0 = move-exception
            r5 = 0
        L_0x025d:
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r2 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r2, r0)
            r2 = r5
        L_0x0265:
            if (r2 != 0) goto L_0x0268
            goto L_0x0269
        L_0x0268:
            return r2
        L_0x0269:
            r1 = 0
            kv r0 = defpackage.kv.a((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):kv");
    }

    public static boolean a(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }
}
