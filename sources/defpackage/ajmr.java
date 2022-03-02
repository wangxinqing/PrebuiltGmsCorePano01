package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: ajmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmr {
    public final Context a;
    public final SharedPreferences b;
    public final ajmx c;
    public final ahya d;

    public ajmr(Context context, SharedPreferences sharedPreferences, ajmx ajmx, ahya ahya) {
        this.a = context;
        this.d = ahya;
        this.c = ajmx;
        this.b = sharedPreferences;
    }

    @Deprecated
    private final ReportingConfig a() {
        ArrayList arrayList = new ArrayList();
        for (Account p : ((ahxz) this.d).b) {
            arrayList.add(p(p));
        }
        return new ReportingConfig(arrayList, this.c.a());
    }

    public static String b(Account account) {
        return ajmq.a(account).j;
    }

    public static String c(Account account) {
        return ajmq.a(account).k;
    }

    public static String e(Account account) {
        return ajmq.a(account).m;
    }

    public static String f(Account account) {
        return ajmq.a(account).s;
    }

    public static String g(Account account) {
        return ajmq.a(account).n;
    }

    public static String j(Account account) {
        return ajmq.a(account).o;
    }

    public static String k(Account account) {
        return ajmq.a(account).p;
    }

    public static String n(Account account) {
        return ajmq.a(account).q;
    }

    public static String o(Account account) {
        return ajmq.a(account).r;
    }

    public static String r(Account account) {
        return ajmq.a(account).u;
    }

    public static String s(Account account) {
        return ajmq.a(account).t;
    }

    public static String t(Account account) {
        return ajmq.a(account).v;
    }

    public static String u(Account account) {
        return ajmq.a(account).w;
    }

    public final long d(Account account) {
        return this.b.getLong(c(account), 0);
    }

    public final boolean h(Account account) {
        return this.b.contains(g(account));
    }

    public final boolean i(Account account) {
        return this.b.getBoolean(g(account), false);
    }

    public final boolean l(Account account) {
        return this.b.contains(k(account));
    }

    public final boolean m(Account account) {
        return this.b.getBoolean(k(account), false);
    }

    public final AccountConfig p(Account account) {
        ajms a2 = AccountConfig.a(account);
        a(account, a2);
        a2.a(0);
        a2.p = null;
        a2.a(true);
        return a2.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean q(Account account) {
        return h(account) || l(account);
    }

    public static String a(Account account) {
        return ajmq.a(account).i;
    }

    /* access modifiers changed from: package-private */
    public final void a(Account account, ajms ajms) {
        ajms.c = Boolean.valueOf(q(account));
        ajms.b = Long.valueOf(d(account));
        ajms.d = Boolean.valueOf(this.d.a(account));
        ajms.i = Boolean.valueOf(i(account));
        ajms.j = this.b.getString(j(account), (String) null);
        ajms.k = Boolean.valueOf(m(account));
        ajms.l = this.b.getString(n(account), (String) null);
        ajms.g = Long.valueOf(this.b.getLong(b(account), Long.MIN_VALUE));
        int i = this.b.getInt(e(account), 0);
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                i = -1;
                break;
        }
        ajms.h = Integer.valueOf(i);
        ajms.e = Boolean.valueOf(this.b.getBoolean(a(account), false));
        ajms.m = this.c.a();
        ajms.o = Build.MODEL;
        ajms.r = Boolean.valueOf(this.b.getBoolean(o(account), true));
        ajms.s = Integer.valueOf(ajkh.a(this.b.getInt(f(account), 0)));
    }

    public final void a(SharedPreferences.Editor editor, boolean z, String str, String str2, boolean z2) {
        String str3;
        int i;
        ReportingConfig a2 = a();
        editor.apply();
        ReportingConfig a3 = a();
        if (!z2) {
            Context context = this.a;
            if (!z) {
                for (Account account : a3.a()) {
                    AccountConfig a4 = a3.a(account);
                    AccountConfig a5 = a2.a(account);
                    if (!(a5 == null || !a4.f() || (i = a4.s) == 1 || i == 2)) {
                        if (aztb.A()) {
                            boolean z3 = a4.g;
                            if (z3 != a5.g) {
                                ajle.a(context, account, z3);
                            }
                        } else if (a4.j() && !a5.j()) {
                            ajle.a(context, account, true);
                        }
                    }
                }
            }
        }
        Set<Account> a6 = a2.a();
        a6.addAll(a3.a());
        StringBuilder sb = new StringBuilder();
        for (Account account2 : a6) {
            AccountConfig a7 = a2.a(account2);
            AccountConfig a8 = a3.a(account2);
            ajnh ajnh = new ajnh(a7);
            ajnh ajnh2 = new ajnh(a8);
            if (!ajnh.equals(ajnh2)) {
                sb.append(rmp.a(account2));
                sb.append(": ");
                String a9 = ajnh.a(ajnh.a, ajnh2.a);
                String a10 = ajnh.a(ajnh.b, ajnh2.b);
                if (atiu.a(ajnh.c, ajnh2.c)) {
                    str3 = ajnh2.a();
                } else {
                    String a11 = ajnh.a();
                    String a12 = ajnh2.a();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a11).length() + 4 + String.valueOf(a12).length());
                    sb2.append(a11);
                    sb2.append(" -> ");
                    sb2.append(a12);
                    str3 = sb2.toString();
                }
                int length = String.valueOf(a9).length();
                StringBuilder sb3 = new StringBuilder(length + 10 + String.valueOf(a10).length() + String.valueOf(str3).length());
                sb3.append("LR=");
                sb3.append(a9);
                sb3.append(", LH=");
                sb3.append(a10);
                sb3.append(", ");
                sb3.append(str3);
                sb.append(sb3.toString());
                sb.append("; ");
            }
        }
        String sb4 = sb.toString();
        if (!sb4.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(sb4).length());
            sb5.append(str);
            sb5.append(" at ");
            sb5.append(currentTimeMillis);
            sb5.append(": ");
            sb5.append(sb4);
            ajix.a("GCoreUlrLong", sb5.toString());
        }
        ajme.b(this.a, str2);
    }
}
