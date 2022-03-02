package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: eim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class eim {
    public static final String[] c = {"com.google", "com.google.work", "cn.google"};
    public static final String d = "callerUid";
    public static final String e = "androidPackageName";
    public static final ComponentName f = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final iwd g = ehv.a("GoogleAuthUtil");

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    public static TokenData a(Bundle bundle) {
        TokenData a = TokenData.a(bundle, "tokenDetails");
        if (a != null) {
            return a;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        gei c2 = gei.c(string);
        if (gei.a(c2)) {
            iwd iwd = g;
            String valueOf = String.valueOf(c2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            iwd.d("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        } else if (gei.b(c2)) {
            throw new IOException(string);
        } else {
            throw new eif(string);
        }
    }

    public static String b(Context context, Account account, String str, Bundle bundle) {
        a(account);
        return c(context, account, str, bundle).b;
    }

    public static TokenData c(Context context, Account account, String str, Bundle bundle) {
        Bundle bundle2;
        iva.b("Calling this from your main thread can lead to deadlock");
        iva.a(str, (Object) "Scope cannot be empty or null.");
        a(account);
        b(context);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(e))) {
            bundle2.putString(e, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        agvx.a(context);
        if (awkm.c() && a(context)) {
            eof a = eog.a(context);
            iva.a((Object) account, (Object) "Account name cannot be null!");
            iva.a(str, (Object) "Scope cannot be null!");
            iha b = ihb.b();
            b.b = new Feature[]{eia.d};
            b.a = new epn(account, str, bundle2);
            try {
                Bundle bundle3 = (Bundle) a(((iby) a).b(b.a()), "token retrieval");
                a((Object) bundle3);
                return a(bundle3);
            } catch (ibr e2) {
                g.d("Encountered APIException with code %s for %s, falls back to the other branch.", Integer.valueOf(e2.a()), "token retrieval");
            }
        }
        return (TokenData) a(context, f, new eih(account, str, bundle2));
    }

    public static String d(Context context, Account account, String str) {
        return b(context, account, str, new Bundle());
    }

    public static void e(Context context, String str) {
        iva.b("Calling this from your main thread can lead to deadlock");
        b(context);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(e)) {
            bundle.putString(e, str2);
        }
        agvx.a(context);
        if (awkm.c() && a(context)) {
            eof a = eog.a(context);
            ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
            clearTokenRequest.b = str;
            iha b = ihb.b();
            b.b = new Feature[]{eia.d};
            b.a = new epo(clearTokenRequest);
            try {
                a(((iby) a).b(b.a()), "clear token");
                return;
            } catch (ibr e2) {
                g.d("Encountered APIException with code %s for %s, falls back to the other branch.", Integer.valueOf(e2.a()), "clear token");
            }
        }
        a(context, f, new eii(str, bundle));
    }

    public static String f(Context context, String str) {
        iva.a(str, (Object) "accountName must be provided");
        iva.b("Calling this from your main thread can lead to deadlock");
        b(context);
        return b(context, str, "^^_account_id_^^", new Bundle());
    }

    public static Account[] g(Context context, String str) {
        iva.c(str);
        int i = hxk.c;
        hxz.l(context);
        if (!jkr.b()) {
            return AccountManager.get(context).getAccountsByType(str);
        }
        iva.a((Object) context);
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (acquireContentProviderClient != null) {
            try {
                Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", str, new Bundle()).getParcelableArray("accounts");
                Account[] accountArr = new Account[parcelableArray.length];
                for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                    accountArr[i2] = (Account) parcelableArray[i2];
                }
                acquireContentProviderClient.release();
                return accountArr;
            } catch (Exception e2) {
                g.e("GoogleAuthUtil", "Error when getting accounts", e2);
                String valueOf = String.valueOf(e2.getMessage());
                throw new RemoteException(valueOf.length() == 0 ? new String("Accounts ContentProvider failed: ") : "Accounts ContentProvider failed: ".concat(valueOf));
            } catch (Throwable th) {
                acquireContentProviderClient.release();
                throw th;
            }
        } else {
            throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
        }
    }

    @Deprecated
    public static String b(Context context, String str, String str2, Bundle bundle) {
        return b(context, new Account(str, "com.google"), str2, bundle);
    }

    public static List b(Context context, int i, String str) {
        iva.a(str, (Object) "accountName must be provided");
        iva.b("Calling this from your main thread can lead to deadlock");
        b(context);
        AccountChangeEventsRequest accountChangeEventsRequest = new AccountChangeEventsRequest();
        accountChangeEventsRequest.c = str;
        accountChangeEventsRequest.b = i;
        agvx.a(context);
        if (awkm.b() && a(context)) {
            eof a = eog.a(context);
            iva.a((Object) accountChangeEventsRequest, (Object) "request cannot be null.");
            iha b = ihb.b();
            b.b = new Feature[]{eia.e};
            b.a = new epp(accountChangeEventsRequest);
            try {
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) a(((iby) a).b(b.a()), "account change events retrieval");
                a((Object) accountChangeEventsResponse);
                return accountChangeEventsResponse.b;
            } catch (ibr e2) {
                g.d("Encountered APIException with code %s for %s, falls back to the other branch.", Integer.valueOf(e2.a()), "account change events retrieval");
            }
        }
        return (List) a(context, f, new eij(accountChangeEventsRequest));
    }

    public static Object a(acwa acwa, String str) {
        try {
            return acws.a(acwa);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof ibr) {
                throw ((ibr) cause);
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str});
            g.d(format, new Object[0]);
            throw new IOException(format, e2);
        } catch (InterruptedException e3) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str});
            g.d(format2, new Object[0]);
            throw new IOException(format2, e3);
        } catch (CancellationException e4) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str});
            g.d(format3, new Object[0]);
            throw new IOException(format3, e4);
        }
    }

    public static Object a(Context context, ComponentName componentName, eil eil) {
        hwz hwz = new hwz();
        itc a = itc.a(context);
        try {
            if (a.a(componentName, (ServiceConnection) hwz, "GoogleAuthUtil")) {
                try {
                    Object a2 = eil.a(hwz.a());
                    a.a(componentName, (ServiceConnection) hwz);
                    return a2;
                } catch (RemoteException | InterruptedException e2) {
                    g.c("GoogleAuthUtil", "Error on service connection.", e2);
                    throw new IOException("Error on service connection.", e2);
                } catch (Throwable th) {
                    a.a(componentName, (ServiceConnection) hwz);
                    throw th;
                }
            } else {
                throw new IOException("Could not bind to service.");
            }
        } catch (SecurityException e3) {
            g.d("SecurityException while bind to auth service: %s", e3.getMessage());
            throw new IOException("SecurityException while binding to Auth service.", e3);
        }
    }

    public static void b(Context context) {
        try {
            hxz.l(context.getApplicationContext());
        } catch (hxx e2) {
            throw new ein(e2.a, e2.getMessage(), new Intent(e2.b));
        } catch (hxw e3) {
            throw new eif(e3.getMessage());
        }
    }

    private static void a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = c;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }

    public static void a(Object obj) {
        if (obj == null) {
            g.d("GoogleAuthUtil", "Service call returned null.");
            throw new IOException("Service unavailable.");
        }
    }

    public static boolean a(Context context) {
        return hxj.a.b(context) == 0;
    }
}
