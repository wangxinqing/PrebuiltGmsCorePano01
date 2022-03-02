package defpackage;

import android.app.ActivityManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.HashMap;
import java.util.List;

/* renamed from: cet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cet extends ccw {
    public static final ccj b = new ccj(new ces(), "RunningAppsProducer", new int[]{20}, new int[]{7});
    private long k;
    private final HashMap l;
    private String m;
    private int n;

    public cet(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
        this.n = 1;
        this.k = cbi.i().a();
        this.n = 1;
        this.l = new HashMap();
        this.m = "";
        a(20);
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* access modifiers changed from: protected */
    public final long k() {
        long j;
        if (this.k == 0) {
            return 0;
        }
        if (this.n == 3) {
            j = awuz.a.a().aN();
        } else {
            j = awuz.a.a().ay();
        }
        long a = (this.k + j) - cbi.i().a();
        if (a >= 0) {
            return a;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, long j, WriteBatchImpl writeBatchImpl) {
        ContextData contextData = (ContextData) this.l.remove(str);
        if (contextData == null) {
            ((anih) ((anih) bxk.a.c()).a("cet", "a", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[RunningAppsProducer] onGoingContext for %s should not be null", (Object) str);
            return;
        }
        aucd o = atuc.f.o();
        if (!TextUtils.isEmpty(str)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            atuc atuc = (atuc) o.b;
            str.getClass();
            atuc.a |= 1;
            atuc.b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            atuc atuc2 = (atuc) o.b;
            str2.getClass();
            atuc2.a |= 2;
            atuc2.c = str2;
        }
        jti jti = new jti(contextData);
        jti.a(j);
        writeBatchImpl.a(jti.a());
        new Object[1][0] = o.toString();
    }

    public final void b(ContextData contextData) {
        int i = 1;
        new Object[1][0] = contextData;
        if (contextData.g() != 7) {
            ((anih) ((anih) bxk.a.c()).a("cet", "b", 88, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[RunningAppsProducer] Should not be receiving context: %s", (Object) Integer.toString(contextData.g()));
            return;
        }
        atuf atuf = (atuf) contextData.a((aubq) atuf.d);
        if (atuf == null) {
            ((anih) ((anih) bxk.a.b()).a("cet", "b", 97, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[RunningAppsProducer] Could not get Screen proto in Running app producer.");
            return;
        }
        int i2 = this.n;
        int a = atue.a(atuf.b);
        if (a == 0) {
            a = 1;
        }
        if (i2 != a) {
            int a2 = atue.a(atuf.b);
            if (a2 != 0 && a2 == 3) {
                this.m = "";
            }
            int a3 = atue.a(atuf.b);
            if (a3 != 0) {
                i = a3;
            }
            this.n = i;
            j();
        }
    }

    /* access modifiers changed from: protected */
    public final void j() {
        WriteBatchImpl writeBatchImpl;
        WriteBatchImpl writeBatchImpl2;
        String str;
        long a = cbi.i().a();
        if (jkr.a()) {
            writeBatchImpl2 = juc.b();
            UsageEvents queryEvents = ((UsageStatsManager) this.d.getSystemService("usagestats")).queryEvents(this.k, a);
            while (queryEvents.hasNextEvent()) {
                UsageEvents.Event event = new UsageEvents.Event();
                queryEvents.getNextEvent(event);
                int eventType = event.getEventType();
                if (eventType == 1 || eventType == 8) {
                    if (eventType != 8) {
                        str = null;
                    } else if (jkr.d()) {
                        str = event.getShortcutId();
                    }
                    String packageName = event.getPackageName();
                    String className = event.getClassName();
                    long timeStamp = event.getTimeStamp();
                    aucd o = atuc.f.o();
                    if (!TextUtils.isEmpty(packageName)) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atuc atuc = (atuc) o.b;
                        packageName.getClass();
                        atuc.a |= 1;
                        atuc.b = packageName;
                    }
                    if (!TextUtils.isEmpty(className)) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atuc atuc2 = (atuc) o.b;
                        className.getClass();
                        atuc2.a |= 2;
                        atuc2.c = className;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atuc atuc3 = (atuc) o.b;
                        str.getClass();
                        atuc3.a |= 8;
                        atuc3.e = str;
                    }
                    int i = eventType != 1 ? 3 : 2;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atuc atuc4 = (atuc) o.b;
                    atuc4.d = i - 1;
                    atuc4.a |= 4;
                    jti jti = new jti(1, 20, 1);
                    jti.a(eventType == 1 ? jut.b(timeStamp) : jut.a(timeStamp));
                    jti.a(atuc.g, (atuc) o.i());
                    ContextData a2 = jti.a();
                    writeBatchImpl2.a(a2);
                    if (eventType == 1) {
                        this.l.put(packageName, a2);
                    }
                } else if (eventType == 2) {
                    String packageName2 = event.getPackageName();
                    String className2 = event.getClassName();
                    long timeStamp2 = event.getTimeStamp();
                    ContextData contextData = (ContextData) this.l.remove(packageName2);
                    if (contextData == null) {
                        ((anih) ((anih) bxk.a.c()).a("cet", "a", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[RunningAppsProducer] onGoingContext for %s should not be null", (Object) packageName2);
                    } else {
                        aucd o2 = atuc.f.o();
                        if (!TextUtils.isEmpty(packageName2)) {
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            atuc atuc5 = (atuc) o2.b;
                            packageName2.getClass();
                            atuc5.a |= 1;
                            atuc5.b = packageName2;
                        }
                        if (!TextUtils.isEmpty(className2)) {
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            atuc atuc6 = (atuc) o2.b;
                            className2.getClass();
                            atuc6.a |= 2;
                            atuc6.c = className2;
                        }
                        jti jti2 = new jti(contextData);
                        jti2.a(timeStamp2);
                        writeBatchImpl2.a(jti2.a());
                        new Object[1][0] = o2.toString();
                    }
                }
            }
        } else {
            writeBatchImpl2 = juc.b();
            PackageManager packageManager = this.d.getPackageManager();
            List<ActivityManager.RecentTaskInfo> recentTasks = ((ActivityManager) this.d.getSystemService("activity")).getRecentTasks((int) awuz.a.a().au(), 3);
            if (recentTasks.size() > 0) {
                ResolveInfo resolveActivity = packageManager.resolveActivity(recentTasks.get(0).baseIntent, 0);
                if (resolveActivity == null || resolveActivity.activityInfo == null || TextUtils.isEmpty(resolveActivity.activityInfo.packageName)) {
                    writeBatchImpl = null;
                    if (writeBatchImpl != null && writeBatchImpl.a()) {
                        a(writeBatchImpl);
                    }
                    this.k = a;
                }
                String str2 = resolveActivity.activityInfo.packageName;
                if (!TextUtils.equals(str2, this.m)) {
                    aucd o3 = atuc.f.o();
                    if (!TextUtils.isEmpty(str2)) {
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        atuc atuc7 = (atuc) o3.b;
                        str2.getClass();
                        atuc7.a |= 1;
                        atuc7.b = str2;
                    }
                    jti jti3 = new jti(1, 20, 1);
                    jti3.a(jut.a(cbi.i().a()));
                    jti3.a(atuc.g, (atuc) o3.i());
                    writeBatchImpl2.a(jti3.a());
                    this.m = str2;
                }
            }
        }
        writeBatchImpl = writeBatchImpl2;
        a(writeBatchImpl);
        this.k = a;
    }
}
