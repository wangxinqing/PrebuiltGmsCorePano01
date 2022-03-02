package defpackage;

import android.content.ComponentName;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.stats.AlarmEvent;
import com.google.android.gms.common.stats.ConnectionEvent;
import com.google.android.gms.common.stats.StatsEvent;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* renamed from: jda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jda implements jdb {
    private static jda i;
    public final jck a;
    public final long b;
    public final long c;
    public final File d;
    public final ScheduledExecutorService e;
    public final jcw f;
    public final Map g = new nz();
    public final Map h = new nz();

    public static ArrayList a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new ArrayList(Arrays.asList(str.split(",")));
        }
        return null;
    }

    public final int a(int i2) {
        jck jck = this.a;
        return i2 != 1 ? i2 != 2 ? jck.c : jck.a : jck.b;
    }

    private jda() {
        if (ihs.b() == null) {
            ComponentName componentName = jcl.a;
            this.a = new jck((byte[]) null);
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = null;
            this.f = null;
            return;
        }
        try {
            aeeg.b(ihs.b().getContentResolver(), "gms:common:stats:writer", "gms:common:stats:connections", "gms:common:stats:wakeLocks", "gms:common:stats:alarms");
        } catch (SecurityException e2) {
            Log.w("StatisticalEventTracker", "Failed to cache log levels", e2);
        }
        jck jck = new jck();
        this.a = jck;
        if (jck.d) {
            this.d = aekv.d(ihs.b()).getDir("stats", 0);
            this.f = new jcw();
            this.e = jfm.a(1, 10);
            this.b = ((Long) jcc.f.c()).longValue();
            this.c = ((Long) jcf.b.c()).longValue();
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public static synchronized jda a() {
        jda jda;
        synchronized (jda.class) {
            if (i == null) {
                i = new jda();
            }
            jda = i;
        }
        return jda;
    }

    private final void a(String str, StatsEvent statsEvent) {
        jcy jcy;
        synchronized (this.h) {
            jcy = (jcy) this.h.remove(statsEvent.c());
        }
        if (jcy != null) {
            ScheduledFuture scheduledFuture = jcy.b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.e.execute(new jcx(this, str, jcy.a, statsEvent));
            return;
        }
        Log.w("StatisticalEventTracker", "Close event missing open event.");
    }

    private final void a(String str, jcy jcy) {
        jcz jcz = new jcz(this, str, jcy.a);
        ScheduledExecutorService scheduledExecutorService = this.e;
        StatsEvent statsEvent = jcy.a;
        long e2 = statsEvent.e();
        long j = 0;
        if (statsEvent instanceof ConnectionEvent) {
            j = e2 != 0 ? Math.min(e2, this.b) : this.b;
        } else if (statsEvent instanceof WakeLockEvent) {
            if (e2 != 0) {
                j = Math.min(e2, this.c);
            } else {
                j = this.c;
            }
        }
        jcy.b = ((jfv) scheduledExecutorService).schedule((Runnable) jcz, j, TimeUnit.MILLISECONDS);
    }

    public final void a(AlarmEvent alarmEvent) {
        if (this.a.a("alarms")) {
            int i2 = this.a.c;
            ComponentName componentName = jcl.a;
            if (i2 != 0) {
                ((jfv) this.e).submit((Runnable) new jcx(this, "alarms", alarmEvent));
            }
        }
    }

    public final void a(ConnectionEvent connectionEvent) {
        if (this.a.a("service_connections")) {
            int i2 = connectionEvent.c;
            if (i2 != 1) {
                if (!(i2 == 2 || i2 == 3)) {
                    if (i2 != 4) {
                        switch (i2) {
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                                break;
                            case UrlRequest.Status.READING_RESPONSE /*14*/:
                                break;
                            case Service.START_CONTINUATION_MASK:
                                String str = connectionEvent.i;
                                synchronized (this.h) {
                                    Iterator it = this.h.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (((String) entry.getKey()).startsWith(str)) {
                                            if (((jcy) entry.getValue()).b != null) {
                                                ((jcy) entry.getValue()).b.cancel(true);
                                            }
                                            this.e.execute(new jcx(this, "service_connections", ((jcy) entry.getValue()).a, connectionEvent));
                                            it.remove();
                                        }
                                    }
                                }
                                return;
                            default:
                                return;
                        }
                    }
                }
                synchronized (this.h) {
                    jcy jcy = new jcy(connectionEvent);
                    this.h.put(connectionEvent.i, jcy);
                    jck jck = this.a;
                    int i3 = connectionEvent.c;
                    if (i3 == 2 || i3 == 3 || i3 == 13) {
                        if ((jck.a & jcl.b) != 0) {
                            a("service_connections", jcy);
                        }
                    }
                }
                return;
            }
            jck jck2 = this.a;
            if (i2 != 1) {
                if (!(i2 == 2 || i2 == 3)) {
                    if (i2 != 4) {
                        switch (i2) {
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                                break;
                            case UrlRequest.Status.READING_RESPONSE /*14*/:
                            case Service.START_CONTINUATION_MASK:
                                break;
                            default:
                                return;
                        }
                    }
                }
                if ((jck2.a & jcl.c) == 0) {
                    return;
                }
                a("service_connections", (StatsEvent) connectionEvent);
            }
            if ((jck2.a & jcl.d) == 0) {
                return;
            }
            a("service_connections", (StatsEvent) connectionEvent);
        }
    }

    public final void a(WakeLockEvent wakeLockEvent) {
        if (this.a.a("wakelocks")) {
            int i2 = wakeLockEvent.c;
            if (i2 != 7) {
                if (i2 != 8) {
                    if (i2 != 10) {
                        if (i2 != 11) {
                            if (i2 == 16 && this.a.a(wakeLockEvent)) {
                                wakeLockEvent.p = wakeLockEvent.j;
                                this.e.execute(new jcx(this, "wakelocks", wakeLockEvent));
                                return;
                            }
                            return;
                        }
                    }
                }
                if (this.a.a(wakeLockEvent)) {
                    a("wakelocks", (StatsEvent) wakeLockEvent);
                    return;
                }
                return;
            }
            synchronized (this.h) {
                jcy jcy = new jcy(wakeLockEvent);
                this.h.put(wakeLockEvent.i, jcy);
                jck jck = this.a;
                int i3 = wakeLockEvent.c;
                if (i3 == 7 || i3 == 10) {
                    if ((jck.b & jcl.b) != 0) {
                        a("wakelocks", jcy);
                    }
                }
            }
        }
    }
}
