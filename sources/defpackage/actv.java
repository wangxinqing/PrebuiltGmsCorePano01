package defpackage;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.util.Log;
import com.google.android.gms.appusage.AppUsageIntervals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: actv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actv {
    public final Map a = new HashMap();
    public final AppUsageIntervals b;
    private final long c;
    private final long d;
    private Set e;
    private actu f;
    private actu g;
    private boolean h;
    private long i;
    private long j;
    private final Map k = new HashMap();
    private final UsageStatsManager l;
    private int m;

    public actv(long j2, long j3, List list) {
        this.c = j2;
        this.d = j3;
        if (list != null) {
            HashSet hashSet = new HashSet();
            this.e = hashSet;
            hashSet.addAll(list);
        }
        this.l = (UsageStatsManager) ihs.b().getSystemService("usagestats");
        this.b = new AppUsageIntervals(new ArrayList(), new ArrayList(), new ArrayList());
    }

    private final void a(long j2) {
        this.j = j2;
        this.h = false;
    }

    private final long b(long j2) {
        return this.m != 1 ? Math.max(this.i, j2 - 30000) : this.c;
    }

    private final void b() {
        this.j = 0;
        this.h = true;
    }

    private final boolean c() {
        return this.g.a.equals(this.f.a);
    }

    private final void d() {
        actu actu = this.g;
        actu.c = Math.min(actu.a() + 30000, this.j);
        this.i = Math.max(this.i, this.g.a());
    }

    private final void e() {
        a(this.g);
        this.g = null;
        this.j = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.actu r14) {
        /*
            r13 = this;
            java.lang.String r0 = r14.a
            java.util.Set r1 = r13.e
            if (r1 != 0) goto L_0x0007
            goto L_0x000e
        L_0x0007:
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            long r1 = r14.a()
            long r3 = r14.b
            long r9 = r1 - r3
            java.util.Map r1 = r13.k
            java.lang.Object r2 = r1.get(r0)
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            r5 = 0
            if (r2 != 0) goto L_0x0050
            ihs r6 = defpackage.ihs.b()
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            android.content.pm.PackageInfo r2 = r6.getPackageInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x0033 }
            r1.put(r0, r2)     // Catch:{ NameNotFoundException -> 0x0031 }
            goto L_0x0051
        L_0x0031:
            r1 = move-exception
            goto L_0x0034
        L_0x0033:
            r1 = move-exception
        L_0x0034:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r6 = "Didn't find package info in PackageManager for "
            int r7 = r1.length()
            if (r7 != 0) goto L_0x0046
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            goto L_0x004a
        L_0x0046:
            java.lang.String r1 = r6.concat(r1)
        L_0x004a:
            java.lang.String r6 = "AppUsageUtil"
            android.util.Log.e(r6, r1)
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            int r1 = r2.versionCode
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            java.util.List r2 = defpackage.actw.a(r0)
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0093
            int r1 = r2.size()
            r6 = 0
        L_0x0066:
            if (r6 >= r1) goto L_0x0085
            java.lang.Object r7 = r2.get(r6)
            android.util.Pair r7 = (android.util.Pair) r7
            int r6 = r6 + 1
            java.lang.Object r8 = r7.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r11 = r8.longValue()
            int r8 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x0066
            java.lang.Object r1 = r7.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0093
        L_0x0085:
            java.lang.Object r1 = defpackage.anbs.d(r2)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L_0x0093:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.util.Pair r2 = android.util.Pair.create(r0, r2)
            java.util.Map r3 = r13.a
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L_0x00b0
            java.util.Map r3 = r13.a
            java.lang.Object r3 = r3.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            goto L_0x00b2
        L_0x00b0:
            r3 = 0
        L_0x00b2:
            java.util.Map r6 = r13.a
            long r3 = r3 + r9
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6.put(r2, r3)
            long r7 = r14.b
            com.google.android.gms.appusage.AppUsageIntervals r14 = r13.b
            java.util.List r2 = r14.a
            java.util.List r3 = r14.b
            java.util.List r14 = r14.c
        L_0x00c6:
            int r4 = r2.size()
            if (r5 >= r4) goto L_0x00e5
            java.lang.Object r4 = r2.get(r5)
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00e2
            java.lang.Object r4 = r3.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r1 == r4) goto L_0x00e6
        L_0x00e2:
            int r5 = r5 + 1
            goto L_0x00c6
        L_0x00e5:
            r5 = -1
        L_0x00e6:
            if (r5 >= 0) goto L_0x00f8
            int r4 = r2.size()
            r2.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.add(r0)
            r6 = r4
            goto L_0x00f9
        L_0x00f8:
            r6 = r5
        L_0x00f9:
            com.google.android.gms.appusage.AppUsageIntervals$Interval r0 = new com.google.android.gms.appusage.AppUsageIntervals$Interval
            r5 = r0
            r5.<init>(r6, r7, r9)
            r14.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actv.a(actu):void");
    }

    private final void a(actu actu, long j2) {
        actu.c = j2;
        this.i = Math.max(this.i, j2);
    }

    public final void a() {
        try {
            UsageEvents queryEvents = this.l.queryEvents(this.c, this.d);
            UsageEvents.Event event = new UsageEvents.Event();
            while (queryEvents.hasNextEvent()) {
                queryEvents.getNextEvent(event);
                long timeStamp = event.getTimeStamp();
                String packageName = event.getPackageName();
                if (event.getEventType() == 1) {
                    this.m++;
                    actu actu = this.g;
                    if (actu != null) {
                        if (this.h) {
                            if (actu.a() + 250 <= timeStamp || !packageName.equals(this.g.a)) {
                                e();
                            } else {
                                this.f = this.g;
                                this.g = null;
                                this.j = 0;
                            }
                        } else if (this.f == null || actu.a() + 30000 < this.f.b || !c()) {
                            d();
                            e();
                        } else {
                            a(this.g, this.f.b);
                            a(timeStamp);
                            this.f = null;
                        }
                    }
                    actu actu2 = this.f;
                    if (actu2 != null) {
                        this.g = actu2;
                        a(timeStamp);
                        this.f = null;
                    }
                    this.f = new actu(packageName, timeStamp, 0);
                } else if (event.getEventType() == 2) {
                    this.m++;
                    actu actu3 = this.g;
                    if (actu3 != null) {
                        if (this.h) {
                            if (actu3.a() + 30000 <= timeStamp || !packageName.equals(this.g.a) || this.f != null) {
                                e();
                            } else {
                                a(this.g, timeStamp);
                            }
                        } else if (this.j + 1000 >= timeStamp && packageName.equals(actu3.a)) {
                            a(this.g, timeStamp);
                            if (this.f == null || !c() || timeStamp + 250 <= this.f.b) {
                                b();
                            } else {
                                this.f = this.g;
                                this.g = null;
                                this.j = 0;
                            }
                        } else {
                            d();
                            b();
                            e();
                        }
                    }
                    actu actu4 = this.f;
                    if (actu4 != null) {
                        if (!packageName.equals(actu4.a)) {
                            actu actu5 = this.f;
                            if (actu5.b + 1000 > timeStamp) {
                                a(new actu(packageName, b(timeStamp), timeStamp));
                            } else {
                                long min = Math.min(30000, (timeStamp - actu5.a()) / 2);
                                actu actu6 = this.f;
                                actu6.c = actu6.b + min;
                                this.i = Math.max(this.i, actu6.a());
                                a(this.f);
                                this.f = null;
                            }
                        } else {
                            a(this.f, timeStamp);
                            this.g = this.f;
                            b();
                            this.f = null;
                        }
                    }
                    this.g = new actu(packageName, b(timeStamp), timeStamp);
                    b();
                    this.f = null;
                }
            }
            if (this.g != null) {
                if (!this.h) {
                    d();
                }
                e();
            }
            actu actu7 = this.f;
            if (actu7 != null) {
                actu7.c = this.d;
                a(actu7);
            }
        } catch (NullPointerException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("AppUsageUtil", valueOf.length() == 0 ? new String("Query events in UsageStatsManager caused NPE: ") : "Query events in UsageStatsManager caused NPE: ".concat(valueOf));
        }
    }
}
