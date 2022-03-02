package defpackage;

import android.accounts.Account;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: qel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qel implements qer {
    final /* synthetic */ List a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ qen e;

    public qel(qen qen, List list, String str, int i, int i2) {
        this.e = qen;
        this.a = list;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        qev a2 = this.e.c.a();
        qez a3 = this.e.d.a();
        a2.a("RouterBackendClient.getAppSplits.cumulative.gotRequestContextLoader");
        arbd a4 = this.e.a(a3, this.a);
        a2.a("RouterBackendClient.getAppSplits.cumulative.gotRequestContext");
        aucd o = arap.f.o();
        aucd o2 = arbf.e.o();
        String str = this.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arbf arbf = (arbf) o2.b;
        str.getClass();
        arbf.a = str;
        arbf.c = this.c;
        arbf.d = this.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        arbf arbf2 = (arbf) o2.i();
        arbf2.getClass();
        ((arap) o.b).a = arbf2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        arap arap = (arap) o.b;
        a4.getClass();
        arap.b = a4;
        arap.c = true;
        arap.d = true;
        Bundle bundle = null;
        try {
            PackageInfo packageInfo = this.e.b.getPackageManager().getPackageInfo("com.google.android.instantapps.supervisor", 128);
            if (packageInfo.applicationInfo != null) {
                bundle = packageInfo.applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e2) {
        }
        boolean z = !(bundle != null ? bundle.getBoolean("instantapps.appinfohashcheck.enabled") : false);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arap) o.b).e = z;
        arap arap2 = (arap) o.i();
        new Object[1][0] = arap2;
        try {
            qed qed = this.e.g;
            Account c2 = qed.a.c();
            if (c2 != null) {
                String a5 = qed.a(c2);
                if (a5 != null) {
                    a2.a("RouterBackendClient.getAppSplits.cumulative.gotAuthToken");
                    this.e.f.a("auth_token", a5);
                    this.e.c();
                    qev a6 = this.e.c.a();
                    try {
                        qen qen = this.e;
                        qeo qeo = qen.e;
                        ClientContext clientContext = qen.f;
                        if (qeo.c == null) {
                            qeo.c = baaj.a(baai.UNARY, "google.internal.play.atoms.api.v1.WhApiService/GetAppSplits", baoq.a(arap.f), baoq.a(araq.m));
                        }
                        araq araq = (araq) qeo.a.a(qeo.c, clientContext, arap2, (long) qeo.b, TimeUnit.MILLISECONDS);
                        a6.a("RouterBackendClient.getAppSplits.success");
                        a2.a("RouterBackendClient.getAppSplits.cumulative.success");
                        return araq;
                    } catch (eif e3) {
                        a6.a("RouterBackendClient.getAppSplits.authFailure");
                        throw new babk(babj.j);
                    }
                } else {
                    throw new babk(babj.j);
                }
            } else {
                throw new qep("No eligible account");
            }
        } catch (qep e4) {
            throw new babk(babj.j);
        }
    }
}
