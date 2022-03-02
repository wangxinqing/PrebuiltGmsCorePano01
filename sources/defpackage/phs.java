package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: phs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phs extends pgv {
    private final aeyb e;
    private final ifu f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public phs(defpackage.awdn r12, defpackage.aeva r13, java.lang.String r14, android.accounts.Account r15, int r16, int r17, byte[] r18, byte[] r19, defpackage.ifu r20) {
        /*
            r11 = this;
            r0 = r11
            auku r1 = defpackage.auku.SYNC_LATEST_PER_SECONDARY_ID
            r6 = r15
            r7 = r16
            r8 = r17
            r11.<init>(r15, r7, r8, r1)
            aeyb r1 = new aeyb
            r2 = r1
            r3 = r12
            r4 = r13
            r5 = r14
            r9 = r18
            r10 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.e = r1
            r1 = r20
            r0.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phs.<init>(awdn, aeva, java.lang.String, android.accounts.Account, int, int, byte[], byte[], ifu):void");
    }

    public final void a(Status status) {
        this.f.a(status);
    }

    public final pcp b() {
        return pcp.WRITE;
    }

    public final void e() {
        try {
            this.e.a();
            this.f.a(Status.a);
        } catch (aepg e2) {
            this.f.a(pku.a(getClass().getSimpleName(), e2));
        }
    }
}
