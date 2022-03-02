package defpackage;

import android.accounts.Account;
import android.util.Pair;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: wuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wuo implements acvz {
    final /* synthetic */ Account a;

    public wuo(Account account) {
        this.a = account;
    }

    public final /* bridge */ /* synthetic */ acwa a(Object obj) {
        SyncStatus syncStatus = (SyncStatus) obj;
        return acws.a((Object) Pair.create(wup.a(this.a), String.format("%s: %s", new Object[]{Integer.valueOf(syncStatus.a), syncStatus.b})));
    }
}
