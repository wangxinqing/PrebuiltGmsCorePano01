package defpackage;

import android.content.Intent;

/* renamed from: aljl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljl {
    private static aljl d;
    public final int a;
    public final String b = null;
    public final boolean c;

    public aljl(int i, boolean z) {
        this.a = i;
        this.c = z;
    }

    public static aljl a() {
        if (d == null) {
            aljk aljk = new aljk();
            aljk.a = 2132018088;
            aljk.b = true;
            d = aljk.a();
        }
        return d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.c
            r5 = 1
            r6 = 3
            r7 = 5
            r8 = 6
            r9 = 2
            java.lang.String r10 = "glif_light"
            java.lang.String r11 = "material"
            java.lang.String r12 = "glif_v3"
            java.lang.String r13 = "glif_v2"
            java.lang.String r14 = "glif"
            java.lang.String r15 = "glif_v3_light"
            java.lang.String r3 = "material_light"
            java.lang.String r4 = "glif_v2_light"
            r16 = -1
            r17 = 0
            if (r2 == 0) goto L_0x0087
            if (r20 != 0) goto L_0x0087
            if (r1 == 0) goto L_0x00f5
            int r2 = r19.hashCode()
            switch(r2) {
                case -2128555920: goto L_0x0065;
                case -1270463490: goto L_0x005d;
                case -1241052239: goto L_0x0055;
                case 3175618: goto L_0x004d;
                case 115650329: goto L_0x0045;
                case 115650330: goto L_0x003d;
                case 299066663: goto L_0x0035;
                case 767685465: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x006d
        L_0x002d:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x006d
            r3 = 4
            goto L_0x006e
        L_0x0035:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x006d
            r3 = 7
            goto L_0x006e
        L_0x003d:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x006d
            r3 = 1
            goto L_0x006e
        L_0x0045:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x006d
            r3 = 3
            goto L_0x006e
        L_0x004d:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x006d
            r3 = 5
            goto L_0x006e
        L_0x0055:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x006d
            r3 = 0
            goto L_0x006e
        L_0x005d:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            r3 = 6
            goto L_0x006e
        L_0x0065:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x006d
            r3 = 2
            goto L_0x006e
        L_0x006d:
            r3 = -1
        L_0x006e:
            switch(r3) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0082;
                case 2: goto L_0x007d;
                case 3: goto L_0x007d;
                case 4: goto L_0x0078;
                case 5: goto L_0x0078;
                case 6: goto L_0x0073;
                case 7: goto L_0x0073;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x00f5
        L_0x0073:
            r17 = 2132018097(0x7f1403b1, float:1.9674491E38)
            goto L_0x00f5
        L_0x0078:
            r17 = 2132018088(0x7f1403a8, float:1.9674473E38)
            goto L_0x00f5
        L_0x007d:
            r17 = 2132018091(0x7f1403ab, float:1.9674479E38)
            goto L_0x00f5
        L_0x0082:
            r17 = 2132018094(0x7f1403ae, float:1.9674485E38)
            goto L_0x00f5
        L_0x0087:
            if (r1 == 0) goto L_0x00f5
            int r2 = r19.hashCode()
            switch(r2) {
                case -2128555920: goto L_0x00c9;
                case -1270463490: goto L_0x00c1;
                case -1241052239: goto L_0x00b9;
                case 3175618: goto L_0x00b1;
                case 115650329: goto L_0x00a9;
                case 115650330: goto L_0x00a1;
                case 299066663: goto L_0x0099;
                case 767685465: goto L_0x0091;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x00d1
        L_0x0091:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00d1
            r3 = 4
            goto L_0x00d2
        L_0x0099:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00d1
            r3 = 7
            goto L_0x00d2
        L_0x00a1:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00d1
            r3 = 1
            goto L_0x00d2
        L_0x00a9:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00d1
            r3 = 3
            goto L_0x00d2
        L_0x00b1:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00d1
            r3 = 5
            goto L_0x00d2
        L_0x00b9:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00d1
            r3 = 0
            goto L_0x00d2
        L_0x00c1:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d1
            r3 = 6
            goto L_0x00d2
        L_0x00c9:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00d1
            r3 = 2
            goto L_0x00d2
        L_0x00d1:
            r3 = -1
        L_0x00d2:
            switch(r3) {
                case 0: goto L_0x00f2;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00ea;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00e2;
                case 5: goto L_0x00de;
                case 6: goto L_0x00da;
                case 7: goto L_0x00d6;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x00f5
        L_0x00d6:
            r17 = 2132018096(0x7f1403b0, float:1.967449E38)
            goto L_0x00f5
        L_0x00da:
            r17 = 2132018098(0x7f1403b2, float:1.9674493E38)
            goto L_0x00f5
        L_0x00de:
            r17 = 2132018087(0x7f1403a7, float:1.967447E38)
            goto L_0x00f5
        L_0x00e2:
            r17 = 2132018089(0x7f1403a9, float:1.9674475E38)
            goto L_0x00f5
        L_0x00e6:
            r17 = 2132018090(0x7f1403aa, float:1.9674477E38)
            goto L_0x00f5
        L_0x00ea:
            r17 = 2132018092(0x7f1403ac, float:1.967448E38)
            goto L_0x00f5
        L_0x00ee:
            r17 = 2132018093(0x7f1403ad, float:1.9674483E38)
            goto L_0x00f5
        L_0x00f2:
            r17 = 2132018095(0x7f1403af, float:1.9674487E38)
        L_0x00f5:
            if (r17 != 0) goto L_0x00fa
            int r1 = r0.a
            return r1
        L_0x00fa:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljl.a(java.lang.String, boolean):int");
    }

    public final int a(Intent intent) {
        return a(intent.getStringExtra("theme"), alht.a(intent));
    }

    @Deprecated
    public final int a(String str) {
        return a(str, false);
    }
}
