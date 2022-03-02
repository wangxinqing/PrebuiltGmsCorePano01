package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import java.util.List;

/* renamed from: agme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agme implements aoqa {
    private final agmf a;
    private final String b;
    private final boolean c;
    private final String d;
    private final int e;

    public agme(agmf agmf, String str, int i, boolean z, String str2) {
        this.a = agmf;
        this.b = str;
        this.e = i;
        this.c = z;
        this.d = str2;
    }

    public final aorr a() {
        barb barb;
        agmf agmf = this.a;
        String str = this.b;
        int i = this.e;
        boolean z = this.c;
        String str2 = this.d;
        if (agmf.d.e()) {
            System.gc();
            System.runFinalization();
            System.gc();
        }
        ages ages = (ages) agmf.d.d().c();
        if (ages != null) {
            try {
                barb = ages.a();
            } catch (RuntimeException e2) {
                RuntimeException runtimeException = e2;
                anhn anhn = (anhn) agmf.a.b();
                anhn.a((Throwable) runtimeException);
                ((anhn) anhn.a("agmf", "a", 315, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Metric extension provider failed.");
                barb = null;
            }
        } else {
            barb = null;
        }
        if (!agmf.d.c()) {
            aucd o = basu.s.o();
            barg a2 = agjp.a(i, agmf.b, str2, agmf.d);
            if (o.c) {
                o.c();
                o.c = false;
            }
            basu basu = (basu) o.b;
            a2.getClass();
            basu.b = a2;
            basu.a |= 1;
            agmf.e.a(str, z, (basu) o.i(), barb);
        } else {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = agjs.a(agmf.b).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                String packageName = agmf.b.getPackageName();
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (Build.VERSION.SDK_INT > 22 || next.processName.contains(packageName)) {
                        aucd o2 = basu.s.o();
                        barg a3 = agjp.a(i, next.pid, next.processName, agmf.b, str2, agmf.d);
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        basu basu2 = (basu) o2.b;
                        a3.getClass();
                        basu2.b = a3;
                        basu2.a |= 1;
                        agmf.e.a(str, z, (basu) o2.i(), barb);
                    }
                }
            }
        }
        return aorl.a((Object) null);
    }
}
