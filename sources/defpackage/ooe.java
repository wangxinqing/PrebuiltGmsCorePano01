package defpackage;

import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Calendar;

/* renamed from: ooe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ooe extends nzj {
    public static final /* synthetic */ int e = 0;
    private final HelpChimeraActivity f;
    private final ofn g;
    private final oab h;
    private final nzv i;
    private final boolean j;
    private boolean k;
    private final boolean l;
    private final Calendar m;
    private final boolean n = true;

    public ooe(HelpChimeraActivity helpChimeraActivity, oab oab, nzv nzv, boolean z, Calendar calendar) {
        this(helpChimeraActivity, oab, nzv, z, false, true, calendar);
    }

    public static myp a(HelpConfig helpConfig) {
        if (!helpConfig.A()) {
            return null;
        }
        myp myp = new myp(helpConfig.S);
        myp.c();
        return myp;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f.a(this.h, (nzv) obj, this.l);
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return jkf.a(this.f);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r0 != false) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r8) {
        /*
            r7 = this;
            java.lang.Void[] r8 = (java.lang.Void[]) r8
            oab r8 = r7.h
            boolean r8 = r8.q
            r0 = 1
            if (r8 != 0) goto L_0x0010
            boolean r8 = r7.d()
            if (r8 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r7.k = r0
        L_0x0012:
            boolean r8 = r7.k
            r1 = 0
            if (r8 != 0) goto L_0x0043
            oab r8 = r7.h
            oab r8 = r7.a((defpackage.oab) r8)
            if (r8 != 0) goto L_0x0022
            r2 = 0
            r3 = 1
            goto L_0x0046
        L_0x0022:
            boolean r2 = r8.i()
            if (r2 != 0) goto L_0x003b
            ofn r2 = r7.g
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r3 = r7.f
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r3.x
            java.lang.String r3 = r3.b
            r2.a((defpackage.oab) r8, (java.lang.String) r3)
            oab r2 = r7.h
            java.lang.String r3 = r8.l
            r2.l = r3
            r2 = 1
            goto L_0x003e
        L_0x003b:
            r7.k = r0
            r2 = 0
        L_0x003e:
            oab r3 = r7.h
            r3.q = r0
            goto L_0x0045
        L_0x0043:
            r8 = 0
            r2 = 0
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r8 != 0) goto L_0x0049
            goto L_0x0050
        L_0x0049:
            boolean r4 = r7.k
            if (r4 != 0) goto L_0x0050
            r0 = r2
            goto L_0x00d7
        L_0x0050:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r4 = r7.f
            r5 = 2130969219(0x7f040283, float:1.7547114E38)
            boolean r4 = defpackage.ofy.b(r4, r5)
            oab r5 = r7.h
            java.lang.String r5 = r5.b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0076
            ofn r8 = r7.g
            oab r5 = r7.h
            java.lang.String r5 = r5.d()
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r6 = r7.f
            com.google.android.gms.googlehelp.common.HelpConfig r6 = r6.x
            java.lang.String r6 = r6.b
            oab r8 = r8.a(r5, r6, r4)
            goto L_0x0086
        L_0x0076:
            boolean r5 = defpackage.axnz.b()
            if (r5 == 0) goto L_0x0086
            ofn r8 = r7.g
            oab r5 = r7.h
            java.lang.String r5 = r5.e
            oab r8 = r8.a((java.lang.String) r5, (boolean) r4)
        L_0x0086:
            boolean r4 = r7.k
            if (r4 != 0) goto L_0x008b
            goto L_0x00d6
        L_0x008b:
            if (r8 == 0) goto L_0x008e
            goto L_0x00d6
        L_0x008e:
            boolean r4 = r7.d()
            if (r4 == 0) goto L_0x00d5
            oab r8 = r7.h
            java.lang.String r8 = r8.b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r2 = "Failed to read the leaf content from database: "
            int r4 = r8.length()
            if (r4 != 0) goto L_0x00aa
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2)
            goto L_0x00ae
        L_0x00aa:
            java.lang.String r8 = r2.concat(r8)
        L_0x00ae:
            java.lang.String r2 = "gH_GetLeafContentTask"
            android.util.Log.w(r2, r8)
            oab r8 = r7.h
            java.lang.String r2 = ""
            r8.l = r2
            oab r8 = r7.a((defpackage.oab) r8)
            if (r8 == 0) goto L_0x00d1
            ofn r2 = r7.g
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r4 = r7.f
            com.google.android.gms.googlehelp.common.HelpConfig r4 = r4.x
            java.lang.String r4 = r4.b
            r2.a((defpackage.oab) r8, (java.lang.String) r4)
            oab r2 = r7.h
            java.lang.String r4 = r8.l
            r2.l = r4
            goto L_0x00d2
        L_0x00d1:
            r3 = 1
        L_0x00d2:
            r7.k = r1
            goto L_0x00d7
        L_0x00d5:
        L_0x00d6:
            r0 = r2
        L_0x00d7:
            if (r8 == 0) goto L_0x00fb
            oab r0 = r7.h
            java.util.Calendar r1 = r7.m
            long r1 = r1.getTimeInMillis()
            r0.m = r1
            oab r0 = r7.h
            java.lang.String r0 = r0.d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ee
        L_0x00ed:
            goto L_0x00fd
        L_0x00ee:
            boolean r0 = r8.i()
            if (r0 != 0) goto L_0x00ed
            oab r0 = r7.h
            java.lang.String r1 = r8.d
            r0.d = r1
            goto L_0x00fd
        L_0x00fb:
            if (r0 == 0) goto L_0x010a
        L_0x00fd:
            ofn r0 = r7.g
            oab r1 = r7.h
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r2 = r7.f
            com.google.android.gms.googlehelp.common.HelpConfig r2 = r2.x
            java.lang.String r2 = r2.b
            r0.a((defpackage.oab) r1, (java.lang.String) r2)
        L_0x010a:
            boolean r0 = r7.k
            if (r0 == 0) goto L_0x011b
            nzv r0 = r7.i
            int r1 = r0.i
            r2 = 11
            if (r1 == r2) goto L_0x0117
            goto L_0x011b
        L_0x0117:
            r1 = 12
            r0.i = r1
        L_0x011b:
            nzv r0 = r7.i
            r0.a(r8)
            r0.f = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooe.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public ooe(HelpChimeraActivity helpChimeraActivity, oab oab, nzv nzv, boolean z, boolean z2, boolean z3, Calendar calendar) {
        super(helpChimeraActivity);
        this.f = helpChimeraActivity;
        this.g = helpChimeraActivity.k;
        this.h = oab;
        this.i = nzv;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = calendar;
    }

    public static void a(HelpChimeraActivity helpChimeraActivity, oab oab, int i2, int i3) {
        a(helpChimeraActivity, oab, i2, i3, (String) null);
    }

    public static void a(HelpChimeraActivity helpChimeraActivity, oab oab, int i2, int i3, String str) {
        String str2;
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        myp myp = new myp();
        myp.c();
        new ooe(helpChimeraActivity, oab, nzv.a(i2, i3, str2, -1.0f, false, 11, myp), helpChimeraActivity.L(), false, true, Calendar.getInstance()).executeOnExecutor(helpChimeraActivity.d, new Void[0]);
    }

    /* access modifiers changed from: package-private */
    public final oab a(oab oab) {
        if (this.n) {
            return omp.a(this.f, oab);
        }
        HelpChimeraActivity helpChimeraActivity = this.f;
        return omu.a(helpChimeraActivity, oab, false, helpChimeraActivity.d);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        HelpChimeraActivity helpChimeraActivity = this.f;
        if (this.j) {
            helpChimeraActivity.c((nzj) this);
        }
        helpChimeraActivity.y();
    }
}
