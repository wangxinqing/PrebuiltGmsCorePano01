package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: nzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzd implements Runnable {
    private final nze a;
    private final WeakReference b;
    private final Context c;
    private final HelpConfig d;

    public nzd(nzc nzc, Context context, HelpConfig helpConfig) {
        this.a = new nze(context, helpConfig);
        this.b = new WeakReference(nzc);
        this.c = context;
        this.d = helpConfig;
    }

    private final void b(String str) {
        for (AccountChangeEvent accountChangeEvent : eig.a(this.c, 0, str)) {
            if (accountChangeEvent.d == 3) {
                String str2 = accountChangeEvent.f;
                if (!TextUtils.isEmpty(str2)) {
                    nze nze = new nze(this.c, this.d);
                    nze.a = nze.c(str2);
                    if (nze.a("last_seen_account_change_index", -1) < accountChangeEvent.e) {
                        b(str2);
                        nze nze2 = new nze(this.c, this.d);
                        nze2.a = nze.c(str);
                        nzp a2 = nze2.a();
                        nze nze3 = new nze(this.c, this.d);
                        nze3.a = nze.c(str2);
                        nzp a3 = nze3.a();
                        ou a4 = nzy.a(this.d);
                        int i = a4.h;
                        for (int i2 = 0; i2 < i; i2++) {
                            String str3 = (String) a4.b(i2);
                            Object c2 = a4.c(i2);
                            if (nze3.b(str3)) {
                                if (c2 instanceof Boolean) {
                                    a2.a(str3, nze3.a(str3, ((Boolean) c2).booleanValue()));
                                } else if (c2 instanceof String) {
                                    a2.a(str3, nze3.a(str3, (String) c2));
                                } else if (c2 instanceof Integer) {
                                    a2.a(str3, nze3.a(str3, ((Integer) c2).intValue()));
                                } else if (c2 instanceof Long) {
                                    a2.a(str3, nze3.a(str3, ((Long) c2).longValue()));
                                } else if (c2 instanceof Float) {
                                    throw new UnsupportedOperationException("Float not supported.");
                                }
                                a3.a(str3);
                            }
                        }
                        a3.a("is_account_in_prefs");
                        a2.a();
                        a3.a();
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        nze nze = this.a;
        nze.a = str;
        nzp a2 = nze.a();
        a2.a("is_account_in_prefs", true);
        a2.a();
        nzc nzc = (nzc) this.b.get();
        if (nzc != null) {
            nzc.a(this.a);
        }
    }

    public final void run() {
        Account account = this.d.d;
        if (account == null || this.c == null) {
            a("");
            return;
        }
        String str = account.name;
        try {
            b(str);
            a(nze.c(str));
        } catch (eif | IOException e) {
            Log.w("gH_AcctSpecificPrfInit", "Failed to get account ID.", e);
            a("");
        }
    }
}
