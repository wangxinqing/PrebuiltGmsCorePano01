package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ldj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldj implements lde {
    private static final ith i = new ith("PushNotificationControl", "");
    public final Set a = new HashSet();
    public final ldo b;
    public final AtomicLong c = new AtomicLong();
    public ldf d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Map h = new nz();
    private final String j;
    private final ley k;
    private final lhx l;
    private final ldf[] m;
    private final lfr n;
    private final long o;
    private long p = 0;
    private long q = -1;
    private final ldh r;
    private final ldi s;

    public ldj(Context context, String str, ley ley, lhx lhx, ldf[] ldfArr, ldo ldo, lfr lfr, long j2, long j3) {
        ldh ldh = new ldh(context, str);
        ldi ldi = new ldi(context);
        this.j = str;
        this.k = ley;
        this.l = lhx;
        this.m = ldfArr;
        this.b = ldo;
        this.n = lfr;
        this.o = j3;
        this.r = ldh;
        this.c.set(j2);
        this.s = ldi;
    }

    private final void b(ldf ldf) {
        if (this.d == ldn.a) {
            this.r.a(false);
        } else {
            this.r.a(true);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (ldf != null) {
            lfq c2 = this.n.c();
            c2.c(1, 37);
            c2.a(this.d);
            c2.a(ldf, currentTimeMillis - this.q);
            c2.j();
            c2.a();
        }
        this.q = currentTimeMillis;
    }

    public final synchronized void a() {
        iva.a(this.d != null, (Object) "Not initialized yet");
        this.f = true;
        this.g = false;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c() {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Not initialized yet");
        ldf ldf = ldn.a;
        long currentTimeMillis = System.currentTimeMillis();
        ldf[] ldfArr = this.m;
        int length = ldfArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            ldf ldf2 = ldfArr[i2];
            if (ldf2.a(this, currentTimeMillis)) {
                ldf = ldf2;
                break;
            }
            i2++;
        }
        ldf ldf3 = this.d;
        if (ldf == ldf3) {
            return false;
        }
        this.d = ldf;
        b(ldf3);
        e();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean d() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.c()     // Catch:{ all -> 0x0051 }
            boolean r1 = r7.e     // Catch:{ all -> 0x0051 }
            r2 = 0
            if (r1 == 0) goto L_0x0032
            ldi r1 = r7.s     // Catch:{ all -> 0x0051 }
            agvx r3 = defpackage.jzq.ai     // Catch:{ all -> 0x0051 }
            java.lang.Object r3 = r3.c()     // Catch:{ all -> 0x0051 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0051 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0051 }
            if (r3 <= 0) goto L_0x0034
            android.content.Context r4 = r1.a     // Catch:{ all -> 0x0051 }
            float r4 = defpackage.jiy.e(r4)     // Catch:{ all -> 0x0051 }
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            float r3 = (float) r3     // Catch:{ all -> 0x0051 }
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0034
            android.content.Context r1 = r1.a     // Catch:{ all -> 0x0051 }
            boolean r1 = defpackage.lrh.a(r1)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            monitor-exit(r7)
            return r2
        L_0x0034:
            r1 = 1
            if (r0 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            ldf r0 = r7.d     // Catch:{ all -> 0x0051 }
            ldf r3 = defpackage.ldn.a     // Catch:{ all -> 0x0051 }
            if (r0 != r3) goto L_0x0040
            monitor-exit(r7)
            return r1
        L_0x0040:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0051 }
            long r5 = r7.p     // Catch:{ all -> 0x0051 }
            ldf r0 = r7.d     // Catch:{ all -> 0x0051 }
            long r3 = r3 - r5
            boolean r0 = r0.a(r3)     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0032
            monitor-exit(r7)
            return r1
        L_0x0051:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x0055
        L_0x0054:
            throw r0
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldj.d():boolean");
    }

    public final void e() {
        ldf ldf = this.d;
        ldo ldo = this.b;
        long j2 = this.q;
        long j3 = this.c.get();
        int length = ldo.a.length;
        long[] jArr = new long[length];
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3--) {
            jArr[i2] = ldo.a(i3);
            i2++;
        }
        ldg ldg = new ldg(ldf.a(), jArr, j2, j3);
        lhx lhx = this.l;
        String str = this.j;
        try {
            SharedPreferences.Editor edit = ((lhy) lhx).d().edit();
            String b2 = lhy.b(str);
            JSONArray jSONArray = new JSONArray();
            for (long put : ldg.b) {
                jSONArray.put(put);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activeLevel", ldg.a);
            jSONObject.put("activityHistory", jSONArray);
            jSONObject.put("lastActivityLevelChangeTimestamp", ldg.c);
            if (!edit.putString(b2, jSONObject.toString()).commit()) {
                i.b("PushNotificationControl", "persistActivityState failed to persist state");
            }
        } catch (JSONException e2) {
        }
    }

    public final synchronized void a(ldf ldf) {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Initial level has been set");
        this.d = ldf;
        b((ldf) null);
    }

    public final synchronized void a(boolean z) {
        boolean z2;
        if (this.d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2, (Object) "Not initialized yet");
        if (z) {
            this.e = this.g;
            this.p = System.currentTimeMillis();
        }
        this.f = false;
    }

    public final void b() {
        ley ley = this.k;
        String str = this.j;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(((ou) this.h).h);
        synchronized (this) {
            Iterator it = this.h.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) entry.getValue()).longValue() <= this.o) {
                    arrayList.add((String) entry.getKey());
                } else {
                    it.remove();
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("com.google.android.gms");
        }
        ley.a(str, 103, 3, (List) arrayList);
    }
}
