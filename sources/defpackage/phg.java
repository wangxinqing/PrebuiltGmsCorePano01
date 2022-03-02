package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprintsReadResult;

/* renamed from: phg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phg extends pgv {
    private final san e;
    private final aexy f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public phg(defpackage.aexz r15, java.lang.String r16, android.accounts.Account r17, int r18, int r19, com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter r20, defpackage.san r21) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r7 = r17
            r2 = r20
            auku r3 = defpackage.auku.SYNC_FULL_SNAPSHOT
            r8 = r18
            r9 = r19
            r14.<init>(r7, r8, r9, r3)
            int r10 = r2.a
            java.lang.Long r11 = r2.b
            java.lang.Long r12 = r2.c
            aexy r13 = new aexy
            bapu r2 = r1.a
            java.lang.Object r2 = r2.a()
            aeri r2 = (defpackage.aeri) r2
            r3 = 1
            defpackage.aexz.a(r2, r3)
            bapu r3 = r1.b
            java.lang.Object r3 = r3.a()
            awdn r3 = (defpackage.awdn) r3
            r4 = 2
            defpackage.aexz.a(r3, r4)
            bapu r4 = r1.c
            java.lang.Object r4 = r4.a()
            aevl r4 = (defpackage.aevl) r4
            r5 = 3
            defpackage.aexz.a(r4, r5)
            bapu r1 = r1.d
            java.lang.Object r1 = r1.a()
            r5 = r1
            afeb r5 = (defpackage.afeb) r5
            r1 = 4
            defpackage.aexz.a(r5, r1)
            r1 = 5
            r6 = r16
            defpackage.aexz.a(r6, r1)
            r1 = 6
            defpackage.aexz.a(r7, r1)
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f = r13
            r1 = r21
            r0.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phg.<init>(aexz, java.lang.String, android.accounts.Account, int, int, com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter, san):void");
    }

    public final void a(Status status) {
        this.e.a(status, (MdhFootprintsReadResult) null);
    }

    public final pcp b() {
        return pcp.READ;
    }

    public final void e() {
        try {
            this.e.a(Status.a, pga.a(this.f.call()));
        } catch (aepg e2) {
            this.e.a(pku.a(getClass().getSimpleName(), e2), (MdhFootprintsReadResult) null);
        }
    }
}
