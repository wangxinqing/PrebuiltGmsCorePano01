package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ku {
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return a(resources, xmlPullParser, asAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARNING: type inference failed for: r10v10, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = r18.getName()
            java.lang.String r3 = "selector"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0102
            int r2 = r18.getDepth()
            r3 = 1
            int r2 = r2 + r3
            r4 = 20
            int[][] r5 = new int[r4][]
            int[] r4 = new int[r4]
            r6 = 0
            r7 = 0
        L_0x001e:
            int r8 = r18.next()
            if (r8 == r3) goto L_0x00f2
            int r9 = r18.getDepth()
            if (r9 >= r2) goto L_0x002d
            r10 = 3
            if (r8 == r10) goto L_0x00f2
        L_0x002d:
            r10 = 2
            if (r8 != r10) goto L_0x00ed
            if (r9 > r2) goto L_0x00ed
            java.lang.String r8 = r18.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00ea
            int[] r8 = defpackage.er.a
            if (r1 != 0) goto L_0x0049
            r9 = r17
            android.content.res.TypedArray r8 = r9.obtainAttributes(r0, r8)
            goto L_0x004f
        L_0x0049:
            r9 = r17
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r0, r8, r6, r6)
        L_0x004f:
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r11 = r8.getColor(r6, r11)
            boolean r12 = r8.hasValue(r3)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x0063
            float r13 = r8.getFloat(r3, r13)
            goto L_0x0070
        L_0x0063:
            boolean r12 = r8.hasValue(r10)
            if (r12 == 0) goto L_0x006f
            float r13 = r8.getFloat(r10, r13)
            goto L_0x0070
        L_0x006f:
        L_0x0070:
            r8.recycle()
            int r8 = r19.getAttributeCount()
            int[] r10 = new int[r8]
            r12 = 0
            r14 = 0
        L_0x007b:
            if (r12 < r8) goto L_0x00c6
            int[] r8 = android.util.StateSet.trimStateSet(r10, r14)
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r11 = android.graphics.Color.alpha(r11)
            float r11 = (float) r11
            float r11 = r11 * r13
            int r11 = java.lang.Math.round(r11)
            int r11 = r11 << 24
            r10 = r10 | r11
            int r11 = r7 + 1
            int r12 = r4.length
            if (r11 <= r12) goto L_0x00a2
            int r12 = defpackage.ld.a(r7)
            int[] r12 = new int[r12]
            java.lang.System.arraycopy(r4, r6, r12, r6, r7)
            r4 = r12
        L_0x00a2:
            r4[r7] = r10
            int r10 = r5.length
            if (r11 <= r10) goto L_0x00bf
            java.lang.Class r10 = r5.getClass()
            java.lang.Class r10 = r10.getComponentType()
            int r12 = defpackage.ld.a(r7)
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r10, r12)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.System.arraycopy(r5, r6, r10, r6, r7)
            r5 = r10
        L_0x00bf:
            r5[r7] = r8
            int[][] r5 = (int[][]) r5
            r7 = r11
            goto L_0x001e
        L_0x00c6:
            int r15 = r0.getAttributeNameResource(r12)
            r3 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 != r3) goto L_0x00d0
        L_0x00cf:
            goto L_0x00e6
        L_0x00d0:
            r3 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r3) goto L_0x00cf
            r3 = 2130968635(0x7f04003b, float:1.754593E38)
            if (r15 == r3) goto L_0x00cf
            int r3 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r12, r6)
            if (r16 != 0) goto L_0x00e3
            int r15 = -r15
        L_0x00e3:
            r10[r14] = r15
            r14 = r3
        L_0x00e6:
            int r12 = r12 + 1
            r3 = 1
            goto L_0x007b
        L_0x00ea:
            r9 = r17
            goto L_0x00ef
        L_0x00ed:
            r9 = r17
        L_0x00ef:
            r3 = 1
            goto L_0x001e
        L_0x00f2:
            int[] r0 = new int[r7]
            int[][] r1 = new int[r7][]
            java.lang.System.arraycopy(r4, r6, r0, r6, r7)
            java.lang.System.arraycopy(r5, r6, r1, r6, r7)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0102:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r18.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = ": invalid color state list tag "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x0121
        L_0x0120:
            throw r0
        L_0x0121:
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
