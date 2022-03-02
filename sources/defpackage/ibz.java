package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
/* renamed from: ibz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ibz {
    public Account a;
    public String b;
    public String c;
    private final Set d;
    private final Set e;
    private final Map f;
    private final Context g;
    private final Map h;
    private ifx i;
    private int j;
    private icb k;
    private Looper l;
    private hxj m;
    private final ArrayList n;
    private final ArrayList o;
    private ibn p;

    public ibz(Context context) {
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new nz();
        this.h = new nz();
        this.j = -1;
        this.m = hxj.a;
        this.p = abaf.g;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.g = context;
        this.l = context.getMainLooper();
        this.b = context.getPackageName();
        this.c = context.getClass().getName();
    }

    public final ise a() {
        return new ise(this.a, this.d, this.f, this.b, this.c, this.h.containsKey(abaf.c) ? (abai) this.h.get(abaf.c) : abai.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: ibq} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.icc b() {
        /*
            r22 = this;
            r1 = r22
            java.util.Map r0 = r1.h
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            java.lang.String r3 = "must call addApi() to add at least one API"
            defpackage.iva.b(r0, r3)
            ise r0 = r22.a()
            java.util.Map r3 = r0.d
            nz r11 = new nz
            r11.<init>()
            nz r14 = new nz
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Map r4 = r1.h
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r12 = r4.iterator()
            r18 = 0
            r4 = 0
            r13 = r4
            r16 = 0
        L_0x0034:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r12.next()
            r10 = r4
            ibq r10 = (defpackage.ibq) r10
            java.util.Map r4 = r1.h
            java.lang.Object r17 = r4.get(r10)
            java.lang.Object r4 = r3.get(r10)
            if (r4 == 0) goto L_0x004f
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r11.put(r10, r5)
            idu r9 = new idu
            r9.<init>(r10, r4)
            r15.add(r9)
            ibn r19 = r10.b()
            android.content.Context r5 = r1.g
            android.os.Looper r6 = r1.l
            r4 = r19
            r7 = r0
            r8 = r17
            r20 = r9
            r21 = r10
            r10 = r20
            ibo r4 = r4.a((android.content.Context) r5, (android.os.Looper) r6, (defpackage.ise) r7, (java.lang.Object) r8, (defpackage.ica) r9, (defpackage.icb) r10)
            ibg r5 = r21.a()
            r14.put(r5, r4)
            int r5 = r19.a()
            if (r5 == r2) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            if (r17 == 0) goto L_0x0089
            r16 = 1
            goto L_0x008b
        L_0x0089:
            r16 = 0
        L_0x008b:
            boolean r4 = r4.h()
            if (r4 == 0) goto L_0x0034
            if (r13 != 0) goto L_0x0096
            r13 = r21
            goto L_0x0034
        L_0x0096:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r4 = r21
            java.lang.String r2 = r4.a
            java.lang.String r3 = r13.a
            int r4 = r2.length()
            int r5 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 21
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r2)
            java.lang.String r2 = " cannot be used with "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r0.<init>(r2)
            throw r0
        L_0x00c1:
            if (r13 != 0) goto L_0x00c4
            goto L_0x00eb
        L_0x00c4:
            if (r16 != 0) goto L_0x01d0
            android.accounts.Account r3 = r1.a
            if (r3 != 0) goto L_0x00cc
            r3 = 1
            goto L_0x00cd
        L_0x00cc:
            r3 = 0
        L_0x00cd:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r13.a
            r4[r18] = r5
            java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
            defpackage.iva.a(r3, r5, r4)
            java.util.Set r3 = r1.d
            java.util.Set r4 = r1.e
            boolean r3 = r3.equals(r4)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r13.a
            r4[r18] = r5
            java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
            defpackage.iva.a(r3, r5, r4)
        L_0x00eb:
            java.util.Collection r3 = r14.values()
            int r16 = defpackage.iey.a((java.lang.Iterable) r3, (boolean) r2)
            iey r3 = new iey
            android.content.Context r5 = r1.g
            java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
            r6.<init>()
            android.os.Looper r7 = r1.l
            hxj r9 = r1.m
            ibn r10 = r1.p
            java.util.ArrayList r12 = r1.n
            java.util.ArrayList r13 = r1.o
            int r8 = r1.j
            r4 = r3
            r17 = r8
            r8 = r0
            r0 = r15
            r15 = r17
            r17 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.Set r4 = defpackage.icc.a
            monitor-enter(r4)
            java.util.Set r0 = defpackage.icc.a     // Catch:{ all -> 0x01cd }
            r0.add(r3)     // Catch:{ all -> 0x01cd }
            monitor-exit(r4)     // Catch:{ all -> 0x01cd }
            int r0 = r1.j
            if (r0 < 0) goto L_0x01cc
            ifx r0 = r1.i
            ify r0 = com.google.android.gms.common.api.internal.LifecycleCallback.a((defpackage.ifx) r0)
            java.lang.Class<idc> r4 = defpackage.idc.class
            java.lang.String r5 = "AutoManageHelper"
            com.google.android.gms.common.api.internal.LifecycleCallback r4 = r0.a((java.lang.String) r5, (java.lang.Class) r4)
            idc r4 = (defpackage.idc) r4
            if (r4 != 0) goto L_0x0139
            idc r4 = new idc
            r4.<init>(r0)
            goto L_0x013a
        L_0x0139:
        L_0x013a:
            int r0 = r1.j
            icb r5 = r1.k
            java.lang.String r6 = "GoogleApiClient instance cannot be null"
            defpackage.iva.a((java.lang.Object) r3, (java.lang.Object) r6)
            android.util.SparseArray r6 = r4.a
            int r6 = r6.indexOfKey(r0)
            if (r6 >= 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            r2 = 0
        L_0x014d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 54
            r6.<init>(r7)
            java.lang.String r7 = "Already managing a GoogleApiClient with id "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            defpackage.iva.a((boolean) r2, (java.lang.Object) r6)
            java.util.concurrent.atomic.AtomicReference r2 = r4.c
            java.lang.Object r2 = r2.get()
            idh r2 = (defpackage.idh) r2
            boolean r6 = r4.b
            java.lang.String r7 = java.lang.String.valueOf(r2)
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 49
            r9.<init>(r8)
            java.lang.String r8 = "starting AutoManage for client "
            r9.append(r8)
            r9.append(r0)
            java.lang.String r8 = " "
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = " "
            r9.append(r6)
            r9.append(r7)
            r9.toString()
            idb r6 = new idb
            r6.<init>(r4, r0, r3, r5)
            android.util.SparseArray r5 = r4.a
            r5.put(r0, r6)
            boolean r0 = r4.b
            if (r0 == 0) goto L_0x01cc
            if (r2 != 0) goto L_0x01cc
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 11
            r4.<init>(r2)
            java.lang.String r2 = "connecting "
            r4.append(r2)
            r4.append(r0)
            r4.toString()
            r3.e()
        L_0x01cc:
            return r3
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01cd }
            throw r0
        L_0x01d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r13.a
            int r3 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 82
            r4.<init>(r3)
            java.lang.String r3 = "With using "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            goto L_0x01f5
        L_0x01f4:
            throw r0
        L_0x01f5:
            goto L_0x01f4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibz.b():icc");
    }

    public final void a(Handler handler) {
        iva.a((Object) handler, (Object) "Handler must not be null");
        this.l = handler.getLooper();
    }

    public final void a(Activity activity, int i2, icb icb) {
        ifx ifx = new ifx(activity);
        iva.b(true, "clientId must be non-negative");
        this.j = i2;
        this.k = icb;
        this.i = ifx;
    }

    public final void a(Activity activity, icb icb) {
        a(activity, 0, icb);
    }

    public final void a(Scope scope) {
        iva.a((Object) scope, (Object) "Scope must not be null");
        this.d.add(scope);
    }

    public final void a(ibq ibq) {
        iva.a((Object) ibq, (Object) "Api must not be null");
        this.h.put(ibq, (Object) null);
        List a2 = ibq.b.a((Object) null);
        this.e.addAll(a2);
        this.d.addAll(a2);
    }

    public ibz(Context context, ica ica, icb icb) {
        this(context);
        iva.a((Object) ica, (Object) "Must provide a connected listener");
        this.n.add(ica);
        iva.a((Object) icb, (Object) "Must provide a connection failed listener");
        this.o.add(icb);
    }

    public final void a(ibq ibq, ibj ibj) {
        iva.a((Object) ibq, (Object) "Api must not be null");
        iva.a((Object) ibj, (Object) "Null options are not permitted for this Api");
        this.h.put(ibq, ibj);
        List a2 = ibq.b.a(ibj);
        this.e.addAll(a2);
        this.d.addAll(a2);
    }

    public final void a(ica ica) {
        iva.a((Object) ica, (Object) "Listener must not be null");
        this.n.add(ica);
    }

    public final void a(icb icb) {
        iva.a((Object) icb, (Object) "Listener must not be null");
        this.o.add(icb);
    }

    public final void a(String str) {
        this.a = str != null ? new Account(str, "com.google") : null;
    }

    public final void a(String[] strArr) {
        for (String scope : strArr) {
            this.d.add(new Scope(scope));
        }
    }
}
