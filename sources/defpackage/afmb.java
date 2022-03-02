package defpackage;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: afmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afmb implements aoqa {
    private final afme a;
    private final afkh b;
    private final String c;
    private final aflf d;

    public afmb(afme afme, afkh afkh, String str, aflf aflf) {
        this.a = afme;
        this.b = afkh;
        this.c = str;
        this.d = aflf;
    }

    public final aorr a() {
        amri amri;
        afme afme = this.a;
        afkh afkh = this.b;
        String str = this.c;
        aflf aflf = this.d;
        afjs afjs = (afjs) afkh;
        if (afjs.d.a()) {
            if (afme.f.a()) {
                afsx afsx = (afsx) afme.f.b();
                afvd afvd = (afvd) afjs.d.b();
                synchronized (afsx.class) {
                    if (!afsx.d.containsKey(str)) {
                        HashMap hashMap = afsx.d;
                        afsw afsw = new afsw(afsx, str, afvd);
                        aekn aekn = afsx.a;
                        hashMap.put(str, new ahcc(afsw, 1000, TimeUnit.MILLISECONDS));
                    }
                }
            } else {
                afkd a2 = afkf.a();
                a2.a = afke.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
                a2.b = "downloadFileGroup: DownloadListener is present but Download Monitor is not provided!";
                return aorl.a((Throwable) a2.a());
            }
        }
        if (afjs.c.a()) {
            amri = amri.b((aflb) aucj.a((aucj) aflb.f, ((afka) afjs.c.b()).k(), aubs.b()));
        } else {
            amri = ampu.a;
        }
        afqn afqn = afme.c;
        Object[] objArr = {"MDDManager", aflf.b, aflf.c};
        return aopr.a(aopr.a(afqn.a(), (aoqb) new afqm(afqn, aflf, amri), afqn.n), (aoqb) new aflo(afme, afkh), afme.e);
    }
}
