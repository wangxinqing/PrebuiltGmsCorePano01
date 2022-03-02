package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: aave  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aave extends nis {
    final int a;
    private long b;
    private final zzw c;
    private final String d;
    private final List e;
    private final int f;
    private final String g;
    private final String h;

    static {
        aave.class.getSimpleName();
    }

    public aave(zzw zzw, String str) {
        this(zzw, (String) null, str, (List) null, 0, (String) null, 2);
    }

    private final boolean a() {
        try {
            if (aaum.d.await(this.b, TimeUnit.MILLISECONDS)) {
                return true;
            }
            b();
            return false;
        } catch (InterruptedException e2) {
            b();
            return false;
        }
    }

    private final void b() {
        b(Status.c);
    }

    public aave(zzw zzw, String str, String str2, List list, int i, String str3, int i2) {
        super(45, "xlb");
        this.c = zzw;
        this.d = str2;
        this.e = list;
        this.f = i;
        this.g = str3;
        this.h = str;
        this.a = i2;
        this.b = 60000;
    }

    private final void b(Status status) {
        zzw zzw = this.c;
        if (zzw != null) {
            int i = this.a;
            if (i == 1) {
                this.c.a(status, new SafeBrowsingData(new JSONObject().toString()));
            } else if (i == 2 || i == 3) {
                zzw.a(status);
            } else if (i == 6) {
                zzw.a(status, new SafeBrowsingData());
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040 A[Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049 A[Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r15) {
        /*
            r14 = this;
            int r0 = r14.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r1 = 12001(0x2ee1, float:1.6817E-41)
            r2 = 12009(0x2ee9, float:1.6828E-41)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L_0x00dd
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.String r6 = r14.g     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r0[r4] = r6     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.String r6 = r14.h     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.util.List r7 = r14.e     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            int r8 = r14.f     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r8 != r5) goto L_0x001a
            goto L_0x0029
        L_0x001a:
            if (r8 == r3) goto L_0x0029
            int r3 = defpackage.aaum.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r3 > 0) goto L_0x0037
            com.google.android.gms.common.api.Status r15 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.<init>(r2)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r14.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x0029:
            boolean r2 = defpackage.aaum.b     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r2 != 0) goto L_0x0037
            java.lang.Class<aaum> r2 = defpackage.aaum.class
            monitor-enter(r2)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            defpackage.aaum.b = r5     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r15     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
        L_0x0037:
            defpackage.aaum.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r2 == 0) goto L_0x0049
            com.google.android.gms.common.api.Status r15 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.<init>(r1)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r14.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x0049:
            if (r7 == 0) goto L_0x00d9
            boolean r1 = r7.isEmpty()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r1 != 0) goto L_0x00d9
            r0 = r0[r4]     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            aaak r1 = new aaak     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.util.List r1 = r1.a()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r1 == 0) goto L_0x00d5
            boolean r2 = r1.isEmpty()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r2 != 0) goto L_0x00d5
            defpackage.aaum.a(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            boolean r2 = defpackage.azfv.i()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r2 == 0) goto L_0x00af
            aaal r2 = new aaal     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r2.<init>(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            boolean r15 = r2.a()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 == 0) goto L_0x00af
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.String r15 = r14.d     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.util.Map r4 = defpackage.sno.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.Object r15 = r4.get(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            sno r15 = (defpackage.sno) r15     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 != 0) goto L_0x0095
            java.lang.String r15 = r14.d     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            sno r4 = new sno     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r4.<init>(r15, r0, r2)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.util.Map r0 = defpackage.sno.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r0.put(r15, r4)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            goto L_0x00af
        L_0x0095:
            long r4 = r15.e     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            long r4 = r2 - r4
            azfv r8 = defpackage.azfv.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            azfw r8 = r8.a()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            long r8 = r8.E()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x00a8
        L_0x00a7:
            goto L_0x00ab
        L_0x00a8:
            r15.d = r2     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            goto L_0x00a7
        L_0x00ab:
            r15.e = r2     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.c = r0     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
        L_0x00af:
            aaur r15 = defpackage.aaum.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.String r0 = r14.d     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            org.json.JSONObject r15 = r15.a(r7, r1, r6, r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 == 0) goto L_0x00ca
            com.google.android.gms.safetynet.SafeBrowsingData r0 = new com.google.android.gms.safetynet.SafeBrowsingData     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.String r15 = r15.toString()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r0.<init>(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            zzw r15 = r14.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.a((com.google.android.gms.common.api.Status) r1, (com.google.android.gms.safetynet.SafeBrowsingData) r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x00ca:
            com.google.android.gms.common.api.Status r15 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r0 = 12000(0x2ee0, float:1.6816E-41)
            r15.<init>(r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r14.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x00d5:
            r14.b()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x00d9:
            r14.b()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x00dd:
            r6 = 0
            if (r0 != r3) goto L_0x012b
            java.lang.String r0 = r14.d     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            boolean r0 = defpackage.aann.b(r15, r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x0122
            defpackage.aaum.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            boolean r15 = r14.a()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 == 0) goto L_0x012a
            java.util.concurrent.CountDownLatch r15 = new java.util.concurrent.CountDownLatch     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.<init>(r5)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            aavd r0 = new aavd     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r0.<init>(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            zzw r1 = r14.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r1 == 0) goto L_0x011c
            aaur r1 = defpackage.aaum.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r1.a((defpackage.aauq) r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            long r0 = r14.b     // Catch:{ InterruptedException -> 0x0113 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0113 }
            boolean r15 = r15.await(r0, r2)     // Catch:{ InterruptedException -> 0x0113 }
            if (r15 == 0) goto L_0x010f
            goto L_0x0114
        L_0x010f:
            r14.b()     // Catch:{ InterruptedException -> 0x0113 }
            return
        L_0x0113:
            r15 = move-exception
        L_0x0114:
            zzw r15 = r14.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.a((com.google.android.gms.common.api.Status) r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x011c:
            aaur r15 = defpackage.aaum.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.a((defpackage.aauq) r6)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x0122:
            zzw r15 = r14.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 == 0) goto L_0x012a
            r14.b()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x012a:
            return
        L_0x012b:
            r3 = 3
            if (r0 != r3) goto L_0x0145
            defpackage.aaum.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            defpackage.aaum.c()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            defpackage.aaum.a(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            boolean r15 = r14.a()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 == 0) goto L_0x0144
            zzw r15 = r14.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.a((com.google.android.gms.common.api.Status) r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
        L_0x0144:
            return
        L_0x0145:
            r3 = 4
            if (r0 == r3) goto L_0x01f3
            r3 = 5
            if (r0 != r3) goto L_0x0187
            java.util.List r0 = r14.e     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            int r0 = r0.intValue()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            defpackage.aaum.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            aarq r1 = new aarq     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r1.<init>(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            long r11 = r1.a((int) r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            aaur r15 = defpackage.aaum.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 == 0) goto L_0x0175
            aavb r15 = r15.g     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 == 0) goto L_0x0175
            aava r15 = r15.a(r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 == 0) goto L_0x0175
            byte[] r6 = r15.b     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r13 = r6
            goto L_0x0176
        L_0x0175:
            r13 = r6
        L_0x0176:
            com.google.android.gms.safetynet.SafeBrowsingData r15 = new com.google.android.gms.safetynet.SafeBrowsingData     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r8 = 0
            r9 = 0
            r10 = 0
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            zzw r0 = r14.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r0.a((com.google.android.gms.common.api.Status) r1, (com.google.android.gms.safetynet.SafeBrowsingData) r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x0187:
            r3 = 6
            if (r0 != r3) goto L_0x01f2
            int r0 = r14.f     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r0 != r5) goto L_0x01e8
            int r0 = defpackage.aaum.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r0 > 0) goto L_0x019b
            com.google.android.gms.common.api.Status r15 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.<init>(r2)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r14.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x019b:
            java.lang.String r0 = r14.h     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x01ac
            com.google.android.gms.common.api.Status r15 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.<init>(r1)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r14.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x01ac:
            aaur r0 = defpackage.aaum.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            byte[] r0 = r0.a()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x01e4
            com.google.android.gms.safetynet.SafeBrowsingData r1 = new com.google.android.gms.safetynet.SafeBrowsingData     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r1.<init>()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.io.File r2 = new java.io.File     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.String r15 = r15.dataDir     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            java.lang.String r3 = "/snet/xlb"
            java.lang.String r15 = r15.concat(r3)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r2.<init>(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            boolean r15 = r2.exists()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            if (r15 == 0) goto L_0x01d5
            goto L_0x01d8
        L_0x01d5:
            r2.mkdirs()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
        L_0x01d8:
            r1.g = r2     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r1.f = r0     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            zzw r15 = r14.c     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r15.a((com.google.android.gms.common.api.Status) r0, (com.google.android.gms.safetynet.SafeBrowsingData) r1)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x01e4:
            r14.b()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x01e8:
            com.google.android.gms.common.api.Status r15 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r0 = 12002(0x2ee2, float:1.6818E-41)
            r15.<init>(r0)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            r14.b(r15)     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
        L_0x01f2:
            return
        L_0x01f3:
            defpackage.aaum.a()     // Catch:{ RemoteException -> 0x01fc, Exception -> 0x01f7 }
            return
        L_0x01f7:
            r15 = move-exception
            r14.b()
            return
        L_0x01fc:
            r15 = move-exception
            goto L_0x01ff
        L_0x01fe:
            throw r15
        L_0x01ff:
            goto L_0x01fe
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aave.a(android.content.Context):void");
    }

    public final void a(Status status) {
        if (status != null) {
            b(status);
        } else {
            b();
        }
    }
}
