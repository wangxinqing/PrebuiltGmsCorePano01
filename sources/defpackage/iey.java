package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: iey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iey extends icc implements ifv {
    public static final /* synthetic */ int n = 0;
    public final Lock b;
    public final ita c;
    public final Context d;
    public final Looper e;
    final Queue f = new LinkedList();
    ifq g;
    final Map h;
    Set i;
    final ise j;
    final Map k;
    final ihf l;
    final ibn m;
    private ifw o = null;
    private final int p;
    private volatile boolean q;
    private long r;
    private long s;
    private final iew t;
    private final hxj u;
    private final igf v;
    private final ArrayList w;
    private Integer x;
    private final isz y;

    public iey(Context context, Lock lock, Looper looper, ise ise, hxj hxj, ibn ibn, Map map, List list, List list2, Map map2, int i2, int i3, ArrayList arrayList) {
        long j2;
        Looper looper2 = looper;
        int i4 = i2;
        if (!jim.a()) {
            j2 = 120000;
        } else {
            j2 = 10000;
        }
        this.r = j2;
        this.s = 5000;
        this.i = new HashSet();
        this.v = new igf();
        this.x = null;
        this.y = new iev(this);
        this.d = context;
        this.b = lock;
        this.c = new ita(looper, this.y);
        this.e = looper2;
        this.t = new iew(this, looper);
        this.u = hxj;
        this.p = i4;
        if (i4 >= 0) {
            this.x = Integer.valueOf(i3);
        }
        this.k = map;
        this.h = map2;
        this.w = arrayList;
        this.l = new ihf();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            List list3 = list;
            this.c.a((ica) list.get(i5));
        }
        int size2 = list2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            this.c.a((icb) list2.get(i6));
        }
        this.j = ise;
        this.m = ibn;
    }

    public static int a(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            ibo ibo = (ibo) it.next();
            if (ibo.g()) {
                z2 = true;
            }
            if (ibo.h()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    static String b(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: ibo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(int r19) {
        /*
            r18 = this;
            r15 = r18
            java.lang.Integer r0 = r15.x
            if (r0 != 0) goto L_0x000d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r15.x = r0
            goto L_0x0015
        L_0x000d:
            int r0 = r0.intValue()
            r1 = r19
            if (r0 != r1) goto L_0x01a0
        L_0x0015:
            ifw r0 = r15.o
            if (r0 != 0) goto L_0x019e
            java.util.Map r0 = r15.h
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
            r3 = 0
            r4 = 0
        L_0x0026:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r0.next()
            ibo r5 = (defpackage.ibo) r5
            boolean r6 = r5.g()
            if (r6 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            boolean r5 = r5.h()
            if (r5 == 0) goto L_0x0026
            r4 = 1
            goto L_0x0026
        L_0x0042:
            java.lang.Integer r0 = r15.x
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x016a
            r4 = 2
            if (r0 == r4) goto L_0x0050
            r12 = r15
            goto L_0x016f
        L_0x0050:
            if (r3 == 0) goto L_0x0168
            android.content.Context r3 = r15.d
            java.util.concurrent.locks.Lock r4 = r15.b
            android.os.Looper r5 = r15.e
            hxj r6 = r15.u
            java.util.Map r0 = r15.h
            ise r8 = r15.j
            java.util.Map r7 = r15.k
            ibn r9 = r15.m
            java.util.ArrayList r10 = r15.w
            nz r11 = new nz
            r11.<init>()
            nz r12 = new nz
            r12.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r13 = 0
        L_0x0077:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x00ad
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r16 = r14.getValue()
            r1 = r16
            ibo r1 = (defpackage.ibo) r1
            boolean r16 = r1.h()
            if (r16 != 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r13 = r1
        L_0x0093:
            boolean r16 = r1.g()
            if (r16 == 0) goto L_0x00a3
            java.lang.Object r14 = r14.getKey()
            ibg r14 = (defpackage.ibg) r14
            r11.put(r14, r1)
            goto L_0x0077
        L_0x00a3:
            java.lang.Object r14 = r14.getKey()
            ibg r14 = (defpackage.ibg) r14
            r12.put(r14, r1)
            goto L_0x0077
        L_0x00ad:
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ r2
            java.lang.String r1 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            defpackage.iva.a((boolean) r0, (java.lang.Object) r1)
            nz r14 = new nz
            r14.<init>()
            nz r2 = new nz
            r2.<init>()
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0107
            java.lang.Object r1 = r0.next()
            ibq r1 = (defpackage.ibq) r1
            r16 = r0
            ibg r0 = r1.a()
            boolean r17 = r11.containsKey(r0)
            if (r17 == 0) goto L_0x00ed
            java.lang.Object r0 = r7.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r14.put(r1, r0)
            r0 = r16
            goto L_0x00c9
        L_0x00ed:
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r7.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r2.put(r1, r0)
            r0 = r16
            goto L_0x00c9
        L_0x00ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            r0.<init>(r1)
            throw r0
        L_0x0107:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r10.size()
            r15 = 0
        L_0x0116:
            if (r15 >= r0) goto L_0x014a
            java.lang.Object r16 = r10.get(r15)
            r19 = r0
            r0 = r16
            idu r0 = (defpackage.idu) r0
            r16 = r10
            ibq r10 = r0.a
            boolean r10 = r14.containsKey(r10)
            if (r10 == 0) goto L_0x0130
            r7.add(r0)
            goto L_0x013b
        L_0x0130:
            ibq r10 = r0.a
            boolean r10 = r2.containsKey(r10)
            if (r10 == 0) goto L_0x0142
            r1.add(r0)
        L_0x013b:
            int r15 = r15 + 1
            r0 = r19
            r10 = r16
            goto L_0x0116
        L_0x0142:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            r0.<init>(r1)
            throw r0
        L_0x014a:
            idz r15 = new idz
            r0 = r15
            r16 = r1
            r1 = r3
            r17 = r2
            r2 = r18
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r11
            r11 = r7
            r7 = r12
            r10 = r13
            r12 = r16
            r13 = r14
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r12 = r18
            r12.o = r15
            return
        L_0x0168:
            r12 = r15
            goto L_0x016f
        L_0x016a:
            r12 = r15
            if (r3 == 0) goto L_0x0196
            if (r4 != 0) goto L_0x018e
        L_0x016f:
            ifc r13 = new ifc
            android.content.Context r1 = r12.d
            java.util.concurrent.locks.Lock r3 = r12.b
            android.os.Looper r4 = r12.e
            hxj r5 = r12.u
            java.util.Map r6 = r12.h
            ise r7 = r12.j
            java.util.Map r8 = r12.k
            ibn r9 = r12.m
            java.util.ArrayList r10 = r12.w
            r0 = r13
            r2 = r18
            r11 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.o = r13
            return
        L_0x018e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r1)
            throw r0
        L_0x0196:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r0.<init>(r1)
            throw r0
        L_0x019e:
            r12 = r15
            return
        L_0x01a0:
            r12 = r15
            java.lang.String r0 = b((int) r19)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Integer r2 = r12.x
            int r2 = r2.intValue()
            java.lang.String r2 = b((int) r2)
            int r3 = r0.length()
            int r4 = r2.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 51
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "Cannot use sign-in mode: "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = ". Mode was already set to "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r1.<init>(r0)
            goto L_0x01da
        L_0x01d9:
            throw r1
        L_0x01da:
            goto L_0x01d9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iey.c(int):void");
    }

    public final Context b() {
        return this.d;
    }

    public final Looper c() {
        return this.e;
    }

    public final void d() {
        ifw ifw = this.o;
        if (ifw != null) {
            ifw.f();
        }
    }

    public final void e() {
        this.b.lock();
        try {
            boolean z = false;
            if (this.p < 0) {
                Integer num = this.x;
                if (num == null) {
                    this.x = Integer.valueOf(a((Iterable) this.h.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                iva.a(this.x != null, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            }
            int intValue = this.x.intValue();
            this.b.lock();
            if (intValue == 3) {
                z = true;
            } else if (intValue == 1 || intValue == 2) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(intValue);
            iva.b(z, sb.toString());
            c(intValue);
            k();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.b.unlock();
        }
    }

    public final ConnectionResult f() {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "blockingConnect must not be called on the UI thread");
        this.b.lock();
        try {
            if (this.p < 0) {
                Integer num = this.x;
                if (num == null) {
                    this.x = Integer.valueOf(a((Iterable) this.h.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                if (this.x == null) {
                    z2 = false;
                }
                iva.a(z2, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            }
            c(this.x.intValue());
            this.c.b();
            return this.o.b();
        } finally {
            this.b.unlock();
        }
    }

    public final void g() {
        Lock lock;
        boolean d2;
        this.b.lock();
        try {
            ihf ihf = this.l;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) ihf.c.toArray(ihf.b)) {
                basePendingResult.a((ihe) null);
                synchronized (basePendingResult.g) {
                    if (((icc) basePendingResult.i.get()) == null || !basePendingResult.k) {
                        basePendingResult.b();
                    }
                    d2 = basePendingResult.d();
                }
                if (d2) {
                    ihf.c.remove(basePendingResult);
                }
            }
            ifw ifw = this.o;
            if (ifw != null) {
                ifw.c();
            }
            igf igf = this.v;
            for (ige a : igf.a) {
                a.a();
            }
            igf.a.clear();
            for (idf idf : this.f) {
                idf.a((ihe) null);
                idf.b();
            }
            this.f.clear();
            if (this.o != null) {
                m();
                this.c.a();
                lock = this.b;
            } else {
                lock = this.b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final void h() {
        g();
        e();
    }

    public final boolean i() {
        ifw ifw = this.o;
        return ifw != null && ifw.d();
    }

    public final boolean j() {
        ifw ifw = this.o;
        return ifw != null && ifw.e();
    }

    public final void k() {
        this.c.b();
        this.o.a();
    }

    public final void l() {
        this.b.lock();
        try {
            if (this.q) {
                k();
            }
        } finally {
            this.b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean m() {
        boolean z = false;
        if (this.q) {
            this.q = false;
            this.t.removeMessages(2);
            z = true;
            this.t.removeMessages(1);
            ifq ifq = this.g;
            if (ifq != null) {
                ifq.a();
                this.g = null;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final String n() {
        StringWriter stringWriter = new StringWriter();
        a("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    public final ConnectionResult a(long j2, TimeUnit timeUnit) {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "blockingConnect must not be called on the UI thread");
        iva.a((Object) timeUnit, (Object) "TimeUnit must not be null");
        this.b.lock();
        try {
            Integer num = this.x;
            if (num == null) {
                this.x = Integer.valueOf(a((Iterable) this.h.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            c(this.x.intValue());
            this.c.b();
            return this.o.a(j2, timeUnit);
        } finally {
            this.b.unlock();
        }
    }

    public final idf b(idf idf) {
        boolean z;
        String str;
        Lock lock;
        if (idf.d != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.h.containsKey(idf.d);
        ibq ibq = idf.e;
        if (ibq != null) {
            str = ibq.a;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(str.length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        iva.b(containsKey, sb.toString());
        this.b.lock();
        try {
            if (this.o != null) {
                if (!this.q) {
                    idf = this.o.b(idf);
                    lock = this.b;
                } else {
                    this.f.add(idf);
                    while (!this.f.isEmpty()) {
                        idf idf2 = (idf) this.f.remove();
                        this.l.a(idf2);
                        idf2.a(Status.c);
                    }
                    lock = this.b;
                }
                lock.unlock();
                return idf;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final ibo a(ibg ibg) {
        ibo ibo = (ibo) this.h.get(ibg);
        iva.a((Object) ibo, (Object) "Appropriate Api was not requested.");
        return ibo;
    }

    public final idf a(idf idf) {
        boolean z;
        String str;
        Lock lock;
        if (idf.d != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.h.containsKey(idf.d);
        ibq ibq = idf.e;
        if (ibq != null) {
            str = ibq.a;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(str.length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        iva.b(containsKey, sb.toString());
        this.b.lock();
        try {
            ifw ifw = this.o;
            if (ifw == null) {
                this.f.add(idf);
                lock = this.b;
            } else {
                idf = ifw.a(idf);
                lock = this.b;
            }
            lock.unlock();
            return idf;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final void b(ica ica) {
        this.c.b(ica);
    }

    public final boolean b(ibq ibq) {
        ibo ibo;
        if (!i() || (ibo = (ibo) this.h.get(ibq.a())) == null || !ibo.l()) {
            return false;
        }
        return true;
    }

    public final ige a(Object obj) {
        this.b.lock();
        try {
            igf igf = this.v;
            ige a = igf.a(obj, this.e, "NO_TYPE");
            igf.a.add(a);
            return a;
        } finally {
            this.b.unlock();
        }
    }

    public final void a(int i2) {
        if (i2 == 1 && !this.q) {
            this.q = true;
            if (this.g == null && !jim.a()) {
                try {
                    this.g = this.u.a(this.d.getApplicationContext(), (ifp) new iex(this));
                } catch (SecurityException e2) {
                }
            }
            iew iew = this.t;
            iew.sendMessageDelayed(iew.obtainMessage(1), this.r);
            iew iew2 = this.t;
            iew2.sendMessageDelayed(iew2.obtainMessage(2), this.s);
        }
        for (BasePendingResult c2 : (BasePendingResult[]) this.l.c.toArray(ihf.b)) {
            c2.c(ihf.a);
        }
        this.c.a(i2);
        this.c.a();
        if (i2 == 2) {
            k();
        }
    }

    public final void a(Bundle bundle) {
        while (!this.f.isEmpty()) {
            b((idf) this.f.remove());
        }
        this.c.a(bundle);
    }

    public final void a(ConnectionResult connectionResult) {
        if (!hxz.b(this.d, connectionResult.c)) {
            m();
        }
        if (!this.q) {
            this.c.a(connectionResult);
            this.c.a();
        }
    }

    public final void a(ica ica) {
        this.c.a(ica);
    }

    public final void a(icb icb) {
        this.c.a(icb);
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.d);
        printWriter.append(str).append("mResuming=").print(this.q);
        printWriter.append(" mWorkQueue.size()=").print(this.f.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.l.c.size());
        ifw ifw = this.o;
        if (ifw != null) {
            ifw.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean a(fwa fwa) {
        ifw ifw = this.o;
        return ifw != null && ifw.a(fwa);
    }

    public final boolean a(ibq ibq) {
        return this.h.containsKey(ibq.a());
    }
}
