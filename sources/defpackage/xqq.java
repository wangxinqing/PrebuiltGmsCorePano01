package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: xqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class xqq extends xqg {
    private final wzv a;
    private final Account b;
    private final String c;
    private final wss d;

    public xqq(String str, int i, wzv wzv, Account account, String str2, wss wss, String str3) {
        super(str, i, account.name, str3);
        this.a = wzv;
        this.b = account;
        this.c = str2;
        this.d = wss;
    }

    private final void a(int i, String str) {
        SyncStatus syncStatus = new SyncStatus(i, str);
        wzv wzv = this.a;
        if (wzv != null) {
            try {
                wzv.a(xqy.c.a, syncStatus);
            } catch (RemoteException e) {
                Log.e("BasePeopleOperation", "Operation failed remotely.", e);
            }
        }
    }

    public abstract void a(Account account, String str);

    public final void b(Context context) {
        String str;
        int b2;
        String c2;
        xip.a();
        if (!xqx.a(this.b, this.c)) {
            xdt.b("BasePeopleOperation", "Sync not supported with account: %s, authority: %s.", this.b.name, this.c);
            a(4, "Account/provider not supported.");
            return;
        }
        int isSyncable = ContentResolver.getIsSyncable(this.b, this.c);
        if (isSyncable <= 0 && (!Boolean.valueOf(ayrj.a.a().Z()).booleanValue() || isSyncable >= 0)) {
            if (Boolean.valueOf(ayrj.a.a().bk()).booleanValue() && isSyncable == 0) {
                ContentResolver.setIsSyncable(this.b, this.c, 1);
            } else {
                xdt.b("BasePeopleOperation", "Not syncable with account: %s, authority: %s.", this.b.name, this.c);
                a(2, "Not syncable.");
                return;
            }
        }
        Account account = this.b;
        String str2 = this.c;
        if (ContentResolver.isSyncPending(account, str2)) {
            str = "Sync is pending.";
        } else {
            str = ContentResolver.isSyncActive(account, str2) ? "Sync is active." : "sync_is_idle";
        }
        if ("sync_is_idle".equals(str)) {
            a(this.b, this.c);
            str = "Sync is pending.";
        }
        if (ayxm.c()) {
            this.d.a(this.b.name, this.c, 3, str);
            boolean z = true;
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Log.e("BasePeopleOperation", "sleeping failed.");
                }
                b2 = this.d.b(this.b.name, this.c);
                c2 = this.d.c(this.b.name, this.c);
                if (b2 == 1 || b2 == 2) {
                    if ("Sync initialized.".equals(c2) && z) {
                        a(this.b, this.c);
                        this.d.a(this.b.name, this.c, 3, "Sync is pending.");
                        z = false;
                    }
                }
            }
            a(b2, c2);
            return;
        }
        a(4, "Sync status not trackable.");
    }
}
