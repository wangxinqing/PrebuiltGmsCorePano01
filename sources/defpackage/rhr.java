package defpackage;

import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: rhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhr extends ile implements icl {
    public final Status b;
    public final String c;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r2.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rhr(com.google.android.gms.common.data.DataHolder r2) {
        /*
            r1 = this;
            r1.<init>(r2)
            int r0 = r2.e
            com.google.android.gms.common.api.Status r0 = defpackage.ris.h(r0)
            r1.b = r0
            if (r2 == 0) goto L_0x001a
            android.os.Bundle r2 = r2.f
            if (r2 == 0) goto L_0x001a
            java.lang.String r0 = "com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY"
            java.lang.String r2 = r2.getString(r0)
        L_0x0017:
            r1.c = r2
            return
        L_0x001a:
            r2 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhr.<init>(com.google.android.gms.common.data.DataHolder):void");
    }

    public final Status aO() {
        return this.b;
    }

    /* renamed from: b */
    public final rhq a(int i) {
        return new rkr(this.a, i);
    }
}
