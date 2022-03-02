package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxc extends jba {
    private final ClientContext a;
    private final dwj d;
    private final dwd e;
    private List f = new ArrayList();
    private final List g;

    public dxc(ClientContext clientContext, dwj dwj, dwd dwd, List list, List list2) {
        super(77, "AppInviteUpdateSms");
        new ArrayList();
        this.f = list;
        this.g = list2;
        this.a = clientContext;
        this.d = dwj;
        this.e = dwd;
    }

    /* JADX WARNING: type inference failed for: r14v15, types: [audx] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r14) {
        /*
            r13 = this;
            java.lang.String r14 = "AppInviteAgent"
            dwj r0 = r13.d     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            com.google.android.gms.common.internal.ClientContext r1 = r13.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.util.List r2 = r13.f     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r3 = 0
            if (r2 == 0) goto L_0x0018
            int r4 = r2.size()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            java.util.List r4 = r13.g     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r4 == 0) goto L_0x002a
            int r5 = r4.size()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.Object[] r4 = r4.toArray(r5)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            goto L_0x002b
        L_0x002a:
            r4 = r3
        L_0x002b:
            dwi r0 = r0.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avgu r5 = defpackage.avgu.f     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucd r5 = r5.o()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String r6 = r1.e     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avfe r6 = r0.a(r6)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r6 == 0) goto L_0x0197
            boolean r7 = r5.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r8 = 0
            if (r7 != 0) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            r5.c()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r5.c = r8     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x0046:
            aucj r7 = r5.b     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avgu r7 = (defpackage.avgu) r7     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r6.getClass()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r7.b = r6     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            int r6 = r7.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r6 = r6 | 1
            r7.a = r6     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avgt r6 = r0.a()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            boolean r7 = r5.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r7 != 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            r5.c()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r5.c = r8     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x0063:
            aucj r7 = r5.b     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avgu r7 = (defpackage.avgu) r7     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r6.getClass()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r7.e = r6     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            int r6 = r7.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r6 = r6 | 2
            r7.a = r6     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r2 == 0) goto L_0x00d0
            int r6 = r2.length     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r6 <= 0) goto L_0x00d0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r7.<init>(r6)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r6 = 0
        L_0x007d:
            int r9 = r2.length     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r6 >= r9) goto L_0x00ad
            avge r9 = defpackage.avge.d     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucd r9 = r9.o()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r10 = r2[r6]     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            boolean r11 = r9.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r11 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r9.c()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r9.c = r8     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x0092:
            aucj r11 = r9.b     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avge r11 = (defpackage.avge) r11     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r10.getClass()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            int r12 = r11.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r12 = r12 | 1
            r11.a = r12     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r11.b = r10     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucj r9 = r9.i()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avge r9 = (defpackage.avge) r9     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r7.add(r9)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            int r6 = r6 + 1
            goto L_0x007d
        L_0x00ad:
            boolean r2 = r5.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r2 != 0) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            r5.c()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r5.c = r8     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x00b7:
            aucj r2 = r5.b     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avgu r2 = (defpackage.avgu) r2     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucx r6 = r2.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            boolean r6 = r6.a()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r6 != 0) goto L_0x00cb
            aucx r6 = r2.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r2.c = r6     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x00cb:
            aucx r2 = r2.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            defpackage.auab.a((java.lang.Iterable) r7, (java.util.List) r2)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x00d0:
            if (r4 != 0) goto L_0x00d3
            goto L_0x012f
        L_0x00d3:
            int r2 = r4.length     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r2 <= 0) goto L_0x012f
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r6.<init>(r2)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r2 = 0
        L_0x00dc:
            int r7 = r4.length     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r2 >= r7) goto L_0x010c
            avge r7 = defpackage.avge.d     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucd r7 = r7.o()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r9 = r4[r2]     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            boolean r10 = r7.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r10 != 0) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            r7.c()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r7.c = r8     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x00f1:
            aucj r10 = r7.b     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avge r10 = (defpackage.avge) r10     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r9.getClass()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            int r11 = r10.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r11 = r11 | 1
            r10.a = r11     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r10.b = r9     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucj r7 = r7.i()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avge r7 = (defpackage.avge) r7     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r6.add(r7)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            int r2 = r2 + 1
            goto L_0x00dc
        L_0x010c:
            boolean r2 = r5.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r2 != 0) goto L_0x0111
            goto L_0x0116
        L_0x0111:
            r5.c()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r5.c = r8     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x0116:
            aucj r2 = r5.b     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avgu r2 = (defpackage.avgu) r2     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucx r4 = r2.d     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            boolean r4 = r4.a()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r4 != 0) goto L_0x012a
            aucx r4 = r2.d     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucx r4 = defpackage.aucj.a((defpackage.aucx) r4)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r2.d = r4     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x012a:
            aucx r2 = r2.d     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            defpackage.auab.a((java.lang.Iterable) r6, (java.util.List) r2)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x012f:
            dwh r2 = new dwh     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            dwg r0 = r0.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            auci r4 = defpackage.avgu.g     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucj r5 = r5.i()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avgu r5 = (defpackage.avgu) r5     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r2.<init>(r0, r1, r4, r5)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r2.a()     // Catch:{ eif -> 0x0190, VolleyError -> 0x016c }
            boolean r0 = r2.c()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r0 == 0) goto L_0x0162
            int r0 = r2.e()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r2 = 60
            r1.<init>(r2)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String r2 = "Update Sms invitations failed due to error code: "
            r1.append(r2)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r1.append(r0)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String r0 = r1.toString()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            android.util.Log.e(r14, r0)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            goto L_0x0198
        L_0x0162:
            auci r14 = defpackage.avgv.c     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            audx r14 = r2.a(r14)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r3 = r14
            avgv r3 = (defpackage.avgv) r3     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            goto L_0x0198
        L_0x016c:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            int r1 = r1.length()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            int r1 = r1 + 32
            r2.<init>(r1)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String r1 = "Error communicating with server "
            r2.append(r1)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            r2.append(r0)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.lang.String r0 = r2.toString()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            android.util.Log.e(r14, r0)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            goto L_0x0198
        L_0x0190:
            r0 = move-exception
            java.lang.String r1 = "Authentication Failed "
            android.util.Log.e(r14, r1, r0)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            goto L_0x0198
        L_0x0197:
        L_0x0198:
            if (r3 == 0) goto L_0x01c1
            aucx r14 = r3.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            boolean r14 = r14.isEmpty()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r14 != 0) goto L_0x01be
            dwd r14 = r13.e     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            dlc r14 = r14.a()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            aucx r0 = r3.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
        L_0x01ae:
            boolean r1 = r0.hasNext()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            if (r1 == 0) goto L_0x01be
            java.lang.Object r1 = r0.next()     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            avga r1 = (defpackage.avga) r1     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            defpackage.dwd.a((defpackage.dlc) r14, (defpackage.avga) r1)     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            goto L_0x01ae
        L_0x01be:
            com.google.android.gms.common.api.Status r14 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            return
        L_0x01c1:
            com.google.android.gms.common.api.Status r14 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x01d7, AuthFailureError -> 0x01d5, NetworkError -> 0x01cd, VolleyError -> 0x01c4 }
            return
        L_0x01c4:
            r14 = move-exception
            com.google.android.gms.common.api.Status r14 = new com.google.android.gms.common.api.Status
            r0 = 8
            r14.<init>(r0)
            return
        L_0x01cd:
            r14 = move-exception
            com.google.android.gms.common.api.Status r14 = new com.google.android.gms.common.api.Status
            r0 = 7
            r14.<init>(r0)
            return
        L_0x01d5:
            r14 = move-exception
            goto L_0x01d8
        L_0x01d7:
            r14 = move-exception
        L_0x01d8:
            com.google.android.gms.common.api.Status r14 = new com.google.android.gms.common.api.Status
            r0 = 4
            r14.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxc.a(android.content.Context):void");
    }
}
