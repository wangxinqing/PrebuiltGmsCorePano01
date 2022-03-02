package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SyncResult;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.List;

/* renamed from: xxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxv {
    public static List a;
    public static xxp b;
    public static xxs c;
    public static xxr d;
    public final Account e;
    public final Bundle f;
    public final Context g;
    public final String h;
    public final xxt i;
    public final yaz j;
    public final SyncResult k;
    public final xvp l;
    public final String m;
    public final String n;
    public final amri o;
    public final ybu p;
    private final amri q;
    private final xwl r;
    private final wss s;

    public xxv(Account account, Bundle bundle, Context context, ContentResolver contentResolver, yaz yaz, xvp xvp, jiq jiq, xpp xpp, wss wss, aqwp aqwp, String str, String str2) {
        Account account2 = account;
        Bundle bundle2 = bundle;
        Context context2 = context;
        ContentResolver contentResolver2 = contentResolver;
        yaz yaz2 = yaz;
        wss wss2 = wss;
        ybv ybv = ybv.a;
        this.e = account2;
        this.f = bundle2;
        this.g = context2;
        this.h = bundle2.getString("feed");
        this.j = yaz2;
        this.k = ((ybh) yaz2).a;
        this.l = xvp;
        this.m = str;
        this.n = str2;
        this.s = wss2;
        xip.a();
        xwn xwn = new xwn(new xwo(contentResolver2, account2));
        this.p = ybv.a(context2);
        this.i = new xxt(account2, xwn, this.p);
        xyu xyu = new xyu(account2, contentResolver2);
        ClientContext a2 = Boolean.valueOf(ayrj.a.a().y()).booleanValue() ? xpl.a(context2, account2) : xpl.a(context2, account2.name, "80");
        String a3 = iqi.a(context);
        this.r = new xwl(wss2, yaz2, account2.name);
        if (ayug.b()) {
            xwl xwl = this.r;
            int o2 = xwl.a.o(xwl.c);
            int i2 = o2 - 1;
            if (o2 != 0) {
                if (i2 == 0) {
                    xwl.a.d(xwl.c, 4);
                    wss wss3 = xwl.a;
                    String str3 = xwl.c;
                    iva.b((String) null);
                    SharedPreferences.Editor edit = wss3.a.edit();
                    String valueOf = String.valueOf(str3);
                    edit.remove(valueOf.length() == 0 ? new String("focus_first_full_sync_initial_timestamp_") : "focus_first_full_sync_initial_timestamp_".concat(valueOf)).commit();
                    xwl.a.i(xwl.c);
                    xwl.a.j(xwl.c);
                } else if (i2 == 1) {
                    xwl.a.d(xwl.c, 3);
                    wss wss4 = xwl.a;
                    String str4 = xwl.c;
                    long currentTimeMillis = System.currentTimeMillis();
                    iva.b((String) null);
                    SharedPreferences.Editor edit2 = wss4.a.edit();
                    String valueOf2 = String.valueOf(str4);
                    edit2.putLong(valueOf2.length() == 0 ? new String("focus_first_full_sync_start_timestamp_") : "focus_first_full_sync_start_timestamp_".concat(valueOf2), currentTimeMillis).commit();
                    xwl.b.c();
                } else if (i2 == 2) {
                    xwl.b.c();
                }
                xwl.a(o2);
            } else {
                throw null;
            }
        }
        this.q = xxg.a(wss2, yaz2, account2.name) ? amri.b(new xxg(context2, account2, wss2, yaz2)) : ampu.a;
        this.o = xxj.a(wss2, yaz2, account2.name) ? amri.b(new xxj(context2, account2, wss2, yaz2)) : ampu.a;
        Context context3 = context;
        ClientContext clientContext = a2;
        xpp xpp2 = xpp;
        String str5 = a3;
        yav yav = new yav(context2, yaz2, amsn.a(ampt.a));
        xyu xyu2 = xyu;
        xwn xwn2 = xwn;
        yaz yaz3 = yaz;
        b = new xxp(new xww(context3, clientContext, xpp2, str5, jiu.a, amsn.a(ampt.a), yaz, aqwp, this.p, this.q), new xwt(context3, clientContext, xpp2, str5, amsn.a(ampt.a), yaz, aqwp, this.p), xwn2, contentResolver, xyu2, account, yaz3, xvp, jiq, yav, this.q, this.o);
        yaz yaz4 = yaz;
        c = new xxs(new xwv(context, a2, xpp, a3, jiu.a, amsn.a(ampt.a), yaz3, aqwp, this.p, this.q), xwn2, contentResolver, xyu2, account, yaz4, xvp, jiq, wss, yav, this.q, this.o);
        Context context4 = context;
        xxr xxr = new xxr(context4, new xwt(context4, a2, xpp, a3, amsn.a(ampt.a), yaz4, aqwp, this.p), contentResolver, account, yaz, xvp, new xyt(contentResolver2), yav, this.p, this.q, this.o);
        d = xxr;
        a = Arrays.asList(new xxu[]{b, c, xxr});
    }

    public static void a(xkj xkj) {
        for (xxu a2 : a) {
            a2.a(xkj);
        }
    }

    private static void a(yaz yaz, boolean z, wss wss, String str) {
        ybh ybh = (ybh) yaz;
        if (ybh.t && !z && !ybh.v) {
            String valueOf = String.valueOf(str);
            String str2 = valueOf.length() == 0 ? new String("focus_first_full_sync_failed_times_") : "focus_first_full_sync_failed_times_".concat(valueOf);
            wss.a.edit().putInt(str2, wss.a.getInt(str2, 0) + 1).apply();
        }
    }

    public final void a(boolean z) {
        boolean z2;
        if (ayug.b()) {
            int i2 = 1;
            if (!z || ((ybh) this.j).a.hasError()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                xwl xwl = this.r;
                int o2 = xwl.a.o(xwl.c);
                if (o2 == 3) {
                    xwl.a.d(xwl.c, 4);
                    wss wss = xwl.a;
                    String str = xwl.c;
                    long currentTimeMillis = System.currentTimeMillis();
                    iva.b((String) null);
                    SharedPreferences.Editor edit = wss.a.edit();
                    String valueOf = String.valueOf(str);
                    edit.putLong(valueOf.length() == 0 ? new String("focus_first_full_sync_finish_timestamp_") : "focus_first_full_sync_finish_timestamp_".concat(valueOf), currentTimeMillis).commit();
                }
                xwl.a(o2);
                if (ayug.d()) {
                    wss wss2 = this.s;
                    String valueOf2 = String.valueOf(this.e.name);
                    wss2.a.edit().putInt(valueOf2.length() == 0 ? new String("focus_first_full_sync_failed_times_") : "focus_first_full_sync_failed_times_".concat(valueOf2), 0).apply();
                }
            }
            if (ayug.d()) {
                a(this.j, z2, this.s, this.e.name);
            }
            if (this.q.a()) {
                if (!ayug.d()) {
                    a(this.j, z2, this.s, this.e.name);
                }
                xxg xxg = (xxg) this.q.b();
                if (!((ybh) this.j).t) {
                    i2 = 2;
                }
                xxg.b(i2, z2);
            }
        }
    }
}
