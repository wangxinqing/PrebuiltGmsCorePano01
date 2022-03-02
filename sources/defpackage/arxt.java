package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: arxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxt {
    static final byte[] a = "opt-in".getBytes(Charset.forName("UTF-8"));
    public static final /* synthetic */ int c = 0;
    public final Context b;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final afif f;

    public arxt(Context context, Handler handler) {
        afif a2 = afhy.a(context, handler, handler);
        this.b = context;
        this.f = a2;
    }

    public static List a(Context context) {
        Account[] accountsByType = AccountManager.get(context).getAccountsByType("com.google");
        ArrayList arrayList = new ArrayList();
        for (Account account : accountsByType) {
            if (!(account.name == null || account.type == null)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    static final /* synthetic */ List b(Collection collection) {
        tzj tzj;
        tzj tzj2;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    tzk tzk = (tzk) ((afhu) it.next()).a();
                    if (tzk.a == 2) {
                        tzj tzj3 = (tzj) tzk.b;
                        if ((tzj3.a & 1) == 0 && (tzj3.a & 4) != 0) {
                            if (tzk.a == 2) {
                                tzj = (tzj) tzk.b;
                            } else {
                                tzj = tzj.e;
                            }
                            byte[] k = tzj.d.k();
                            if (k.length >= 4) {
                                int i = 0;
                                while (true) {
                                    if (i < 4) {
                                        if (k[i] != -16) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        if (tzk.a == 2) {
                                            tzj2 = (tzj) tzk.b;
                                        } else {
                                            tzj2 = tzj.e;
                                        }
                                        arrayList.add(tzj2);
                                    }
                                }
                            }
                        }
                    }
                } catch (auda e2) {
                    anih anih = (anih) aryq.a.c();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("arxt", "b", 290, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Failed to parse device");
                }
            }
        }
        return arrayList;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr.length < 4) {
            return null;
        }
        Arrays.fill(bArr, 0, 4, (byte) -16);
        return bArr;
    }

    public final afhs d(Account account) {
        afhs afhs;
        synchronized (this.d) {
            afhs = (afhs) this.d.get(account);
            if (afhs == null) {
                afhs = this.f.a(account, 837, 190536965, tzk.d);
                aepl c2 = aepm.c();
                c2.a((int) aymt.a.a().aa(), TimeUnit.SECONDS);
                aepm a2 = c2.a();
                aepi i = aepj.i();
                i.b(a2);
                i.a(a2);
                if (aymw.a.a().Z()) {
                    i.a(Integer.valueOf((int) aymt.a.a().au()));
                }
                afhs.a(i.a(), afhr.c);
                this.d.put(account, afhs);
            }
        }
        return afhs;
    }

    public final CountDownLatch c() {
        CountDownLatch countDownLatch;
        synchronized (this.e) {
            aryq aryq = aryq.a;
            this.e.size();
            countDownLatch = new CountDownLatch(this.e.size());
            for (Account account : this.e.keySet()) {
                aorl.a(d(account).a((afht) this.e.get(account)), new arxq(countDownLatch), aoqm.a);
            }
            this.e.clear();
        }
        return countDownLatch;
    }

    static final /* synthetic */ List a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    tzk tzk = (tzk) ((afhu) it.next()).a();
                    if (tzk.a == 2) {
                        tzj tzj = (tzj) tzk.b;
                        if ((tzj.a & 1) != 0) {
                            arrayList.add(tzj);
                        }
                    }
                } catch (auda e2) {
                    anih anih = (anih) aryq.a.c();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("arxt", "a", 328, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Failed to parse device");
                }
            }
        }
        return arrayList;
    }

    public static final tzj a(List list, byte[] bArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tzj tzj = (tzj) it.next();
            if (Arrays.equals(bArr, tzj.b.k())) {
                aryq aryq = aryq.a;
                return tzj;
            }
        }
        return null;
    }

    private final void a(Account account, byte[] bArr) {
        try {
            d(account).a(bArr, (audx) tzk.c).get();
        } catch (InterruptedException | ExecutionException e2) {
            anih anih = (anih) aryq.a.c();
            anih.a(e2);
            ((anih) anih.a("arxt", "a", 420, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Error removing footprint.");
        }
    }

    public final boolean c(Account account) {
        int a2;
        try {
            aryq aryq = aryq.a;
            afhs d2 = d(account);
            afhq b2 = afhr.b();
            b2.a(a, 1);
            tzk tzk = (tzk) ((afhu) anbs.b((Iterable) d2.a(b2.a()).get())).a();
            if (tzk.a == 1) {
                ((Integer) tzk.b).intValue();
                if (tzk.a == 1 && (a2 = tzm.a(((Integer) tzk.b).intValue())) != 0 && a2 == 2) {
                    return true;
                }
                return false;
            }
            ((anih) ((anih) aryq.a.c()).a("arxt", "c", 472, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Returned info has no opt in status.");
            return false;
        } catch (auda | InterruptedException | ExecutionException e2) {
            anih anih = (anih) aryq.a.c();
            anih.a(e2);
            ((anih) anih.a("arxt", "c", 475, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Error getting opt in status.");
        } catch (IllegalArgumentException | NoSuchElementException e3) {
            ((anih) ((anih) aryq.a.d()).a("arxt", "c", 477, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Couldn't find a usable opt in status, returning default.");
        }
    }

    public static byte[] b(byte[] bArr) {
        return anml.g.a(bArr).getBytes(Charset.forName("UTF-8"));
    }

    public final aorr a() {
        return a(d());
    }

    public final aorr a(Account account) {
        afhr afhr = afhr.c;
        aryq aryq = aryq.a;
        return aopr.a(d(account).a(afhr), arxn.a, (Executor) aoqm.a);
    }

    public final void b() {
        Account d2 = d();
        if (!c(d2)) {
            a(d2, true);
        }
    }

    public final void b(Account account) {
        try {
            for (tzj tzj : (List) a(account).get()) {
                try {
                    d(account).a(b(tzj.b.k()), (audx) tzk.c).get();
                } catch (InterruptedException | ExecutionException e2) {
                    anih anih = (anih) aryq.a.c();
                    anih.a(e2);
                    ((anih) anih.a("arxt", "a", 420, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Error removing footprint.");
                }
            }
            aryq aryq = aryq.a;
        } catch (InterruptedException | ExecutionException e3) {
            anih anih2 = (anih) aryq.a.c();
            anih2.a(e3);
            ((anih) anih2.a("arxt", "b", 346, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Error removing footprints.");
        }
    }

    public final Account d() {
        List a2 = a(this.b);
        if (!a2.isEmpty()) {
            return (Account) a2.get(0);
        }
        return null;
    }

    public final tzj d(byte[] bArr) {
        List a2 = a(this.b);
        int size = a2.size();
        int i = 0;
        while (i < size) {
            Account account = (Account) a2.get(i);
            try {
                tzj a3 = a((List) a(account).get(), bArr);
                if (a3 != null) {
                    return a3;
                }
                i++;
            } catch (InterruptedException | ExecutionException e2) {
                anih anih = (anih) aryq.a.c();
                anih.a(e2);
                ((anih) anih.a("arxt", "d", 661, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: fail to read footprints from %s.", (Object) account);
            }
        }
        return null;
    }

    public final CountDownLatch a(afht afht, Account account) {
        synchronized (this.e) {
            if (this.e.containsKey(account)) {
                aryq aryq = aryq.a;
                CountDownLatch countDownLatch = new CountDownLatch(0);
                return countDownLatch;
            }
            aryq aryq2 = aryq.a;
            this.e.put(account, afht);
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            aorl.a(d(account).a(afht, afhr.c), new arxp(countDownLatch2), aoqm.a);
            return countDownLatch2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Account account, arxs arxs, long j, Throwable th) {
        int i;
        try {
            i = ((List) a(account).get()).size();
        } catch (InterruptedException | ExecutionException e2) {
            anih anih = (anih) aryq.a.c();
            anih.a(e2);
            ((anih) anih.a("arxt", "b", 237, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Failed to read the footprints for logging device count.");
            i = -1;
        }
        Context context = this.b;
        context.startService(arza.a(context, arxs.a().y, arxs.d(), j, i, th));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((defpackage.anih) ((defpackage.anih) defpackage.aryq.a.d()).a("arxt", "a", 676, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: find the matched device (%s) from footprints.", (java.lang.Object) r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        r0 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.tzj a(java.lang.String r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r3 = "a"
            java.lang.String r4 = "arxt"
            android.content.Context r0 = r1.b
            java.util.List r5 = a((android.content.Context) r0)
            int r6 = r5.size()
            r7 = 0
            r8 = 0
        L_0x0014:
            r0 = 0
            if (r8 >= r6) goto L_0x00b7
            java.lang.Object r9 = r5.get(r8)
            android.accounts.Account r9 = (android.accounts.Account) r9
            aorr r10 = r1.a((android.accounts.Account) r9)     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            java.lang.Object r10 = r10.get()     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
        L_0x002b:
            boolean r11 = r10.hasNext()     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            if (r11 == 0) goto L_0x0093
            java.lang.Object r11 = r10.next()     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            tzj r11 = (defpackage.tzj) r11     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            int r12 = r11.a     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0090
            r12 = r12 & 4
            if (r12 == 0) goto L_0x0090
            auay r12 = r11.d     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            byte[] r12 = r12.k()     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            auay r13 = r11.b     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            byte[] r13 = r13.k()     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            anli r14 = defpackage.anln.d()     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            r15 = 2
            byte[][] r15 = new byte[r15][]     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            r15[r7] = r13     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            byte[] r13 = defpackage.aeez.a((java.lang.String) r18)     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            r16 = 1
            r15[r16] = r13     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            byte[] r13 = defpackage.aooa.a((byte[][]) r15)     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            anlh r13 = r14.a((byte[]) r13)     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            byte[] r13 = r13.b()     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            boolean r12 = java.util.Arrays.equals(r12, r13)     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            if (r12 == 0) goto L_0x008d
            aryq r0 = defpackage.aryq.a     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            anie r0 = r0.d()     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            anih r0 = (defpackage.anih) r0     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            r10 = 676(0x2a4, float:9.47E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r10, (java.lang.String) r2)     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            anih r0 = (defpackage.anih) r0     // Catch:{ ExecutionException -> 0x009b, InterruptedException -> 0x0099 }
            java.lang.String r10 = "FastPair: find the matched device (%s) from footprints."
            r12 = r18
            r0.a((java.lang.String) r10, (java.lang.Object) r12)     // Catch:{ ExecutionException -> 0x008b, InterruptedException -> 0x0089 }
            r0 = r11
            goto L_0x0095
        L_0x0089:
            r0 = move-exception
            goto L_0x009e
        L_0x008b:
            r0 = move-exception
            goto L_0x009e
        L_0x008d:
            r12 = r18
            goto L_0x002b
        L_0x0090:
            r12 = r18
            goto L_0x002b
        L_0x0093:
            r12 = r18
        L_0x0095:
            if (r0 != 0) goto L_0x0098
            goto L_0x00b3
        L_0x0098:
            return r0
        L_0x0099:
            r0 = move-exception
            goto L_0x009c
        L_0x009b:
            r0 = move-exception
        L_0x009c:
            r12 = r18
        L_0x009e:
            aryq r0 = defpackage.aryq.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r10 = 645(0x285, float:9.04E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r10, (java.lang.String) r2)
            anih r0 = (defpackage.anih) r0
            java.lang.String r10 = "FastPair: fail to read footprints from %s."
            r0.a((java.lang.String) r10, (java.lang.Object) r9)
        L_0x00b3:
            int r8 = r8 + 1
            goto L_0x0014
        L_0x00b7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arxt.a(java.lang.String):tzj");
    }

    /* access modifiers changed from: package-private */
    public final tzj a(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tzj tzj = (tzj) it.next();
            int i = tzj.a;
            if (!((i & 1) == 0 || (i & 4) == 0)) {
                byte[] k = tzj.d.k();
                byte[] k2 = tzj.b.k();
                if (Arrays.equals(k, anln.d().a(aooa.a(k2, aeez.a(str))).b())) {
                    ((anih) ((anih) aryq.a.d()).a("arxt", "a", 676, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: find the matched device (%s) from footprints.", (Object) str);
                    return tzj;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(Account account, arxs arxs, long j, Throwable th) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        if (!aymz.b() || !aymw.J()) {
            Context context = this.b;
            context.startService(arza.a(context, arxs.a().y, arxs.d(), j, -1, th));
            return;
        }
        newSingleThreadExecutor.execute(new arxl(this, account, arxs, j, th));
    }

    public final void a(Account account, arxs arxs, aora aora) {
        byte[] k = arxs.a().k();
        byte[] k2 = arxs.b().k();
        if (!aynf.b() || !((anih) aryq.a.d()).l()) {
            aryq aryq = aryq.a;
            int length = k.length;
        } else {
            ((anih) ((anih) aryq.a.d()).a("arxt", "a", 135, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Adding device to Footprints with size %d bytes, account key %s, %s", (Object) Integer.valueOf(k.length), (Object) anml.g.a(k2), (Object) aryq.a(arxs.a()));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aucd o = tzj.e.o();
        auay b2 = arxs.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzj tzj = (tzj) o.b;
        b2.getClass();
        tzj.a |= 1;
        tzj.b = b2;
        auay a2 = auay.a(k);
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzj tzj2 = (tzj) o.b;
        a2.getClass();
        tzj2.a |= 2;
        tzj2.c = a2;
        auay c2 = arxs.c();
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzj tzj3 = (tzj) o.b;
        c2.getClass();
        tzj3.a |= 4;
        tzj3.d = c2;
        afhs d2 = d(account);
        byte[] b3 = b(k2);
        aucd o2 = tzk.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        tzk tzk = (tzk) o2.b;
        tzj tzj4 = (tzj) o.i();
        tzj4.getClass();
        tzk.b = tzj4;
        tzk.a = 2;
        aorl.a(d2.a(b3, (audx) (tzk) o2.i()), new arxo(this, account, arxs, elapsedRealtime, aora), aoqm.a);
    }

    public final void a(Account account, boolean z) {
        int i;
        try {
            afhs d2 = d(account);
            byte[] bArr = a;
            aucd o = tzk.c.o();
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            tzk tzk = (tzk) o.b;
            tzk.b = Integer.valueOf(i - 1);
            tzk.a = 1;
            d2.a(bArr, (audx) (tzk) o.i()).get();
            aryq aryq = aryq.a;
        } catch (InterruptedException | ExecutionException e2) {
            anih anih = (anih) aryq.a.c();
            anih.a(e2);
            ((anih) anih.a("arxt", "a", 450, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Failed to write opt in status.");
        }
    }

    public final void a(Account account, byte[] bArr, byte[] bArr2) {
        try {
            afhs d2 = d(account);
            byte[] b2 = b(bArr);
            aucd o = tzk.c.o();
            aucd o2 = tzj.e.o();
            auay a2 = auay.a(c(bArr2));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            tzj tzj = (tzj) o2.b;
            a2.getClass();
            tzj.a |= 4;
            tzj.d = a2;
            tzj tzj2 = (tzj) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            tzk tzk = (tzk) o.b;
            tzj2.getClass();
            tzk.b = tzj2;
            tzk.a = 2;
            d2.a(b2, (audx) (tzk) o.i()).get();
        } catch (InterruptedException | ExecutionException e2) {
            anih anih = (anih) aryq.a.c();
            anih.a(e2);
            ((anih) anih.a("arxt", "a", 410, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Error forgetting footprint.");
        }
    }

    public final void a(byte[] bArr) {
        List a2 = a(this.b);
        int size = a2.size();
        int i = 0;
        while (i < size) {
            Account account = (Account) a2.get(i);
            try {
                tzj a3 = a((List) a(account).get(), bArr);
                if (a3 == null) {
                    i++;
                } else if ((a3.a & 4) == 0) {
                    ((anih) ((anih) aryq.a.c()).a("arxt", "a", 362, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: fail to forget footprints because device has no sha256.");
                    return;
                } else {
                    a(account, bArr, a3.d.k());
                    return;
                }
            } catch (InterruptedException | ExecutionException e2) {
                anih anih = (anih) aryq.a.c();
                anih.a(e2);
                ((anih) anih.a("arxt", "a", 368, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: fail to forget footprints.");
            }
        }
    }
}
