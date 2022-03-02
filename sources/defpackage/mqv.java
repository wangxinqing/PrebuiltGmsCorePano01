package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.webkit.CookieManager;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mqv {
    private static final Charset f = Charset.forName("UTF-8");
    private static mqv g;
    public final eiw a;
    public final aoru b;
    public final CookieManager c;
    anbh d;
    amzy e = amzy.h();
    private final anli h;

    public mqv(eiw eiw, aoru aoru, CookieManager cookieManager) {
        iva.a((Object) eiw);
        this.a = eiw;
        iva.a((Object) cookieManager);
        this.c = cookieManager;
        iva.a((Object) aoru);
        this.b = aoru;
        this.h = anln.g();
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public static List a(String str, CookieManager cookieManager) {
        ArrayList arrayList = new ArrayList();
        if (!jlh.d(str)) {
            String cookie = cookieManager.getCookie(str);
            if (!jlh.d(cookie)) {
                for (String str2 : amsk.a(";").a((CharSequence) cookie)) {
                    int indexOf = str2.indexOf(61);
                    if (indexOf > 0) {
                        String trim = str2.substring(0, indexOf).trim();
                        if (!trim.isEmpty()) {
                            arrayList.add(new mqu(trim, str2.substring(indexOf + 1)));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static synchronized mqv a() {
        mqv mqv;
        synchronized (mqv.class) {
            if (g == null) {
                g = new mqv(eiw.a((Context) ihs.b()), jfm.a(9), CookieManager.getInstance());
            }
            mqv = g;
        }
        return mqv;
    }

    public final synchronized void a(Account account) {
        anbh<String> anbh = this.d;
        StringBuilder sb = new StringBuilder();
        if (anbh != null) {
            boolean z = false;
            for (String str : anbh) {
                List a2 = a(str, this.c);
                if (!a2.isEmpty()) {
                    sb.append(str);
                    Collections.sort(a2);
                    int size = a2.size();
                    for (int i = 0; i < size; i++) {
                        mqu mqu = (mqu) a2.get(i);
                        if (this.e.contains(a(str, mqu.a))) {
                            sb.append(mqu.a);
                            sb.append(mqu.b);
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                sb.append(account.name);
                this.h.a(sb.toString(), f).toString();
            }
        }
    }
}
