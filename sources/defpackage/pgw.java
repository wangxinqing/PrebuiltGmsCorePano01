package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.FootprintsRecordingSetting;

/* renamed from: pgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pgw extends pgv {
    private static final int e = aulx.d.a();
    private final aexq f;
    private final sao g;

    public pgw(aexr aexr, String str, Account account, int i, sao sao) {
        super(account, 553, e, auku.SYNC_LATEST_PER_SECONDARY_ID);
        aext aext = (aext) aexr.a.a();
        aexr.a(aext, 1);
        aexr.a(str, 2);
        aexr.a(account, 3);
        this.f = new aexq(aext, str, account, i);
        this.g = sao;
    }

    public final void a(Status status) {
        this.g.a(status, (FootprintsRecordingSetting) null);
    }

    public final pcp b() {
        return pcp.READ;
    }

    public final void e() {
        FootprintsRecordingSetting footprintsRecordingSetting;
        try {
            sao sao = this.g;
            Status status = Status.a;
            aete a = this.f.call();
            if (a != null) {
                footprintsRecordingSetting = new FootprintsRecordingSetting(((aesu) a).a, ((aesu) a).b, ((aesu) a).c, ((aesu) a).d);
            } else {
                footprintsRecordingSetting = null;
            }
            sao.a(status, footprintsRecordingSetting);
        } catch (aepg e2) {
            this.g.a(pku.a(getClass().getSimpleName(), e2), (FootprintsRecordingSetting) null);
        }
    }
}
