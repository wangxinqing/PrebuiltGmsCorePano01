package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aiov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiov extends jip {
    public String[] a;
    public long b = 0;
    public final Map g = new ConcurrentHashMap();
    public final jkl h = new jkl();
    public final List i = new ArrayList();
    public ajrb j = new ajrc();
    public ActivityRecognitionRequest k;
    public boolean l;
    public final ajqr m;
    public aicn n;
    public Map o;
    public final List p;
    private final ikh q;

    public aiov(Context context, Handler handler, ikh ikh, ajqr ajqr) {
        super(new String[]{axwu.b()}, context, handler);
        rck rck = new rck();
        rck.a(Long.MAX_VALUE);
        this.k = rck.a();
        this.l = false;
        this.n = null;
        this.o = new ConcurrentHashMap();
        this.q = ikh;
        this.m = ajqr;
        this.p = new ArrayList();
    }

    public static final Intent i() {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_RELEASE_VERSION", 2023);
        return intent;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        g();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(jio jio) {
        ahma ahma = (ahma) jio;
        a(ahma.g, ahma.e, ahma.c, (ActivityRecognitionRequest) ahma.d, ahma.a, ahma.b);
    }

    public final PendingIntent c(String str) {
        for (PendingIntent pendingIntent : this.g.keySet()) {
            if (str.equals(pendingIntent.getTargetPackage())) {
                return pendingIntent;
            }
        }
        return null;
    }

    public final void g() {
        ajrb ajrb;
        this.l = false;
        this.o = new ConcurrentHashMap();
        this.p.clear();
        Iterator it = this.g.values().iterator();
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            aiot aiot = (aiot) it.next();
            String valueOf = String.valueOf(aiot);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Still have activity intent receiver ");
            sb.append(valueOf);
            sb.toString();
            if (aiot.d || aiot.h.getTargetPackage().equals("com.google.android.apps.activitydatacollection")) {
                this.p.add(aiot);
            }
            if (!aiot.c) {
                j2 = Math.min(j2, aiot.q);
                j3 = Math.min(j3, Math.max(aiot.i, aiot.q));
            }
            if (!this.l && !aiot.p) {
                z = false;
            }
            this.l = z;
            int[] iArr = aiot.b;
            if (iArr != null) {
                for (int valueOf2 : iArr) {
                    Map map = this.o;
                    Integer valueOf3 = Integer.valueOf(valueOf2);
                    if (!map.containsKey(valueOf3) || ((Long) this.o.get(valueOf3)).longValue() > aiot.q) {
                        this.o.put(valueOf3, Long.valueOf(aiot.q));
                    }
                }
            }
        }
        this.j = new ajrc();
        double d = (double) j2;
        Double.isNaN(d);
        long j4 = (long) (((d + 1.0d) * 3.0d) / 2.0d);
        for (aiot aiot2 : this.g.values()) {
            if (aiot2.q < j4 && (ajrb = aiot2.n) != null) {
                this.j.a(ajrb);
            }
        }
        StringBuilder sb2 = new StringBuilder(130);
        sb2.append("activityListenersChanged. Consolidated request intervalmillis = ");
        sb2.append(j2);
        sb2.append(", MaxReportLatencyMilli = ");
        sb2.append(j3);
        sb2.toString();
        rck rck = new rck();
        rck.a(j2);
        rck.b(j3);
        rck.f = !this.p.isEmpty();
        this.k = rck.a();
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.g.size();
    }

    public final void a(PendingIntent pendingIntent) {
        aicn aicn = this.n;
        if (aicn != null) {
            aicn.a(aico.ACTIVITY_PENDING_INTENT_REMOVED, pendingIntent.hashCode(), pendingIntent.getTargetPackage());
        }
        aiot aiot = (aiot) this.g.remove(pendingIntent);
        if (aiot == null) {
            String valueOf = String.valueOf(pendingIntent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
            sb.append("Unable to find the activity detection pendingIntent to remove: ");
            sb.append(valueOf);
            sb.toString();
            return;
        }
        aiot.a();
        g();
    }

    public final void a(Context context, ajbg ajbg, PendingIntent pendingIntent, ActivityRecognitionRequest activityRecognitionRequest, boolean z, boolean z2) {
        boolean z3;
        long j2;
        boolean z4;
        ActivityRecognitionRequest activityRecognitionRequest2 = activityRecognitionRequest;
        if (!ahjk.a(context, pendingIntent)) {
            long j3 = activityRecognitionRequest2.a;
            if (!axwx.f()) {
                z3 = false;
            } else {
                z3 = !z2 && j3 < axxa.f();
            }
            if (z3) {
                long f = axxa.f();
                String targetPackage = pendingIntent.getTargetPackage();
                long j4 = activityRecognitionRequest2.a;
                long f2 = axxa.f();
                StringBuilder sb = new StringBuilder(String.valueOf(targetPackage).length() + 109);
                sb.append("throttled period millis for package = ");
                sb.append(targetPackage);
                sb.append(", from interval = ");
                sb.append(j4);
                sb.append(", to interval");
                sb.append(f2);
                sb.toString();
                j2 = f;
            } else {
                j2 = j3;
            }
            String str = activityRecognitionRequest2.d;
            if (axwx.e()) {
                ahol a2 = ahol.a(context);
                String targetPackage2 = pendingIntent.getTargetPackage();
                long currentTimeMillis = System.currentTimeMillis();
                aucd o2 = arec.q.o();
                aucd o3 = arei.e.o();
                ares a3 = ahol.a(targetPackage2, str);
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                arei arei = (arei) o3.b;
                a3.getClass();
                arei.b = a3;
                int i2 = arei.a | 1;
                arei.a = i2;
                long j5 = activityRecognitionRequest2.a;
                int i3 = i2 | 2;
                arei.a = i3;
                arei.c = j5;
                arei.a = i3 | 4;
                arei.d = currentTimeMillis;
                arei arei2 = (arei) o3.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arec arec = (arec) o2.b;
                arei2.getClass();
                arec.b = arei2;
                arec.a |= 1;
                hoi a4 = a2.a.a((audx) (arec) o2.i());
                a4.b(1);
                a4.b();
            }
            String hexString = Integer.toHexString(pendingIntent.hashCode());
            String targetPackage3 = pendingIntent.getTargetPackage();
            long j6 = activityRecognitionRequest2.h;
            boolean z5 = activityRecognitionRequest2.b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 155 + String.valueOf(targetPackage3).length() + String.valueOf(str).length());
            sb2.append("adding activity pendingIntent=");
            sb2.append(hexString);
            sb2.append(", packageName=");
            sb2.append(targetPackage3);
            sb2.append(", tag=");
            sb2.append(str);
            sb2.append(", periodMillis=");
            sb2.append(j2);
            sb2.append(", maxReportLatencyMillis=");
            sb2.append(j6);
            sb2.append(", forceDetectionNow=");
            sb2.append(z5);
            sb2.toString();
            aicn aicn = this.n;
            if (aicn != null) {
                int hashCode = pendingIntent.hashCode();
                String targetPackage4 = pendingIntent.getTargetPackage();
                long j7 = activityRecognitionRequest2.h;
                z4 = z3;
                aicn.a((aicl) new aiqq(aico.ACTIVITY_PENDING_INTENT_ADDED, aicn.b(), aicn.a(targetPackage4), hashCode, (int) Math.min(j2 / 1000, 2147483647L), (int) Math.min(j7 / 1000, 2147483647L), hashCode, targetPackage4, str, j2, j7));
            } else {
                z4 = z3;
            }
            long j8 = j2;
            aiot aiot = new aiot(this, pendingIntent, activityRecognitionRequest2.a, activityRecognitionRequest2.h, ajbg, new ajrc(activityRecognitionRequest2.c), z, str, activityRecognitionRequest2.e, activityRecognitionRequest2.f);
            aiot aiot2 = (aiot) this.g.put(pendingIntent, aiot);
            if (aiot2 != null) {
                aiot2.a();
            }
            if (z4) {
                aiot.a(j8);
            }
            g();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(jio jio) {
        a(((ahma) jio).c);
    }

    public final boolean a(Context context, Intent intent, aiot aiot) {
        if (aiot.a(context, intent)) {
            return true;
        }
        String valueOf = String.valueOf(aiot);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("dropping intent receiver");
        sb.append(valueOf);
        sb.toString();
        Intent intent2 = new Intent();
        intent2.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT", aiot.h);
        this.q.b((Parcelable) intent2);
        aicn aicn = this.n;
        if (aicn == null) {
            return false;
        }
        aicn.a(aico.ACTIVITY_PENDING_INTENT_DROPPED, aiot.h.hashCode(), aiot.h.getTargetPackage());
        return false;
    }
}
