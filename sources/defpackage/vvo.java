package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: vvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vvo implements Callable {
    private final vvq a;
    private final Account b;

    public vvo(vvq vvq, Account account) {
        this.a = vvq;
        this.b = account;
    }

    public final Object call() {
        atvj atvj;
        atwq atwq;
        int a2;
        vvq vvq = this.a;
        Account account = this.b;
        Context context = vvq.a;
        Context applicationContext = context.getApplicationContext();
        whb whb = new whb(context, new whc(new izd(applicationContext, ayni.a.a().ac(), (int) ayni.a.a().ad(), applicationContext.getApplicationInfo().uid, 9728)), applicationContext.getApplicationInfo().uid, applicationContext.getPackageName());
        ClientContext clientContext = new ClientContext();
        clientContext.b = whb.c;
        clientContext.c = account;
        String str = whb.d;
        clientContext.e = str;
        clientContext.f = str;
        clientContext.d("https://www.googleapis.com/auth/webhistory");
        Context context2 = whb.a;
        int i = 1;
        vvl vvl = null;
        try {
            String packageName = context2.getApplicationContext().getPackageName();
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName, 0);
            aucd o = atvj.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atvj atvj2 = (atvj) o.b;
            atvj2.b = 4;
            int i2 = atvj2.a | 1;
            atvj2.a = i2;
            packageName.getClass();
            atvj2.a = i2 | 2;
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
        if (atvj != null) {
            try {
                whc whc = whb.b;
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
                int i3 = 4 | atwn.a;
                atwn.a = i3;
                atwn.b = language;
                atvj.getClass();
                atwn.c = atvj;
                atwn.a = i3 | 8;
                atwn atwn2 = (atwn) o2.i();
                if (whc.b == null) {
                    whc.b = baaj.a(baai.UNARY, "footprints.oneplatform.FootprintsService/GetSettingText", baoq.a(atwn.d), baoq.a(atwq.c));
                }
                atwq = (atwq) whc.a.a(whc.b, clientContext, atwn2, 10000, TimeUnit.MILLISECONDS);
                jjg jjg = vvj.a;
            } catch (babk | eif e2) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a(e2);
                ((anih) anih2.a("whb", "a", 74, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FootprintsGrpcClient.getSettingText failed.");
                atwq = null;
            }
        } else {
            atwq = null;
        }
        if (atwq != null) {
            if (atwq.a != 1) {
                anih anih3 = (anih) vvj.a.d();
                if (atwq.a == 2 && (a2 = atwp.a(((Integer) atwq.b).intValue())) != 0) {
                    i = a2;
                }
                int i4 = i - 1;
                if (i != 0) {
                    anih3.a("Unable to get consent text for device contacts: uiNotAvailableReason=%s.", (Object) i4 != 2 ? i4 != 3 ? "Unknown" : "AlreadyAccepted" : "ShouldNotPrompt");
                } else {
                    throw null;
                }
            } else {
                aqlf aqlf = (aqlf) atwq.b;
                anmd anmd = aqlf.a;
                if (anmd == null) {
                    anmd = anmd.b;
                }
                vvl = new vvl(vvr.a(anmd), vvr.a((List) aqlf.b), vvr.a((List) aqlf.d), vvr.a((List) aqlf.c), aqlf.e, aqlf.f);
            }
        }
        whb.b.a.h();
        if (vvl != null) {
            return vvl;
        }
        throw new RemoteException("Unable to retrieve consent text.");
    }
}
