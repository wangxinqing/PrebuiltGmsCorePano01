package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: irg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class irg extends itx {
    static final int[] c = {0, 2, 3, 21, 4, 5, 22, 6, 23, 1, 7, 24, 8, 25, 26, 27, 28, 9, 29, 10, 11, 19, 30, 31, 12, 13, 14, 15, 0, 0, 17, 32, 33, 0, 35, 36, 37, 38, 18, 0, 39, 40, 4, 41, 20, 42};
    private final AtomicReference a = new AtomicReference(agfu.a().b());
    protected final Context d;
    protected final Set e;
    protected final List f = new ArrayList();
    protected final List g = new ArrayList();

    protected static final boolean a(GetServiceRequest getServiceRequest) {
        return getServiceRequest.a() != null;
    }

    /* access modifiers changed from: protected */
    public abstract void a(isv isv, GetServiceRequest getServiceRequest);

    /* access modifiers changed from: protected */
    public void a(String str, int i) {
    }

    /* access modifiers changed from: protected */
    public Map b() {
        return null;
    }

    protected irg(Context context, int i, int... iArr) {
        this.d = context;
        ob obVar = new ob(r0 + 1);
        this.e = obVar;
        obVar.add(Integer.valueOf(i));
        for (int valueOf : iArr) {
            this.e.add(Integer.valueOf(valueOf));
        }
        this.f.add(new iuy(this.d, i, a(), b()));
        if (axdg.b()) {
            this.f.add(new ivs(this.d));
        }
        if (jix.a(this.d)) {
            this.f.add(new ivo());
        }
        this.f.add(new iul(this.d));
        this.f.add(new isp(this.d));
        iup iup = new iup(this.d);
        this.f.add(iup);
        this.g.add(iup);
    }

    /* access modifiers changed from: protected */
    public Set a() {
        return ixm.c();
    }

    /* access modifiers changed from: protected */
    public void a(int i, itv itv, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        Account account;
        int i3 = c[i];
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        GetServiceRequest getServiceRequest = new GetServiceRequest(i3);
        getServiceRequest.c = i2;
        getServiceRequest.d = str;
        getServiceRequest.h = account;
        getServiceRequest.k = false;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        getServiceRequest.g = bundle;
        if (strArr != null) {
            getServiceRequest.a((Collection) jkx.a(strArr));
        }
        a(itv, getServiceRequest);
    }

    @Deprecated
    public final void a(itv itv) {
        try {
            itv.a(0, (Bundle) null);
        } catch (RuntimeException e2) {
            Log.e("AbstractServiceBroker", "Validating account failed", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        a(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        r0 = defpackage.agfu.a();
        r2 = new java.lang.StringBuilder(22);
        r2.append(r11);
        r2.append("-GetService");
        r0.a(r12, r2.toString());
        r0 = (defpackage.agif) r1.a.getAndSet((java.lang.Object) null);
        r2 = defpackage.agfu.a();
        r3 = new java.lang.StringBuilder(25);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.itv r19, com.google.android.gms.common.internal.GetServiceRequest r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            java.lang.String r9 = "-ServiceBroker"
            java.lang.String r10 = "-GetService"
            int r11 = r0.b
            java.util.Set r2 = r1.e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            boolean r2 = r2.contains(r3)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0025
            java.util.Set r2 = r1.e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 34
            r2.<init>(r4)
            java.lang.String r4 = "Unexpected service id: "
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            defpackage.iva.b(r3, r2)
            agfu r2 = defpackage.agfu.a()
            agif r12 = r2.b()
            java.lang.String r2 = r0.d
            if (r2 == 0) goto L_0x004d
            android.content.Context r3 = r1.d
            defpackage.jhg.c(r3, r2)
        L_0x004d:
            boolean r3 = defpackage.jhg.b()
            r4 = 3
            if (r3 != 0) goto L_0x0064
            android.content.Context r3 = r1.d
            hya r3 = defpackage.hya.a((android.content.Context) r3)
            boolean r3 = r3.b((java.lang.String) r2)
            if (r3 != 0) goto L_0x0062
            r3 = 4
            goto L_0x0065
        L_0x0062:
            r3 = 3
            goto L_0x0065
        L_0x0064:
            r3 = 2
        L_0x0065:
            ivf r5 = defpackage.ivf.f
            boolean r5 = r5.b
            if (r5 != 0) goto L_0x006c
            goto L_0x007d
        L_0x006c:
            if (r3 != r4) goto L_0x007d
            ivf r4 = defpackage.ivf.f
            boolean r5 = r4.b
            if (r5 == 0) goto L_0x007d
            java.util.List r4 = r4.a
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L_0x007d
            r3 = 6
        L_0x007d:
            r1.a((java.lang.String) r2, (int) r3)
            r15 = 0
            com.google.android.gms.common.internal.ConnectionInfo r8 = new com.google.android.gms.common.internal.ConnectionInfo     // Catch:{ RuntimeException -> 0x0147 }
            r8.<init>()     // Catch:{ RuntimeException -> 0x0147 }
            nig r7 = defpackage.njd.b(r0, r3)     // Catch:{ RuntimeException -> 0x0147 }
            isv r6 = new isv     // Catch:{ RuntimeException -> 0x0147 }
            android.content.Context r5 = r1.d     // Catch:{ RuntimeException -> 0x0147 }
            int r16 = android.os.Binder.getCallingUid()     // Catch:{ RuntimeException -> 0x0147 }
            r2 = r6
            r3 = r19
            r4 = r20
            r17 = r5
            r5 = r8
            r13 = r6
            r6 = r17
            r14 = r8
            r8 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0147 }
            java.util.List r2 = r1.g     // Catch:{ RuntimeException -> 0x0147 }
            java.util.List r3 = r13.a     // Catch:{ RuntimeException -> 0x0147 }
            r3.addAll(r2)     // Catch:{ RuntimeException -> 0x0147 }
            java.util.List r2 = r1.f     // Catch:{ RuntimeException -> 0x0147 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ RuntimeException -> 0x0147 }
        L_0x00b0:
            boolean r3 = r2.hasNext()     // Catch:{ RuntimeException -> 0x0147 }
            if (r3 == 0) goto L_0x0116
            java.lang.Object r3 = r2.next()     // Catch:{ RuntimeException -> 0x0147 }
            iss r3 = (defpackage.iss) r3     // Catch:{ RuntimeException -> 0x0147 }
            com.google.android.gms.common.ConnectionResult r3 = r3.a(r0, r14)     // Catch:{ RuntimeException -> 0x0147 }
            boolean r4 = r3.b()     // Catch:{ RuntimeException -> 0x0147 }
            if (r4 != 0) goto L_0x00b0
            android.app.PendingIntent r0 = r3.d     // Catch:{ RuntimeException -> 0x0147 }
            if (r0 == 0) goto L_0x00d5
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ RuntimeException -> 0x0147 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0147 }
            java.lang.String r4 = "pendingIntent"
            r2.putParcelable(r4, r0)     // Catch:{ RuntimeException -> 0x0147 }
            goto L_0x00d6
        L_0x00d5:
            r2 = r15
        L_0x00d6:
            r14.a = r2     // Catch:{ RuntimeException -> 0x0147 }
            int r0 = r3.c     // Catch:{ RuntimeException -> 0x0147 }
            r13.a((int) r0, (android.os.IBinder) r15, (com.google.android.gms.common.internal.ConnectionInfo) r14)     // Catch:{ RuntimeException -> 0x0147 }
            agfu r0 = defpackage.agfu.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 22
            r2.<init>(r3)
            r2.append(r11)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r0.a((defpackage.agif) r12, (java.lang.String) r2)
            java.util.concurrent.atomic.AtomicReference r0 = r1.a
            java.lang.Object r0 = r0.getAndSet(r15)
            agif r0 = (defpackage.agif) r0
            agfu r2 = defpackage.agfu.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 25
            r3.<init>(r4)
        L_0x0108:
            r3.append(r11)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r2.a((defpackage.agif) r0, (java.lang.String) r3)
            return
        L_0x0116:
            r1.a((defpackage.isv) r13, (com.google.android.gms.common.internal.GetServiceRequest) r0)     // Catch:{ RuntimeException -> 0x0147 }
            agfu r0 = defpackage.agfu.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 22
            r2.<init>(r3)
            r2.append(r11)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r0.a((defpackage.agif) r12, (java.lang.String) r2)
            java.util.concurrent.atomic.AtomicReference r0 = r1.a
            java.lang.Object r0 = r0.getAndSet(r15)
            agif r0 = (defpackage.agif) r0
            agfu r2 = defpackage.agfu.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 25
            r3.<init>(r4)
            goto L_0x0108
        L_0x0145:
            r0 = move-exception
            goto L_0x0150
        L_0x0147:
            r0 = move-exception
            java.lang.String r2 = "AbstractServiceBroker"
            java.lang.String r3 = "Getting service failed"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0145 }
            throw r0     // Catch:{ all -> 0x0145 }
        L_0x0150:
            agfu r2 = defpackage.agfu.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 22
            r3.<init>(r4)
            r3.append(r11)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.a((defpackage.agif) r12, (java.lang.String) r3)
            java.util.concurrent.atomic.AtomicReference r2 = r1.a
            java.lang.Object r2 = r2.getAndSet(r15)
            agif r2 = (defpackage.agif) r2
            agfu r3 = defpackage.agfu.a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 25
            r4.<init>(r5)
            r4.append(r11)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r3.a((defpackage.agif) r2, (java.lang.String) r4)
            goto L_0x018a
        L_0x0189:
            throw r0
        L_0x018a:
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irg.a(itv, com.google.android.gms.common.internal.GetServiceRequest):void");
    }
}
