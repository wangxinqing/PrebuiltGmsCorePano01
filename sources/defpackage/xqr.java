package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;

/* renamed from: xqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqr extends xqq {
    public xqr(String str, int i, wzv wzv, Account account, String str2, wss wss) {
        super(str, i, wzv, account, str2, wss, "RequestSyncWithStatus");
    }

    public final void a(Account account, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        bundle.putBoolean("expedited", true);
        xip.a();
        if (((Boolean) xgh.a.a()).booleanValue()) {
            bundle.putString("REQUESTER", "REQUEST_SYNC_WITH_STATUS_API");
        }
        ContentResolver.requestSync(account, str, bundle);
    }
}
