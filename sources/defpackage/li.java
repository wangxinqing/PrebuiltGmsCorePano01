package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;

/* renamed from: li  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class li {
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, lg lgVar, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        return a(context, resources, typedValue, i, i2, lgVar, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r1.require(2, r12, "font-family");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r1.getName().equals("font-family") == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r2 = r0.obtainAttributes(android.util.Xml.asAttributeSet(r1), defpackage.er.b);
        r13 = r2.getString(0);
        r15 = r2.getString(4);
        r12 = r2.getString(5);
        r11 = r2.getResourceId(1, 0);
        r14 = r2.getInteger(2, 1);
        r6 = r2.getInteger(3, 500);
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r13 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        if (r15 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        if (r12 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r1.next() == 3) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        defpackage.la.a((org.xmlpull.v1.XmlPullParser) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        if (r11 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        r1 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r1 = r0.obtainTypedArray(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if (r1.length() == 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        r2 = new java.util.ArrayList();
        r7 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        if (r1.getType(0) == 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r2.add(defpackage.la.a(r0.getStringArray(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        if (r3 >= r1.length()) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        r11 = r1.getResourceId(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        if (r11 == 0) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ca, code lost:
        r2.add(defpackage.la.a(r0.getStringArray(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r2 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1.recycle();
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e0, code lost:
        r2 = new defpackage.kz(new defpackage.mw(r13, r15, r12, r1), r14, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
        if (r1.next() == 3) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0101, code lost:
        if (r1.getEventType() != 2) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010d, code lost:
        if (r1.getName().equals("font") == false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        r3 = r0.obtainAttributes(android.util.Xml.asAttributeSet(r1), defpackage.er.c);
        r11 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011f, code lost:
        if (r3.hasValue(8) != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0121, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0124, code lost:
        r18 = r3.getInt(r11, 400);
        r11 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012f, code lost:
        if (r3.hasValue(6) != false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013b, code lost:
        if (r3.getInt(r11, 0) != 1) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0140, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0142, code lost:
        r11 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0148, code lost:
        if (r3.hasValue(9) != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014a, code lost:
        r11 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014d, code lost:
        r12 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0152, code lost:
        if (r3.hasValue(7) != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0154, code lost:
        r12 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0157, code lost:
        r20 = r3.getString(r12);
        r21 = r3.getInt(r11, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0165, code lost:
        if (r3.hasValue(5) != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0167, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0169, code lost:
        r12 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016a, code lost:
        r22 = r3.getResourceId(r12, 0);
        r17 = r3.getString(r12);
        r3.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017b, code lost:
        if (r1.next() != 3) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017d, code lost:
        r2.add(new defpackage.ky(r17, r18, r19, r20, r21, r22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0189, code lost:
        defpackage.la.a((org.xmlpull.v1.XmlPullParser) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        defpackage.la.a((org.xmlpull.v1.XmlPullParser) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019c, code lost:
        if (r2.isEmpty() != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019e, code lost:
        r2 = new defpackage.kx((defpackage.ky[]) r2.toArray(new defpackage.ky[r2.size()]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b1, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b3, code lost:
        defpackage.la.a((org.xmlpull.v1.XmlPullParser) r1);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b7, code lost:
        if (r2 != null) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b9, code lost:
        android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
        r8.b(-3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d4, code lost:
        return defpackage.lp.a(r23, r2, r24, r26, r27, r28, r29);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface a(android.content.Context r23, android.content.res.Resources r24, android.util.TypedValue r25, int r26, int r27, defpackage.lg r28, boolean r29) {
        /*
            r0 = r24
            r1 = r25
            r4 = r26
            r5 = r27
            r8 = r28
            java.lang.String r2 = "font-family"
            java.lang.String r9 = "ResourcesCompat"
            java.lang.CharSequence r3 = r1.string
            if (r3 == 0) goto L_0x0230
            java.lang.CharSequence r1 = r1.string
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r10.startsWith(r1)
            r12 = 0
            if (r1 == 0) goto L_0x022a
            oi r1 = defpackage.lp.b
            java.lang.String r3 = defpackage.lp.a((android.content.res.Resources) r0, (int) r4, (int) r5)
            java.lang.Object r1 = r1.a((java.lang.Object) r3)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 != 0) goto L_0x0226
            java.lang.String r1 = r10.toLowerCase()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            java.lang.String r3 = ".xml"
            boolean r1 = r1.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r1 == 0) goto L_0x01e3
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
        L_0x003f:
            int r3 = r1.next()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r6 = 2
            r7 = 1
            if (r3 != r6) goto L_0x01d5
            r1.require(r6, r12, r2)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            java.lang.String r3 = r1.getName()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            boolean r2 = r3.equals(r2)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r2 == 0) goto L_0x01b3
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            int[] r3 = defpackage.er.b     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            android.content.res.TypedArray r2 = r0.obtainAttributes(r2, r3)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r3 = 0
            java.lang.String r13 = r2.getString(r3)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r14 = 4
            java.lang.String r15 = r2.getString(r14)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r14 = 5
            java.lang.String r12 = r2.getString(r14)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            int r11 = r2.getResourceId(r7, r3)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            int r14 = r2.getInteger(r6, r7)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r6 = 500(0x1f4, float:7.0E-43)
            r7 = 3
            int r6 = r2.getInteger(r7, r6)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r2.recycle()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r13 != 0) goto L_0x0083
            goto L_0x00f1
        L_0x0083:
            if (r15 == 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00f1
        L_0x0087:
            int r2 = r1.next()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r2 == r7) goto L_0x0091
            defpackage.la.a((org.xmlpull.v1.XmlPullParser) r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            goto L_0x0087
        L_0x0091:
            if (r11 != 0) goto L_0x0098
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            goto L_0x00e0
        L_0x0098:
            android.content.res.TypedArray r1 = r0.obtainTypedArray(r11)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            int r2 = r1.length()     // Catch:{ all -> 0x00ec }
            if (r2 == 0) goto L_0x00d8
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00ec }
            r2.<init>()     // Catch:{ all -> 0x00ec }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ec }
            int r7 = r1.getType(r3)     // Catch:{ all -> 0x00ec }
            r3 = 1
            if (r7 == r3) goto L_0x00bc
            java.lang.String[] r3 = r0.getStringArray(r11)     // Catch:{ all -> 0x00ec }
            java.util.List r3 = defpackage.la.a((java.lang.String[]) r3)     // Catch:{ all -> 0x00ec }
            r2.add(r3)     // Catch:{ all -> 0x00ec }
            goto L_0x00dc
        L_0x00bc:
            r3 = 0
        L_0x00bd:
            int r7 = r1.length()     // Catch:{ all -> 0x00ec }
            if (r3 >= r7) goto L_0x00dc
            r7 = 0
            int r11 = r1.getResourceId(r3, r7)     // Catch:{ all -> 0x00ec }
            if (r11 == 0) goto L_0x00d5
            java.lang.String[] r7 = r0.getStringArray(r11)     // Catch:{ all -> 0x00ec }
            java.util.List r7 = defpackage.la.a((java.lang.String[]) r7)     // Catch:{ all -> 0x00ec }
            r2.add(r7)     // Catch:{ all -> 0x00ec }
        L_0x00d5:
            int r3 = r3 + 1
            goto L_0x00bd
        L_0x00d8:
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00ec }
        L_0x00dc:
            r1.recycle()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r1 = r2
        L_0x00e0:
            kz r2 = new kz     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            mw r3 = new mw     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r3.<init>(r13, r15, r12, r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r2.<init>(r3, r14, r6)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            goto L_0x01b7
        L_0x00ec:
            r0 = move-exception
            r1.recycle()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            throw r0     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
        L_0x00f1:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
        L_0x00f6:
            int r3 = r1.next()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r3 == r7) goto L_0x0198
            int r3 = r1.getEventType()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r6 = 2
            if (r3 != r6) goto L_0x0194
            java.lang.String r3 = r1.getName()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            java.lang.String r11 = "font"
            boolean r3 = r3.equals(r11)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r3 == 0) goto L_0x018d
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            int[] r11 = defpackage.er.c     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            android.content.res.TypedArray r3 = r0.obtainAttributes(r3, r11)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r11 = 8
            boolean r12 = r3.hasValue(r11)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r12 != 0) goto L_0x0123
            r11 = 1
            goto L_0x0124
        L_0x0123:
        L_0x0124:
            r12 = 400(0x190, float:5.6E-43)
            int r18 = r3.getInt(r11, r12)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r11 = 6
            boolean r12 = r3.hasValue(r11)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r12 != 0) goto L_0x0133
            r11 = 2
            goto L_0x0134
        L_0x0133:
        L_0x0134:
            r12 = 0
            int r11 = r3.getInt(r11, r12)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r12 = 1
            if (r11 != r12) goto L_0x0140
            r19 = 1
            goto L_0x0142
        L_0x0140:
            r19 = 0
        L_0x0142:
            r11 = 9
            boolean r12 = r3.hasValue(r11)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r12 != 0) goto L_0x014c
            r11 = 3
            goto L_0x014d
        L_0x014c:
        L_0x014d:
            r12 = 7
            boolean r13 = r3.hasValue(r12)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r13 != 0) goto L_0x0156
            r12 = 4
            goto L_0x0157
        L_0x0156:
        L_0x0157:
            java.lang.String r20 = r3.getString(r12)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r12 = 0
            int r21 = r3.getInt(r11, r12)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r11 = 5
            boolean r12 = r3.hasValue(r11)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r12 != 0) goto L_0x0169
            r12 = 0
            goto L_0x016a
        L_0x0169:
            r12 = 5
        L_0x016a:
            r13 = 0
            int r22 = r3.getResourceId(r12, r13)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            java.lang.String r17 = r3.getString(r12)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r3.recycle()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
        L_0x0177:
            int r3 = r1.next()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r3 != r7) goto L_0x0189
            ky r3 = new ky     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            goto L_0x00f6
        L_0x0189:
            defpackage.la.a((org.xmlpull.v1.XmlPullParser) r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            goto L_0x0177
        L_0x018d:
            r11 = 5
            r13 = 0
            defpackage.la.a((org.xmlpull.v1.XmlPullParser) r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            goto L_0x00f6
        L_0x0194:
            r11 = 5
            r13 = 0
            goto L_0x00f6
        L_0x0198:
            boolean r1 = r2.isEmpty()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r1 != 0) goto L_0x01b1
            kx r1 = new kx     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            int r3 = r2.size()     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            ky[] r3 = new defpackage.ky[r3]     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            ky[] r2 = (defpackage.ky[]) r2     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r2 = r1
            goto L_0x01b7
        L_0x01b1:
            r2 = 0
            goto L_0x01b7
        L_0x01b3:
            defpackage.la.a((org.xmlpull.v1.XmlPullParser) r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r2 = 0
        L_0x01b7:
            if (r2 != 0) goto L_0x01c4
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r9, r0)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r1 = -3
            r8.b((int) r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            r1 = 0
            return r1
        L_0x01c4:
            r1 = r23
            r3 = r24
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            android.graphics.Typeface r0 = defpackage.lp.a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            return r0
        L_0x01d5:
            r6 = 1
            if (r3 == r6) goto L_0x01db
            r12 = 0
            goto L_0x003f
        L_0x01db:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            throw r0     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
        L_0x01e3:
            r1 = r23
            android.graphics.Typeface r0 = defpackage.lp.a(r1, r0, r4, r10, r5)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            if (r0 != 0) goto L_0x01f0
            r1 = -3
            r8.b((int) r1)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
            goto L_0x01f3
        L_0x01f0:
            r8.b((android.graphics.Typeface) r0)     // Catch:{ XmlPullParserException -> 0x020a, IOException -> 0x01f4 }
        L_0x01f3:
            return r0
        L_0x01f4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r9, r1, r0)
            goto L_0x021f
        L_0x020a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r9, r1, r0)
        L_0x021f:
            r1 = -3
            r8.b((int) r1)
            r2 = 0
            return r2
        L_0x0226:
            r8.b((android.graphics.Typeface) r1)
            return r1
        L_0x022a:
            r2 = r12
            r1 = -3
            r8.b((int) r1)
            return r2
        L_0x0230:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r26)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            goto L_0x0260
        L_0x025f:
            throw r2
        L_0x0260:
            goto L_0x025f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, lg, boolean):android.graphics.Typeface");
    }

    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        int i2 = Build.VERSION.SDK_INT;
        return resources.getDrawable(i, theme);
    }
}
