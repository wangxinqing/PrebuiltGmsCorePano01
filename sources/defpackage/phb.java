package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprintsReadResult;

/* renamed from: phb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phb extends pgv {
    private final san e;
    private final aexv f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public phb(defpackage.aexw r13, java.lang.String r14, android.accounts.Account r15, int r16, int r17, com.google.android.gms.mdh.LatestFootprintFilter r18, defpackage.san r19) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r7 = r15
            auku r2 = defpackage.auku.SYNC_LATEST_PER_SECONDARY_ID
            r8 = r16
            r9 = r17
            r12.<init>(r15, r8, r9, r2)
            aeta r10 = defpackage.pga.a((com.google.android.gms.mdh.LatestFootprintFilter) r18)
            aexv r11 = new aexv
            bapu r2 = r1.a
            pcz r2 = defpackage.pdb.b()
            r3 = 1
            defpackage.aexw.a(r2, r3)
            bapu r3 = r1.b
            java.lang.Object r3 = r3.a()
            awdn r3 = (defpackage.awdn) r3
            r4 = 2
            defpackage.aexw.a(r3, r4)
            bapu r4 = r1.c
            java.lang.Object r4 = r4.a()
            aeva r4 = (defpackage.aeva) r4
            r5 = 3
            defpackage.aexw.a(r4, r5)
            bapu r1 = r1.d
            java.lang.Object r1 = r1.a()
            r5 = r1
            afeb r5 = (defpackage.afeb) r5
            r1 = 4
            defpackage.aexw.a(r5, r1)
            r1 = 5
            r6 = r14
            defpackage.aexw.a(r14, r1)
            r1 = 6
            defpackage.aexw.a(r15, r1)
            r1 = 9
            defpackage.aexw.a(r10, r1)
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f = r11
            r1 = r19
            r0.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phb.<init>(aexw, java.lang.String, android.accounts.Account, int, int, com.google.android.gms.mdh.LatestFootprintFilter, san):void");
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
