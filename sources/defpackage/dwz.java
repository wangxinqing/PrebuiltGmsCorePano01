package defpackage;

import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: dwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwz extends jba {
    private final ClientContext a;
    private final dwj d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final Map j;
    private final String k;
    private final String l;
    private final List m = new ArrayList();
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final byte[] r;
    private final int s;
    private final int t;
    private final String u;
    private final String v;
    private final int w;
    private final String x;
    private final dwn y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dwz(ClientContext clientContext, dwj dwj, String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, List list, String str8, String str9, String str10, String str11, byte[] bArr, int i2, int i3, String str12, String str13, int i4, String str14, dwn dwn) {
        super(106, "AppInviteCreateInvitations");
        this.a = clientContext;
        this.d = dwj;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = map;
        this.k = str6;
        this.l = str7;
        this.n = str8;
        this.o = str9;
        this.p = str10;
        this.q = str11;
        this.r = bArr;
        this.s = i2;
        this.t = i3;
        this.u = str12;
        this.v = str13;
        this.w = i4;
        this.x = str14;
        this.y = dwn;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.m.add(new SourcedContactPerson((ContactPerson) list.get(i5), 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r28) {
        /*
            r27 = this;
            r1 = r27
            dwj r5 = r1.d     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            com.google.android.gms.common.internal.ClientContext r6 = r1.a     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r7 = r1.e     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r8 = r1.f     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r9 = r1.g     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r10 = r1.h     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r11 = r1.i     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.util.Map r12 = r1.j     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r13 = r1.k     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r14 = r1.l     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.util.List r15 = r1.m     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r0 = r1.n     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r4 = r1.o     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r3 = r1.p     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.lang.String r2 = r1.q     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r19 = r2
            byte[] r2 = r1.r     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r20 = r2
            int r2 = r1.s     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r21 = r2
            int r2 = r1.t     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r22 = r2
            java.lang.String r2 = r1.u     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r23 = r2
            java.lang.String r2 = r1.v     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r24 = r2
            int r2 = r1.w     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r25 = r2
            java.lang.String r2 = r1.x     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r16 = r0
            r17 = r4
            r18 = r3
            r26 = r2
            avfk r0 = r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            if (r0 == 0) goto L_0x0130
            aucx r2 = r0.a     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            boolean r2 = r2.isEmpty()     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            if (r2 != 0) goto L_0x0130
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r3.<init>()     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            aucx r0 = r0.a     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x005f:
            boolean r4 = r0.hasNext()     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r4 == 0) goto L_0x0126
            java.lang.Object r4 = r0.next()     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            avfy r4 = (defpackage.avfy) r4     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            avgm r5 = r4.c     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r5 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            avgm r5 = defpackage.avgm.e     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x0072:
            avge r6 = r4.b     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r6 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            avge r6 = defpackage.avge.d     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x0079:
            int r6 = r6.a     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x008b
            avge r6 = r4.b     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r6 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            avge r6 = defpackage.avge.d     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x0086:
            java.lang.String r6 = r6.b     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r3.add(r6)     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x008b:
            int r6 = r4.a     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r7 = 4
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0122
            int r6 = r5.a     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r6 = r6 & 2
            if (r6 == 0) goto L_0x0122
            avfn r6 = r5.c     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r6 == 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            avfn r6 = defpackage.avfn.f     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x009e:
            int r6 = r6.b     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            int r6 = defpackage.avfm.a(r6)     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r6 == 0) goto L_0x011e
            r7 = 4
            if (r6 != r7) goto L_0x011e
            avfn r6 = r5.c     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r6 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            avfn r6 = defpackage.avfn.f     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x00b0:
            java.lang.String r6 = r6.e     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            boolean r6 = r6.isEmpty()     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r6 != 0) goto L_0x011a
            avgj r6 = r4.d     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r6 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            avgj r6 = defpackage.avgj.b     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x00bf:
            java.lang.String r6 = r6.a     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            boolean r6 = r6.isEmpty()     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r6 != 0) goto L_0x0116
            int r6 = r4.a     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0116
            avfn r5 = r5.c     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r5 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            avfn r5 = defpackage.avfn.f     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x00d4:
            java.lang.String r5 = r5.e     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            avgj r6 = r4.d     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r6 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            avgj r6 = defpackage.avgj.b     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x00dd:
            java.lang.String r6 = r6.a     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            android.text.Spanned r6 = android.text.Html.fromHtml(r6)     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            java.lang.String r6 = r6.toString()     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            avge r4 = r4.b     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            if (r4 == 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            avge r4 = defpackage.avge.d     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
        L_0x00ee:
            java.lang.String r4 = r4.b     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            dxe r7 = new dxe     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            android.content.Context r8 = r28.getApplicationContext()     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r7.<init>(r8)     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r7.a = r5     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r7.b = r6     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r7.c = r4     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            com.google.android.gms.common.internal.ClientContext r4 = r1.a     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            android.accounts.Account r4 = r4.d     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            java.lang.String r4 = r4.name     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r7.d = r4     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            java.lang.String r4 = r1.x     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r7.e = r4     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            android.content.Intent r4 = r7.a()     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            r5 = r28
            r5.startService(r4)     // Catch:{ eif -> 0x012d, VolleyError -> 0x012a, dvy -> 0x0128 }
            goto L_0x005f
        L_0x0116:
            r5 = r28
            goto L_0x005f
        L_0x011a:
            r5 = r28
            goto L_0x005f
        L_0x011e:
            r5 = r28
            goto L_0x005f
        L_0x0122:
            r5 = r28
            goto L_0x005f
        L_0x0126:
            r4 = r3
            goto L_0x0133
        L_0x0128:
            r0 = move-exception
            goto L_0x012b
        L_0x012a:
            r0 = move-exception
        L_0x012b:
            r4 = r3
            goto L_0x0138
        L_0x012d:
            r0 = move-exception
            r4 = r3
            goto L_0x0142
        L_0x0130:
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.c     // Catch:{ eif -> 0x0140, VolleyError -> 0x0136, dvy -> 0x0134 }
            r4 = 0
        L_0x0133:
            goto L_0x0148
        L_0x0134:
            r0 = move-exception
            goto L_0x0137
        L_0x0136:
            r0 = move-exception
        L_0x0137:
            r4 = 0
        L_0x0138:
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r0 = 8
            r2.<init>(r0)
            goto L_0x0148
        L_0x0140:
            r0 = move-exception
            r4 = 0
        L_0x0142:
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r3 = 4
            r2.<init>(r3)
        L_0x0148:
            dwn r0 = r1.y
            if (r0 == 0) goto L_0x015a
            android.os.Parcel r3 = r0.aQ()
            defpackage.bhx.a((android.os.Parcel) r3, (android.os.Parcelable) r2)
            r3.writeStringList(r4)
            r2 = 1
            r0.c(r2, r3)
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwz.a(android.content.Context):void");
    }
}
