package defpackage;

import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: wpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpk extends wpc {
    private final AvatarReference a;
    private final ParcelableLoadImageOptions b;
    private wpc s;

    public wpk(String str, int i, wmq wmq, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        super(str, (String) null, i, wmq, "LoadAvatarByReference");
        this.a = avatarReference;
        this.b = parcelableLoadImageOptions;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length());
        sb.append("[avref: ref=");
        sb.append(valueOf);
        sb.append(" opts=");
        sb.append(valueOf2);
        sb.append("]");
        sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wpb c(android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r1 = r10.i
            int r2 = r10.j
            wmq r3 = r10.g
            com.google.android.gms.people.model.AvatarReference r5 = r10.a
            com.google.android.gms.people.internal.ParcelableLoadImageOptions r7 = r10.b
            defpackage.xip.a()
            xfs r0 = defpackage.xgs.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r4 = "Unsupported avatar reference"
            java.lang.String r6 = "This avatar reference is not used based on code search and our logging; If you believe that your service still have a valid use case, please contact us at menagerie-eng@google.com. "
            r8 = 0
            r9 = 0
            if (r0 != 0) goto L_0x00bd
            int r0 = r5.a
            switch(r0) {
                case 1: goto L_0x00b3;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0083;
                case 4: goto L_0x0065;
                case 5: goto L_0x004c;
                case 6: goto L_0x002b;
                default: goto L_0x0026;
            }
        L_0x0026:
            defpackage.iva.b(r9, r4)
            goto L_0x0139
        L_0x002b:
            boolean r0 = defpackage.ayvu.f()
            if (r0 == 0) goto L_0x0036
            defpackage.iva.b(r9, r6)
            goto L_0x0139
        L_0x0036:
            defpackage.iva.a((java.lang.Object) r5)
            int r0 = r5.a
            java.lang.String r4 = r5.b
            long r4 = defpackage.xfd.i(r0, r4)
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            wpc r8 = defpackage.wpn.a((java.lang.String) r0, (int) r1, (defpackage.wmq) r2, (long) r3, (com.google.android.gms.people.internal.ParcelableLoadImageOptions) r5)
            goto L_0x0139
        L_0x004c:
            defpackage.xip.a()
            xfs r0 = defpackage.xhz.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = r5.b
            wpc r8 = defpackage.wpn.a((java.lang.String) r1, (int) r2, (defpackage.wmq) r3, (java.lang.String) r0, (com.google.android.gms.people.internal.ParcelableLoadImageOptions) r7)
            goto L_0x0139
        L_0x0065:
            boolean r0 = defpackage.ayvu.e()
            if (r0 == 0) goto L_0x0070
            defpackage.iva.b(r9, r6)
            goto L_0x0139
        L_0x0070:
            defpackage.iva.a((java.lang.Object) r5)
            int r0 = r5.a
            java.lang.String r4 = r5.b
            java.lang.String r4 = defpackage.xfd.c(r0, r4)
            r0 = r11
            r6 = r7
            wpc r8 = defpackage.wpn.b(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0139
        L_0x0083:
            defpackage.iva.a((java.lang.Object) r5)
            int r0 = r5.a
            java.lang.String r4 = r5.b
            java.lang.String r4 = defpackage.xfd.j(r0, r4)
            defpackage.iva.a((java.lang.Object) r5)
            int r0 = r5.a
            java.lang.String r5 = r5.b
            long r5 = defpackage.xfd.h(r0, r5)
            r0 = r11
            wpc r8 = defpackage.wpn.a((android.content.Context) r0, (java.lang.String) r1, (int) r2, (defpackage.wmq) r3, (java.lang.String) r4, (long) r5, (com.google.android.gms.people.internal.ParcelableLoadImageOptions) r7)
            goto L_0x0139
        L_0x00a0:
            defpackage.iva.a((java.lang.Object) r5)
            int r0 = r5.a
            java.lang.String r4 = r5.b
            java.lang.String r4 = defpackage.xfd.g(r0, r4)
            r0 = r11
            r6 = r7
            wpc r8 = defpackage.wpn.a((android.content.Context) r0, (java.lang.String) r1, (int) r2, (defpackage.wmq) r3, (java.lang.String) r4, (com.google.android.gms.people.model.AvatarReference) r5, (com.google.android.gms.people.internal.ParcelableLoadImageOptions) r6)
            goto L_0x0139
        L_0x00b3:
            java.lang.String r4 = r5.b
            r0 = r11
            r5 = r7
            wpc r8 = defpackage.wpn.a(r0, r1, r2, r3, r4, r5)
            goto L_0x0139
        L_0x00bd:
            boolean r0 = r5.a()
            if (r0 != 0) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            com.google.android.gms.people.model.AvatarReference r0 = defpackage.xfd.c(r5)
            r5 = r0
        L_0x00c9:
            int r0 = r5.a
            switch(r0) {
                case 1: goto L_0x0131;
                case 2: goto L_0x0128;
                case 3: goto L_0x011a;
                case 4: goto L_0x0106;
                case 5: goto L_0x00ee;
                case 6: goto L_0x00d3;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            defpackage.iva.b(r9, r4)
            goto L_0x0139
        L_0x00d3:
            boolean r0 = defpackage.ayvu.f()
            if (r0 != 0) goto L_0x00e9
            java.lang.Long r0 = r5.h
            long r4 = r0.longValue()
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            wpc r8 = defpackage.wpn.a((java.lang.String) r0, (int) r1, (defpackage.wmq) r2, (long) r3, (com.google.android.gms.people.internal.ParcelableLoadImageOptions) r5)
            goto L_0x0139
        L_0x00e9:
            defpackage.iva.b(r9, r6)
            goto L_0x0139
        L_0x00ee:
            defpackage.xip.a()
            xfs r0 = defpackage.xhz.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0131
            java.lang.String r0 = r5.c
            wpc r8 = defpackage.wpn.a((java.lang.String) r1, (int) r2, (defpackage.wmq) r3, (java.lang.String) r0, (com.google.android.gms.people.internal.ParcelableLoadImageOptions) r7)
            goto L_0x0139
        L_0x0106:
            boolean r0 = defpackage.ayvu.e()
            if (r0 != 0) goto L_0x0115
            java.lang.String r4 = r5.d
            r0 = r11
            r6 = r7
            wpc r8 = defpackage.wpn.b(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0139
        L_0x0115:
            defpackage.iva.b(r9, r6)
            goto L_0x0139
        L_0x011a:
            java.lang.String r4 = r5.d
            java.lang.Long r0 = r5.g
            long r5 = r0.longValue()
            r0 = r11
            wpc r8 = defpackage.wpn.a((android.content.Context) r0, (java.lang.String) r1, (int) r2, (defpackage.wmq) r3, (java.lang.String) r4, (long) r5, (com.google.android.gms.people.internal.ParcelableLoadImageOptions) r7)
            goto L_0x0139
        L_0x0128:
            java.lang.String r4 = r5.d
            r0 = r11
            r6 = r7
            wpc r8 = defpackage.wpn.a((android.content.Context) r0, (java.lang.String) r1, (int) r2, (defpackage.wmq) r3, (java.lang.String) r4, (com.google.android.gms.people.model.AvatarReference) r5, (com.google.android.gms.people.internal.ParcelableLoadImageOptions) r6)
            goto L_0x0139
        L_0x0131:
            java.lang.String r4 = r5.c
            r0 = r11
            r5 = r7
            wpc r8 = defpackage.wpn.a(r0, r1, r2, r3, r4, r5)
        L_0x0139:
            r10.s = r8
            wpb r11 = r8.c(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpk.c(android.content.Context):wpb");
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        wpc wpc = this.s;
        if (wpc != null) {
            wpc.b(z);
        }
    }
}
