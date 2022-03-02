package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import java.util.List;

/* renamed from: eig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eig extends eim {
    public static final String a = eim.d;
    public static final String b = eim.e;

    public static String a(Context context, Account account, String str) {
        return eim.d(context, account, str);
    }

    @Deprecated
    public static void a(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static String b(Context context, Account account, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("handle_notification", true);
        try {
            TokenData c = eim.c(context, account, str, bundle);
            hxz.h(context);
            return c.b;
        } catch (ein e) {
            hxy.a(e.a, context);
            Log.w("GoogleAuthUtil", "Error when getting token", e);
            throw new eiu("User intervention required. Notification has been pushed.");
        } catch (UserRecoverableAuthException e2) {
            hxz.h(context);
            Log.w("GoogleAuthUtil", "Error when getting token", e2);
            throw new eiu("User intervention required. Notification has been pushed.");
        }
    }

    public static TokenData c(Context context, Account account, String str) {
        return eim.c(context, account, str, (Bundle) null);
    }

    public static Account[] d(Context context, String str) {
        return eim.g(context, str);
    }

    public static String a(Context context, Account account, String str, Bundle bundle) {
        return eim.b(context, account, str, bundle);
    }

    public static String c(Context context, String str) {
        return eim.f(context, str);
    }

    @Deprecated
    public static String a(Context context, String str, String str2) {
        return eim.d(context, new Account(str, "com.google"), str2);
    }

    @Deprecated
    public static String a(Context context, String str, String str2, Bundle bundle) {
        return eim.b(context, str, str2, bundle);
    }

    public static List a(Context context, int i, String str) {
        return eim.b(context, i, str);
    }

    public static Account[] a(Context context, String str, String[] strArr) {
        iva.a((Object) context);
        iva.c(str);
        eim.b(context);
        agvx.a(context);
        if (awkm.b() && eim.a(context)) {
            eof a2 = eog.a(context);
            GetAccountsRequest getAccountsRequest = new GetAccountsRequest(str, strArr);
            iva.a((Object) getAccountsRequest, (Object) "request cannot be null.");
            iha b2 = ihb.b();
            b2.b = new Feature[]{eia.e};
            b2.a = new epq(getAccountsRequest);
            try {
                List list = (List) eim.a(((iby) a2).b(b2.a()), "Accounts retrieval");
                eim.a((Object) list);
                return (Account[]) list.toArray(new Account[0]);
            } catch (ibr e) {
                eim.g.d("Encountered APIException with code %s for %s, falls back to the other branch.", Integer.valueOf(e.a()), "Accounts retrieval");
            }
        }
        return (Account[]) eim.a(context, eim.f, new eik(str, strArr));
    }

    @Deprecated
    public static String b(Context context, String str, String str2) {
        return b(context, new Account(str, "com.google"), str2);
    }

    public static void b(Context context, String str) {
        eim.e(context, str);
    }
}
