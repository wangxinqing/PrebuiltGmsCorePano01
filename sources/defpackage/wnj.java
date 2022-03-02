package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: wnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wnj extends xqg {
    private final wzv a;
    private final Account b;
    private final String c;
    private final wss d;
    private final boolean e = ayuq.b();

    private final void a(int i, String str, int i2, int i3) {
        wmi wmi;
        wmi wmi2;
        wmi wmi3;
        SyncStatus syncStatus = new SyncStatus(i, str);
        wzv wzv = this.a;
        if (wzv != null) {
            try {
                wzv.a(xqy.c.a, syncStatus);
                if (this.e && (wmi3 = this.r) != null) {
                    wmi3.b(i2, i3);
                }
            } catch (RemoteException e2) {
                Log.e("BasePeopleOperation", "Operation failed remotely.", e2);
                if (this.e && (wmi = this.r) != null) {
                    wmi.b(10, 0);
                }
            } catch (Throwable th) {
                if (this.e && (wmi2 = this.r) != null) {
                    wmi2.b(i2, i3);
                }
                throw th;
            }
        }
    }

    public final void b(Context context) {
        if (!xqx.a(this.b, this.c)) {
            xdt.b("BasePeopleOperation", "Sync not supported with account: %s, authority: %s.", this.b.name, this.c);
            a(4, "Account/provider not supported.", 14, 0);
        } else if (!ayxm.c()) {
            a(4, "Sync status not trackable.", 15, 0);
        } else {
            a(this.d.b(this.b.name, this.c), this.d.c(this.b.name, this.c), 2, 1);
        }
    }

    public wnj(String str, int i, wzv wzv, Account account, String str2, wss wss) {
        super(str, i, account.name, "GetSyncStatus", (byte[]) null);
        this.a = wzv;
        this.b = account;
        this.c = str2;
        this.d = wss;
    }
}
