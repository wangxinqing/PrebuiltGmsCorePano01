package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: gsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gsa {
    public static final /* synthetic */ int a = 0;
    private static final Intent b = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.backup.BackupAccountManagerService").addCategory("android.intent.category.DEFAULT");
    private final Context c;

    public gsa(Context context) {
        iva.a((Object) context);
        this.c = context;
    }

    private final Object a(grz grz) {
        gsu gsu;
        hwz hwz = new hwz();
        if (!jca.a().a(this.c, b, hwz, 1)) {
            return null;
        }
        try {
            IBinder a2 = hwz.a();
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                gsu = !(queryLocalInterface instanceof gsu) ? new gsu(a2) : (gsu) queryLocalInterface;
            } else {
                gsu = null;
            }
            Object a3 = grz.a(gsu);
            try {
                jca.a().a(this.c, (ServiceConnection) hwz);
            } catch (IllegalArgumentException | IllegalStateException e) {
                Log.w("BackupAccountMgrClient", "Exception when unbinding: ", e);
            }
            return a3;
        } catch (InterruptedException e2) {
            Log.w("BackupAccountMgrClient", e2);
            try {
                jca.a().a(this.c, (ServiceConnection) hwz);
            } catch (IllegalArgumentException | IllegalStateException e3) {
                Log.w("BackupAccountMgrClient", "Exception when unbinding: ", e3);
            }
            return null;
        } catch (RemoteException e4) {
            Log.w("BackupAccountMgrClient", e4);
            try {
                jca.a().a(this.c, (ServiceConnection) hwz);
            } catch (IllegalArgumentException | IllegalStateException e5) {
                Log.w("BackupAccountMgrClient", "Exception when unbinding: ", e5);
            }
            return null;
        } catch (Throwable th) {
            try {
                jca.a().a(this.c, (ServiceConnection) hwz);
            } catch (IllegalArgumentException | IllegalStateException e6) {
                Log.w("BackupAccountMgrClient", "Exception when unbinding: ", e6);
            }
            throw th;
        }
    }

    public final Account a() {
        return (Account) a(grx.a);
    }

    public final void a(Account account) {
        a((grz) new gry(account));
    }
}
