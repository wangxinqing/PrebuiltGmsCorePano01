package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: pgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pgz extends pgv {
    private final aeri e;
    private final sak f;
    private final aexs g;

    public pgz(aeri aeri, aext aext, String str, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, sak sak) {
        super(account, i, i2, auku.SYNC_LATEST_PER_SECONDARY_ID);
        this.e = aeri;
        this.f = sak;
        this.g = aext.a(str, account, i, i2, pga.a(latestFootprintFilter));
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
            this.f.a(Status.a, new MdhFootprintListSafeParcelable(anda.a(this.g.call(), pgy.a)));
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
