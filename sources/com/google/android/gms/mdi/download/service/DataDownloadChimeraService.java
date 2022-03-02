package com.google.android.gms.mdi.download.service;

import android.content.Context;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DataDownloadChimeraService extends nio {
    private Context a;
    private afqn b;
    private sca k;
    private sbw l;
    private afsb m;
    private aekn n;

    public DataDownloadChimeraService() {
        super(new int[]{152}, new String[]{"com.google.android.mdd.service.START"}, Collections.emptySet(), 3, 9, 1, (Map) null);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        scg scg;
        Context context = this.a;
        afqn afqn = this.b;
        sca sca = this.k;
        sbw sbw = this.l;
        afsb afsb = this.m;
        nix a2 = nix.a(this, this.e, this.f);
        String str = getServiceRequest.d;
        int i = getServiceRequest.c;
        if (jhg.b()) {
            scg = scg.ZERO_PARTY;
        } else {
            scg = hya.a(this.a).b(str) ? scg.FIRST_PARTY : scg.THIRD_PARTY;
        }
        nit.a(new scj(context, afqn, sca, sbw, afsb, a2, str, i, scg, this.n));
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (!axsv.a.a().e() && (strArr == null || strArr.length <= 0 || !"force_mdd_dump".equals(strArr[0]))) {
            printWriter.println("==== MDD dumped info is DISABLED ====");
            return;
        }
        printWriter.println("==== MDD dumped info ====");
        if (axsv.b()) {
            sca sca = this.k;
            printWriter.println("==== PhenotypeConfigPopulator ====");
            afkc afkc = (afkc) sdu.a(sbx.c, sca.a, (auef) afkc.b.c(7));
            if (afkc != null) {
                printWriter.println("\n== PhConfig: ==");
                aucx aucx = afkc.a;
                int size = aucx.size();
                for (int i = 0; i < size; i++) {
                    afkb afkb = (afkb) aucx.get(i);
                    printWriter.format("Found ph flag %s from ph config.\n", new Object[]{afkb.a});
                    afjx afjx = (afjx) sdu.a(agvx.a(sbx.b, afkb.a, sbx.a), sca.a, (auef) afjx.e.c(7));
                    if (afjx != null) {
                        printWriter.format("groupName: %s\nDataFileGroup:\n %s\n", new Object[]{afjx.b, afjx.toString()});
                    }
                }
            }
        }
        try {
            afqn afqn = this.b;
            aopr.a(afqn.a(), (aoqb) new afpq(afqn, printWriter), afqn.n).get(3, TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
            printWriter.format("Failed to get debug info from MobileDataDownloadManager with exception %s", new Object[]{e});
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            printWriter.format("Failed to get debug info from MobileDataDownloadManager with exception %s", new Object[]{e2});
        }
        printWriter.println();
    }

    public final void onCreate() {
        this.a = getApplicationContext();
        this.n = new aekp();
        aoru aoru = this.f;
        if (sbv.b == null) {
            synchronized (sbv.a) {
                if (sbv.b == null) {
                    sbg sbg = new sbg();
                    sbh sbh = new sbh(aoru);
                    awdx.a(sbh);
                    sbg.a = sbh;
                    awdx.a((Object) sbg.a, sbh.class);
                    sbv.b = new sbv(sbg.a);
                }
            }
        }
        sbv sbv = sbv.b;
        this.b = sbv.a();
        this.m = (afsb) sbv.c.a();
        this.k = new sca(sbv.a(), (afsb) sbv.c.a(), (Executor) sbv.d.a());
        this.l = hxz.g(getApplicationContext()) ? new sbw(getApplicationContext()) : null;
    }

    public final void onDestroy() {
    }
}
