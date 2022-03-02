package com.google.android.gms.appinvite.ui.context;

import android.os.Bundle;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.SectionInfo;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SelectionFragmentHolderImpl extends dya {
    private dxx a;

    private static final void a(Bundle bundle, SectionInfo sectionInfo) {
        sectionInfo.p = bundle.getBoolean("docked");
    }

    public final List b() {
        return this.a.b();
    }

    public final mby a() {
        return mbz.a((Object) this.a);
    }

    public final void b(int i) {
        dxx dxx = this.a;
        dxx.B = i;
        dzw dzw = dxx.s;
        if (dzw != null) {
            dzw.a(i);
        }
    }

    public final void a(int i) {
        dxx dxx = this.a;
        dxx.A = i;
        dxf dxf = dxx.D;
        if (dxf != null) {
            dxf.c = i;
        }
        dym dym = dxx.t;
        if (dym != null) {
            dym.f(dxx.A);
        }
        dyj dyj = dxx.u;
        if (dyj != null) {
            dyj.f(dxx.A);
        }
    }

    public final void b(ContactPerson contactPerson) {
        List b = this.a.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            ContactPerson contactPerson2 = (ContactPerson) b.get(i);
            if (!contactPerson.equals(contactPerson2)) {
                i++;
                if (eap.d(contactPerson, contactPerson2)) {
                }
            }
            eap.b(contactPerson2, contactPerson);
            dxx dxx = this.a;
            dxx.t.b(contactPerson2);
            dyj dyj = dxx.u;
            if (dyj != null) {
                dyj.b(contactPerson2);
                return;
            }
            return;
        }
    }

    public final void a(ContactPerson contactPerson) {
        List b = this.a.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            ContactPerson contactPerson2 = (ContactPerson) b.get(i);
            i++;
            if (contactPerson.equals(contactPerson2)) {
                dxx dxx = this.a;
                dxx.a(contactPerson2, 0, dxx.d(contactPerson2));
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = r0.a
            int r2 = r0.b
            java.util.ArrayList r3 = r0.c
            boolean r4 = r0.d
            android.os.Bundle r5 = r0.n
            boolean r6 = r0.l
            java.lang.String[] r8 = r0.e
            int r9 = r0.f
            int r10 = r0.g
            java.lang.String r11 = r0.h
            boolean r12 = r0.j
            boolean r15 = r0.m
            java.util.ArrayList r0 = r0.k
            java.util.ArrayList r14 = new java.util.ArrayList
            int r7 = r0.size()
            r14.<init>(r7)
            int r7 = r0.size()
            r13 = 0
        L_0x002a:
            if (r13 >= r7) goto L_0x00ef
            java.lang.Object r16 = r0.get(r13)
            r17 = r0
            r0 = r16
            android.os.Bundle r0 = (android.os.Bundle) r0
            r16 = r7
            java.lang.String r7 = "type"
            r18 = r15
            java.lang.String r15 = r0.getString(r7)
            r19 = r12
            int r12 = r15.hashCode()
            r20 = r11
            java.lang.String r11 = "grid"
            r21 = r10
            r10 = -1715965556(0xffffffff99b8718c, float:-1.9071015E-23)
            if (r12 == r10) goto L_0x006e
            r10 = 3181382(0x308b46, float:4.458066E-39)
            if (r12 == r10) goto L_0x0066
            r10 = 3322014(0x32b09e, float:4.655133E-39)
            if (r12 == r10) goto L_0x005c
            goto L_0x0078
        L_0x005c:
            java.lang.String r10 = "list"
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x0078
            r10 = 2
            goto L_0x0079
        L_0x0066:
            boolean r10 = r15.equals(r11)
            if (r10 == 0) goto L_0x0078
            r10 = 1
            goto L_0x0079
        L_0x006e:
            java.lang.String r10 = "selection"
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x0078
            r10 = 0
            goto L_0x0079
        L_0x0078:
            r10 = -1
        L_0x0079:
            if (r10 == 0) goto L_0x00c4
            r12 = 1
            if (r10 == r12) goto L_0x0082
            r12 = 2
            if (r10 == r12) goto L_0x0082
            goto L_0x00df
        L_0x0082:
            java.lang.String r7 = r0.getString(r7)
            java.lang.String r10 = "source"
            java.lang.String r10 = r0.getString(r10)
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x0098
            com.google.android.gms.appinvite.ui.context.section.GridSectionInfo r7 = new com.google.android.gms.appinvite.ui.context.section.GridSectionInfo
            r7.<init>((java.lang.String) r10)
            goto L_0x009d
        L_0x0098:
            com.google.android.gms.appinvite.ui.context.section.ListSectionInfo r7 = new com.google.android.gms.appinvite.ui.context.section.ListSectionInfo
            r7.<init>((java.lang.String) r10)
        L_0x009d:
            a(r0, r7)
            java.lang.String r10 = "loaderOptions"
            java.lang.String r10 = r0.getString(r10)
            r7.d = r10
            java.lang.String r10 = "headerText"
            java.lang.String r10 = r0.getString(r10)
            r7.g = r10
            java.lang.String r10 = "includeInSearch"
            boolean r10 = r0.getBoolean(r10)
            r7.e = r10
            java.lang.String r10 = "methodOrder"
            java.lang.String[] r0 = r0.getStringArray(r10)
            r7.b = r0
            r14.add(r7)
            goto L_0x00df
        L_0x00c4:
            com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo r7 = new com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo
            r7.<init>()
            a(r0, r7)
            java.lang.String r10 = "hintText"
            java.lang.CharSequence r10 = r0.getCharSequence(r10)
            r7.a = r10
            java.lang.String r10 = "showCount"
            boolean r0 = r0.getBoolean(r10)
            r7.b = r0
            r14.add(r7)
        L_0x00df:
            int r13 = r13 + 1
            r7 = r16
            r0 = r17
            r15 = r18
            r12 = r19
            r11 = r20
            r10 = r21
            goto L_0x002a
        L_0x00ef:
            r21 = r10
            r20 = r11
            r19 = r12
            r18 = r15
            if (r3 == 0) goto L_0x0100
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r3 = r0
            goto L_0x0102
        L_0x0100:
            r0 = 0
            r3 = r0
        L_0x0102:
            r7 = 0
            r13 = 0
            r0 = 0
            r10 = r14
            r14 = r0
            r15 = 0
            r17 = r18
            r16 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r21
            r11 = r20
            r12 = r19
            dxx r0 = defpackage.dxx.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r22
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appinvite.ui.context.SelectionFragmentHolderImpl.a(com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions):void");
    }

    public final void a(dxy dxy) {
        this.a.e = new dyg(dxy);
    }

    public final void a(dxz dxz) {
        this.a.f = new dyh(dxz);
    }

    public final void a(mby mby) {
        this.a = (dxx) mbz.a(mby);
    }

    public final void a(boolean z) {
        dxx dxx = this.a;
        dxx.z = z;
        dym dym = dxx.t;
        if (dym != null) {
            dym.c(z);
        }
        dyj dyj = dxx.u;
        if (dyj != null) {
            dyj.c(z);
        }
        dxm dxm = dxx.E;
        if (dxm != null) {
            dxm.m = z;
        }
        dxf dxf = dxx.D;
        if (dxf != null) {
            dxf.notifyDataSetChanged();
        }
    }
}
