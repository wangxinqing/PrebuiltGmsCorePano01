package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: ceb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ceb extends ccy {
    public static final ccj b = new ccj(new cea(), "InstalledAppsProducer", new int[]{39}, (int[]) null);
    private atsa k;

    public ceb(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    private final void a(atsb[] atsbArr, long j) {
        aucd o = atsa.b.o();
        List asList = Arrays.asList(atsbArr);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atsa atsa = (atsa) o.b;
        if (!atsa.a.a()) {
            atsa.a = aucj.a(atsa.a);
        }
        auab.a((Iterable) asList, (List) atsa.a);
        this.k = (atsa) o.i();
        jti jti = new jti(7, 39, 1);
        jti.a(jut.b(j));
        jti.a(atsa.c, this.k);
        d(jti.a());
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
        intentFilter.addDataScheme("package");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(cbi.i().a());
    }

    protected static atsb[] a(PackageManager packageManager) {
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        int size = installedPackages.size();
        atsb[] atsbArr = new atsb[size];
        for (int i = 0; i < size; i++) {
            aucd o = atsb.c.o();
            String str = installedPackages.get(i).packageName;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atsb atsb = (atsb) o.b;
            str.getClass();
            atsb.a |= 1;
            atsb.b = str;
            atsbArr[i] = (atsb) o.i();
        }
        return atsbArr;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        a(a(this.d.getPackageManager()), cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        super.a(j);
        this.k = null;
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_FULLY_REMOVED")) {
            atsb[] a = a(this.d.getPackageManager());
            if (!g()) {
                ((anih) ((anih) bxk.a.c()).a("ceb", "a", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[InstalledAppsProducer] No ongoing data");
                a(a, cbi.i().a());
                return;
            }
            long a2 = cbi.i().a();
            a(a2);
            a(a, a2 + 1);
        }
    }
}
