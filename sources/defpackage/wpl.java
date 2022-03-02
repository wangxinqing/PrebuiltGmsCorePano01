package defpackage;

import android.content.Context;

/* renamed from: wpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpl extends woy {
    private final wot b;

    /* access modifiers changed from: protected */
    public final byte[] d(Context context) {
        wot wot = this.b;
        if (wot == null) {
            return super.d(context);
        }
        String str = this.a;
        byte[] a = wot.a(str);
        if (a != null) {
            return a;
        }
        byte[] d = super.d(context);
        if (d != null) {
            wot wot2 = this.b;
            xip.a();
            wot2.a(str, d, ((Long) xhq.a.a()).longValue());
        }
        return d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wpl(android.content.Context r8, java.lang.String r9, int r10, defpackage.wot r11, defpackage.wmq r12, java.lang.String r13, int r14, int r15) {
        /*
            r7 = this;
            java.lang.String r3 = defpackage.ycc.a(r8, r13, r14, r15)
            r8 = 1
            r13 = r15 & 1
            if (r13 != 0) goto L_0x000c
            r8 = 0
            r5 = 0
            goto L_0x000d
        L_0x000c:
            r5 = 1
        L_0x000d:
            java.lang.String r6 = "LoadAvatarByUrl"
            r0 = r7
            r1 = r9
            r2 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpl.<init>(android.content.Context, java.lang.String, int, wot, wmq, java.lang.String, int, int):void");
    }
}
