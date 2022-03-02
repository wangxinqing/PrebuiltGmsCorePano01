package com.google.android.gms.smart_profile;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmartProfileChimeraActivity extends bjs implements abfw {
    public ClientContext a;
    public boolean b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public Integer g;
    public int h;
    public auuv i = auuv.UNKNOWN_APPLICATION;
    public String j;
    public boolean k;
    public boolean l;
    public abgj m;
    public Toolbar n;
    private abgt o;

    static {
        sv.n();
    }

    public final void b() {
        if (!azim.b()) {
            a(true);
        } else if (getResources().getConfiguration().orientation == 2) {
            a(true);
        }
    }

    public final void c() {
        if (!azim.b()) {
            a(false);
        } else if (getResources().getConfiguration().orientation == 2) {
            a(false);
        }
    }

    public final void d() {
        if (azim.b()) {
            a(true);
        }
    }

    public final void e() {
        if (azim.b()) {
            a(false);
        }
    }

    public final void f() {
        SmartProfileContainerView smartProfileContainerView = this.o.d;
        if (smartProfileContainerView != null) {
            smartProfileContainerView.c();
        }
    }

    public final void finish() {
        abgt abgt = this.o;
        super.finish();
        abgt.o.overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        abgt abgt = this.o;
        if (i2 == 1 || i2 == 2) {
            abmb abmb = abgt.m;
            abmb.a.restartLoader(9, (Bundle) null, new ablz(abmb, new abgs(abgt)));
        }
    }

    public final void onBackPressed() {
        f();
    }

    /* JADX WARNING: type inference failed for: r0v40, types: [aucj] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r1 = r33
            r0 = r34
            super.onCreate(r34)
            boolean r2 = defpackage.azim.b()
            if (r2 == 0) goto L_0x0020
            boolean r2 = defpackage.azig.b()
            if (r2 == 0) goto L_0x001a
            r2 = 2132017798(0x7f140286, float:1.9673885E38)
            r1.setTheme(r2)
            goto L_0x0020
        L_0x001a:
            r2 = 2132017797(0x7f140285, float:1.9673883E38)
            r1.setTheme(r2)
        L_0x0020:
            abgt r14 = new abgt
            r14.<init>(r1)
            r1.o = r14
            boolean r2 = defpackage.azim.b()
            if (r2 == 0) goto L_0x004b
            azho r2 = defpackage.azho.a
            azhp r2 = r2.a()
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0042
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            r3 = 2131624476(0x7f0e021c, float:1.8876133E38)
            r2.setContentView((int) r3)
            goto L_0x0053
        L_0x0042:
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            r3 = 2131624475(0x7f0e021b, float:1.887613E38)
            r2.setContentView((int) r3)
            goto L_0x0053
        L_0x004b:
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            r3 = 2131624819(0x7f0e0373, float:1.8876828E38)
            r2.setContentView((int) r3)
        L_0x0053:
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            int r3 = android.os.Build.VERSION.SDK_INT
            r3 = 2131429513(0x7f0b0889, float:1.84807E38)
            android.view.View r2 = r2.findViewById(r3)
            r3 = 2
            r2.setImportantForAccessibility(r3)
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            r4 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r2 = r2.findViewById(r4)
            com.google.android.gms.smart_profile.SmartProfileContainerView r2 = (com.google.android.gms.smart_profile.SmartProfileContainerView) r2
            r14.d = r2
            com.google.android.gms.smart_profile.SmartProfileContainerView r2 = r14.d
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r4 = r14.o
            r2.g = r4
            r2 = 2131428631(0x7f0b0517, float:1.8478912E38)
            android.view.View r2 = r4.findViewById(r2)
            com.google.android.gms.smart_profile.header.view.HeaderView r2 = (com.google.android.gms.smart_profile.header.view.HeaderView) r2
            r14.e = r2
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            r15 = 0
            r2.overridePendingTransition(r15, r15)
            android.content.Intent r4 = r2.getIntent()
            azij r5 = defpackage.azij.a
            azik r5 = r5.a()
            r5.a()
            java.lang.String r5 = defpackage.jhg.a((com.google.android.chimera.Activity) r2)
            r2.f = r5
            hya r5 = defpackage.hya.a((android.content.Context) r2)
            java.lang.String r6 = r2.f
            boolean r5 = r5.b((java.lang.String) r6)
            if (r5 == 0) goto L_0x08e4
            java.lang.String r5 = "com.google.android.gms.people.smart_profile.CALLING_PACKAGE"
            boolean r6 = r4.hasExtra(r5)
            if (r6 == 0) goto L_0x00b3
            java.lang.String r5 = r4.getStringExtra(r5)
            r2.f = r5
        L_0x00b3:
            auuv r5 = defpackage.auuv.THIRD_PARTY
            r2.i = r5
            java.lang.String r5 = "com.google.android.gms.people.smart_profile.APPLICATION_ID"
            boolean r6 = r4.hasExtra(r5)
            if (r6 == 0) goto L_0x08db
            int r5 = r4.getIntExtra(r5, r15)
            auuv r5 = defpackage.auuv.a(r5)
            r2.i = r5
            if (r5 == 0) goto L_0x00cc
            goto L_0x00d0
        L_0x00cc:
            auuv r5 = defpackage.auuv.UNKNOWN_APPLICATION
            r2.i = r5
        L_0x00d0:
            java.lang.Integer r5 = defpackage.jpr.a((android.content.Intent) r4)
            r2.g = r5
            boolean r5 = defpackage.azim.b()
            if (r5 == 0) goto L_0x00e3
            int r5 = defpackage.jsa.a(r2)
            r2.h = r5
            goto L_0x00fe
        L_0x00e3:
            android.os.Bundle r5 = r4.getExtras()
            if (r5 != 0) goto L_0x00ee
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            goto L_0x00f8
        L_0x00ee:
            java.lang.String r6 = "com.google.android.gms.people.smart_profile.STATUS_BAR_COLOR"
            int r5 = r5.getInt(r6, r15)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x00f8:
            int r5 = r5.intValue()
            r2.h = r5
        L_0x00fe:
            int r5 = android.os.Build.VERSION.SDK_INT
            android.view.Window r5 = r2.getWindow()
            r5.setStatusBarColor(r15)
            r13 = 1
            if (r0 == 0) goto L_0x0114
            java.lang.String r5 = "impressionsLogged"
            boolean r5 = r0.getBoolean(r5)
            if (r5 == 0) goto L_0x0114
            r5 = 1
            goto L_0x0115
        L_0x0114:
            r5 = 0
        L_0x0115:
            r2.b = r5
            if (r0 == 0) goto L_0x0123
            java.lang.String r5 = "isError"
            boolean r5 = r0.getBoolean(r5)
            if (r5 == 0) goto L_0x0123
            r5 = 1
            goto L_0x0124
        L_0x0123:
            r5 = 0
        L_0x0124:
            r2.c = r5
            if (r0 == 0) goto L_0x0132
            java.lang.String r5 = "firstCardDurationLogged"
            boolean r5 = r0.getBoolean(r5)
            if (r5 == 0) goto L_0x0132
            r5 = 1
            goto L_0x0133
        L_0x0132:
            r5 = 0
        L_0x0133:
            r2.k = r5
            if (r0 == 0) goto L_0x0141
            java.lang.String r5 = "allCardsDurationLogged"
            boolean r5 = r0.getBoolean(r5)
            if (r5 == 0) goto L_0x0141
            r5 = 1
            goto L_0x0142
        L_0x0141:
            r5 = 0
        L_0x0142:
            r2.l = r5
            java.lang.String r5 = "com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME"
            java.lang.String r5 = r4.getStringExtra(r5)
            r2.d = r5
            aziy r5 = defpackage.aziy.a
            aziz r5 = r5.a()
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x0177
            java.lang.String r5 = "com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID"
            java.lang.String r5 = r4.getStringExtra(r5)
            r2.e = r5
            if (r5 == 0) goto L_0x0177
            java.lang.String r5 = r2.d
            if (r5 == 0) goto L_0x0167
            goto L_0x0177
        L_0x0167:
            r2.c = r13
            r0 = 2131953734(0x7f130846, float:1.9543947E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r15)
            r0.show()
            r2.f()
            return
        L_0x0177:
            azip r5 = defpackage.azip.a
            aziq r5 = r5.a()
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x01aa
            com.google.android.gms.common.internal.ClientContext r5 = new com.google.android.gms.common.internal.ClientContext
            r5.<init>()
            int r6 = android.os.Process.myUid()
            r5.b = r6
            java.lang.String r6 = r2.getPackageName()
            r5.e = r6
            java.lang.String r6 = r2.getPackageName()
            r5.f = r6
            azip r6 = defpackage.azip.a
            aziq r6 = r6.a()
            java.lang.String r6 = r6.a()
            r5.d(r6)
            r2.a = r5
            goto L_0x01cd
        L_0x01aa:
            com.google.android.gms.common.internal.ClientContext r5 = new com.google.android.gms.common.internal.ClientContext
            r5.<init>()
            int r6 = android.os.Process.myUid()
            r5.b = r6
            java.lang.String r6 = r2.getPackageName()
            r5.e = r6
            java.lang.String r6 = r2.getPackageName()
            r5.f = r6
            java.lang.String r6 = "https://www.googleapis.com/auth/peopleapi.legacy.readwrite"
            r5.d(r6)
            java.lang.String r6 = "https://www.googleapis.com/auth/plus.native"
            r5.d(r6)
            r2.a = r5
        L_0x01cd:
            java.lang.String r5 = r2.d
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r6 = "com.google"
            if (r5 != 0) goto L_0x01e4
            android.accounts.Account r5 = new android.accounts.Account
            java.lang.String r7 = r2.d
            r5.<init>(r7, r6)
            com.google.android.gms.common.internal.ClientContext r7 = r2.a
            r7.c = r5
            r7.d = r5
        L_0x01e4:
            com.google.android.gms.common.internal.ClientContext r5 = r2.a
            ixk r5 = defpackage.ixk.a((android.content.Context) r2, (com.google.android.gms.common.internal.ClientContext) r5)
            abgj r7 = new abgj
            java.lang.String r8 = "android.permission.READ_SMS"
            int r8 = r5.a(r8)
            if (r8 != 0) goto L_0x01f6
            r8 = 1
            goto L_0x01f7
        L_0x01f6:
            r8 = 0
        L_0x01f7:
            int r9 = android.os.Build.VERSION.SDK_INT
            java.lang.String r9 = "android.permission.READ_CALL_LOG"
            int r9 = r5.a(r9)
            if (r9 == 0) goto L_0x0203
            r9 = 0
            goto L_0x0204
        L_0x0203:
            r9 = 1
        L_0x0204:
            java.lang.String r10 = "android.permission.READ_CALENDAR"
            int r10 = r5.a(r10)
            if (r10 != 0) goto L_0x020f
            r10 = 1
            goto L_0x0210
        L_0x020f:
            r10 = 0
        L_0x0210:
            java.lang.String r11 = "android.permission.READ_CONTACTS"
            int r5 = r5.a(r11)
            if (r5 != 0) goto L_0x021b
            r5 = 1
            goto L_0x021c
        L_0x021b:
            r5 = 0
        L_0x021c:
            r7.<init>(r8, r9, r10, r5)
            r2.m = r7
            java.lang.String r5 = "com.google.android.gms.people.smart_profile.QUALIFIED_ID"
            java.lang.String r5 = r4.getStringExtra(r5)
            boolean r7 = defpackage.wxh.a(r5)
            r12 = 4
            if (r7 == 0) goto L_0x03c2
            abgj r7 = r2.m
            boolean r7 = r7.d
            if (r7 == 0) goto L_0x03c2
            java.lang.String r7 = defpackage.wxh.b(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r9 = "times_used"
            java.lang.String r10 = "is_primary"
            r11 = 3
            java.lang.String r16 = "data1"
            if (r8 != 0) goto L_0x02a0
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.String[] r8 = new java.lang.String[r11]
            r8[r15] = r16
            r8[r13] = r10
            r8[r3] = r9
            android.content.ContentResolver r17 = r2.getContentResolver()
            android.net.Uri r18 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI
            java.lang.String[] r11 = new java.lang.String[r13]
            r11[r15] = r7
            int r19 = android.os.Build.VERSION.SDK_INT
            java.lang.String r20 = "contact_id= ?"
            java.lang.String r22 = "times_used DESC"
            r19 = r8
            r21 = r11
            android.database.Cursor r8 = r17.query(r18, r19, r20, r21, r22)
            if (r8 != 0) goto L_0x026d
            r11 = 0
            r17 = 0
            goto L_0x0291
        L_0x026d:
            r11 = 0
            r17 = 0
        L_0x0270:
            boolean r18 = r8.moveToNext()     // Catch:{ all -> 0x029b }
            if (r18 == 0) goto L_0x028e
            java.lang.String r18 = r8.getString(r15)     // Catch:{ all -> 0x029b }
            boolean r19 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x029b }
            if (r19 != 0) goto L_0x0281
            goto L_0x0283
        L_0x0281:
            r11 = r18
        L_0x0283:
            int r3 = r8.getInt(r13)     // Catch:{ all -> 0x029b }
            if (r3 != r13) goto L_0x028c
            r17 = r18
        L_0x028c:
            r3 = 2
            goto L_0x0270
        L_0x028e:
            r8.close()
        L_0x0291:
            boolean r3 = android.text.TextUtils.isEmpty(r17)
            if (r3 == 0) goto L_0x0298
            goto L_0x02a1
        L_0x0298:
            r11 = r17
            goto L_0x02a1
        L_0x029b:
            r0 = move-exception
            r8.close()
            throw r0
        L_0x02a0:
            r11 = 0
        L_0x02a1:
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L_0x02ad
            java.lang.String r5 = defpackage.ycm.h(r11)
            goto L_0x03c3
        L_0x02ad:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L_0x031a
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String[] r3 = new java.lang.String[r12]
            r3[r15] = r16
            java.lang.String r8 = "data4"
            r3[r13] = r8
            r8 = 2
            r3[r8] = r10
            r8 = 3
            r3[r8] = r9
            android.content.ContentResolver r24 = r2.getContentResolver()
            android.net.Uri r25 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String[] r8 = new java.lang.String[r13]
            r8[r15] = r7
            int r9 = android.os.Build.VERSION.SDK_INT
            java.lang.String r27 = "contact_id= ?"
            java.lang.String r29 = "times_used DESC"
            r26 = r3
            r28 = r8
            android.database.Cursor r3 = r24.query(r25, r26, r27, r28, r29)
            if (r3 != 0) goto L_0x02e0
            r8 = 0
            r9 = 0
            goto L_0x030c
        L_0x02e0:
            r8 = 0
            r9 = 0
        L_0x02e2:
            boolean r10 = r3.moveToNext()     // Catch:{ all -> 0x0315 }
            if (r10 == 0) goto L_0x0309
            java.lang.String r10 = r3.getString(r13)     // Catch:{ all -> 0x0315 }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0315 }
            if (r11 != 0) goto L_0x02f3
            goto L_0x02f8
        L_0x02f3:
            java.lang.String r10 = r3.getString(r15)     // Catch:{ all -> 0x0315 }
        L_0x02f8:
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0315 }
            if (r11 != 0) goto L_0x02ff
            goto L_0x0300
        L_0x02ff:
            r8 = r10
        L_0x0300:
            int r11 = r3.getInt(r13)     // Catch:{ all -> 0x0315 }
            if (r11 != r13) goto L_0x02e2
            r9 = r10
            goto L_0x02e2
        L_0x0309:
            r3.close()
        L_0x030c:
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 == 0) goto L_0x0313
            goto L_0x031b
        L_0x0313:
            r8 = r9
            goto L_0x031b
        L_0x0315:
            r0 = move-exception
            r3.close()
            throw r0
        L_0x031a:
            r8 = 0
        L_0x031b:
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 == 0) goto L_0x03aa
            java.lang.String r3 = r2.d
            java.lang.String r8 = r2.f
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 != 0) goto L_0x03a9
            boolean r9 = defpackage.jkf.a(r2)
            if (r9 == 0) goto L_0x03a9
            android.accounts.Account r9 = new android.accounts.Account
            r9.<init>(r3, r6)
            boolean r3 = defpackage.jgu.b((android.content.Context) r2, (android.accounts.Account) r9, (java.lang.String) r8)
            if (r3 == 0) goto L_0x03a9
            java.lang.String[] r3 = new java.lang.String[r13]
            r3[r15] = r16
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r8 = "vnd.android.cursor.item/website"
            r6[r15] = r8
            r6[r13] = r7
            android.content.ContentResolver r20 = r2.getContentResolver()
            android.net.Uri r21 = android.provider.ContactsContract.Data.CONTENT_URI
            r25 = 0
            java.lang.String r23 = "mimetype=? and contact_id=? and (data1 LIKE \"%plus.google.com%\" or data1 LIKE \"%www.google.com/profile%\")"
            r22 = r3
            r24 = r6
            android.database.Cursor r3 = r20.query(r21, r22, r23, r24, r25)
            if (r3 == 0) goto L_0x039b
        L_0x035d:
            boolean r6 = r3.moveToNext()     // Catch:{ all -> 0x0396 }
            if (r6 == 0) goto L_0x0392
            java.lang.String r6 = r3.getString(r15)     // Catch:{ all -> 0x0396 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ all -> 0x0396 }
            java.lang.String r6 = r6.getEncodedPath()     // Catch:{ all -> 0x0396 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0396 }
            if (r7 != 0) goto L_0x035d
            java.lang.String r7 = "/"
            java.lang.String[] r6 = r6.split(r7)     // Catch:{ all -> 0x0396 }
            int r7 = r6.length     // Catch:{ all -> 0x0396 }
            int r7 = r7 + -1
            r6 = r6[r7]     // Catch:{ all -> 0x0396 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0396 }
            if (r7 != 0) goto L_0x035d
            java.lang.String r7 = "[0-9]+"
            boolean r7 = r6.matches(r7)     // Catch:{ all -> 0x0396 }
            if (r7 == 0) goto L_0x035d
            r3.close()
            goto L_0x039d
        L_0x0392:
            r3.close()
            goto L_0x039c
        L_0x0396:
            r0 = move-exception
            r3.close()
            throw r0
        L_0x039b:
        L_0x039c:
            r6 = 0
        L_0x039d:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x03a8
            java.lang.String r5 = defpackage.ycm.f(r6)
            goto L_0x03c3
        L_0x03a8:
            goto L_0x03c3
        L_0x03a9:
            goto L_0x03c3
        L_0x03aa:
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String r5 = "p:"
            int r6 = r3.length()
            if (r6 != 0) goto L_0x03bd
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
            r5 = r3
            goto L_0x03c3
        L_0x03bd:
            java.lang.String r5 = r5.concat(r3)
            goto L_0x03c3
        L_0x03c2:
        L_0x03c3:
            r2.j = r5
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x03d2
            r2.setResult(r15)
            r2.finish()
            return
        L_0x03d2:
            java.lang.String r3 = r2.j
            boolean r3 = defpackage.ycm.i(r3)
            java.lang.String r11 = "com.google.android.gms.people.smart_profile.DISPLAY_PHONE"
            java.lang.String r10 = "com.google.android.gms.people.smart_profile.DISPLAY_EMAIL"
            if (r3 == 0) goto L_0x03f2
            java.lang.String r3 = r4.getStringExtra(r10)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x03f2
            java.lang.String r3 = r2.j
            java.lang.String r3 = defpackage.ycm.g(r3)
            r4.putExtra(r10, r3)
            goto L_0x041b
        L_0x03f2:
            java.lang.String r3 = r2.j
            boolean r3 = defpackage.wxh.e(r3)
            if (r3 == 0) goto L_0x041b
            java.lang.String r3 = r4.getStringExtra(r11)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x041b
            java.lang.String r3 = r2.j
            java.lang.String r3 = defpackage.wxh.h(r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getCountry()
            java.lang.String r3 = android.telephony.PhoneNumberUtils.formatNumber(r3, r5)
            r4.putExtra(r11, r3)
        L_0x041b:
            r3 = 2131429705(0x7f0b0949, float:1.848109E38)
            android.view.View r3 = r2.findViewById(r3)
            android.support.v7.widget.Toolbar r3 = (android.support.v7.widget.Toolbar) r3
            r2.n = r3
            r2.a((android.support.v7.widget.Toolbar) r3)
            sg r2 = r2.aE()
            r2.c((boolean) r15)
            jtf r2 = new jtf
            jtd r3 = new jtd
            hol r4 = new hol
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r5 = r14.o
            java.lang.String r6 = r5.d
            java.lang.String r7 = "CONTACTSHEET"
            r4.<init>(r5, r7, r6)
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r5 = r14.o
            auuv r5 = r5.i
            r3.<init>(r4, r5)
            r2.<init>(r0, r3)
            r14.l = r2
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            java.lang.Integer r2 = r2.g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0468
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            r3 = 2131099867(0x7f0600db, float:1.78121E38)
            int r3 = defpackage.kf.b(r2, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.g = r3
        L_0x0468:
            boolean r2 = defpackage.azim.b()
            if (r2 == 0) goto L_0x0477
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            int r3 = defpackage.jsa.a(r2)
            r2.h = r3
            goto L_0x0489
        L_0x0477:
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            int r3 = r2.h
            if (r3 != 0) goto L_0x0489
            java.lang.Integer r3 = r2.g
            int r3 = r3.intValue()
            int r3 = defpackage.jpr.a((int) r3)
            r2.h = r3
        L_0x0489:
            if (r0 == 0) goto L_0x0496
            com.google.android.gms.smart_profile.header.view.HeaderView r2 = r14.e
            java.lang.String r3 = "HEADER_VIEW_COLLAPSE_RATIO"
            float r3 = r0.getFloat(r3)
            r2.b((float) r3)
        L_0x0496:
            boolean r2 = defpackage.azim.b()
            if (r2 != 0) goto L_0x04b6
            com.google.android.gms.smart_profile.header.view.HeaderView r2 = r14.e
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r3 = r14.o
            java.lang.Integer r3 = r3.g
            int r3 = r3.intValue()
            android.view.View r4 = r2.c
            r4.setBackgroundColor(r3)
            int r3 = defpackage.jpr.a((int) r3)
            com.google.android.gms.smart_profile.header.view.CircleView r2 = r2.e
            android.graphics.Paint r2 = r2.a
            r2.setColor(r3)
        L_0x04b6:
            abku r2 = new abku
            com.google.android.gms.smart_profile.header.view.HeaderView r3 = r14.e
            jtf r4 = r14.l
            r2.<init>(r3, r4)
            r14.f = r2
            azjb r2 = defpackage.azjb.a
            azjc r2 = r2.a()
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x04dc
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            auuv r2 = r2.i
            auuv r3 = defpackage.auuv.GOOGLE_VOICE
            if (r2 != r3) goto L_0x04dc
            abku r2 = r14.f
            com.google.android.gms.smart_profile.header.view.HeaderView r2 = r2.a
            r2.d()
        L_0x04dc:
            boolean r2 = defpackage.azim.b()
            java.lang.String r3 = "com.google.android.gms.people.smart_profile.SHOW_HANGOUTS_ENTRY"
            if (r2 == 0) goto L_0x051a
            boolean r2 = defpackage.azhu.c()
            if (r2 != 0) goto L_0x04eb
            goto L_0x051a
        L_0x04eb:
            abkz r2 = new abkz
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r4 = r14.o
            com.google.android.gms.smart_profile.header.view.HeaderView r5 = r14.e
            java.lang.String r6 = r4.d
            jtf r7 = r14.l
            android.content.Intent r8 = r4.getIntent()
            boolean r21 = r8.getBooleanExtra(r3, r13)
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r3 = r14.o
            auuv r3 = r3.i
            auuv r8 = defpackage.auuv.BABEL
            if (r3 == r8) goto L_0x0508
            r22 = 1
            goto L_0x050a
        L_0x0508:
            r22 = 0
        L_0x050a:
            r16 = r2
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r14.i = r2
            goto L_0x053b
        L_0x051a:
            abkz r2 = new abkz
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r4 = r14.o
            com.google.android.gms.smart_profile.header.view.HeaderView r5 = r14.e
            java.lang.String r6 = r4.d
            jtf r7 = r14.l
            android.content.Intent r8 = r4.getIntent()
            boolean r28 = r8.getBooleanExtra(r3, r13)
            r23 = r2
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r23.<init>(r24, r25, r26, r27, r28)
            r14.i = r2
        L_0x053b:
            jsx r9 = new jsx
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            com.google.android.chimera.LoaderManager r2 = r2.getLoaderManager()
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r3 = r14.o
            r9.<init>(r2, r3)
            abmk r8 = new abmk
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            com.google.android.chimera.LoaderManager r2 = r2.getLoaderManager()
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r3 = r14.o
            com.google.android.gms.common.internal.ClientContext r4 = r3.a
            r8.<init>(r2, r4, r3)
            abhf r2 = new abhf
            abgf r3 = new abgf
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r4 = r14.o
            r3.<init>(r4)
            r2.<init>(r3, r0)
            r14.c = r2
            abfl r7 = new abfl
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r4 = r14.o
            com.google.android.gms.common.internal.ClientContext r5 = r4.a
            abhf r6 = r14.c
            r2 = 2131429514(0x7f0b088a, float:1.8480703E38)
            android.view.View r2 = r4.findViewById(r2)
            r16 = r2
            android.view.ViewGroup r16 = (android.view.ViewGroup) r16
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            java.lang.String r3 = r2.d
            java.lang.String r12 = r2.e
            java.lang.String r2 = r2.f
            jtf r13 = r14.l
            r19 = r2
            r2 = r7
            r20 = r3
            r3 = r4
            r15 = r7
            r7 = r16
            r1 = r8
            r8 = r9
            r30 = r9
            r9 = r20
            r31 = r10
            r10 = r12
            r32 = r11
            r12 = 0
            r11 = r19
            r12 = r13
            r13 = r34
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.b = r15
            abfl r0 = r14.b
            java.util.List r0 = r0.d
            r0.add(r14)
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r0 = r14.o
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x06c7
            java.lang.String r2 = "com.google.android.gms.people.smart_profile.CARD_BYTES"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x06c7
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r0 = r14.o
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            byte[] r0 = r0.getByteArray(r2)
            aubs r2 = defpackage.aubs.c()     // Catch:{ auda -> 0x05d8 }
            avht r3 = defpackage.avht.b     // Catch:{ auda -> 0x05d8 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r0, (defpackage.aubs) r2)     // Catch:{ auda -> 0x05d8 }
            r11 = r0
            avht r11 = (defpackage.avht) r11     // Catch:{ auda -> 0x05d8 }
            goto L_0x05da
        L_0x05d8:
            r0 = move-exception
            r11 = 0
        L_0x05da:
            if (r11 != 0) goto L_0x05de
            goto L_0x06c7
        L_0x05de:
            abfl r0 = r14.b
            aucx r2 = r11.a
            r3 = 0
            avhr[] r4 = new defpackage.avhr[r3]
            java.lang.Object[] r2 = r2.toArray(r4)
            avhr[] r2 = (defpackage.avhr[]) r2
            abfo r3 = r0.s
            boolean r3 = r3.e()
            if (r3 != 0) goto L_0x06c7
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = 0
        L_0x05fa:
            if (r5 >= r4) goto L_0x0619
            r6 = r2[r5]
            int r7 = r6.a
            r7 = r7 & 8
            if (r7 != 0) goto L_0x0605
            goto L_0x0616
        L_0x0605:
            int r7 = r3.size()
            r8 = 10
            if (r7 >= r8) goto L_0x0616
            avih r6 = r6.e
            if (r6 != 0) goto L_0x0613
            avih r6 = defpackage.avih.d
        L_0x0613:
            r3.add(r6)
        L_0x0616:
            int r5 = r5 + 1
            goto L_0x05fa
        L_0x0619:
            r2 = 0
        L_0x061a:
            int r4 = r3.size()
            if (r2 >= r4) goto L_0x06ba
            boolean r4 = defpackage.azim.b()
            if (r4 == 0) goto L_0x065c
            android.content.Context r4 = r0.a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131624463(0x7f0e020f, float:1.8876106E38)
            android.view.ViewGroup r6 = r0.c
            r7 = 0
            android.view.View r4 = r4.inflate(r5, r6, r7)
            jqm r5 = new jqm
            int r6 = r2 * 50
            int r6 = r6 + 500
            jsx r7 = r0.h
            jtf r8 = r0.m
            r5.<init>(r4, r6, r7, r8)
            java.lang.Object r6 = r3.get(r2)
            avih r6 = (defpackage.avih) r6
            amri r6 = defpackage.amri.b(r6)
            r5.a((defpackage.amri) r6)
            abfo r5 = r0.s
            jth r6 = defpackage.jth.GENERIC_CARD
            jtg r6 = defpackage.jtg.a(r6, r2)
            r5.a(r4, r6)
            goto L_0x06b6
        L_0x065c:
            android.content.Context r4 = r0.a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131624142(0x7f0e00ce, float:1.8875455E38)
            android.view.ViewGroup r6 = r0.c
            r7 = 0
            android.view.View r4 = r4.inflate(r5, r6, r7)
            com.google.android.gms.smart_profile.card.view.BaseCardView r4 = (com.google.android.gms.smart_profile.card.view.BaseCardView) r4
            java.util.List r5 = r0.f
            abiz r6 = new abiz
            android.content.Context r7 = r0.a
            java.lang.Object r8 = r3.get(r2)
            r25 = r8
            avih r25 = (defpackage.avih) r25
            int r8 = r2 * 50
            int r8 = r8 + 500
            jsx r9 = r0.h
            jtf r10 = r0.m
            java.util.ArrayList r11 = r0.n
            int r11 = r11.size()
            if (r2 >= r11) goto L_0x0697
            java.util.ArrayList r11 = r0.n
            java.lang.Object r11 = r11.get(r2)
            android.os.Bundle r11 = (android.os.Bundle) r11
            r29 = r11
            goto L_0x0699
        L_0x0697:
            r29 = 0
        L_0x0699:
            r22 = r6
            r23 = r7
            r24 = r4
            r26 = r8
            r27 = r9
            r28 = r10
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r5.add(r6)
            abfo r5 = r0.s
            jth r6 = defpackage.jth.GENERIC_CARD
            jtg r6 = defpackage.jtg.a(r6, r2)
            r5.a(r4, r6)
        L_0x06b6:
            int r2 = r2 + 1
            goto L_0x061a
        L_0x06ba:
            abfo r2 = r0.s
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x06c7
            abfo r0 = r0.s
            r0.c()
        L_0x06c7:
            abfn r0 = new abfn
            abfl r2 = r14.b
            r0.<init>(r2)
            r14.a = r0
            abhf r0 = r14.c
            abfl r2 = r14.b
            r0.a((defpackage.abhe) r2)
            abhf r0 = r14.c
            abkz r2 = r14.i
            r0.a((defpackage.abhe) r2)
            ablh r0 = new ablh
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r2 = r14.o
            java.lang.String r3 = r2.j
            android.content.Intent r2 = r2.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            abli r2 = defpackage.abli.a(r3, r2)
            r0.<init>(r1, r2)
            r14.n = r0
            ablh r0 = r14.n
            abmk r1 = r0.a
            avik r2 = r0.b()
            able r3 = new able
            r3.<init>(r0)
            com.google.android.chimera.LoaderManager r0 = r1.a
            abmi r4 = new abmi
            r4.<init>(r1, r2, r3)
            r1 = 4
            r2 = 0
            r0.initLoader(r1, r2, r4)
            ablh r0 = r14.n
            abfn r1 = r14.a
            r0.a(r1)
            ablh r0 = r14.n
            abku r1 = r14.f
            r0.a(r1)
            ablh r0 = r14.n
            abkz r1 = r14.i
            r0.a(r1)
            ablh r0 = r14.n
            abhf r1 = r14.c
            r0.a(r1)
            abko r0 = new abko
            r0.<init>()
            abkl r1 = new abkl
            ablu r3 = new ablu
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r4 = r14.o
            com.google.android.chimera.LoaderManager r4 = r4.getSupportLoaderManager()
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r5 = r14.o
            r3.<init>(r4, r5)
            abkn r4 = new abkn
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r7 = r14.o
            java.lang.String r8 = r7.j
            java.lang.String r9 = r7.d
            java.lang.String r10 = r7.e
            auuv r5 = r7.i
            int r11 = r5.iZ
            java.lang.String r12 = r7.f
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.<init>(r3, r4, r0)
            r14.j = r1
            abhf r1 = r14.c
            abkl r3 = r14.j
            r1.a((defpackage.abhe) r3)
            abgi r1 = new abgi
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r3 = r14.o
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "com.google.android.gms.people.smart_profile.DISPLAY_NAME"
            java.lang.String r3 = r3.getStringExtra(r4)
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r4 = r14.o
            android.content.Intent r4 = r4.getIntent()
            r5 = r32
            java.lang.String r4 = r4.getStringExtra(r5)
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r5 = r14.o
            android.content.Intent r5 = r5.getIntent()
            r6 = r31
            java.lang.String r5 = r5.getStringExtra(r6)
            r1.<init>(r3, r4, r5)
            abkl r3 = r14.j
            r3.a((defpackage.abkj) r1)
            ablh r3 = r14.n
            r3.a(r1)
            abku r3 = r14.f
            r1.a((defpackage.abgg) r3)
            abkz r3 = r14.i
            r1.a((defpackage.abgg) r3)
            abfl r3 = r14.b
            r1.a((defpackage.abgg) r3)
            r1.a((defpackage.abgg) r0)
            abff r1 = new abff
            ablm r3 = new ablm
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r4 = r14.o
            com.google.android.chimera.LoaderManager r4 = r4.getLoaderManager()
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r5 = r14.o
            r3.<init>(r4, r5)
            r4 = r30
            r1.<init>(r4, r3)
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r3 = r14.o
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "com.google.android.gms.people.smart_profile.AVATAR_BYTES"
            boolean r3 = r3.hasExtra(r4)
            if (r3 == 0) goto L_0x07f1
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r3 = r14.o
            android.content.Intent r3 = r3.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            byte[] r3 = r3.getByteArray(r4)
            int r4 = r3.length
            android.graphics.BitmapFactory$Options r5 = defpackage.jpr.a()
            r6 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r6, r4, r5)
            boolean r4 = r1.a
            if (r4 == 0) goto L_0x07e2
            goto L_0x081d
        L_0x07e2:
            boolean r4 = r1.b
            if (r4 != 0) goto L_0x081d
            r4 = 1
            r1.a = r4
            amri r3 = defpackage.amri.c(r3)
            r1.a((defpackage.amri) r3)
            goto L_0x081d
        L_0x07f1:
            r4 = 1
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r3 = r14.o
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r5 = "com.google.android.gms.people.smart_profile.AVATAR_URL"
            boolean r3 = r3.hasExtra(r5)
            if (r3 == 0) goto L_0x081d
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r3 = r14.o
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r3 = r3.getStringExtra(r5)
            boolean r5 = r1.a
            if (r5 != 0) goto L_0x081d
            boolean r5 = r1.b
            if (r5 != 0) goto L_0x081d
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x081d
            r1.a = r4
            r1.a((java.lang.String) r3)
        L_0x081d:
            abkl r3 = r14.j
            r3.a((defpackage.abkj) r1)
            ablh r3 = r14.n
            r3.a(r1)
            abku r3 = r14.f
            r1.a((defpackage.abfe) r3)
            r1.a((defpackage.abfe) r0)
            abmf r0 = new abmf
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r5 = r14.o
            java.lang.String r6 = r5.d
            java.lang.String r7 = r5.e
            auuv r1 = r5.i
            int r8 = r1.iZ
            com.google.android.chimera.LoaderManager r9 = r5.getLoaderManager()
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r14.k = r0
            abmf r0 = r14.k
            com.google.android.chimera.LoaderManager r1 = r0.e
            abme r3 = new abme
            r3.<init>(r0)
            r0 = 14
            r1.initLoader(r0, r2, r3)
            abgb r0 = new abgb
            r0.<init>()
            r14.g = r0
            abmf r0 = r14.k
            abgb r1 = r14.g
            java.util.List r2 = r0.f
            r2.add(r1)
            abmg r0 = r0.g
            if (r0 != 0) goto L_0x0868
            goto L_0x086b
        L_0x0868:
            r1.a((defpackage.abmg) r0)
        L_0x086b:
            ablh r0 = r14.n
            abgb r1 = r14.g
            r0.a(r1)
            abgb r0 = r14.g
            abfl r1 = r14.b
            r0.a((defpackage.abga) r1)
            abgb r0 = r14.g
            abku r1 = r14.f
            r0.a((defpackage.abga) r1)
            abgb r0 = r14.g
            abkz r1 = r14.i
            r0.a((defpackage.abga) r1)
            boolean r0 = defpackage.azim.b()
            if (r0 != 0) goto L_0x08ab
            abfy r0 = new abfy
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r1 = r14.o
            r2 = 2131428143(0x7f0b032f, float:1.8477922E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            abkl r2 = r14.j
            jtf r3 = r14.l
            r0.<init>(r1, r2, r3)
            ablh r1 = r14.n
            r1.a(r0)
            abgb r1 = r14.g
            r1.a((defpackage.abga) r0)
        L_0x08ab:
            abmb r0 = new abmb
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r1 = r14.o
            com.google.android.chimera.LoaderManager r3 = r1.getLoaderManager()
            com.google.android.gms.smart_profile.SmartProfileChimeraActivity r4 = r14.o
            auuv r1 = r4.i
            int r5 = r1.iZ
            java.lang.String r6 = r4.j
            java.lang.String r7 = r4.d
            java.lang.String r8 = r4.e
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r14.m = r0
            abmb r0 = r14.m
            abgp r1 = new abgp
            r1.<init>(r14)
            r2 = 9
            r0.a(r2, r1)
            boolean r0 = r14.c()
            if (r0 != 0) goto L_0x08da
            r14.b()
        L_0x08da:
            return
        L_0x08db:
            r1 = 0
            r2.setResult(r1)
            r2.finish()
            return
        L_0x08e4:
            r1 = 0
            r2.setResult(r1)
            r2.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smart_profile.SmartProfileChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        abgt abgt = this.o;
        if (azim.b()) {
            abgt.o.getMenuInflater().inflate(R.menu.gm_toolbar_menu, menu);
        } else {
            abgt.o.getMenuInflater().inflate(R.menu.profile_main, menu);
        }
        SmartProfileChimeraActivity smartProfileChimeraActivity = abgt.o;
        Toolbar toolbar = smartProfileChimeraActivity.n;
        abkl abkl = abgt.j;
        String concat = String.valueOf(smartProfileChimeraActivity.f).concat(".SMART_PROFILE.USER_INITIATED_FEEDBACK_REPORT");
        SmartProfileChimeraActivity smartProfileChimeraActivity2 = abgt.o;
        abgt.h = new abkq(smartProfileChimeraActivity, toolbar, abkl, new abkt(smartProfileChimeraActivity, concat, smartProfileChimeraActivity2.d, smartProfileChimeraActivity2.getWindow().getDecorView().getRootView()), abgt.l);
        abgt.g.a((abga) abgt.h);
        abgt.n.a(abgt.h);
        return true;
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        f();
        return true;
    }

    public final boolean onMenuOpened(int i2, Menu menu) {
        abgt abgt = this.o;
        if (menu != null) {
            abgt.l.a(jth.OVERFLOW_MENU_BUTTON, jth.SMART_PROFILE_HEADER);
        }
        return super.onMenuOpened(i2, menu);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.n.d();
        super.onPause();
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
        new qvr().postDelayed(new abgo(this), 500);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("impressionsLogged", this.b);
        bundle.putBoolean("isError", this.c);
        bundle.putBoolean("firstCardDurationLogged", this.k);
        bundle.putBoolean("allCardsDurationLogged", this.l);
        abgt abgt = this.o;
        abhf abhf = abgt.c;
        bundle.putStringArrayList("merged emails", new ArrayList(abhf.a));
        bundle.putStringArrayList("merged phones", new ArrayList(abhf.b));
        abfl abfl = abgt.b;
        Bundle bundle2 = new Bundle();
        List list = abfl.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((abir) list.get(i2)).a(bundle2);
        }
        bundle.putBundle("cardsController", bundle2);
        abfl.n = new ArrayList();
        for (int i3 = 0; i3 < abfl.f.size(); i3++) {
            abfl.n.add(new Bundle());
            ((abir) abfl.f.get(i3)).a((Bundle) abfl.n.get(i3));
        }
        bundle.putParcelableArrayList("genericCardsController", abfl.n);
        Set set = abgt.l.a;
        jtg[] jtgArr = (jtg[]) set.toArray(new jtg[set.size()]);
        int length = jtgArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < jtgArr.length; i4++) {
            iArr[i4] = jtgArr[i4].a().intValue();
            iArr2[i4] = jtgArr[i4].b() != null ? jtgArr[i4].b().intValue() : -1;
        }
        bundle.putIntArray("veRecordedImpressionNodeIds", iArr);
        bundle.putIntArray("veRecordedImpressionIndexes", iArr2);
        bundle.putFloat("HEADER_VIEW_COLLAPSE_RATIO", abgt.e.i);
    }

    private final void a(boolean z) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 0;
        if (z) {
            i2 = this.h;
        } else {
            i2 = 0;
        }
        if (azim.b()) {
            if (!azhl.a.a().h() || Build.VERSION.SDK_INT != 21) {
                i4 = i2;
            }
            getWindow().setStatusBarColor(i4);
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(getWindow(), "statusBarColor", new int[]{getWindow().getStatusBarColor(), i2});
        ofInt.setDuration(150);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
    }

    public final void a() {
        abfl abfl = this.o.b;
        if (abfl != null) {
            abfl.s.b();
            abfl.t.b();
            abfl.u.b();
            abfl.v.b();
            abfl.w.b();
        }
    }
}
