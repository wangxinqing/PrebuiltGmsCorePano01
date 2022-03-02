package defpackage;

import java.io.IOException;

/* renamed from: aubh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aubh extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    aubh() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aubh(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            if (r0 != 0) goto L_0x0012
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            goto L_0x0016
        L_0x0012:
            java.lang.String r3 = r1.concat(r3)
        L_0x0016:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aubh.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aubh(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            if (r0 != 0) goto L_0x0012
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            goto L_0x0016
        L_0x0012:
            java.lang.String r3 = r1.concat(r3)
        L_0x0016:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aubh.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public aubh(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
