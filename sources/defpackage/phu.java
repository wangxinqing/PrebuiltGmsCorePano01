package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: phu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phu extends pgv {
    private final aeyc e;
    private final sap f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public phu(defpackage.awdn r11, defpackage.aevl r12, java.lang.String r13, android.accounts.Account r14, int r15, int r16, byte[] r17, defpackage.sap r18) {
        /*
            r10 = this;
            r0 = r10
            auku r1 = defpackage.auku.SYNC_FULL_SNAPSHOT
            r6 = r14
            r7 = r15
            r8 = r16
            r10.<init>(r14, r15, r8, r1)
            aeyc r1 = new aeyc
            r2 = r1
            r3 = r11
            r4 = r12
            r5 = r13
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.e = r1
            r1 = r18
            r0.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phu.<init>(awdn, aevl, java.lang.String, android.accounts.Account, int, int, byte[], sap):void");
    }

    public final void a(Status status) {
        this.f.a(status, -1);
    }

    public final pcp b() {
        return pcp.WRITE;
    }

    public final void e() {
        try {
            this.f.a(Status.a, this.e.call().longValue());
        } catch (aepg e2) {
            this.f.a(pku.a(getClass().getSimpleName(), e2), -1);
        }
    }
}
