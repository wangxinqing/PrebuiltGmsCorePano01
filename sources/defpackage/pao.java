package defpackage;

import java.util.Arrays;

/* renamed from: pao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pao implements Comparable {
    final String a;
    final String b;
    final String c;

    public pao(String str, String str2) {
        this(str, str2, (String) null);
    }

    /* renamed from: a */
    public final int compareTo(pao pao) {
        int compareTo = this.a.compareTo(pao.a);
        if (compareTo != 0 || (compareTo = this.b.compareTo(pao.b)) != 0) {
            return compareTo;
        }
        String str = this.c;
        if (str == null) {
            return pao.c != null ? -1 : 0;
        }
        String str2 = pao.c;
        if (str2 != null) {
            return str.compareTo(str2);
        }
        return 1;
    }

    public final String b() {
        String str;
        if (!jix.a() || !this.b.startsWith("messages/")) {
            str = this.b;
        } else {
            str = "messages/<redacted>";
        }
        return amre.a("-").a().a(this.a, str, this.c);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pao) && compareTo((pao) obj) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public pao(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pao(defpackage.ota r6) {
        /*
            r5 = this;
            osz r0 = r6.b
            if (r0 == 0) goto L_0x0005
            goto L_0x0007
        L_0x0005:
            osz r0 = defpackage.osz.s
        L_0x0007:
            java.lang.String r0 = r0.e
            osz r1 = r6.b
            if (r1 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            osz r1 = defpackage.osz.s
        L_0x0010:
            java.lang.String r1 = r1.c
            otg r2 = r6.c
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            otg r2 = defpackage.otg.h
        L_0x0019:
            int r2 = r2.c
            int r2 = defpackage.otf.a(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0033
            r4 = 3
            if (r2 != r4) goto L_0x0033
            osz r6 = r6.b
            if (r6 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            osz r6 = defpackage.osz.s
        L_0x002c:
            int r6 = r6.b
            java.lang.String r3 = java.lang.Integer.toString(r6)
            goto L_0x0034
        L_0x0033:
        L_0x0034:
            r5.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pao.<init>(ota):void");
    }

    public final String a() {
        return amre.a("-").a().a(this.a, this.b, this.c);
    }
}
