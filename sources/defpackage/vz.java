package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MenuInflater;

/* renamed from: vz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vz extends MenuInflater {
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public vz(Context context) {
        super(context);
        this.e = context;
        Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x020e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            vy r2 = new vy
            r3 = r19
            r2.<init>(r0, r3)
            int r3 = r17.getEventType()
        L_0x000f:
            java.lang.String r4 = "menu"
            r5 = 2
            r6 = 1
            if (r3 != r5) goto L_0x003b
            java.lang.String r3 = r17.getName()
            boolean r7 = r3.equals(r4)
            if (r7 == 0) goto L_0x0024
            int r3 = r17.next()
            goto L_0x0041
        L_0x0024:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Expecting menu, got "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x003b:
            int r3 = r17.next()
            if (r3 != r6) goto L_0x0262
        L_0x0041:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0045:
            if (r9 != 0) goto L_0x0261
            if (r3 == r6) goto L_0x0259
            java.lang.String r12 = "item"
            java.lang.String r13 = "group"
            r14 = 3
            if (r3 == r5) goto L_0x00c7
            if (r3 == r14) goto L_0x0058
            r12 = r17
            r5 = 0
            r7 = 2
            goto L_0x0252
        L_0x0058:
            java.lang.String r3 = r17.getName()
            if (r10 == 0) goto L_0x006c
            boolean r14 = r3.equals(r11)
            if (r14 == 0) goto L_0x006c
            r12 = r17
            r5 = 0
            r7 = 2
            r10 = 0
            r11 = 0
            goto L_0x0252
        L_0x006c:
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x007c
            r2.a()
            r12 = r17
            r5 = 0
            r7 = 2
            goto L_0x0252
        L_0x007c:
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x0090
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0094
            r12 = r17
            r5 = 0
            r7 = 2
            r9 = 1
            goto L_0x0252
        L_0x0090:
            boolean r3 = r2.h
            if (r3 == 0) goto L_0x009a
        L_0x0094:
            r12 = r17
            r5 = 0
            r7 = 2
            goto L_0x0252
        L_0x009a:
            pa r3 = r2.A
            if (r3 != 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x00ae
            r2.b()
            r12 = r17
            r5 = 0
            r7 = 2
            goto L_0x0252
        L_0x00ae:
            r2.h = r6
            android.view.Menu r3 = r2.a
            int r12 = r2.b
            int r13 = r2.i
            int r14 = r2.j
            java.lang.CharSequence r15 = r2.k
            android.view.MenuItem r3 = r3.add(r12, r13, r14, r15)
            r2.a((android.view.MenuItem) r3)
            r12 = r17
            r5 = 0
            r7 = 2
            goto L_0x0252
        L_0x00c7:
            if (r10 != 0) goto L_0x024e
            java.lang.String r3 = r17.getName()
            boolean r13 = r3.equals(r13)
            r15 = 5
            r7 = 4
            if (r13 != 0) goto L_0x0218
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x00f6
            boolean r7 = r3.equals(r4)
            if (r7 == 0) goto L_0x00ee
            android.view.SubMenu r3 = r2.b()
            r12 = r17
            r0.a(r12, r1, r3)
            r5 = 0
            r7 = 2
            goto L_0x0252
        L_0x00ee:
            r12 = r17
            r11 = r3
            r5 = 0
            r7 = 2
            r10 = 1
            goto L_0x0252
        L_0x00f6:
            r12 = r17
            vz r3 = r2.F
            android.content.Context r3 = r3.e
            int[] r13 = defpackage.uh.r
            aev r3 = defpackage.aev.a((android.content.Context) r3, (android.util.AttributeSet) r1, (int[]) r13)
            int r13 = r3.f(r5, r8)
            r2.i = r13
            int r13 = r2.c
            int r13 = r3.a((int) r15, (int) r13)
            r15 = -65536(0xffffffffffff0000, float:NaN)
            r13 = r13 & r15
            r15 = 6
            int r5 = r2.d
            int r5 = r3.a((int) r15, (int) r5)
            char r5 = (char) r5
            r5 = r5 | r13
            r2.j = r5
            r5 = 7
            java.lang.CharSequence r5 = r3.c(r5)
            r2.k = r5
            r5 = 8
            java.lang.CharSequence r5 = r3.c(r5)
            r2.l = r5
            int r5 = r3.f(r8, r8)
            r2.m = r5
            r5 = 9
            java.lang.String r5 = r3.d(r5)
            char r5 = defpackage.vy.a((java.lang.String) r5)
            r2.n = r5
            r5 = 16
            r13 = 4096(0x1000, float:5.74E-42)
            int r5 = r3.a((int) r5, (int) r13)
            r2.o = r5
            r5 = 10
            java.lang.String r5 = r3.d(r5)
            char r5 = defpackage.vy.a((java.lang.String) r5)
            r2.p = r5
            r5 = 20
            int r5 = r3.a((int) r5, (int) r13)
            r2.q = r5
            r5 = 11
            boolean r13 = r3.f(r5)
            if (r13 == 0) goto L_0x016a
            boolean r5 = r3.a((int) r5, (boolean) r8)
            r2.r = r5
            goto L_0x016e
        L_0x016a:
            int r5 = r2.e
            r2.r = r5
        L_0x016e:
            boolean r5 = r3.a((int) r14, (boolean) r8)
            r2.s = r5
            boolean r5 = r2.f
            boolean r5 = r3.a((int) r7, (boolean) r5)
            r2.t = r5
            boolean r5 = r2.g
            boolean r5 = r3.a((int) r6, (boolean) r5)
            r2.u = r5
            r5 = 21
            r7 = -1
            int r5 = r3.a((int) r5, (int) r7)
            r2.v = r5
            r5 = 12
            java.lang.String r5 = r3.d(r5)
            r2.z = r5
            r5 = 13
            int r5 = r3.f(r5, r8)
            r2.w = r5
            r5 = 15
            java.lang.String r5 = r3.d(r5)
            r2.x = r5
            r5 = 14
            java.lang.String r5 = r3.d(r5)
            r2.y = r5
            java.lang.String r5 = r2.y
            if (r5 == 0) goto L_0x01d2
            int r13 = r2.w
            if (r13 == 0) goto L_0x01b7
            goto L_0x01ca
        L_0x01b7:
            java.lang.String r13 = r2.x
            if (r13 != 0) goto L_0x01ca
            java.lang.Class[] r13 = b
            vz r14 = r2.F
            java.lang.Object[] r14 = r14.d
            java.lang.Object r5 = r2.a(r5, r13, r14)
            pa r5 = (defpackage.pa) r5
            r2.A = r5
            goto L_0x01d5
        L_0x01ca:
            java.lang.String r5 = "SupportMenuInflater"
            java.lang.String r13 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r5, r13)
        L_0x01d2:
            r5 = 0
            r2.A = r5
        L_0x01d5:
            r5 = 17
            java.lang.CharSequence r5 = r3.c(r5)
            r2.B = r5
            r5 = 22
            java.lang.CharSequence r5 = r3.c(r5)
            r2.C = r5
            r5 = 19
            boolean r13 = r3.f(r5)
            if (r13 == 0) goto L_0x01fa
            int r5 = r3.a((int) r5, (int) r7)
            android.graphics.PorterDuff$Mode r7 = r2.E
            android.graphics.PorterDuff$Mode r5 = defpackage.aak.a(r5, r7)
            r2.E = r5
            goto L_0x01fd
        L_0x01fa:
            r5 = 0
            r2.E = r5
        L_0x01fd:
            r5 = 18
            boolean r7 = r3.f(r5)
            if (r7 == 0) goto L_0x020e
            android.content.res.ColorStateList r5 = r3.e(r5)
            r2.D = r5
            r5 = 0
            goto L_0x0211
        L_0x020e:
            r5 = 0
            r2.D = r5
        L_0x0211:
            r3.a()
            r2.h = r8
            r7 = 2
            goto L_0x0252
        L_0x0218:
            r12 = r17
            r5 = 0
            vz r3 = r2.F
            android.content.Context r3 = r3.e
            int[] r13 = defpackage.uh.q
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r1, r13)
            int r13 = r3.getResourceId(r6, r8)
            r2.b = r13
            int r13 = r3.getInt(r14, r8)
            r2.c = r13
            int r7 = r3.getInt(r7, r8)
            r2.d = r7
            int r7 = r3.getInt(r15, r8)
            r2.e = r7
            r7 = 2
            boolean r13 = r3.getBoolean(r7, r6)
            r2.f = r13
            boolean r13 = r3.getBoolean(r8, r6)
            r2.g = r13
            r3.recycle()
            goto L_0x0252
        L_0x024e:
            r12 = r17
            r5 = 0
            r7 = 2
        L_0x0252:
            int r3 = r17.next()
            r5 = 2
            goto L_0x0045
        L_0x0259:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected end of document"
            r1.<init>(r2)
            throw r1
        L_0x0261:
            return
        L_0x0262:
            r12 = r17
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(int r4, android.view.Menu r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r5 instanceof defpackage.mh
            if (r1 == 0) goto L_0x0039
            r1 = 0
            android.content.Context r2 = r3.e     // Catch:{ XmlPullParserException -> 0x002b, IOException -> 0x0024, all -> 0x0022 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ XmlPullParserException -> 0x002b, IOException -> 0x0024, all -> 0x0022 }
            android.content.res.XmlResourceParser r1 = r2.getLayout(r4)     // Catch:{ XmlPullParserException -> 0x002b, IOException -> 0x0024, all -> 0x0022 }
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r1)     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001e }
            r3.a(r1, r4, r5)     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001e }
            if (r1 == 0) goto L_0x001d
            r1.close()
        L_0x001d:
            return
        L_0x001e:
            r4 = move-exception
            goto L_0x0025
        L_0x0020:
            r4 = move-exception
            goto L_0x002c
        L_0x0022:
            r4 = move-exception
            goto L_0x0033
        L_0x0024:
            r4 = move-exception
        L_0x0025:
            android.view.InflateException r5 = new android.view.InflateException     // Catch:{ all -> 0x0032 }
            r5.<init>(r0, r4)     // Catch:{ all -> 0x0032 }
            throw r5     // Catch:{ all -> 0x0032 }
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            android.view.InflateException r5 = new android.view.InflateException     // Catch:{ all -> 0x0032 }
            r5.<init>(r0, r4)     // Catch:{ all -> 0x0032 }
            throw r5     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r4 = move-exception
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.close()
        L_0x0038:
            throw r4
        L_0x0039:
            super.inflate(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz.inflate(int, android.view.Menu):void");
    }

    public final Object a(Object obj) {
        return ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) ? obj : a(((ContextWrapper) obj).getBaseContext());
    }
}
