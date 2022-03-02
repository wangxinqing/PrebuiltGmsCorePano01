package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.common.util.ClientListeners$UserReceiver;
import java.util.Collection;

/* renamed from: jip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jip implements jhq, jkm {
    private final nz a;
    private final String[] b;
    public final nz c;
    public final nz d;
    public final jhr e;
    public String[] f;
    private final Context g;
    private final jkb h;
    private final jkn i;
    private final Handler j;
    private BroadcastReceiver k;
    private IntentFilter l;
    private boolean m;
    private boolean n;

    public jip(String[] strArr, Context context, Handler handler) {
        this(strArr, context, handler, jhr.a(context), jkb.a(context), jkn.a(context));
    }

    public static final boolean a(String[] strArr, String str) {
        for (String equals : strArr) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    private final int b(Object obj, jio jio) {
        if (this.d.remove(obj) == null) {
            return this.a.remove(obj) == null ? 0 : 16;
        }
        c(jio);
        return 2;
    }

    private final void c(jio jio) {
        for (String str : jio.m()) {
            if (a(this.f, str)) {
                if (awyg.d()) {
                    this.e.a(str, jio.j(), jio.k(), jio.l());
                } else {
                    this.e.b(str, jio.j(), jio.k());
                }
                t(str);
            }
        }
        a(jio);
    }

    private final void g() {
        if (!this.c.isEmpty()) {
            if (!this.m) {
                for (String str : this.b) {
                    if (!jkr.h() || (!"android:monitor_location".equals(str) && !"android:monitor_location_high_power".equals(str))) {
                        this.e.a(str, this);
                    } else {
                        this.e.a(str, 1, (jhq) this);
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (this.k == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    this.l = intentFilter;
                    intentFilter.addAction("android.intent.action.USER_SWITCHED");
                    this.k = new ClientListeners$UserReceiver(this);
                }
                this.g.registerReceiver(this.k, this.l, (String) null, this.j);
                this.i.a(this, this.j);
                this.m = true;
            }
        } else if (this.m) {
            if (this.b.length > 0) {
                this.e.a((jhq) this);
            }
            b();
            this.i.b();
            this.m = false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i2);

    /* access modifiers changed from: protected */
    public abstract void a(jio jio);

    /* access modifiers changed from: protected */
    public abstract void b(jio jio);

    public final Collection d() {
        return this.a.values();
    }

    public final Collection e() {
        return this.c.values();
    }

    public final void f() {
        if (this.n) {
            this.n = false;
            this.g.sendBroadcast(new Intent("android.location.HIGH_POWER_REQUEST_CHANGE"));
        }
    }

    public final void s(String str) {
        this.j.post(new jin(this, str));
    }

    public final void t(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if ("android:monitor_location_high_power".equals(str)) {
            this.n = true;
        }
    }

    public final jio a(Object obj) {
        jio jio = (jio) this.c.remove(obj);
        if (jio != null) {
            a(b(obj, jio));
            g();
            f();
        }
        return jio;
    }

    protected jip(String[] strArr, Context context, Handler handler, jhr jhr, jkb jkb, jkn jkn) {
        this.c = new nz();
        this.d = new nz();
        this.a = new nz();
        this.m = false;
        this.n = false;
        this.b = strArr;
        this.g = context;
        this.j = handler;
        this.e = jhr;
        this.h = jkb;
        this.i = jkn;
        this.f = strArr;
    }

    public final jio b(Object obj) {
        return (jio) this.c.get(obj);
    }

    public final jio a(Object obj, jio jio) {
        boolean z;
        jio jio2 = (jio) this.c.put(obj, jio);
        if (jio2 != jio) {
            if (jio2 != null) {
                b(obj, jio2);
                z = true;
            } else {
                z = false;
            }
            a(z);
            g();
        }
        return jio2;
    }

    public final void b() {
        int i2 = Build.VERSION.SDK_INT;
        try {
            BroadcastReceiver broadcastReceiver = this.k;
            if (broadcastReceiver != null) {
                this.g.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e2) {
        }
    }

    public final void b(int i2) {
        int i3 = this.c.h;
        int i4 = 0;
        while (i4 < i3) {
            if (i2 != ((jio) this.c.c(i4)).j()) {
                i4++;
            } else {
                a(false);
                return;
            }
        }
    }

    public final void a() {
        int i2;
        this.c.clear();
        for (jio c2 : this.d.values()) {
            c(c2);
        }
        if (!this.d.isEmpty()) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (!this.a.isEmpty()) {
            i2 |= 16;
        }
        this.d.clear();
        this.a.clear();
        a(i2);
        f();
    }

    public final Collection c() {
        return this.d.values();
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "MultiUserUtil"
            awyg r0 = defpackage.awyg.a
            awyk r0 = r0.a()
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x0018
            android.content.Context r0 = r1.g
            jkb r0 = defpackage.jkb.a((android.content.Context) r0)
            r3 = r0
            goto L_0x001b
        L_0x0018:
            jkb r0 = r1.h
            r3 = r0
        L_0x001b:
            r3.b()
            nz r0 = r1.c
            int r4 = r0.h
            r6 = 0
            r7 = 0
        L_0x0024:
            if (r6 >= r4) goto L_0x01f1
            nz r0 = r1.c
            java.lang.Object r8 = r0.b((int) r6)
            nz r0 = r1.c
            java.lang.Object r0 = r0.c(r6)
            r9 = r0
            jio r9 = (defpackage.jio) r9
            boolean r0 = defpackage.jkr.b()
            if (r0 == 0) goto L_0x005b
            java.lang.String[] r0 = r9.m()
            int r10 = r0.length
            r11 = 0
        L_0x0041:
            if (r11 >= r10) goto L_0x005b
            r12 = r0[r11]
            jhr r13 = r1.e
            int r14 = r9.j()
            java.lang.String r15 = r9.k()
            int r12 = r13.d(r12, r14, r15)
            if (r12 != 0) goto L_0x0058
            int r11 = r11 + 1
            goto L_0x0041
        L_0x0058:
            r12 = 0
            goto L_0x0156
        L_0x005b:
            jkn r0 = r1.i
            boolean r0 = r0.a()
            r10 = -1
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r9.k()
            java.lang.String[] r11 = r9.m()
            int r12 = r11.length
            r13 = 0
        L_0x006e:
            if (r13 >= r12) goto L_0x00d7
            r14 = r11[r13]
            java.lang.String r15 = "android:monitor_location_high_power"
            boolean r15 = r15.equals(r14)
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            if (r15 == 0) goto L_0x008c
            android.content.Context r14 = r1.g
            jnh r14 = defpackage.jni.b(r14)
            int r5 = r14.a((java.lang.String) r5, (java.lang.String) r0)
            if (r5 == r10) goto L_0x0089
            goto L_0x00d4
        L_0x0089:
            r12 = 0
            goto L_0x0156
        L_0x008c:
            java.lang.String r15 = "android:monitor_location"
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L_0x00b2
            android.content.Context r14 = r1.g
            jnh r14 = defpackage.jni.b(r14)
            java.lang.String r15 = "android.permission.ACCESS_COARSE_LOCATION"
            int r14 = r14.a((java.lang.String) r15, (java.lang.String) r0)
            if (r14 != r10) goto L_0x00d4
            android.content.Context r14 = r1.g
            jnh r14 = defpackage.jni.b(r14)
            int r5 = r14.a((java.lang.String) r5, (java.lang.String) r0)
            if (r5 != r10) goto L_0x00d4
            r12 = 0
            goto L_0x0156
        L_0x00b2:
            java.lang.String r5 = "android:activity_recognition"
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto L_0x00cc
            android.content.Context r5 = r1.g
            jnh r5 = defpackage.jni.b(r5)
            java.lang.String r14 = "android.permission.ACTIVITY_RECOGNITION"
            int r5 = r5.a((java.lang.String) r14, (java.lang.String) r0)
            if (r5 != r10) goto L_0x00d4
            r12 = 0
            goto L_0x0156
        L_0x00cc:
            java.lang.String r5 = "ClientListeners"
            java.lang.String r14 = "Currently only OPSTR_MONITOR_HIGH_POWER_LOCATION, OPSTR_MONITOR_LOCATION and OPSTR_ACTIVITY_RECOGNITION are supported. Add additional ops as necessary."
            android.util.Log.wtf(r5, r14)
        L_0x00d4:
            int r13 = r13 + 1
            goto L_0x006e
        L_0x00d7:
            int r0 = r9.j()
            int r5 = r3.b
            if (r5 == r10) goto L_0x01e9
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.reflect.Method r5 = defpackage.jkb.a
            r10 = 1
            if (r5 == 0) goto L_0x017f
            java.lang.reflect.Method r5 = defpackage.jkb.a     // Catch:{ all -> 0x0179 }
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0179 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0179 }
            r12 = 0
            r11[r12] = r0     // Catch:{ all -> 0x0177 }
            r0 = 0
            java.lang.Object r0 = r5.invoke(r0, r11)     // Catch:{ all -> 0x0177 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0177 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0177 }
            r5 = r3
            jkc r5 = (defpackage.jkc) r5     // Catch:{ all -> 0x0177 }
            r5 = r3
            jkc r5 = (defpackage.jkc) r5     // Catch:{ all -> 0x0177 }
            java.util.List r5 = r5.d     // Catch:{ all -> 0x0177 }
            if (r5 != 0) goto L_0x0108
            goto L_0x0180
        L_0x0108:
            java.lang.reflect.Field r5 = defpackage.jkc.c     // Catch:{ all -> 0x0177 }
            if (r5 == 0) goto L_0x0180
            r5 = r3
            jkc r5 = (defpackage.jkc) r5     // Catch:{ all -> 0x0177 }
            r5 = r3
            jkc r5 = (defpackage.jkc) r5     // Catch:{ all -> 0x0177 }
            java.util.List r5 = r5.d     // Catch:{ all -> 0x0177 }
            int r5 = r5.size()     // Catch:{ all -> 0x0177 }
            r11 = 0
        L_0x0119:
            if (r11 >= r5) goto L_0x0156
            r13 = r3
            jkc r13 = (defpackage.jkc) r13     // Catch:{ Exception -> 0x0132 }
            r13 = r3
            jkc r13 = (defpackage.jkc) r13     // Catch:{ Exception -> 0x0132 }
            java.util.List r13 = r13.d     // Catch:{ Exception -> 0x0132 }
            java.lang.Object r13 = r13.get(r11)     // Catch:{ Exception -> 0x0132 }
            java.lang.reflect.Field r14 = defpackage.jkc.c     // Catch:{ Exception -> 0x0132 }
            int r13 = r14.getInt(r13)     // Catch:{ Exception -> 0x0132 }
            if (r13 == r0) goto L_0x0180
            int r11 = r11 + 1
            goto L_0x0119
        L_0x0132:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0177 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0177 }
            int r5 = r5.length()     // Catch:{ all -> 0x0177 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0177 }
            int r5 = r5 + 44
            r11.<init>(r5)     // Catch:{ all -> 0x0177 }
            java.lang.String r5 = "Unable to find id field in UserInfo object: "
            r11.append(r5)     // Catch:{ all -> 0x0177 }
            r11.append(r0)     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0177 }
            android.util.Log.wtf(r2, r0)     // Catch:{ all -> 0x0177 }
            goto L_0x0180
        L_0x0156:
            nz r0 = r1.a
            java.lang.Object r0 = r0.put(r8, r9)
            if (r0 == 0) goto L_0x0160
            goto L_0x01e5
        L_0x0160:
            if (r17 != 0) goto L_0x0165
            r0 = 8
            goto L_0x0167
        L_0x0165:
            r0 = 32
        L_0x0167:
            r7 = r7 | r0
            nz r0 = r1.d
            java.lang.Object r0 = r0.remove(r8)
            if (r0 == 0) goto L_0x01e5
            r7 = r7 | 2
            r1.c(r9)
            goto L_0x01e5
        L_0x0177:
            r0 = move-exception
            goto L_0x017b
        L_0x0179:
            r0 = move-exception
            r12 = 0
        L_0x017b:
            android.util.Log.wtf(r2, r0)
            goto L_0x0180
        L_0x017f:
            r12 = 0
        L_0x0180:
            nz r0 = r1.d
            java.lang.Object r0 = r0.put(r8, r9)
            if (r0 != 0) goto L_0x01e5
            if (r17 != 0) goto L_0x018b
            goto L_0x018c
        L_0x018b:
            r10 = 4
        L_0x018c:
            r0 = r7 | r10
            nz r5 = r1.a
            java.lang.Object r5 = r5.remove(r8)
            if (r5 != 0) goto L_0x0198
            r7 = r0
            goto L_0x019b
        L_0x0198:
            r0 = r0 | 16
            r7 = r0
        L_0x019b:
            java.lang.String[] r0 = r9.m()
            int r5 = r0.length
            r8 = 0
        L_0x01a1:
            if (r8 >= r5) goto L_0x01e2
            r10 = r0[r8]
            java.lang.String[] r11 = r1.f
            boolean r11 = a((java.lang.String[]) r11, (java.lang.String) r10)
            if (r11 != 0) goto L_0x01ae
            goto L_0x01df
        L_0x01ae:
            boolean r11 = defpackage.awyg.d()
            if (r11 == 0) goto L_0x01cc
            jhr r11 = r1.e
            int r13 = r9.j()
            java.lang.String r14 = r9.k()
            java.lang.String r15 = r9.l()
            int r11 = r11.c(r10, r13, r14, r15)
            if (r11 != 0) goto L_0x01df
            r1.t(r10)
            goto L_0x01df
        L_0x01cc:
            jhr r11 = r1.e
            int r13 = r9.j()
            java.lang.String r14 = r9.k()
            int r11 = r11.a((java.lang.String) r10, (int) r13, (java.lang.String) r14)
            if (r11 != 0) goto L_0x01df
            r1.t(r10)
        L_0x01df:
            int r8 = r8 + 1
            goto L_0x01a1
        L_0x01e2:
            r1.b((defpackage.jio) r9)
        L_0x01e5:
            int r6 = r6 + 1
            goto L_0x0024
        L_0x01e9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "isForegroundUser must be called after beginForegroundUserQuery"
            r0.<init>(r2)
            throw r0
        L_0x01f1:
            r3.c()
            if (r7 == 0) goto L_0x01f9
            r1.a((int) r7)
        L_0x01f9:
            r16.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jip.a(boolean):void");
    }

    public final void a(String[] strArr) {
        for (jio jio : this.d.values()) {
            for (String str : jio.m()) {
                boolean a2 = a(this.f, str);
                boolean a3 = a(strArr, str);
                if (a2 != a3) {
                    t(str);
                    if (a3) {
                        if (awyg.d()) {
                            this.e.c(str, jio.j(), jio.k(), jio.l());
                        } else {
                            this.e.a(str, jio.j(), jio.k());
                        }
                    } else if (awyg.d()) {
                        this.e.a(str, jio.j(), jio.k(), jio.l());
                    } else {
                        this.e.b(str, jio.j(), jio.k());
                    }
                }
            }
        }
        this.f = strArr;
        f();
    }
}
