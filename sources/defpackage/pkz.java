package defpackage;

import android.accounts.Account;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;

/* renamed from: pkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pkz {
    public final bapu a;

    public pkz(bapu bapu) {
        a(bapu, 1);
        this.a = bapu;
    }

    public static void a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    public final pky a(String str, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter, ifu ifu) {
        afeb afeb = (afeb) this.a.a();
        a(afeb, 1);
        a(str, 2);
        a(account, 3);
        SyncPolicy syncPolicy2 = syncPolicy;
        a(syncPolicy2, 6);
        LatestFootprintFilter latestFootprintFilter2 = latestFootprintFilter;
        a(latestFootprintFilter2, 7);
        ifu ifu2 = ifu;
        a(ifu2, 8);
        return new pky(afeb, str, account, i, i2, syncPolicy2, latestFootprintFilter2, ifu2);
    }
}
