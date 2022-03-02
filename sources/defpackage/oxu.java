package defpackage;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: oxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class oxu {
    private final oyt a;
    private final oxc b;
    private final oyq c;
    private final oxx d;

    public oxu(oyt oyt, oxc oxc, oyq oyq, oxx oxx) {
        this.a = oyt;
        this.b = oxc;
        this.c = oyq;
        this.d = oxx;
    }

    public final Pair a(oxy oxy) {
        String message = oxy.getMessage();
        aolx aolx = oxy.a;
        try {
            Thing thing = oxy.b;
            if (thing != null) {
                String str = thing.d;
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 31 + String.valueOf(str).length());
                sb.append(message);
                sb.append(" The invalid indexable url is: ");
                sb.append(str);
                message = sb.toString();
            }
            try {
                apmu.a(String.format("Invalid Indexable detected: %s", new Object[]{message}));
                oxx oxx = this.d;
                oxc oxc = this.b;
                String str2 = oxc.a;
                aolv aolv = oxc.b;
                oxx.a(str2, aolv, aolx, oxy.getMessage(), oxy.b, (ActionImpl) null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            this.a.a("AppIndexingTask catch", e, axrp.f());
            return new Pair(message, aolx);
        }
        return new Pair(message, aolx);
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public abstract void a(Status status, Object obj);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: aolx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: aolx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: aolx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090 A[Catch:{ Exception -> 0x00de }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r15 = this;
            java.lang.String r0 = "%s from %s failed"
            oxc r1 = r15.b
            java.lang.String r1 = r1.a()
            oxc r2 = r15.b
            java.lang.String r2 = r2.a
            aolx r3 = defpackage.aolx.NO_ERROR
            java.lang.String r4 = "Handling %s request from %s"
            defpackage.oso.a((java.lang.String) r4, (java.lang.Object) r1, (java.lang.Object) r2)
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            java.lang.Object r8 = r15.a()     // Catch:{ oxy -> 0x00fb, oxa -> 0x007c, oye -> 0x0067, oyf -> 0x004c, Exception -> 0x0031 }
            java.lang.String r9 = "%s from %s finished successfully"
            defpackage.oso.a((java.lang.String) r9, (java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ oxy -> 0x002d, oxa -> 0x002a, oye -> 0x0027, oyf -> 0x0024, Exception -> 0x0022 }
            goto L_0x0114
        L_0x0022:
            r3 = move-exception
            goto L_0x0033
        L_0x0024:
            r3 = move-exception
            r7 = r8
            goto L_0x004d
        L_0x0027:
            r3 = move-exception
            r7 = r8
            goto L_0x0068
        L_0x002a:
            r3 = move-exception
            r7 = r8
            goto L_0x007d
        L_0x002d:
            r3 = move-exception
            r7 = r8
            goto L_0x00fc
        L_0x0031:
            r3 = move-exception
            r8 = r7
        L_0x0033:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r6] = r1
            r4[r5] = r2
            defpackage.oso.c((java.lang.Throwable) r3, (java.lang.String) r0, (java.lang.Object[]) r4)
            aolx r0 = defpackage.aolx.INTERNAL_ERROR
            oyt r1 = r15.a
            long r4 = defpackage.axrp.f()
            java.lang.String r2 = "AppIndexingTask INTERNAL_ERROR"
            r1.a(r2, r3, r4)
            r3 = r0
            goto L_0x0114
        L_0x004c:
            r3 = move-exception
        L_0x004d:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r6] = r1
            r4[r5] = r2
            defpackage.oso.c((java.lang.Throwable) r3, (java.lang.String) r0, (java.lang.Object[]) r4)
            android.util.Pair r0 = r15.a((defpackage.oyf) r3)
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            r3 = r0
            aolx r3 = (defpackage.aolx) r3
            r8 = r7
            r7 = r1
            goto L_0x0114
        L_0x0067:
            r3 = move-exception
        L_0x0068:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r6] = r1
            r4[r5] = r2
            defpackage.oso.c((java.lang.Throwable) r3, (java.lang.String) r0, (java.lang.Object[]) r4)
            aolx r0 = defpackage.aolx.SEQUENCE_TABLE_FULL
            java.lang.String r1 = r3.getMessage()
            r3 = r0
            r8 = r7
            r7 = r1
            goto L_0x0114
        L_0x007c:
            r3 = move-exception
        L_0x007d:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r6] = r1
            r4[r5] = r2
            defpackage.oso.c((java.lang.Throwable) r3, (java.lang.String) r0, (java.lang.Object[]) r4)
            java.lang.String r0 = r3.getMessage()
            aolx r1 = r3.a
            com.google.firebase.appindexing.internal.ActionImpl r2 = r3.c     // Catch:{ Exception -> 0x00de }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r2 = r2.c     // Catch:{ Exception -> 0x00de }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00de }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00de }
            int r4 = r4 + 28
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00de }
            int r8 = r8.length()     // Catch:{ Exception -> 0x00de }
            int r4 = r4 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00de }
            r8.<init>(r4)     // Catch:{ Exception -> 0x00de }
            r8.append(r0)     // Catch:{ Exception -> 0x00de }
            java.lang.String r4 = " The invalid action url is: "
            r8.append(r4)     // Catch:{ Exception -> 0x00de }
            r8.append(r2)     // Catch:{ Exception -> 0x00de }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x00de }
            goto L_0x00bb
        L_0x00ba:
        L_0x00bb:
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00dc }
            r2[r6] = r0     // Catch:{ Exception -> 0x00dc }
            java.lang.String r4 = "Invalid Action detected: %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)     // Catch:{ Exception -> 0x00dc }
            defpackage.apmu.a((java.lang.String) r2)     // Catch:{ Exception -> 0x00dc }
            oxx r8 = r15.d     // Catch:{ Exception -> 0x00dc }
            oxc r2 = r15.b     // Catch:{ Exception -> 0x00dc }
            java.lang.String r9 = r2.a     // Catch:{ Exception -> 0x00dc }
            aolv r10 = r2.b     // Catch:{ Exception -> 0x00dc }
            java.lang.String r12 = r3.getMessage()     // Catch:{ Exception -> 0x00dc }
            com.google.firebase.appindexing.internal.ActionImpl r14 = r3.c     // Catch:{ Exception -> 0x00dc }
            r13 = 0
            r11 = r1
            r8.a(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00dc }
            goto L_0x00ea
        L_0x00dc:
            r2 = move-exception
            goto L_0x00df
        L_0x00de:
            r2 = move-exception
        L_0x00df:
            oyt r3 = r15.a
            long r4 = defpackage.axrp.f()
            java.lang.String r6 = "AppIndexingTask catch"
            r3.a(r6, r2, r4)
        L_0x00ea:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r1)
            java.lang.Object r0 = r2.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r2.second
            r3 = r1
            aolx r3 = (defpackage.aolx) r3
            r8 = r7
            r7 = r0
            goto L_0x0114
        L_0x00fb:
            r3 = move-exception
        L_0x00fc:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r6] = r1
            r4[r5] = r2
            defpackage.oso.c((java.lang.Throwable) r3, (java.lang.String) r0, (java.lang.Object[]) r4)
            android.util.Pair r0 = r15.a((defpackage.oxy) r3)
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            r3 = r0
            aolx r3 = (defpackage.aolx) r3
            r8 = r7
            r7 = r1
        L_0x0114:
            r15.a(r7, r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxu.b():void");
    }

    public final Pair a(oyf oyf) {
        String message = oyf.getMessage();
        String valueOf = String.valueOf(oyf.a);
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(valueOf).length());
        sb.append(message);
        sb.append(" The Slice URI is: ");
        sb.append(valueOf);
        String sb2 = sb.toString();
        aolx aolx = oyf.b;
        apmu.a(String.format("Invalid Slice detected: %s", new Object[]{oyf.a}));
        oxx oxx = this.d;
        oxc oxc = this.b;
        String str = oxc.a;
        aolv aolv = oxc.b;
        oxx.a(str, aolv, aolx, oyf.getMessage(), (Thing) null, (ActionImpl) null);
        return new Pair(sb2, aolx);
    }

    /* access modifiers changed from: protected */
    public void a(String str, aolx aolx, Object obj) {
        try {
            a(new Status(oxz.a(aolx), str), obj);
        } catch (RemoteException e) {
            oso.c((Throwable) e, "Client died during %s", this.b.a());
            if (aolx == aolx.NO_ERROR) {
                aolx = aolx.CLIENT_DISCONNECTED;
            }
        }
        this.b.a(this.c, aolx);
    }
}
