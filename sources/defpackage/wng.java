package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: wng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wng extends xqg {
    private static final anaf f = anaf.a(0, 5, 1, 3, 2, 3, 3, 1);
    private final wzv a;
    private final Account b;
    private final String c;
    private final wss d;
    private final String e;

    private final void a(int i, String str) {
        SyncStatus syncStatus = new SyncStatus(i, str);
        aucd o = xld.e.o();
        if (aytk.b()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            xld xld = (xld) o.b;
            xld.b = 6;
            xld.a |= 1;
            int a2 = yby.a(this.e);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xld xld2 = (xld) o.b;
            int i2 = a2 - 1;
            if (a2 != 0) {
                xld2.d = i2;
                xld2.a |= 4;
            } else {
                throw null;
            }
        }
        wzv wzv = this.a;
        if (wzv != null) {
            try {
                wzv.b(xqy.c.a, syncStatus);
                if (aytk.b()) {
                    wml a3 = wml.a();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xld xld3 = (xld) o.b;
                    xld3.c = 1;
                    xld3.a |= 2;
                    a3.a((xld) o.i());
                }
            } catch (RemoteException e2) {
                if (aytk.b()) {
                    wml a4 = wml.a();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xld xld4 = (xld) o.b;
                    xld4.c = 0;
                    xld4.a |= 2;
                    a4.a((xld) o.i());
                }
                Log.e("GetFirstFullSyncStatusOperation", "Operation failed remotely.", e2);
            }
        }
    }

    public final void b(Context context) {
        if (!aytk.a.a().b()) {
            Log.e("GetFirstFullSyncStatusOperation", "Get First Full Sync Status API is not enabled.");
            SyncStatus syncStatus = new SyncStatus(4, "Get First Full Sync Status API is not enabled.");
            wzv wzv = this.a;
            if (wzv != null) {
                try {
                    wzv.b(16, syncStatus);
                } catch (RemoteException e2) {
                    Log.e("GetFirstFullSyncStatusOperation", "Operation failed remotely.", e2);
                }
            }
        } else if (!xqx.a(this.b, this.c)) {
            xdt.b("GetFirstFullSyncStatusOperation", "Sync not supported with account: %s, authority: %s.", this.b.name, this.c);
            a(4, "Account/provider not supported.");
        } else if (!ayxm.c()) {
            a(4, "Sync status not trackable.");
        } else {
            int o = this.d.o(this.b.name);
            int i = o - 1;
            anaf anaf = f;
            if (o != 0) {
                a(((Integer) anaf.getOrDefault(Integer.valueOf(i), 5)).intValue(), "Sync status unknown.");
                return;
            }
            throw null;
        }
    }

    public wng(String str, int i, wzv wzv, Account account, String str2, wss wss) {
        super(str, i, account.name, "GetFirstFullSyncStatus", (byte[]) null);
        this.a = wzv;
        this.b = account;
        this.c = str2;
        this.d = wss;
        this.e = str;
    }
}
