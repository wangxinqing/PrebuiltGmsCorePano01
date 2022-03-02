package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: uq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uq extends uy implements mb {
    private ul d;
    private up e;
    private int f;
    private int g;
    private boolean h;

    static {
        uq.class.getSimpleName();
    }

    public uq() {
        this((ul) null, (Resources) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012a, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r19.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.uq a(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            java.lang.String r4 = r19.getName()
            java.lang.String r5 = "animated-selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0215
            uq r4 = new uq
            r5 = 0
            r4.<init>(r5, r5)
            int[] r6 = defpackage.vc.a
            android.content.res.TypedArray r6 = defpackage.lj.a((android.content.res.Resources) r1, (android.content.res.Resources.Theme) r3, (android.util.AttributeSet) r2, (int[]) r6)
            r7 = 1
            boolean r8 = r6.getBoolean(r7, r7)
            r4.setVisible(r8, r7)
            ul r8 = r4.d
            int r9 = android.os.Build.VERSION.SDK_INT
            int r9 = r8.f
            int r10 = r6.getChangingConfigurations()
            r9 = r9 | r10
            r8.f = r9
            boolean r9 = r8.k
            r10 = 2
            boolean r9 = r6.getBoolean(r10, r9)
            r8.k = r9
            boolean r9 = r8.n
            r11 = 3
            boolean r9 = r6.getBoolean(r11, r9)
            r8.n = r9
            int r9 = r8.B
            r12 = 4
            int r9 = r6.getInt(r12, r9)
            r8.B = r9
            r9 = 5
            int r13 = r8.C
            int r9 = r6.getInt(r9, r13)
            r8.C = r9
            boolean r8 = r8.z
            r9 = 0
            boolean r8 = r6.getBoolean(r9, r8)
            r4.setDither(r8)
            ut r8 = r4.a
            r8.a((android.content.res.Resources) r1)
            r6.recycle()
            int r6 = r19.getDepth()
            int r6 = r6 + r7
        L_0x0070:
            int r8 = r19.next()
            if (r8 == r7) goto L_0x020d
            int r13 = r19.getDepth()
            if (r13 >= r6) goto L_0x007e
            if (r8 == r11) goto L_0x020d
        L_0x007e:
            if (r8 != r10) goto L_0x0207
            if (r13 > r6) goto L_0x0207
            java.lang.String r8 = r19.getName()
            java.lang.String r13 = "item"
            boolean r8 = r8.equals(r13)
            r13 = -1
            if (r8 != 0) goto L_0x0149
            java.lang.String r8 = r19.getName()
            java.lang.String r14 = "transition"
            boolean r8 = r8.equals(r14)
            if (r8 == 0) goto L_0x0144
            int[] r8 = defpackage.vc.c
            android.content.res.TypedArray r8 = defpackage.lj.a((android.content.res.Resources) r1, (android.content.res.Resources.Theme) r3, (android.util.AttributeSet) r2, (int[]) r8)
            int r14 = r8.getResourceId(r10, r13)
            int r15 = r8.getResourceId(r7, r13)
            int r5 = r8.getResourceId(r9, r13)
            if (r5 <= 0) goto L_0x00b8
            ads r7 = defpackage.ads.a()
            android.graphics.drawable.Drawable r5 = r7.a((android.content.Context) r0, (int) r5)
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            boolean r7 = r8.getBoolean(r11, r9)
            r8.recycle()
            java.lang.String r8 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L_0x0100
        L_0x00c5:
            int r5 = r19.next()
            if (r5 == r12) goto L_0x00fe
            if (r5 != r10) goto L_0x00e5
            java.lang.String r5 = r19.getName()
            java.lang.String r11 = "animated-vector"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x00de
            ass r5 = defpackage.ass.a(r17, r18, r19, r20, r21)
            goto L_0x0100
        L_0x00de:
            int r5 = android.os.Build.VERSION.SDK_INT
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21)
            goto L_0x0100
        L_0x00e5:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r19.getPositionDescription()
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            r11 = 3
            goto L_0x00c5
        L_0x0100:
            if (r5 == 0) goto L_0x012b
            if (r14 == r13) goto L_0x0110
            if (r15 == r13) goto L_0x0110
            ul r8 = r4.d
            r8.a(r14, r15, r5, r7)
            r5 = 0
            r7 = 1
            r11 = 3
            goto L_0x0070
        L_0x0110:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r19.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x012b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r19.getPositionDescription()
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0144:
            r5 = 0
            r7 = 1
            r11 = 3
            goto L_0x0070
        L_0x0149:
            int[] r5 = defpackage.vc.b
            android.content.res.TypedArray r5 = defpackage.lj.a((android.content.res.Resources) r1, (android.content.res.Resources.Theme) r3, (android.util.AttributeSet) r2, (int[]) r5)
            int r7 = r5.getResourceId(r9, r9)
            r8 = 1
            int r11 = r5.getResourceId(r8, r13)
            if (r11 <= 0) goto L_0x0163
            ads r13 = defpackage.ads.a()
            android.graphics.drawable.Drawable r11 = r13.a((android.content.Context) r0, (int) r11)
            goto L_0x0164
        L_0x0163:
            r11 = 0
        L_0x0164:
            r5.recycle()
            int r5 = r20.getAttributeCount()
            int[] r13 = new int[r5]
            r14 = 0
            r15 = 0
        L_0x016f:
            if (r14 < r5) goto L_0x01e5
            int[] r5 = android.util.StateSet.trimStateSet(r13, r15)
            java.lang.String r13 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r11 != 0) goto L_0x01b2
        L_0x0179:
            int r11 = r19.next()
            if (r11 == r12) goto L_0x0179
            if (r11 != r10) goto L_0x0199
            java.lang.String r11 = r19.getName()
            java.lang.String r14 = "vector"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0192
            atg r11 = defpackage.atg.a(r18, r19, r20, r21)
            goto L_0x01b2
        L_0x0192:
            int r11 = android.os.Build.VERSION.SDK_INT
            android.graphics.drawable.Drawable r11 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21)
            goto L_0x01b2
        L_0x0199:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r19.getPositionDescription()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b2:
            if (r11 == 0) goto L_0x01cc
            ul r13 = r4.d
            int r11 = r13.a((android.graphics.drawable.Drawable) r11)
            int[][] r14 = r13.K
            r14[r11] = r5
            ov r5 = r13.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.b(r11, r7)
            r5 = 0
            r7 = 1
            r11 = 3
            goto L_0x0070
        L_0x01cc:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r19.getPositionDescription()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01e5:
            int r8 = r2.getAttributeNameResource(r14)
            if (r8 == 0) goto L_0x0201
            r10 = 16842960(0x10100d0, float:2.369414E-38)
            if (r8 == r10) goto L_0x0201
            r10 = 16843161(0x1010199, float:2.3694704E-38)
            if (r8 == r10) goto L_0x0201
            int r10 = r15 + 1
            boolean r16 = r2.getAttributeBooleanValue(r14, r9)
            if (r16 != 0) goto L_0x01fe
            int r8 = -r8
        L_0x01fe:
            r13[r15] = r8
            r15 = r10
        L_0x0201:
            int r14 = r14 + 1
            r8 = 1
            r10 = 2
            goto L_0x016f
        L_0x0207:
            r5 = 0
            r7 = 1
            r10 = 2
            r11 = 3
            goto L_0x0070
        L_0x020d:
            int[] r0 = r4.getState()
            r4.onStateChange(r0)
            return r4
        L_0x0215:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r19.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x0234
        L_0x0233:
            throw r0
        L_0x0234:
            goto L_0x0233
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.a(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):uq");
    }

    public final boolean isStateful() {
        return true;
    }

    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        up upVar = this.e;
        if (upVar != null) {
            upVar.b();
            this.e = null;
            a(this.f);
            this.f = -1;
            this.g = -1;
        }
    }

    public final Drawable mutate() {
        if (!this.h) {
            super.mutate();
            this.d.a();
            this.h = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int longValue;
        boolean z;
        up upVar;
        int[] iArr2 = iArr;
        int a = this.d.a(iArr2);
        int i = this.c;
        boolean z2 = false;
        if (a != i) {
            up upVar2 = this.e;
            if (upVar2 != null) {
                if (a != this.f) {
                    if (a == this.g && upVar2.c()) {
                        upVar2.d();
                        this.f = this.g;
                        this.g = a;
                    } else {
                        i = this.f;
                        upVar2.b();
                    }
                }
                z2 = true;
            }
            this.e = null;
            this.g = -1;
            this.f = -1;
            ul ulVar = this.d;
            int a2 = ulVar.a(i);
            int a3 = ulVar.a(a);
            if (!(a3 == 0 || a2 == 0 || (longValue = (int) ((Long) ulVar.a.a(ul.a(a2, a3), -1L)).longValue()) < 0)) {
                if ((((Long) ulVar.a.a(ul.a(a2, a3), -1L)).longValue() & 8589934592L) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                a(longValue);
                Drawable drawable = this.b;
                if (drawable instanceof AnimationDrawable) {
                    if ((((Long) ulVar.a.a(ul.a(a2, a3), -1L)).longValue() & 4294967296L) != 0) {
                        z2 = true;
                    }
                    upVar = new un((AnimationDrawable) drawable, z2, z);
                } else if (drawable instanceof ass) {
                    upVar = new um((ass) drawable);
                } else if (drawable instanceof Animatable) {
                    upVar = new uk((Animatable) drawable);
                }
                upVar.a();
                this.e = upVar;
                this.g = i;
                this.f = a;
                z2 = true;
            }
            if (a(a)) {
                z2 = true;
            }
        }
        Drawable drawable2 = this.b;
        return drawable2 != null ? drawable2.setState(iArr2) | z2 : z2;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        up upVar = this.e;
        if (upVar != null && (visible || z2)) {
            if (z) {
                upVar.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public uq(ul ulVar, Resources resources) {
        super((byte[]) null);
        this.f = -1;
        this.g = -1;
        a((ut) new ul(ulVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ul c() {
        return new ul(this.d, this, (Resources) null);
    }

    public final void a(ut utVar) {
        super.a(utVar);
        if (utVar instanceof ul) {
            this.d = (ul) utVar;
        }
    }
}
