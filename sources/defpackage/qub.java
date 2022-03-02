package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

/* renamed from: qub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qub {
    public final AccountManager a;

    static {
        new Random();
    }

    private qub(AccountManager accountManager) {
        this.a = accountManager;
    }

    public static Intent a(Account account, ArrayList arrayList, String[] strArr) {
        amkr a2 = amlv.a("AccountManager.newChooseAccountIntentPreM");
        try {
            Intent newChooseAccountIntent = AccountManager.newChooseAccountIntent(account, arrayList, strArr, false, (String) null, (String) null, (String[]) null, (Bundle) null);
            if (a2 != null) {
                a2.close();
            }
            return newChooseAccountIntent;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final int b(Account account, String str) {
        amkr a2 = amlv.a("AccountManager.getAccountVisibility");
        try {
            int accountVisibility = this.a.getAccountVisibility(account, str);
            if (a2 != null) {
                a2.close();
            }
            return accountVisibility;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final AccountManagerFuture c(Account account) {
        amkr a2 = amlv.a("AccountManager.removeAccountPreLMR1");
        try {
            AccountManagerFuture<Boolean> removeAccount = this.a.removeAccount(account, (AccountManagerCallback) null, (Handler) null);
            if (a2 != null) {
                a2.close();
            }
            return removeAccount;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final AccountManagerFuture d(Account account) {
        amkr a2 = amlv.a("AccountManager.removeAccount");
        try {
            AccountManagerFuture<Bundle> removeAccount = this.a.removeAccount(account, (Activity) null, (AccountManagerCallback) null, (Handler) null);
            if (a2 != null) {
                a2.close();
            }
            return removeAccount;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void e(Account account) {
        amkr a2 = amlv.a("AccountManager.removeAccountExplicitly");
        try {
            this.a.removeAccountExplicitly(account);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Map b(Account account) {
        amkr a2 = amlv.a("AccountManager.getPackagesAndVisibilityForAccount");
        try {
            Map<String, Integer> packagesAndVisibilityForAccount = this.a.getPackagesAndVisibilityForAccount(account);
            if (a2 != null) {
                a2.close();
            }
            return packagesAndVisibilityForAccount;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final String c(Account account, String str) {
        amkr a2 = amlv.a("AccountManager.blockingGetAuthToken");
        try {
            String blockingGetAuthToken = this.a.blockingGetAuthToken(account, str, true);
            if (a2 != null) {
                a2.close();
            }
            return blockingGetAuthToken;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public static qub a(Context context) {
        return new qub(AccountManager.get(context));
    }

    public final void b(String str, String str2) {
        amkr a2 = amlv.a("AccountManager.invalidateAuthToken");
        try {
            this.a.invalidateAuthToken(str, str2);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final AccountManagerFuture a(Account account, String[] strArr, AccountManagerCallback accountManagerCallback) {
        amkr a2 = amlv.a("AccountManager.hasFeatures");
        try {
            AccountManagerFuture<Boolean> hasFeatures = this.a.hasFeatures(account, strArr, accountManagerCallback, (Handler) null);
            if (a2 != null) {
                a2.close();
            }
            return hasFeatures;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Account[] b() {
        amkr a2 = amlv.a("AccountManager.getAccounts");
        try {
            Account[] accounts = this.a.getAccounts();
            if (a2 != null) {
                a2.close();
            }
            return accounts;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final AccountManagerFuture a(String str, String str2, String[] strArr, Bundle bundle, Activity activity, AccountManagerCallback accountManagerCallback) {
        amkr a2 = amlv.a("AccountManager.addAccount");
        try {
            AccountManagerFuture<Bundle> addAccount = this.a.addAccount(str, str2, strArr, bundle, activity, accountManagerCallback, (Handler) null);
            if (a2 != null) {
                a2.close();
            }
            return addAccount;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final AccountManagerFuture a(String str, String[] strArr) {
        amkr a2 = amlv.a("AccountManager.getAccountsByTypeAndFeatures");
        try {
            AccountManagerFuture<Account[]> accountsByTypeAndFeatures = this.a.getAccountsByTypeAndFeatures(str, strArr, (AccountManagerCallback) null, (Handler) null);
            if (a2 != null) {
                a2.close();
            }
            return accountsByTypeAndFeatures;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final String a(Account account) {
        amkr a2 = amlv.a("AccountManager.getPassword");
        try {
            String password = this.a.getPassword(account);
            if (a2 != null) {
                a2.close();
            }
            return password;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(Account account, Bundle bundle, Activity activity, AccountManagerCallback accountManagerCallback, Handler handler) {
        amkr a2 = amlv.a("AccountManager.confirmCredentials");
        try {
            this.a.confirmCredentials(account, bundle, activity, accountManagerCallback, handler);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(Account account, String str) {
        amkr a2 = amlv.a("AccountManager.setPassword");
        try {
            this.a.setPassword(account, str);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(Account account, String str, Bundle bundle, Activity activity, AccountManagerCallback accountManagerCallback) {
        amkr a2 = amlv.a("AccountManager.updateCredentials");
        try {
            this.a.updateCredentials(account, str, bundle, activity, accountManagerCallback, (Handler) null);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(OnAccountsUpdateListener onAccountsUpdateListener, boolean z) {
        amkr a2 = amlv.a("AccountManager.addOnAccountsUpdatedListener");
        try {
            this.a.addOnAccountsUpdatedListener(onAccountsUpdateListener, (Handler) null, z);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean a(Account account, String str, int i) {
        amkr a2 = amlv.a("AccountManager.setAccountVisibility");
        try {
            boolean accountVisibility = this.a.setAccountVisibility(account, str, i);
            if (a2 != null) {
                a2.close();
            }
            return accountVisibility;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean a(Account account, String str, Bundle bundle) {
        amkr a2 = amlv.a("AccountManager.addAccountExplicitly");
        try {
            boolean addAccountExplicitly = this.a.addAccountExplicitly(account, str, bundle);
            if (a2 != null) {
                a2.close();
            }
            return addAccountExplicitly;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Account[] a(String str) {
        amkr a2 = amlv.a("AccountManager.getAccountsByType");
        try {
            Account[] accountsByType = this.a.getAccountsByType(str);
            if (a2 != null) {
                a2.close();
            }
            return accountsByType;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Account[] a(String str, String str2) {
        amkr a2 = amlv.a("AccountManager.getAccountsByTypeForPackage");
        try {
            Account[] accountsByTypeForPackage = this.a.getAccountsByTypeForPackage(str, str2);
            if (a2 != null) {
                a2.close();
            }
            return accountsByTypeForPackage;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final AuthenticatorDescription[] a() {
        amkr a2 = amlv.a("AccountManager.getAuthenticatorType");
        try {
            AuthenticatorDescription[] authenticatorTypes = this.a.getAuthenticatorTypes();
            if (a2 != null) {
                a2.close();
            }
            return authenticatorTypes;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
