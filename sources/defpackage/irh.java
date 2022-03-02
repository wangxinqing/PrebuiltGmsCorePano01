package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: irh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class irh extends itl {
    int a = -1;
    private final Account b;
    private final Context c;

    public irh(Context context, Account account) {
        this.c = context.getApplicationContext();
        this.b = account;
    }

    public static Account a(itm itm) {
        Account account = null;
        if (itm != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = itm.a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof irh) {
            return this.b.equals(((irh) obj).b);
        }
        return false;
    }

    public final Account a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.a) {
            if (hxz.a(this.c, callingUid)) {
                this.a = callingUid;
            } else {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
        }
        return this.b;
    }
}
