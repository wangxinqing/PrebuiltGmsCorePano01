package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: whb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class whb {
    public final Context a;
    public final whc b;
    public final int c;
    public final String d;

    public whb(Context context, whc whc, int i, String str) {
        this.a = context;
        this.b = whc;
        this.c = i;
        this.d = str;
    }

    private static final atvj a(Context context) {
        try {
            String packageName = context.getApplicationContext().getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            aucd o = atvj.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atvj atvj = (atvj) o.b;
            atvj.b = 4;
            int i = atvj.a | 1;
            atvj.a = i;
            packageName.getClass();
            atvj.a = i | 2;
            atvj.c = packageName;
            atvj.a(atvj);
            if (packageInfo.versionName != null) {
                String str = packageInfo.versionName;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atvj atvj2 = (atvj) o.b;
                str.getClass();
                atvj2.a |= 4;
                atvj2.d = str;
            }
            return (atvj) o.i();
        } catch (PackageManager.NameNotFoundException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("whb", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to get package info.");
            return null;
        }
    }

    public final atwq a(Account account) {
        atvj atvj;
        ClientContext clientContext = new ClientContext();
        clientContext.b = this.c;
        clientContext.c = account;
        String str = this.d;
        clientContext.e = str;
        clientContext.f = str;
        clientContext.d("https://www.googleapis.com/auth/webhistory");
        Context context = this.a;
        try {
            String packageName = context.getApplicationContext().getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            aucd o = atvj.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atvj atvj2 = (atvj) o.b;
            atvj2.b = 4;
            int i = atvj2.a | 1;
            atvj2.a = i;
            packageName.getClass();
            atvj2.a = i | 2;
            atvj2.c = packageName;
            atvj.a(atvj2);
            if (packageInfo.versionName != null) {
                String str2 = packageInfo.versionName;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atvj atvj3 = (atvj) o.b;
                str2.getClass();
                atvj3.a |= 4;
                atvj3.d = str2;
            }
            atvj = (atvj) o.i();
        } catch (PackageManager.NameNotFoundException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("whb", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to get package info.");
            atvj = null;
        }
        if (atvj == null) {
            return null;
        }
        try {
            whc whc = this.b;
            aucd o2 = atwn.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atwn.a((atwn) o2.b);
            String language = arzd.b().getLanguage();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atwn atwn = (atwn) o2.b;
            language.getClass();
            int i2 = 4 | atwn.a;
            atwn.a = i2;
            atwn.b = language;
            atvj.getClass();
            atwn.c = atvj;
            atwn.a = i2 | 8;
            atwn atwn2 = (atwn) o2.i();
            if (whc.b == null) {
                whc.b = baaj.a(baai.UNARY, "footprints.oneplatform.FootprintsService/GetSettingText", baoq.a(atwn.d), baoq.a(atwq.c));
            }
            atwq atwq = (atwq) whc.a.a(whc.b, clientContext, atwn2, 10000, TimeUnit.MILLISECONDS);
            jjg jjg = vvj.a;
            return atwq;
        } catch (babk | eif e2) {
            anih anih2 = (anih) vvj.a.c();
            anih2.a(e2);
            ((anih) anih2.a("whb", "a", 74, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FootprintsGrpcClient.getSettingText failed.");
            return null;
        }
    }
}
