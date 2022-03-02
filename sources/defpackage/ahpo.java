package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpo implements ajad, ahji, ahlz {
    public static final Object a = new Object();
    public static ahpo b;
    public final aizy c;
    public boolean d = false;
    public long e = -1;
    public long f = axwx.k();
    public ActivityTransitionRequest g;
    public boolean h = false;
    public final aiwl i;
    private final ahjc j;
    private final ahpn k;
    private final ahpi l;

    public ahpo(aizy aizy, ahjc ahjc, aiwl aiwl, ahpn ahpn, ahpi ahpi) {
        this.c = aizy;
        this.j = ahjc;
        this.i = aiwl;
        this.k = ahpn;
        this.l = ahpi;
    }

    private static List a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) it.next();
            Iterator it2 = list2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                ActivityTransition activityTransition = (ActivityTransition) it2.next();
                if (activityTransitionEvent.a == activityTransition.a && activityTransitionEvent.b == activityTransition.b) {
                    arrayList.add(activityTransitionEvent);
                    z = true;
                }
            }
            if (!z) {
                String valueOf = String.valueOf(activityTransitionEvent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Not an interested transition: ");
                sb.append(valueOf);
                sb.toString();
            }
        }
        return arrayList;
    }

    public final void a(ajai ajai) {
    }

    public final void a(List list, int[] iArr) {
    }

    public final void b(int i2) {
    }

    public final synchronized void c(boolean z) {
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(52);
        sb.append("Changing the wifi connected from = ");
        sb.append(z2);
        sb.append(", to = ");
        sb.append(z);
        sb.toString();
        this.d = z;
        this.e = z ? System.currentTimeMillis() : -1;
    }

    public final void s() {
    }

    public final void a(ajah ajah) {
        if (ajah.b != 0) {
            return;
        }
        if (!this.d || !axxd.a.a().enableConnectedWifiFilterAudioFusion() || ajah.a != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ActivityTransitionEvent(20, ajah.a, ajah.c * 1000000));
            this.j.a((List) arrayList, 3);
        }
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult, boolean z) {
        if (this.h) {
            ahpi ahpi = this.l;
            boolean z2 = false;
            if (axxa.a.a().arTransitionWifiFilteringEnabled() && this.d) {
                z2 = true;
            }
            List a2 = ahpi.a(activityRecognitionResult, z, z2);
            if (a2 == null || a2.isEmpty()) {
                StringBuilder sb = new StringBuilder(55);
                sb.append("No valid transitions found. Deep still mode was = ");
                sb.append(z);
                sb.toString();
                return;
            }
            List a3 = a(a2, this.g.b);
            if (!a3.isEmpty()) {
                this.j.a(a3, 2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.google.android.gms.location.ActivityTransitionRequest r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            if (r5 != 0) goto L_0x0006
            goto L_0x0070
        L_0x0006:
            java.util.List r2 = r5.b     // Catch:{ all -> 0x008c }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x008c }
            if (r2 != 0) goto L_0x0070
            ahpn r2 = r4.k     // Catch:{ all -> 0x008c }
            boolean r2 = r2.u()     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x004b
            r4.g = r5     // Catch:{ all -> 0x008c }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x008c }
            r1.<init>()     // Catch:{ all -> 0x008c }
            java.util.List r5 = r5.b     // Catch:{ all -> 0x008c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x008c }
        L_0x0023:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x008c }
            com.google.android.gms.location.ActivityTransition r2 = (com.google.android.gms.location.ActivityTransition) r2     // Catch:{ all -> 0x008c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008c }
            r1.put(r2, r3)     // Catch:{ all -> 0x008c }
            goto L_0x0023
        L_0x0037:
            boolean r5 = defpackage.axxa.c()     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x0044
            aiwl r5 = r4.i     // Catch:{ all -> 0x008c }
            r5.a()     // Catch:{ all -> 0x008c }
            r4.h = r0     // Catch:{ all -> 0x008c }
        L_0x0044:
            ahpn r5 = r4.k     // Catch:{ all -> 0x008c }
            r5.a(r1)     // Catch:{ all -> 0x008c }
            monitor-exit(r4)
            return
        L_0x004b:
            boolean r0 = defpackage.axxa.g()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006e
            aiwl r0 = r4.i     // Catch:{ all -> 0x008c }
            r4.g = r5     // Catch:{ all -> 0x008c }
            boolean r5 = r4.h     // Catch:{ all -> 0x008c }
            if (r5 != 0) goto L_0x0063
            long r2 = defpackage.axwx.k()     // Catch:{ all -> 0x008c }
            r0.a(r2)     // Catch:{ all -> 0x008c }
            r5 = 1
            r4.h = r5     // Catch:{ all -> 0x008c }
        L_0x0063:
            boolean r5 = defpackage.axxa.c()     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x006e
            ahpn r5 = r4.k     // Catch:{ all -> 0x008c }
            r5.a(r1)     // Catch:{ all -> 0x008c }
        L_0x006e:
            monitor-exit(r4)
            return
        L_0x0070:
            r4.g = r1     // Catch:{ all -> 0x008c }
            ahpn r5 = r4.k     // Catch:{ all -> 0x008c }
            boolean r5 = r5.u()     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x007f
            ahpn r5 = r4.k     // Catch:{ all -> 0x008c }
            r5.a(r1)     // Catch:{ all -> 0x008c }
        L_0x007f:
            boolean r5 = r4.h     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x008a
            aiwl r5 = r4.i     // Catch:{ all -> 0x008c }
            r5.a()     // Catch:{ all -> 0x008c }
            r4.h = r0     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r4)
            return
        L_0x008c:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0090
        L_0x008f:
            throw r5
        L_0x0090:
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpo.a(com.google.android.gms.location.ActivityTransitionRequest):void");
    }

    public final synchronized void a(List list) {
        if (this.k.u()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ajag ajag = (ajag) it.next();
                String a2 = DetectedActivity.a(ajag.b);
                int i2 = ajag.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = ajag.a;
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 70);
                sb.append("Received event: [");
                sb.append(a2);
                sb.append(", ");
                sb.append(i2);
                sb.append("] happened ");
                double d2 = (double) elapsedRealtime;
                Double.isNaN(d2);
                double d3 = (double) j2;
                Double.isNaN(d3);
                sb.append((d2 / 1000.0d) - (d3 / 1000.0d));
                sb.append("s ago");
                sb.toString();
            }
            if (this.g != null && !list.isEmpty()) {
                List arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ajag ajag2 = (ajag) it2.next();
                    try {
                        arrayList.add(new ActivityTransitionEvent(ajag2.b, ajag2.c, ajag2.a * 1000000));
                    } catch (Exception e2) {
                        int i3 = ajag2.c;
                        int i4 = ajag2.b;
                        StringBuilder sb2 = new StringBuilder(70);
                        sb2.append("Received invalid transition type = ");
                        sb2.append(i3);
                        sb2.append(", Activity = ");
                        sb2.append(i4);
                        sb2.toString();
                    }
                }
                if (!axwr.b()) {
                    arrayList = ahpp.a(arrayList, anax.a((Object) 16, (Object) 17));
                }
                List a3 = a(this.l.a(arrayList, this.d), this.g.b);
                if (!a3.isEmpty()) {
                    this.j.a(a3, 1);
                }
            }
        }
    }

    public final void a(boolean z) {
        StringBuilder sb = new StringBuilder(71);
        sb.append("Activity recognition deep still mode has changed. deepStillMode = ");
        sb.append(z);
        sb.toString();
        if (z && this.h && axxa.a.a().arDeepStillTransitioningEnabled()) {
            a(new ActivityRecognitionResult(new DetectedActivity(3, 100), System.currentTimeMillis(), SystemClock.elapsedRealtime(), 0, (Bundle) null), true);
        }
    }

    public final boolean a() {
        return this.f == axwx.d();
    }
}
