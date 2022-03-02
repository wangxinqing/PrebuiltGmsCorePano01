package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;

/* renamed from: xqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqs extends xqq {
    public xqs(String str, int i, wzv wzv, Account account, String str2, wss wss) {
        super(str, i, wzv, account, str2, wss, "RequestUploadSyncWithStatus");
    }

    public final void a(Account account, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        bundle.putBoolean("expedited", true);
        bundle.putBoolean("upload", true);
        xip.a();
        if (((Boolean) xgh.a.a()).booleanValue()) {
            bundle.putString("REQUESTER", "REQUEST_UPLOAD_SYNC_WITH_STATUS_API");
        }
        ContentResolver.requestSync(account, str, bundle);
    }
}
