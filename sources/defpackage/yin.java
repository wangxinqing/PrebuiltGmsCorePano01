package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: yin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yin extends yiu {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ HeterodyneSyncTaskChimeraService a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yin(com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService r10) {
        /*
            r9 = this;
            r9.a = r10
            jjg r0 = com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService.a
            android.content.Context r2 = r10.b
            yfg r3 = r10.c
            yfg r4 = r10.d
            yiz r5 = r10.j
            agwa r6 = r10.h
            java.lang.String r10 = "HeterodyneSyncerPrefs"
            r0 = 0
            r2.getSharedPreferences(r10, r0)
            bapu r8 = defpackage.yim.a
            r7 = 2
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yin.<init>(com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService):void");
    }

    private final void a(String str, String str2, String str3, int i) {
        aucd o = avsi.e.o();
        aucd o2 = avsh.d.o();
        long a2 = hph.a(str);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avsh avsh = (avsh) o2.b;
        avsh.a = 1;
        avsh.b = Long.valueOf(a2);
        aucd o3 = avsg.d.o();
        long j = (long) i;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        avsg avsg = (avsg) o3.b;
        int i2 = 1 | avsg.a;
        avsg.a = i2;
        avsg.b = j;
        avsg.a = i2 | 2;
        avsg.c = 1;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avsh avsh2 = (avsh) o2.b;
        avsg avsg2 = (avsg) o3.i();
        avsg2.getClass();
        avsh2.c();
        avsh2.c.add(avsg2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avsi avsi = (avsi) o.b;
        avsh avsh3 = (avsh) o2.i();
        avsh3.getClass();
        avsi.c();
        avsi.c.add(avsh3);
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.a;
        jjg jjg = HeterodyneSyncTaskChimeraService.a;
        hoi a3 = heterodyneSyncTaskChimeraService.e.a(((avsi) o.i()).k());
        a3.d = "CLEARCUT_LOG_LOSS";
        a3.f = avsd.DEFAULT;
        a3.b();
        this.a.g.d(str2).a(i);
        hph hph = new hph(this.a.e, "CLEARCUT_LOG_LOSS", 1024);
        hph.d(str3).a(i);
        hph.d();
    }

    /* access modifiers changed from: protected */
    public final void aP() {
        izj.b(4611);
        a("LogLossTracking_HeterodyneServerRequest", "LogLossTracking_Counter_HeterodyneServerRequest", "LogLossTracking_ImmediateCounter_HeterodyneServerRequest", 0);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return (String) yge.b.c();
    }

    /* access modifiers changed from: protected */
    public final avrb c() {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.a;
        jjg jjg = HeterodyneSyncTaskChimeraService.a;
        return yii.a(heterodyneSyncTaskChimeraService.b);
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        try {
            HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.a;
            jjg jjg = HeterodyneSyncTaskChimeraService.a;
            eig.b(heterodyneSyncTaskChimeraService.b, str);
        } catch (eif | IOException e) {
            anih anih = (anih) HeterodyneSyncTaskChimeraService.a.b();
            anih.a(e);
            ((anih) anih.a("yin", "b", 478, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Problem clearing auth token");
        }
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            ((anih) ((anih) HeterodyneSyncTaskChimeraService.a.c()).a("yin", "a", 457, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No account for auth token provided");
            return null;
        }
        try {
            HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.a;
            jjg jjg = HeterodyneSyncTaskChimeraService.a;
            return eig.b(heterodyneSyncTaskChimeraService.b, str, ayzv.b());
        } catch (IOException e) {
            anih anih = (anih) HeterodyneSyncTaskChimeraService.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("yin", "a", 464, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("IOException on getting auth token");
            throw new yfy(29504, "Failed getting auth token due to a transient error.");
        } catch (eif e2) {
            anih anih2 = (anih) HeterodyneSyncTaskChimeraService.a.b();
            anih2.a((Throwable) e2);
            ((anih) anih2.a("yin", "a", 468, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed getting auth token");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Set a(Set set) {
        List<ActivityManager.RunningAppProcessInfo> list;
        if (set.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.a;
        jjg jjg = HeterodyneSyncTaskChimeraService.a;
        ActivityManager activityManager = (ActivityManager) heterodyneSyncTaskChimeraService.b.getSystemService("activity");
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        } else {
            ((anih) ((anih) HeterodyneSyncTaskChimeraService.a.b()).a("yin", "a", 644, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("activityManager is null.");
            list = null;
        }
        if (list != null) {
            hashSet = angm.a(list.size());
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                Collections.addAll(hashSet, runningAppProcessInfo.pkgList);
            }
        }
        hashSet.retainAll(set);
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.a;
        jjg jjg = HeterodyneSyncTaskChimeraService.a;
        yij.b(heterodyneSyncTaskChimeraService.b, i);
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Set set) {
        HashSet<String> hashSet;
        Set set2;
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.a;
        jjg jjg = HeterodyneSyncTaskChimeraService.a;
        Map a2 = yfu.a(heterodyneSyncTaskChimeraService.c.getWritableDatabase(), set);
        boolean a3 = ayzr.a.a().a();
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (!a3) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            Intent registerReceiver = this.a.b.registerReceiver((BroadcastReceiver) null, intentFilter);
            if (!(registerReceiver == null || registerReceiver.getIntExtra("plugged", 0) == 0)) {
                PackageUpdateTaskChimeraService.a(this.a.b, set, a2, i);
                HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService2 = this.a;
                Context context = heterodyneSyncTaskChimeraService2.b;
                SQLiteDatabase writableDatabase = heterodyneSyncTaskChimeraService2.c.getWritableDatabase();
                long a4 = this.a.l.a() / 1000;
                if (azaf.j() >= 0) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("HeterodyneSyncerPrefs", 0);
                    if (a4 - sharedPreferences.getLong("lastNotifyAllUncommittedTimestamp", 0) >= azaf.j()) {
                        PackageUpdateTaskChimeraService.a(context, set, writableDatabase);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong("lastNotifyAllUncommittedTimestamp", a4);
                        edit.apply();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Set keySet = a2.keySet();
        if (keySet.isEmpty()) {
            hashSet = new HashSet<>();
        } else {
            HashSet hashSet2 = new HashSet();
            ActivityManager activityManager = (ActivityManager) this.a.b.getSystemService("activity");
            if (activityManager != null) {
                list = activityManager.getRunningAppProcesses();
            } else {
                ((anih) ((anih) HeterodyneSyncTaskChimeraService.a.b()).a("yin", "a", 644, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("activityManager is null.");
            }
            if (list != null) {
                HashSet a5 = angm.a(list.size());
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                    Collections.addAll(a5, runningAppProcessInfo.pkgList);
                }
                hashSet = a5;
            } else {
                hashSet = hashSet2;
            }
            hashSet.retainAll(keySet);
        }
        hashSet.addAll(ayzr.a.a().f().a);
        if (!hashSet.isEmpty()) {
            set2 = new HashSet();
            for (String str : hashSet) {
                List list2 = (List) a2.get(str);
                if (list2 != null) {
                    set2.addAll(list2);
                }
            }
        } else {
            set2 = Collections.emptySet();
        }
        PackageUpdateTaskChimeraService.a(this.a.b, set2, a2, i);
        set.removeAll(set2);
        if (!set.isEmpty()) {
            PackageUpdateTaskChimeraService.a(this.a.b, a3);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.a;
        jjg jjg = HeterodyneSyncTaskChimeraService.a;
        aucd a2 = yfd.a(heterodyneSyncTaskChimeraService.b);
        avss avss = (avss) avst.m.o();
        if (avss.c) {
            avss.c();
            avss.c = false;
        }
        avst avst = (avst) avss.b;
        avst.a |= 16;
        avst.h = j;
        avst avst2 = (avst) avss.i();
        if (a2.c) {
            a2.c();
            a2.c = false;
        }
        avtk avtk = (avtk) a2.b;
        avtk avtk2 = avtk.k;
        avst2.getClass();
        avtk.c = avst2;
        avtk.a |= 2;
        hoi a3 = this.a.e.a(((avtk) a2.i()).k());
        a3.b(16);
        a3.b();
        yij.e(this.a.b);
    }

    /* access modifiers changed from: protected */
    public final void a(yiy yiy) {
        izj.a();
        if (yiy != null) {
            a("LogLossTracking_HeterodyneServerResponse", "LogLossTracking_Counter_HeterodyneServerResponse", "LogLossTracking_ImmediateCounter_HeterodyneServerResponse", yiy.d);
        }
    }

    public final String[] a() {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.a;
        jjg jjg = HeterodyneSyncTaskChimeraService.a;
        return ygd.a(heterodyneSyncTaskChimeraService.b);
    }
}
