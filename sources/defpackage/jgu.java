package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: jgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jgu {
    static {
        new ith("AccountUtils");
    }

    public static Account a(Context context, Account account, String str) {
        if (account == null) {
            return null;
        }
        if ("<<default account>>".equals(account.name)) {
            return b(context, str);
        }
        if (!b(context, account, str)) {
            return null;
        }
        return account;
    }

    public static Account b(Context context, String str) {
        ivk a = a(context);
        String string = a.getString(str, (String) null);
        if (!TextUtils.isEmpty(string)) {
            String valueOf = String.valueOf(str);
            Account account = new Account(string, a.getString(valueOf.length() == 0 ? new String("selected_account_type:") : "selected_account_type:".concat(valueOf), "com.google"));
            if (b(context, account, str)) {
                return account;
            }
        }
        return null;
    }

    public static List c(Context context, String str, String str2) {
        qub a = qub.a(context);
        int i = Build.VERSION.SDK_INT;
        ClientContext clientContext = new ClientContext();
        clientContext.e = context.getPackageName();
        clientContext.b = Process.myUid();
        Account[] a2 = ixk.a(context, clientContext).a("android.permission.INTERACT_ACROSS_USERS") == 0 ? a.a(str2, str) : a.a(str2);
        ArrayList arrayList = new ArrayList();
        for (Account account : a2) {
            if (!(account.name == null || account.type == null)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    public static Account d(Context context) {
        if (context != null) {
            for (Account account : d(context, context.getPackageName())) {
                if (account.name.endsWith("@google.com")) {
                    return account;
                }
            }
        }
        return null;
    }

    public static boolean e(Context context) {
        return hxy.e(context);
    }

    public static List f(Context context, String str) {
        Account[] accountArr;
        Throwable e;
        qub a = qub.a(context);
        String a2 = aeea.a(str);
        Account[] accountArr2 = new Account[0];
        try {
            accountArr = (Account[]) a.a("com.google", new String[]{a2}).getResult();
            try {
                Object[] objArr = {Integer.valueOf(accountArr.length), str, a2};
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                e = e2;
                accountArr2 = accountArr;
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e3) {
            e = e3;
            Log.w("AccountUtils", "Unable to get accounts by type and service flag/feature", e);
            accountArr = accountArr2;
            return Arrays.asList(accountArr);
        }
        return Arrays.asList(accountArr);
    }

    @Deprecated
    public static String b(Context context, String str, String str2) {
        Account a = a(context, str != null ? new Account(str, "com.google") : null, str2);
        if (a != null) {
            return a.name;
        }
        return null;
    }

    public static List d(Context context, String str) {
        return c(context, str, "com.google");
    }

    public static boolean g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (((UserManager) context.getSystemService("user")).getUserRestrictions().getBoolean("no_modify_accounts")) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        String[] accountTypesWithManagementDisabled = ((DevicePolicyManager) context.getSystemService("device_policy")).getAccountTypesWithManagementDisabled();
        if (accountTypesWithManagementDisabled == null) {
            return true;
        }
        for (String a : accountTypesWithManagementDisabled) {
            if (jhx.a((Object[]) eim.c, (Object) a)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Context context) {
        return d(context) != null;
    }

    @Deprecated
    public static boolean d(Context context, String str, String str2) {
        for (Account account : d(context, str2)) {
            if (account.name.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context, String str) {
        for (Account account : f(context, "usm")) {
            if (str.equals(account.name)) {
                return true;
            }
        }
        return false;
    }

    public static ivk a(Context context) {
        int i = jhg.a;
        return new ivk(context, "common.selected_account_prefs", false);
    }

    public static boolean b(Context context, Account account, String str) {
        List c = c(context, str, account.type);
        int size = c.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((Account) c.get(i)).name.equals(account.name)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public static String[] b(List list) {
        String[] a = a(list);
        Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);
        return a;
    }

    @Deprecated
    public static String a(Context context, String str) {
        Account b = b(context, str);
        if (b != null) {
            return b.name;
        }
        return null;
    }

    public static boolean f(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle()) == 0;
    }

    @Deprecated
    public static boolean g(Context context, String str) {
        return d(context, str, context.getPackageName());
    }

    public static ArrayList a(List list, String str) {
        if (list == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList(list);
        }
        String valueOf = String.valueOf(str.toLowerCase(Locale.US));
        String str2 = valueOf.length() == 0 ? new String("@") : "@".concat(valueOf);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            if (account.name.toLowerCase(Locale.US).endsWith(str2)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    public static void c(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Clearing selected account for ");
        } else {
            "Clearing selected account for ".concat(valueOf);
        }
        SharedPreferences.Editor edit = a(context).edit();
        edit.remove(str);
        String valueOf2 = String.valueOf(str);
        edit.remove(valueOf2.length() == 0 ? new String("selected_account_type:") : "selected_account_type:".concat(valueOf2));
        edit.apply();
    }

    public static boolean c(Context context) {
        if (context == null || d(context, context.getPackageName()).isEmpty()) {
            return false;
        }
        return true;
    }

    public static void a(Context context, ClientContext clientContext) {
        if (clientContext.c()) {
            a(context, clientContext.e, clientContext.c);
        }
    }

    public static void a(Context context, String str, Account account) {
        if (account != null) {
            SharedPreferences.Editor edit = a(context).edit();
            edit.putString(str, account.name);
            String valueOf = String.valueOf(str);
            edit.putString(valueOf.length() == 0 ? new String("selected_account_type:") : "selected_account_type:".concat(valueOf), account.type);
            edit.apply();
        }
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            a(context, str, new Account(str2, "com.google"));
        }
    }

    public static boolean a(Account account, String str) {
        return account != null && account.name.equals("<<default account>>") && account.type.equals(str);
    }

    public static boolean a(Context context, Account account) {
        return b(context, account, context.getPackageName());
    }

    public static String[] a(List list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((Account) list.get(i)).name;
        }
        return strArr;
    }
}
