package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: apq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apq extends apu {
    public apc a;
    public aps b;
    public List c;
    private ArrayList d = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a3, code lost:
        if (defpackage.apl.b(r4, "text", (java.lang.String) null) != null) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public apq(androidx.slice.Slice r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r20.<init>((androidx.slice.Slice) r21)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.d = r2
            androidx.slice.SliceItem r2 = r0.f
            if (r2 == 0) goto L_0x01df
            java.lang.String r2 = "slice"
            java.lang.String r3 = "actions"
            androidx.slice.SliceItem r4 = defpackage.apl.b((androidx.slice.Slice) r1, (java.lang.String) r2, (java.lang.String) r3)
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]
            r7 = 0
            r6[r7] = r3
            r8 = 1
            java.lang.String r9 = "shortcut"
            r6[r8] = r9
            r10 = 0
            if (r4 == 0) goto L_0x002d
            java.util.List r4 = defpackage.apl.a((androidx.slice.SliceItem) r4, (java.lang.String) r2, (java.lang.String[]) r6, (java.lang.String[]) r10)
            goto L_0x002e
        L_0x002d:
            r4 = r10
        L_0x002e:
            if (r4 == 0) goto L_0x0052
            java.util.ArrayList r6 = new java.util.ArrayList
            int r11 = r4.size()
            r6.<init>(r11)
            r11 = 0
        L_0x003a:
            int r12 = r4.size()
            if (r11 >= r12) goto L_0x0051
            java.lang.Object r12 = r4.get(r11)
            androidx.slice.SliceItem r12 = (androidx.slice.SliceItem) r12
            apd r13 = new apd
            r13.<init>(r12)
            r6.add(r13)
            int r11 = r11 + 1
            goto L_0x003a
        L_0x0051:
            goto L_0x0053
        L_0x0052:
            r6 = r10
        L_0x0053:
            r0.c = r6
            r4 = 8
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r6 = "list_item"
            r4[r7] = r6
            r4[r8] = r9
            r4[r5] = r3
            r11 = 3
            java.lang.String r12 = "keywords"
            r4[r11] = r12
            r13 = 4
            java.lang.String r14 = "ttl"
            r4[r13] = r14
            r15 = 5
            java.lang.String r16 = "last_updated"
            r4[r15] = r16
            r17 = 6
            java.lang.String r13 = "horizontal"
            r4[r17] = r13
            r17 = 7
            java.lang.String r19 = "selection_option"
            r4[r17] = r19
            androidx.slice.SliceItem r4 = defpackage.apl.a((androidx.slice.Slice) r1, (java.lang.String) r2, (java.lang.String[]) r10, (java.lang.String[]) r4)
            java.lang.String r17 = "see_more"
            if (r4 == 0) goto L_0x00a6
            java.lang.String r15 = r4.b
            boolean r15 = r2.equals(r15)
            if (r15 == 0) goto L_0x00a6
            java.lang.String[] r15 = new java.lang.String[r11]
            r15[r7] = r3
            r15[r8] = r12
            r15[r5] = r17
            boolean r15 = r4.a((java.lang.String[]) r15)
            if (r15 != 0) goto L_0x00a6
            r15 = r10
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r11 = "text"
            androidx.slice.SliceItem r11 = defpackage.apl.b((androidx.slice.SliceItem) r4, (java.lang.String) r11, (java.lang.String) r15)
            if (r11 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r4 = r10
        L_0x00a7:
            if (r4 == 0) goto L_0x00b5
            aps r11 = new aps
            r11.<init>(r4)
            r0.b = r11
            java.util.ArrayList r4 = r0.d
            r4.add(r11)
        L_0x00b5:
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r7] = r17
            androidx.slice.SliceItem r4 = defpackage.apl.a((androidx.slice.Slice) r1, (java.lang.String) r10, (java.lang.String) r10, (java.lang.String[]) r4)
            java.lang.String r11 = "action"
            if (r4 == 0) goto L_0x00ec
            java.lang.String r15 = r4.b
            boolean r15 = r2.equals(r15)
            if (r15 == 0) goto L_0x00ec
            androidx.slice.Slice r15 = r4.f()
            java.util.List r15 = r15.c()
            int r10 = r15.size()
            if (r10 != r8) goto L_0x00ed
            java.lang.Object r10 = r15.get(r7)
            androidx.slice.SliceItem r10 = (androidx.slice.SliceItem) r10
            java.lang.String r10 = r10.b
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00ed
            java.lang.Object r4 = r15.get(r7)
            androidx.slice.SliceItem r4 = (androidx.slice.SliceItem) r4
            goto L_0x00ed
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            if (r4 != 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            aps r10 = new aps
            r10.<init>(r4)
        L_0x00f5:
            java.util.List r1 = r21.c()
            r4 = 0
        L_0x00fa:
            int r10 = r1.size()
            if (r4 >= r10) goto L_0x0170
            java.lang.Object r10 = r1.get(r4)
            androidx.slice.SliceItem r10 = (androidx.slice.SliceItem) r10
            java.lang.String r15 = r10.b
            r21 = r1
            r5 = 5
            java.lang.String[] r1 = new java.lang.String[r5]
            r1[r7] = r3
            r1[r8] = r17
            r19 = 2
            r1[r19] = r12
            r19 = 3
            r1[r19] = r14
            r18 = 4
            r1[r18] = r16
            boolean r1 = r10.a((java.lang.String[]) r1)
            if (r1 == 0) goto L_0x0124
            goto L_0x016a
        L_0x0124:
            boolean r1 = r11.equals(r15)
            if (r1 != 0) goto L_0x0130
            boolean r1 = r2.equals(r15)
            if (r1 == 0) goto L_0x016a
        L_0x0130:
            aps r1 = r0.b
            if (r1 != 0) goto L_0x0148
            boolean r1 = r10.a((java.lang.String) r6)
            if (r1 == 0) goto L_0x013b
            goto L_0x0148
        L_0x013b:
            aps r1 = new aps
            r1.<init>(r10)
            r0.b = r1
            java.util.ArrayList r10 = r0.d
            r10.add(r7, r1)
            goto L_0x016a
        L_0x0148:
            boolean r1 = r10.a((java.lang.String) r6)
            if (r1 == 0) goto L_0x016a
            boolean r1 = r10.a((java.lang.String) r13)
            if (r1 == 0) goto L_0x0160
            java.util.ArrayList r1 = r0.d
            apo r15 = new apo
            r15.<init>(r10)
            r1.add(r15)
            goto L_0x016a
        L_0x0160:
            java.util.ArrayList r1 = r0.d
            aps r15 = new aps
            r15.<init>(r10)
            r1.add(r15)
        L_0x016a:
            int r4 = r4 + 1
            r1 = r21
            r5 = 2
            goto L_0x00fa
        L_0x0170:
            aps r1 = r0.b
            if (r1 != 0) goto L_0x0186
            java.util.ArrayList r1 = r0.d
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0186
            java.util.ArrayList r1 = r0.d
            java.lang.Object r1 = r1.get(r7)
            aps r1 = (defpackage.aps) r1
            r0.b = r1
        L_0x0186:
            java.util.ArrayList r1 = r0.d
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x01ac
            java.util.ArrayList r1 = r0.d
            int r2 = r1.size()
            int r2 = r2 + -1
            java.lang.Object r1 = r1.get(r2)
            boolean r1 = r1 instanceof defpackage.apo
            if (r1 == 0) goto L_0x01ac
            java.util.ArrayList r1 = r0.d
            int r2 = r1.size()
            int r2 = r2 + -1
            java.lang.Object r1 = r1.get(r2)
            apo r1 = (defpackage.apo) r1
        L_0x01ac:
            aps r1 = r0.b
            if (r1 == 0) goto L_0x01b3
            androidx.slice.SliceItem r1 = r1.a
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            if (r1 != 0) goto L_0x01c7
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r7] = r9
            java.lang.String r2 = "title"
            r1[r8] = r2
            androidx.slice.SliceItem r2 = r0.f
            r3 = 0
            androidx.slice.SliceItem r1 = defpackage.apl.b(r2, r11, r1, r3)
            goto L_0x01c8
        L_0x01c7:
            r3 = 0
        L_0x01c8:
            if (r1 != 0) goto L_0x01d3
            androidx.slice.SliceItem r1 = r0.f
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            androidx.slice.SliceItem r1 = defpackage.apl.b((androidx.slice.SliceItem) r1, (java.lang.String) r11, (java.lang.String) r10)
        L_0x01d3:
            if (r1 == 0) goto L_0x01db
            apd r10 = new apd
            r10.<init>(r1)
            goto L_0x01dc
        L_0x01db:
            r10 = r3
        L_0x01dc:
            r0.a = r10
            return
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apq.<init>(androidx.slice.Slice):void");
    }

    public final boolean a() {
        return super.a() && this.d.size() > 0;
    }
}
