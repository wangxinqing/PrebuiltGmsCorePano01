package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Build;
import android.os.Handler;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: spn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class spn extends swm {
    public Boolean a;
    public Boolean b;
    public long c;
    private long d;
    private String e;
    private AccountManager f;

    public spn(svv svv) {
        super(svv);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        Calendar instance = Calendar.getInstance();
        this.d = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.e = sb.toString();
        return false;
    }

    public final String b() {
        k();
        return Build.MODEL;
    }

    public final String c() {
        k();
        return Build.VERSION.RELEASE;
    }

    public final long d() {
        k();
        return this.d;
    }

    public final String e() {
        k();
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        h();
        long a2 = A().a();
        if (a2 - this.c > 86400000) {
            this.b = null;
        }
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (kf.a(z(), "android.permission.GET_ACCOUNTS") != 0) {
            E().g.a("Permission error checking for dasher/unicorn accounts");
            this.c = a2;
            this.b = false;
            return false;
        }
        if (this.f == null) {
            this.f = AccountManager.get(z());
        }
        try {
            Account[] result = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result != null) {
                if (result.length > 0) {
                    this.b = true;
                    this.c = a2;
                    return true;
                }
            }
            Account[] result2 = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result2 != null) {
                if (result2.length > 0) {
                    this.b = true;
                    this.c = a2;
                    return true;
                }
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            E().d.a("Exception checking account types", e2);
        }
        this.c = a2;
        this.b = false;
        return false;
    }
}
