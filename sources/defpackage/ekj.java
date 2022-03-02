package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncAdapterType;
import android.os.Build;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: ekj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekj {
    private static final iwd a = ehv.a("AccountRenameHelper");
    private final qub b;
    private final gsa c;
    private final elv d;

    public ekj(Context context) {
        qub a2 = qub.a(context);
        gsa gsa = new gsa(context);
        elv a3 = elv.a(context);
        iva.a((Object) a2);
        this.b = a2;
        iva.a((Object) (eny) eny.a.b());
        iva.a((Object) gsa);
        this.c = gsa;
        iva.a((Object) a3);
        this.d = a3;
    }

    public final boolean a(Account account, Account account2) {
        if (account.equals(account2)) {
            return false;
        }
        String a2 = this.d.a();
        try {
            List asList = Arrays.asList(this.b.a(account.type));
            if (asList.contains(account) && !asList.contains(account2)) {
                int i = Build.VERSION.SDK_INT;
                boolean b2 = b(account, account2);
                this.d.a(a2);
                return b2;
            }
            a.c("Already renamed", new Object[0]);
            return false;
        } finally {
            this.d.a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(Account account, Account account2) {
        SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (SyncAdapterType syncAdapterType : syncAdapterTypes) {
            if (account2.type.equals(syncAdapterType.accountType)) {
                hashMap2.put(syncAdapterType.authority, Integer.valueOf(ContentResolver.getIsSyncable(account, syncAdapterType.authority)));
                hashMap.put(syncAdapterType.authority, Boolean.valueOf(ContentResolver.getSyncAutomatically(account, syncAdapterType.authority)));
            }
        }
        qub qub = this.b;
        String str = account2.name;
        amkr a2 = amlv.a("AccountManager.renameAccount");
        try {
            AccountManagerFuture<Account> renameAccount = qub.a.renameAccount(account, str, (AccountManagerCallback) null, (Handler) null);
            if (a2 != null) {
                a2.close();
            }
            try {
                Account result = renameAccount.getResult();
                if (!result.name.equals(account2.name)) {
                    a.c("Rename for account %s failed.", iwd.a((Object) account));
                    return false;
                }
                a.c("Account rename succeeded: %s -> %s.", iwd.a((Object) account), iwd.a((Object) account2));
                if (account.equals(this.c.a())) {
                    try {
                        this.c.a(account2);
                        a.c("Set account %s as backup account.", iwd.a((Object) account2));
                    } catch (Exception e) {
                        a.e("Failed to set backup account: %s", iwd.a((Object) account2), e);
                    }
                }
                for (String str2 : hashMap.keySet()) {
                    ContentResolver.setIsSyncable(result, str2, ((Integer) hashMap2.get(str2)).intValue());
                    ContentResolver.setSyncAutomatically(result, str2, ((Boolean) hashMap.get(str2)).booleanValue());
                }
                this.d.a(account.name, 4, account2.name);
                this.d.a(account2.name, 3, account.name);
                return true;
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                a.c("Rename for account %s failed.", iwd.a((Object) account));
                return false;
            }
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
