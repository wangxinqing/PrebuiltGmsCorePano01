package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: phe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phe extends pgv {
    private final aeri e;
    private final sak f;
    private final aexx g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public phe(defpackage.aeri r17, defpackage.awdn r18, defpackage.aevl r19, defpackage.afeb r20, java.lang.String r21, android.accounts.Account r22, int r23, int r24, com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter r25, defpackage.sak r26) {
        /*
            r16 = this;
            r0 = r16
            r1 = r25
            auku r2 = defpackage.auku.SYNC_FULL_SNAPSHOT
            r9 = r22
            r10 = r23
            r11 = r24
            r0.<init>(r9, r10, r11, r2)
            r2 = r17
            r0.e = r2
            r3 = r26
            r0.f = r3
            aexx r15 = new aexx
            int r12 = r1.a
            java.lang.Long r13 = r1.b
            java.lang.Long r14 = r1.c
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.g = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phe.<init>(aeri, awdn, aevl, afeb, java.lang.String, android.accounts.Account, int, int, com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter, sak):void");
    }

    public final void a(Status status) {
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable;
        sak sak = this.f;
        if (this.e.F()) {
            mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(amzy.h());
        } else {
            mdhFootprintListSafeParcelable = null;
        }
        sak.a(status, mdhFootprintListSafeParcelable);
    }

    public final pcp b() {
        return pcp.READ;
    }

    public final void e() {
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable;
        try {
            this.f.a(Status.a, new MdhFootprintListSafeParcelable(anda.a(this.g.call(), phd.a)));
        } catch (aepg e2) {
            sak sak = this.f;
            Status a = pku.a(getClass().getSimpleName(), e2);
            if (this.e.F()) {
                mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(amzy.h());
            } else {
                mdhFootprintListSafeParcelable = null;
            }
            sak.a(a, mdhFootprintListSafeParcelable);
        }
    }
}
