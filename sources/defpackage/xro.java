package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncStatusObserver;

/* renamed from: xro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xro implements SyncStatusObserver {
    public final Context a;
    public Object b;
    final /* synthetic */ xrp c;
    private boolean d = false;
    private amsn e;
    private final Account f;

    public xro(xrp xrp, Context context, Account account) {
        this.c = xrp;
        this.f = account;
        this.a = context.getApplicationContext();
    }

    private final void a(String str) {
        this.c.getActivity().runOnUiThread(new xrn(this, str));
    }

    public final void onStatusChanged(int i) {
        if (ContentResolver.isSyncActive(this.f, "com.google.android.gms.people")) {
            a(String.format("Sync started for account: %s", new Object[]{this.f.name}));
            this.d = true;
            this.e = amsn.b();
        } else if (this.d && this.b != null) {
            this.e.e();
            ContentResolver.removeStatusChangeListener(this.b);
            a(String.format("Sync finished for account: %s.  Took %s", new Object[]{this.f.name, this.e}));
        }
    }
}
