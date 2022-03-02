package com.google.android.gms.auth.uiflows.consent;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;
import java.util.ArrayList;
import java.util.Random;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GrantCredentialsWithAclChimeraActivity extends gnx implements View.OnClickListener, gno {
    private static final iwd c = ehv.a("GrantCredentials");
    long a = 0;
    protected aucd b;
    private String d;
    private int e;
    private String f;
    private String g;
    private ArrayList h = new ArrayList();
    private int p;
    private boolean q;
    private boolean r;
    private Drawable s;
    private String t;
    private crq u;
    private LinearLayout v;
    private Button w;
    private Button x;
    private ScrollViewWithEvents y;
    private long z;

    private final Intent a(gei gei, gda gda) {
        Intent intent = new Intent();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        String str = null;
        FACLConfig fACLConfig = null;
        for (int i = 0; i < size; i++) {
            ScopeData scopeData = (ScopeData) arrayList.get(i);
            if (scopeData.g) {
                fACLConfig = new FACLConfig(scopeData.n, scopeData.h, scopeData.o, scopeData.l, scopeData.m, scopeData.k);
            }
            if (scopeData.a()) {
                str = scopeData.f;
            }
        }
        intent.putExtra(ConsentResult.a, new ConsentResult(gei, str, fACLConfig, gda, getIntent().getStringExtra("GrantCredentialsWithAclChimeraActivityconsentCookieWrapper")));
        return intent;
    }

    private final void c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ScopeData scopeData = (ScopeData) arrayList.get(i);
            scopeData.f = null;
            scopeData.h = null;
            scopeData.k = false;
            scopeData.l = false;
            scopeData.m = false;
            scopeData.n = false;
            scopeData.o = false;
        }
        a(0, a(gei.PERMISSION_DENIED, gda.REJECTED));
        long currentTimeMillis = System.currentTimeMillis();
        aucd aucd = this.b;
        long j = currentTimeMillis - this.z;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpk anpk = (anpk) aucd.b;
        anpk anpk2 = anpk.k;
        anpk.a |= 2;
        anpk.c = j;
        e();
        this.x.setEnabled(false);
        this.w.setEnabled(false);
    }

    private final void e() {
        if (((Boolean) gnv.b.c()).booleanValue() && new Random().nextFloat() < ((Float) gnv.c.c()).floatValue()) {
            aucd o = anpy.f.o();
            String str = this.d;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anpy anpy = (anpy) o.b;
            str.getClass();
            int i = anpy.a | 1;
            anpy.a = i;
            anpy.b = str;
            String str2 = this.f;
            str2.getClass();
            anpy.a = i | 2;
            anpy.c = str2;
            try {
                String e2 = jhg.e(this, this.d);
                if (e2 != null) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    anpy anpy2 = (anpy) o.b;
                    e2.getClass();
                    anpy2.a |= 4;
                    anpy2.d = e2;
                }
            } catch (PackageManager.NameNotFoundException e3) {
            }
            aucd aucd = this.b;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anpk anpk = (anpk) aucd.b;
            anpy anpy3 = (anpy) o.i();
            anpk anpk2 = anpk.k;
            anpy3.getClass();
            anpk.h = anpy3;
            anpk.a |= 64;
            aucd aucd2 = this.b;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anpk anpk3 = (anpk) aucd2.b;
            anpk3.j = 1;
            anpk3.a |= 1024;
            aucd o2 = anon.v.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anon anon = (anon) o2.b;
            anon.c = 2;
            anon.a |= 1;
            anpk anpk4 = (anpk) this.b.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anon anon2 = (anon) o2.b;
            anpk4.getClass();
            anon2.e = anpk4;
            anon2.a |= 4;
            new hol(this, "ANDROID_AUTH", (String) null).a(((anon) o2.i()).k()).b();
        }
    }

    public final String b() {
        return "GrantCredentialsWithAclActivity";
    }

    public final void onBackPressed() {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpk anpk = (anpk) aucd.b;
        anpk anpk2 = anpk.k;
        anpk.b = 1;
        anpk.a = 1 | anpk.a;
        c();
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0131, code lost:
        if (r14.c != false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0139, code lost:
        ((defpackage.ixe) r14.b).a = defpackage.aucj.s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0143, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r18.getId()
            r2 = 3
            r3 = 1
            r4 = 0
            r5 = 2131427705(0x7f0b0179, float:1.8477034E38)
            if (r0 != r5) goto L_0x0034
            iwd r0 = c
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "Consent declined"
            r0.b(r6, r5)
            aucd r0 = r1.b
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            r0.c()
            r0.c = r4
        L_0x0023:
            aucj r0 = r0.b
            anpk r0 = (defpackage.anpk) r0
            anpk r4 = defpackage.anpk.k
            r0.b = r2
            int r2 = r0.a
            r2 = r2 | r3
            r0.a = r2
            r17.c()
            return
        L_0x0034:
            r5 = 2131427360(0x7f0b0020, float:1.8476334E38)
            if (r0 != r5) goto L_0x033d
            iwd r0 = c
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "Consent accepted"
            r0.b(r6, r5)
            aucd r0 = r1.b
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            r0.c()
            r0.c = r4
        L_0x004e:
            aucj r0 = r0.b
            anpk r0 = (defpackage.anpk) r0
            anpk r5 = defpackage.anpk.k
            r5 = 2
            r0.b = r5
            int r6 = r0.a
            r6 = r6 | r3
            r0.a = r6
            com.google.android.gms.common.widget.phone.ScrollViewWithEvents r0 = r1.y
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x032e
            java.util.ArrayList r0 = r1.h
            int r6 = r0.size()
            r7 = 0
        L_0x006b:
            r8 = -1
            if (r7 < r6) goto L_0x00c0
            int r0 = defpackage.jhg.a
            gei r0 = defpackage.gei.SUCCESS
            gda r2 = defpackage.gda.GRANTED
            android.content.Intent r0 = r1.a((defpackage.gei) r0, (defpackage.gda) r2)
            r1.a(r8, r0)
            long r2 = java.lang.System.currentTimeMillis()
            aucd r0 = r1.b
            long r6 = r1.z
            long r2 = r2 - r6
            boolean r6 = r0.c
            if (r6 == 0) goto L_0x008d
            r0.c()
            r0.c = r4
        L_0x008d:
            aucj r0 = r0.b
            anpk r0 = (defpackage.anpk) r0
            int r6 = r0.a
            r5 = r5 | r6
            r0.a = r5
            r0.c = r2
            aucd r0 = r1.b
            long r2 = r1.a
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x00a1
            goto L_0x00a6
        L_0x00a1:
            r0.c()
            r0.c = r4
        L_0x00a6:
            aucj r0 = r0.b
            anpk r0 = (defpackage.anpk) r0
            int r5 = r0.a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r0.a = r5
            r0.i = r2
            r17.e()
            android.widget.Button r0 = r1.x
            r0.setEnabled(r4)
            android.widget.Button r0 = r1.w
            r0.setEnabled(r4)
            return
        L_0x00c0:
            java.util.ArrayList r0 = r1.h
            java.lang.Object r0 = r0.get(r7)
            r9 = r0
            com.google.android.gms.auth.firstparty.shared.ScopeData r9 = (com.google.android.gms.auth.firstparty.shared.ScopeData) r9
            com.google.android.chimera.FragmentManager r0 = r17.getSupportFragmentManager()
            java.lang.String r10 = a((int) r7)
            com.google.android.chimera.Fragment r0 = r0.findFragmentByTag(r10)
            gnp r0 = (defpackage.gnp) r0
            r10 = 0
            if (r0 == 0) goto L_0x02f9
            java.util.ArrayList r11 = r0.b
            if (r11 == 0) goto L_0x02f9
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x00eb
            java.lang.String r0 = ""
            r5 = 1
            r16 = 2
            goto L_0x02f6
        L_0x00eb:
            java.util.ArrayList r11 = r0.b
            r12 = 5
            com.google.android.gms.auth.firstparty.shared.ScopeData r0 = r0.a     // Catch:{ auda -> 0x014d }
            java.lang.String r0 = r0.f     // Catch:{ auda -> 0x014d }
            if (r0 == 0) goto L_0x014c
            byte[] r0 = defpackage.jhy.c((java.lang.String) r0)     // Catch:{ auda -> 0x014d }
            aubs r13 = defpackage.aubs.c()     // Catch:{ auda -> 0x014d }
            ixc r14 = defpackage.ixc.c     // Catch:{ auda -> 0x014d }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r14, (byte[]) r0, (defpackage.aubs) r13)     // Catch:{ auda -> 0x014d }
            ixc r0 = (defpackage.ixc) r0     // Catch:{ auda -> 0x014d }
            aucx r0 = r0.a     // Catch:{ auda -> 0x014d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ auda -> 0x014d }
        L_0x010a:
            boolean r13 = r0.hasNext()     // Catch:{ auda -> 0x014a }
            if (r13 == 0) goto L_0x0176
            java.lang.Object r13 = r0.next()     // Catch:{ auda -> 0x014a }
            ixd r13 = (defpackage.ixd) r13     // Catch:{ auda -> 0x014a }
            int r14 = r13.a     // Catch:{ auda -> 0x014a }
            r14 = r14 & r5
            if (r14 == 0) goto L_0x010a
            ixe r13 = r13.b     // Catch:{ auda -> 0x014a }
            if (r13 != 0) goto L_0x0122
            ixe r13 = defpackage.ixe.b     // Catch:{ auda -> 0x014a }
            goto L_0x0123
        L_0x0122:
        L_0x0123:
            java.lang.Object r14 = r13.c(r12)     // Catch:{ auda -> 0x014a }
            aucd r14 = (defpackage.aucd) r14     // Catch:{ auda -> 0x014a }
            r14.a((defpackage.aucj) r13)     // Catch:{ auda -> 0x014a }
            if (r14 == 0) goto L_0x0148
            boolean r0 = r14.c     // Catch:{ auda -> 0x0145 }
            if (r0 != 0) goto L_0x0134
            goto L_0x0139
        L_0x0134:
            r14.c()     // Catch:{ auda -> 0x0145 }
            r14.c = r4     // Catch:{ auda -> 0x0145 }
        L_0x0139:
            aucj r0 = r14.b     // Catch:{ auda -> 0x0145 }
            ixe r0 = (defpackage.ixe) r0     // Catch:{ auda -> 0x0145 }
            aucx r10 = defpackage.aucj.s()     // Catch:{ auda -> 0x0145 }
            r0.a = r10     // Catch:{ auda -> 0x0145 }
            r10 = r14
            goto L_0x0176
        L_0x0145:
            r0 = move-exception
            r10 = r14
            goto L_0x014e
        L_0x0148:
            r10 = r14
            goto L_0x010a
        L_0x014a:
            r0 = move-exception
            goto L_0x014e
        L_0x014c:
            goto L_0x0176
        L_0x014d:
            r0 = move-exception
        L_0x014e:
            java.lang.String r13 = "AuthScopeFragment"
            boolean r12 = android.util.Log.isLoggable(r13, r12)
            if (r12 == 0) goto L_0x0175
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r12 = "Failed to get SharingRoster from RenderedSharingRoster: "
            int r14 = r0.length()
            if (r14 != 0) goto L_0x016d
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
            goto L_0x0171
        L_0x016d:
            java.lang.String r0 = r12.concat(r0)
        L_0x0171:
            android.util.Log.w(r13, r0)
            goto L_0x0176
        L_0x0175:
        L_0x0176:
            if (r10 != 0) goto L_0x017e
            ixe r0 = defpackage.ixe.b
            aucd r10 = r0.o()
        L_0x017e:
            if (r11 != 0) goto L_0x0185
            r5 = 1
            r16 = 2
            goto L_0x02e8
        L_0x0185:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x02e5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r12 = r11.size()
            r13 = 0
        L_0x0195:
            if (r13 >= r12) goto L_0x02a8
            java.lang.Object r14 = r11.get(r13)
            com.google.android.gms.common.people.data.AudienceMember r14 = (com.google.android.gms.common.people.data.AudienceMember) r14
            ixg r15 = defpackage.ixg.e
            aucd r15 = r15.o()
            int r2 = r14.b
            r8 = 4
            if (r2 == r3) goto L_0x022e
            if (r2 != r5) goto L_0x0215
            java.lang.String r2 = r14.e
            ixh r14 = defpackage.ixh.d
            aucd r14 = r14.o()
            boolean r16 = defpackage.ycm.i(r2)
            if (r16 == 0) goto L_0x01d4
            java.lang.String r2 = defpackage.ycm.g(r2)
            boolean r8 = r14.c
            if (r8 == 0) goto L_0x01c5
            r14.c()
            r14.c = r4
        L_0x01c5:
            aucj r8 = r14.b
            ixh r8 = (defpackage.ixh) r8
            r2.getClass()
            int r5 = r8.a
            r5 = r5 | r3
            r8.a = r5
            r8.b = r2
            goto L_0x01f0
        L_0x01d4:
            java.lang.String r2 = defpackage.ycm.e(r2)
            boolean r5 = r14.c
            if (r5 != 0) goto L_0x01dd
            goto L_0x01e2
        L_0x01dd:
            r14.c()
            r14.c = r4
        L_0x01e2:
            aucj r5 = r14.b
            ixh r5 = (defpackage.ixh) r5
            r2.getClass()
            int r3 = r5.a
            r3 = r3 | r8
            r5.a = r3
            r5.c = r2
        L_0x01f0:
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x01f5
            goto L_0x01fa
        L_0x01f5:
            r15.c()
            r15.c = r4
        L_0x01fa:
            aucj r2 = r15.b
            ixg r2 = (defpackage.ixg) r2
            aucj r3 = r14.i()
            ixh r3 = (defpackage.ixh) r3
            r3.getClass()
            r2.b = r3
            int r3 = r2.a
            r5 = 1
            r3 = r3 | r5
            r2.a = r3
            r2 = 3
            r5 = 1
            r16 = 2
            goto L_0x0298
        L_0x0215:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 32
            r3.<init>(r4)
            java.lang.String r4 = "Unknown member type: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x022e:
            int r2 = r14.c
            r3 = -1
            if (r2 == r3) goto L_0x0279
            r5 = 1
            if (r2 == r5) goto L_0x025e
            r14 = 2
            if (r2 == r14) goto L_0x025b
            r14 = 3
            if (r2 == r14) goto L_0x0259
            if (r2 != r8) goto L_0x0240
            r2 = 4
            goto L_0x0260
        L_0x0240:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 38
            r3.<init>(r4)
            java.lang.String r4 = "Unknown system group type: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0259:
            r2 = 3
            goto L_0x0260
        L_0x025b:
            r14 = 3
            r2 = 2
            goto L_0x0260
        L_0x025e:
            r14 = 3
            r2 = 1
        L_0x0260:
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0265
            goto L_0x026a
        L_0x0265:
            r15.c()
            r15.c = r4
        L_0x026a:
            aucj r3 = r15.b
            ixg r3 = (defpackage.ixg) r3
            r3.d = r2
            int r2 = r3.a
            r2 = r2 | r8
            r3.a = r2
            r2 = 3
            r16 = 2
            goto L_0x0298
        L_0x0279:
            r2 = 3
            r5 = 1
            java.lang.String r3 = r14.d
            boolean r8 = r15.c
            if (r8 != 0) goto L_0x0282
            goto L_0x0287
        L_0x0282:
            r15.c()
            r15.c = r4
        L_0x0287:
            aucj r8 = r15.b
            ixg r8 = (defpackage.ixg) r8
            r3.getClass()
            int r14 = r8.a
            r16 = 2
            r14 = r14 | 2
            r8.a = r14
            r8.c = r3
        L_0x0298:
            aucj r3 = r15.i()
            ixg r3 = (defpackage.ixg) r3
            r0.add(r3)
            int r13 = r13 + 1
            r3 = 1
            r5 = 2
            r8 = -1
            goto L_0x0195
        L_0x02a8:
            r5 = 1
            r16 = 2
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x02b0
            goto L_0x02b5
        L_0x02b0:
            r10.c()
            r10.c = r4
        L_0x02b5:
            aucj r3 = r10.b
            ixe r3 = (defpackage.ixe) r3
            ixe r8 = defpackage.ixe.b
            aucx r8 = defpackage.aucj.s()
            r3.a = r8
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x02c6
            goto L_0x02cb
        L_0x02c6:
            r10.c()
            r10.c = r4
        L_0x02cb:
            aucj r3 = r10.b
            ixe r3 = (defpackage.ixe) r3
            aucx r8 = r3.a
            boolean r8 = r8.a()
            if (r8 != 0) goto L_0x02df
            aucx r8 = r3.a
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)
            r3.a = r8
        L_0x02df:
            aucx r3 = r3.a
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r3)
            goto L_0x02e8
        L_0x02e5:
            r5 = 1
            r16 = 2
        L_0x02e8:
            aucj r0 = r10.i()
            ixe r0 = (defpackage.ixe) r0
            byte[] r0 = r0.k()
            java.lang.String r0 = defpackage.jhy.d(r0)
        L_0x02f6:
            r9.f = r0
            goto L_0x0328
        L_0x02f9:
            r5 = 1
            r16 = 2
            if (r0 != 0) goto L_0x02ff
        L_0x02fe:
            goto L_0x0320
        L_0x02ff:
            com.google.android.gms.auth.firstparty.shared.ScopeData r3 = r0.a
            if (r3 == 0) goto L_0x02fe
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x02fe
            java.lang.String r3 = r0.a()
            r9.h = r3
            com.google.android.gms.auth.firstparty.shared.ScopeData r0 = r0.a
            if (r0 == 0) goto L_0x0314
            boolean r3 = r0.n
            goto L_0x0315
        L_0x0314:
            r3 = 0
        L_0x0315:
            r9.n = r3
            if (r0 == 0) goto L_0x031c
            boolean r0 = r0.o
            goto L_0x031d
        L_0x031c:
            r0 = 0
        L_0x031d:
            r9.o = r0
            goto L_0x0328
        L_0x0320:
            r9.f = r10
            r9.h = r10
            r9.n = r4
            r9.o = r4
        L_0x0328:
            int r7 = r7 + 1
            r3 = 1
            r5 = 2
            goto L_0x006b
        L_0x032e:
            com.google.android.gms.common.widget.phone.ScrollViewWithEvents r0 = r1.y
            r2 = 130(0x82, float:1.82E-43)
            r0.pageScroll(r2)
            long r2 = r1.a
            r4 = 1
            long r2 = r2 + r4
            r1.a = r2
            return
        L_0x033d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity.onClick(android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r1 = r23
            super.onCreate(r24)
            anpk r0 = defpackage.anpk.k
            aucd r0 = r0.o()
            r1.b = r0
            long r2 = java.lang.System.currentTimeMillis()
            r1.z = r2
            if (r24 == 0) goto L_0x0019
            r23.a((android.os.Bundle) r24)
            goto L_0x0024
        L_0x0019:
            android.content.Intent r0 = r23.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1.a((android.os.Bundle) r0)
        L_0x0024:
            java.lang.String r0 = r1.g
            r2 = 5
            java.lang.String r3 = "GLSActivity"
            r4 = 1
            r5 = 0
            r6 = 0
            if (r0 != 0) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            java.lang.String r0 = r1.d
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r1.f
            if (r0 != 0) goto L_0x006c
        L_0x0037:
            boolean r0 = android.util.Log.isLoggable(r3, r2)
            if (r0 == 0) goto L_0x0068
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Class r7 = r23.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r0[r6] = r7
            java.lang.String r7 = r1.g
            if (r7 == 0) goto L_0x0052
            java.lang.String r7 = "<omitted>"
            goto L_0x0053
        L_0x0052:
            r7 = r5
        L_0x0053:
            r0[r4] = r7
            r7 = 2
            java.lang.String r8 = r1.d
            r0[r7] = r8
            r7 = 3
            java.lang.String r8 = r1.f
            r0[r7] = r8
            java.lang.String r7 = "%s started with username=%s callingPackage=%s service=%s"
            java.lang.String r0 = java.lang.String.format(r7, r0)
            android.util.Log.w(r3, r0)
        L_0x0068:
            r1.a(r6, r5)
        L_0x006c:
            boolean r0 = r1.r
            if (r0 == 0) goto L_0x0071
            goto L_0x0094
        L_0x0071:
            android.graphics.drawable.Drawable r0 = r1.s
            if (r0 != 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            java.lang.String r0 = r1.t
            if (r0 != 0) goto L_0x0094
        L_0x007a:
            boolean r0 = android.util.Log.isLoggable(r3, r2)
            if (r0 == 0) goto L_0x0090
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = r1.d
            r0[r6] = r2
            java.lang.String r2 = "Failed to get ApplicationInfo for package: %s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            android.util.Log.w(r3, r0)
        L_0x0090:
            r1.a(r6, r5)
        L_0x0094:
            r1.requestWindowFeature(r4)
            r0 = 2131624088(0x7f0e0098, float:1.8875346E38)
            r1.setContentView((int) r0)
            gnu r0 = new gnu
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r3 = r1.g
            java.lang.String r7 = "com.google"
            r2.<init>(r3, r7)
            amzy r2 = defpackage.amzy.a((java.lang.Object) r2)
            r0.<init>(r1, r1, r2)
            r1.u = r0
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            crq r2 = r1.u
            r0.setAdapter(r2)
            r0.setItemsCanFocus(r6)
            r2 = 2131429383(0x7f0b0807, float:1.8480437E38)
            android.view.View r0 = r1.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.v = r0
            r0 = 2131429393(0x7f0b0811, float:1.8480457E38)
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.gms.common.widget.phone.ScrollViewWithEvents r0 = (com.google.android.gms.common.widget.phone.ScrollViewWithEvents) r0
            r1.y = r0
            com.google.android.chimera.FragmentManager r0 = r23.getSupportFragmentManager()
            java.lang.String r3 = "headerFragment"
            com.google.android.chimera.Fragment r7 = r0.findFragmentByTag(r3)
            if (r7 != 0) goto L_0x00f8
            com.google.android.chimera.FragmentTransaction r0 = r0.beginTransaction()
            r7 = 2131428625(0x7f0b0511, float:1.84789E38)
            java.lang.String r8 = r1.t
            gnn r8 = defpackage.gnn.a(r8)
            r0.add(r7, r8, r3)
            r0.commit()
        L_0x00f8:
            int r0 = defpackage.jhg.a
            ikz r0 = defpackage.gnv.a
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x014a
            java.lang.String r0 = r1.f
            java.lang.String r0 = r0.trim()
            java.lang.String r3 = "audience:"
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x014a
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r4 = r1.f
            java.lang.String r4 = r4.trim()
            boolean r3 = r4.startsWith(r3)
            if (r3 == 0) goto L_0x0142
            r3 = 9
            java.lang.String r3 = r4.substring(r3)
            r2[r6] = r3
            r3 = 2131951811(0x7f1300c3, float:1.9540047E38)
            java.lang.String r2 = r1.getString(r3, r2)
            r0.setText(r2)
            android.widget.LinearLayout r2 = r1.v
            r2.addView(r0)
            goto L_0x0229
        L_0x0142:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Expected auth token type to start with 'audience:'"
            r0.<init>(r2)
            throw r0
        L_0x014a:
            java.util.ArrayList r0 = r1.h
            if (r0 != 0) goto L_0x014f
            goto L_0x0155
        L_0x014f:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01ee
        L_0x0155:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h = r0
            java.lang.String r0 = r1.f
            java.lang.String r3 = "com.google.android.googleapps.permission.GOOGLE_AUTH."
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x01a3 }
            int r4 = r0.length()     // Catch:{ NameNotFoundException -> 0x01a3 }
            if (r4 != 0) goto L_0x0170
            java.lang.String r0 = new java.lang.String     // Catch:{ NameNotFoundException -> 0x01a3 }
            r0.<init>(r3)     // Catch:{ NameNotFoundException -> 0x01a3 }
            goto L_0x0174
        L_0x0170:
            java.lang.String r0 = r3.concat(r0)     // Catch:{ NameNotFoundException -> 0x01a3 }
        L_0x0174:
            android.content.pm.PackageManager r3 = r23.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01a3 }
            android.content.pm.PermissionInfo r0 = r3.getPermissionInfo(r0, r6)     // Catch:{ NameNotFoundException -> 0x01a3 }
            int r4 = r0.labelRes     // Catch:{ NameNotFoundException -> 0x01a3 }
            if (r4 == 0) goto L_0x018f
            java.lang.String r4 = r0.packageName     // Catch:{ NameNotFoundException -> 0x01a3 }
            int r7 = r0.labelRes     // Catch:{ NameNotFoundException -> 0x01a3 }
            java.lang.CharSequence r3 = r3.getText(r4, r7, r5)     // Catch:{ NameNotFoundException -> 0x01a3 }
            if (r3 == 0) goto L_0x018f
            java.lang.String r0 = r3.toString()     // Catch:{ NameNotFoundException -> 0x01a3 }
            goto L_0x01a5
        L_0x018f:
            java.lang.CharSequence r3 = r0.nonLocalizedLabel     // Catch:{ NameNotFoundException -> 0x01a3 }
            if (r3 == 0) goto L_0x019a
            java.lang.CharSequence r0 = r0.nonLocalizedLabel     // Catch:{ NameNotFoundException -> 0x01a3 }
            java.lang.String r0 = r0.toString()     // Catch:{ NameNotFoundException -> 0x01a3 }
            goto L_0x01a5
        L_0x019a:
            java.lang.String r3 = r0.name     // Catch:{ NameNotFoundException -> 0x01a3 }
            if (r3 == 0) goto L_0x01a1
            java.lang.String r0 = r0.name     // Catch:{ NameNotFoundException -> 0x01a3 }
            goto L_0x01a5
        L_0x01a1:
            r0 = r5
            goto L_0x01a5
        L_0x01a3:
            r0 = move-exception
            r0 = r5
        L_0x01a5:
            if (r0 == 0) goto L_0x01a8
            goto L_0x01aa
        L_0x01a8:
            java.lang.String r0 = r1.f
        L_0x01aa:
            java.lang.String r3 = "SID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x01bf
            java.lang.String r3 = "LSID"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x01bc
            goto L_0x01bf
        L_0x01bc:
            r8 = r0
            r9 = r5
            goto L_0x01cf
        L_0x01bf:
            r0 = 2131953987(0x7f130943, float:1.954446E38)
            java.lang.String r0 = r1.getString(r0)
            r3 = 2131953986(0x7f130942, float:1.9544458E38)
            java.lang.String r5 = r1.getString(r3)
            r8 = r0
            r9 = r5
        L_0x01cf:
            com.google.android.gms.auth.firstparty.shared.ScopeData r0 = new com.google.android.gms.auth.firstparty.shared.ScopeData
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            java.util.List r21 = com.google.android.gms.auth.firstparty.shared.ScopeData.a
            r22 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.util.ArrayList r3 = r1.h
            r3.add(r0)
        L_0x01ee:
            com.google.android.chimera.FragmentManager r0 = r23.getSupportFragmentManager()
            com.google.android.chimera.FragmentTransaction r3 = r0.beginTransaction()
            java.util.ArrayList r4 = r1.h
            int r4 = r4.size()
        L_0x01fc:
            if (r6 >= r4) goto L_0x0220
            java.util.ArrayList r5 = r1.h
            java.lang.Object r5 = r5.get(r6)
            com.google.android.gms.auth.firstparty.shared.ScopeData r5 = (com.google.android.gms.auth.firstparty.shared.ScopeData) r5
            java.lang.String r7 = a((int) r6)
            com.google.android.chimera.Fragment r8 = r0.findFragmentByTag(r7)
            if (r8 != 0) goto L_0x021d
            java.lang.String r8 = r1.t
            java.lang.String r9 = r1.g
            java.lang.String r10 = r1.d
            gnp r5 = defpackage.gnp.a(r6, r8, r9, r10, r5)
            r3.add(r2, r5, r7)
        L_0x021d:
            int r6 = r6 + 1
            goto L_0x01fc
        L_0x0220:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0229
            r3.commit()
        L_0x0229:
            r0 = 2131428340(0x7f0b03f4, float:1.8478322E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r2 = r23.getResources()
            r3 = 2131951812(0x7f1300c4, float:1.954005E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setText(r2)
            r0 = 2131427705(0x7f0b0179, float:1.8477034E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.w = r0
            r0.setOnClickListener(r1)
            r0 = 2131427360(0x7f0b0020, float:1.8476334E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.x = r0
            r0.setOnClickListener(r1)
            android.content.res.Resources r0 = r23.getResources()
            boolean r2 = defpackage.jix.a((android.content.res.Resources) r0)
            if (r2 == 0) goto L_0x026e
            r2 = 2131166938(0x7f0706da, float:1.7948135E38)
            float r0 = r0.getDimension(r2)
            goto L_0x0275
        L_0x026e:
            r2 = 2131166937(0x7f0706d9, float:1.7948133E38)
            float r0 = r0.getDimension(r2)
        L_0x0275:
            android.app.Activity r2 = r23.getContainerActivity()
            double r3 = (double) r0
            defpackage.jgv.a((android.app.Activity) r2, (double) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("callingPkg", this.d);
        bundle.putInt("callingUid", this.e);
        bundle.putString("service", this.f);
        bundle.putString("acctName", this.g);
        bundle.putParcelableArrayList("scopeData", this.h);
        bundle.putInt("lastScopeIndex", this.p);
        bundle.putBoolean("GrantCredentialsWithAclChimeraActivityhasTitle", this.q);
        bundle.putBoolean("GrantCredentialsWithAclChimeraActivityisRemoteApp", this.r);
        bundle.putString("GrantCredentialsWithAclChimeraActivityremoteAppLabel", this.t);
    }

    public final void onStart() {
        super.onStart();
    }

    public final void onStop() {
        super.onStop();
    }

    public static Intent a(String str, int i, String str2, String str3, ArrayList arrayList, boolean z2, int i2, String str4, boolean z3, String str5) {
        Intent className = new Intent().setClassName(ihs.b(), "com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclActivity");
        className.putExtra("callingPkg", str);
        className.putExtra("callingUid", i);
        className.putExtra("service", str2);
        className.putExtra("acctName", str3);
        className.putParcelableArrayListExtra("scopeData", arrayList);
        className.putExtra("GrantCredentialsWithAclChimeraActivityhasTitle", z2);
        className.putExtra("GrantCredentialsWithAclChimeraActivitytitle", i2);
        className.putExtra("GrantCredentialsWithAclChimeraActivityconsentCookieWrapper", str4);
        className.putExtra("GrantCredentialsWithAclChimeraActivityisRemoteApp", z3);
        className.putExtra("GrantCredentialsWithAclChimeraActivityremoteAppLabel", str5);
        return className;
    }

    private static final String a(int i) {
        StringBuilder sb = new StringBuilder(24);
        sb.append("scopeFragment");
        sb.append(i);
        return sb.toString();
    }

    private final void a(Bundle bundle) {
        this.d = bundle.getString("callingPkg");
        this.e = bundle.getInt("callingUid");
        this.f = bundle.getString("service");
        this.g = bundle.getString("acctName");
        this.p = bundle.getInt("lastScopeIndex");
        this.q = bundle.getBoolean("GrantCredentialsWithAclChimeraActivityhasTitle");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("scopeData");
        if (parcelableArrayList != null) {
            this.h.clear();
            this.h.addAll(parcelableArrayList);
        }
        this.r = bundle.getBoolean("GrantCredentialsWithAclChimeraActivityisRemoteApp");
        fzp fzp = new fzp(this);
        this.s = fzp.b(this.d);
        CharSequence a2 = fzp.a(this.d);
        if (a2 != null) {
            this.t = a2.toString();
        } else if (this.r) {
            this.t = bundle.getString("GrantCredentialsWithAclChimeraActivityremoteAppLabel");
        }
    }

    public final void a(long j) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpk anpk = (anpk) aucd.b;
        anpk anpk2 = anpk.k;
        anpk.a |= 4;
        anpk.d = j;
        aucd aucd2 = this.b;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        anpk anpk3 = (anpk) aucd2.b;
        anpk3.a |= 8;
        anpk3.e = true;
    }

    public final void a(boolean z2, boolean z3) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpk anpk = (anpk) aucd.b;
        anpk anpk2 = anpk.k;
        anpk.a |= 16;
        anpk.f = z2;
        aucd aucd2 = this.b;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        anpk anpk3 = (anpk) aucd2.b;
        anpk3.a |= 32;
        anpk3.g = z3;
    }
}
