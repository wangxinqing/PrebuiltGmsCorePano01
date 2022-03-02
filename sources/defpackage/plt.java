package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: plt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class plt {
    private static final aafk f;
    private static plt g;
    public final Context a;
    public final pnr b;
    private final oyq c = new oyq(this.a);
    private final aaig d;
    private final aalw e;

    static {
        aafj aafj = new aafj();
        aafj.a = "AppsCorpus";
        f = aafj.a();
    }

    public plt(Context context, pnr pnr, aaig aaig, aalw aalw) {
        this.a = context;
        this.b = pnr;
        this.d = aaig;
        this.e = aalw;
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("proxy-apps-corpus", 0);
        int i = sharedPreferences.getInt("version", 0);
        if (i < 4) {
            sharedPreferences.edit().putInt("version", 4).commit();
        }
        if (i >= 4) {
            SharedPreferences sharedPreferences2 = this.a.getSharedPreferences("proxy-apps-corpus", 0);
            String string = sharedPreferences2.getString("current-os-build-id", (String) null);
            if (string == null || !Build.ID.equals(string)) {
                sharedPreferences2.edit().putString("current-os-build-id", Build.ID).apply();
            } else if (e() > 0) {
                return;
            }
            poi.a().a(poi.a("AppsCorpusReconcileCorpusRunnable", new pls(this)));
            return;
        }
        poi.a().a(poi.a("AppsCorpusRecreateCorpusRunnable", new plq(this)));
    }

    public static plt a(Context context) {
        if (!a()) {
            return null;
        }
        synchronized (plt.class) {
            if (g == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (pnr.class) {
                    if (pnr.e == null) {
                        pnr.e = new pnr(applicationContext, "icing_apps_corpus_entries.bin", "icing_apps_corpus_component_names.txt");
                    }
                }
                g = new plt(applicationContext, pnr.e, aafi.b(applicationContext, f), aafi.a(applicationContext, f));
            }
        }
        return g;
    }

    public final boolean b() {
        pnz.a("AppsCorpus::recreateWholeCorpus");
        amzy a2 = plw.a(this.a.getPackageManager());
        if (!a2.isEmpty()) {
            this.b.a((Iterable) plw.a((Iterable) a2));
            Set<plv> a3 = plw.a(this.e, this.c);
            if (a3 != null) {
                long e2 = e();
                ArrayList arrayList = new ArrayList(a3.size() + a2.size());
                for (plv plv : a3) {
                    e2++;
                    aucd o = pln.e.o();
                    String str = plv.a;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    pln pln = (pln) o.b;
                    str.getClass();
                    int i = pln.a | 2;
                    pln.a = i;
                    pln.c = str;
                    pln.b = 2;
                    int i2 = i | 1;
                    pln.a = i2;
                    pln.a = i2 | 4;
                    pln.d = e2;
                    arrayList.add((pln) o.i());
                }
                anhk i3 = a2.listIterator();
                while (i3.hasNext()) {
                    e2++;
                    aucd o2 = pln.e.o();
                    String str2 = ((plv) i3.next()).a;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    pln pln2 = (pln) o2.b;
                    str2.getClass();
                    int i4 = pln2.a | 2;
                    pln2.a = i4;
                    pln2.c = str2;
                    pln2.b = 1;
                    int i5 = i4 | 1;
                    pln2.a = i5;
                    pln2.a = i5 | 4;
                    pln2.d = e2;
                    arrayList.add((pln) o2.i());
                }
                this.b.a((List) arrayList);
                a(e2);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0089 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r11 = this;
            aaig r0 = r11.d     // Catch:{ InterruptedException -> 0x00df, ExecutionException -> 0x00dd }
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r2 = "apps"
            acwa r0 = r0.b(r1, r2)     // Catch:{ InterruptedException -> 0x00df, ExecutionException -> 0x00dd }
            java.lang.Object r0 = defpackage.acws.a((defpackage.acwa) r0)     // Catch:{ InterruptedException -> 0x00df, ExecutionException -> 0x00dd }
            com.google.android.gms.appdatasearch.CorpusStatus r0 = (com.google.android.gms.appdatasearch.CorpusStatus) r0     // Catch:{ InterruptedException -> 0x00df, ExecutionException -> 0x00dd }
            boolean r1 = r0.a
            if (r1 == 0) goto L_0x00d4
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "apps"
            r3 = 0
            r1[r3] = r2
            long r4 = r0.c
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 1
            r1[r4] = r2
            r2 = 2
            long r4 = r0.b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r2] = r4
            java.lang.String r2 = "Status for corpus %s, lastCommittedSeqno:%d lastIndexedSeqno:%d"
            defpackage.pnz.c((java.lang.String) r2, (java.lang.Object[]) r1)
            pnr r1 = r11.b
            long r4 = r0.c
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r2 = "removeCommittedEntries for lastCommittedSeqno %d"
            defpackage.pnz.a((java.lang.String) r2, (java.lang.Object) r0)
            java.lang.Object r0 = defpackage.pnr.a
            monitor-enter(r0)
            java.util.List r2 = r1.a()     // Catch:{ all -> 0x00d1 }
            r6 = -1
        L_0x0048:
            int r7 = r6 + 1
            int r8 = r2.size()     // Catch:{ all -> 0x00d1 }
            if (r7 >= r8) goto L_0x005e
            java.lang.Object r8 = r2.get(r7)     // Catch:{ all -> 0x00d1 }
            pln r8 = (defpackage.pln) r8     // Catch:{ all -> 0x00d1 }
            long r8 = r8.d     // Catch:{ all -> 0x00d1 }
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x005e
            r6 = r7
            goto L_0x0048
        L_0x005e:
            if (r6 < 0) goto L_0x0089
            java.lang.String r4 = "Remove committed entries from %d to %d"
            java.lang.Object r5 = r2.get(r3)     // Catch:{ all -> 0x00d1 }
            pln r5 = (defpackage.pln) r5     // Catch:{ all -> 0x00d1 }
            long r8 = r5.d     // Catch:{ all -> 0x00d1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = r2.get(r6)     // Catch:{ all -> 0x00d1 }
            pln r6 = (defpackage.pln) r6     // Catch:{ all -> 0x00d1 }
            long r8 = r6.d     // Catch:{ all -> 0x00d1 }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00d1 }
            defpackage.pnz.a((java.lang.String) r4, (java.lang.Object) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x00d1 }
            java.util.List r3 = r2.subList(r3, r7)     // Catch:{ all -> 0x00d1 }
            r3.clear()     // Catch:{ all -> 0x00d1 }
            r1.a((java.util.List) r2)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x008a
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
        L_0x008a:
            long r0 = r11.e()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "Requesting indexing of %s with lastSeqno %d"
            java.lang.String r2 = "apps"
            defpackage.pnz.a((java.lang.String) r1, (java.lang.Object) r2, (java.lang.Object) r0)
            aaig r0 = r11.d     // Catch:{ ExecutionException -> 0x00bc, InterruptedException -> 0x00ba }
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r2 = "apps"
            long r3 = r11.e()     // Catch:{ ExecutionException -> 0x00bc, InterruptedException -> 0x00ba }
            acwa r0 = r0.a(r1, r2, r3)     // Catch:{ ExecutionException -> 0x00bc, InterruptedException -> 0x00ba }
            java.lang.Object r0 = defpackage.acws.a((defpackage.acwa) r0)     // Catch:{ ExecutionException -> 0x00bc, InterruptedException -> 0x00ba }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ExecutionException -> 0x00bc, InterruptedException -> 0x00ba }
            boolean r0 = r0.booleanValue()     // Catch:{ ExecutionException -> 0x00bc, InterruptedException -> 0x00ba }
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "Failed to request indexing"
            defpackage.pnz.e(r0)     // Catch:{ ExecutionException -> 0x00bc, InterruptedException -> 0x00ba }
        L_0x00b9:
            return
        L_0x00ba:
            r0 = move-exception
            goto L_0x00bd
        L_0x00bc:
            r0 = move-exception
        L_0x00bd:
            boolean r1 = r0 instanceof defpackage.ibr
            if (r1 == 0) goto L_0x00d0
            ibr r0 = (defpackage.ibr) r0
            int r0 = r0.a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "Failed to request indexing. Status Code: %d"
            defpackage.pnz.e(r1, r0)
        L_0x00d0:
            return
        L_0x00d1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            throw r1
        L_0x00d4:
            java.lang.String r0 = "Couldn't find corpus %s"
            java.lang.String r1 = "apps"
            defpackage.pnz.e(r0, r1)
            return
        L_0x00dd:
            r0 = move-exception
            goto L_0x00e0
        L_0x00df:
            r0 = move-exception
        L_0x00e0:
            java.lang.String r0 = "Couldn't fetch status for corpus %s"
            java.lang.String r1 = "apps"
            defpackage.pnz.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plt.c():void");
    }

    public final void d() {
        pnz.a("AppsCorpus.onMaintenance starts");
        long currentTimeMillis = System.currentTimeMillis();
        amzy a2 = plw.a(this.a.getPackageManager());
        if (!a2.isEmpty()) {
            this.b.a((Iterable) plw.a((Iterable) a2));
            Set<plv> a3 = plw.a(this.e, this.c);
            if (a3 != null) {
                HashSet<plv> hashSet = new HashSet<>(a2);
                if (a3.equals(hashSet)) {
                    pnz.a("AppsCorpus has %d ComponentNames.", (Object) Integer.valueOf(hashSet.size()));
                } else {
                    HashSet hashSet2 = new HashSet(a3);
                    hashSet2.retainAll(hashSet);
                    a3.removeAll(hashSet2);
                    hashSet.removeAll(hashSet2);
                    long e2 = e();
                    ArrayList arrayList = new ArrayList(a3.size() + hashSet.size());
                    for (plv plv : a3) {
                        e2++;
                        aucd o = pln.e.o();
                        String str = plv.a;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        pln pln = (pln) o.b;
                        str.getClass();
                        int i = pln.a | 2;
                        pln.a = i;
                        pln.c = str;
                        pln.b = 2;
                        int i2 = i | 1;
                        pln.a = i2;
                        pln.a = i2 | 4;
                        pln.d = e2;
                        arrayList.add((pln) o.i());
                    }
                    for (plv plv2 : hashSet) {
                        e2++;
                        aucd o2 = pln.e.o();
                        String str2 = plv2.a;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        pln pln2 = (pln) o2.b;
                        str2.getClass();
                        int i3 = pln2.a | 2;
                        pln2.a = i3;
                        pln2.c = str2;
                        pln2.b = 1;
                        int i4 = i3 | 1;
                        pln2.a = i4;
                        pln2.a = i4 | 4;
                        pln2.d = e2;
                        arrayList.add((pln) o2.i());
                    }
                    this.b.a((List) arrayList);
                    a(e2);
                    c();
                }
            }
        }
        aucd o3 = aoiw.d.o();
        int a4 = (int) ((a("icing_apps_corpus_entries.bin") + a("icing_apps_corpus_component_names.txt")) >> 10);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aoiw aoiw = (aoiw) o3.b;
        aoiw.a = 1 | aoiw.a;
        aoiw.b = a4;
        int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aoiw aoiw2 = (aoiw) o3.b;
        aoiw2.a |= 2;
        aoiw2.c = currentTimeMillis2;
        aoiw aoiw3 = (aoiw) o3.i();
        oyq oyq = this.c;
        long d2 = axrp.d();
        if (oyq.a(d2)) {
            aucd o4 = aoji.R.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aoji aoji = (aoji) o4.b;
            aoiw3.getClass();
            aoji.o = aoiw3;
            aoji.a |= 16384;
            oyq.a(2004, o4, d2);
        }
        pnz.a("AppsCorpus.onMaintenance ends");
    }

    public final long e() {
        return this.a.getSharedPreferences("proxy-apps-corpus", 0).getLong("last-seqno", -1);
    }

    public static boolean a() {
        if (!((Boolean) ozx.ac.c()).booleanValue()) {
            return true;
        }
        pnz.d("AppsCorpus is disabled by Gservices flag");
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long a(String str) {
        try {
            File fileStreamPath = this.a.getFileStreamPath(str);
            if (fileStreamPath != null) {
                return fileStreamPath.length();
            }
            return 0;
        } catch (SecurityException e2) {
            pnz.e("Failed to get file size for %s", str);
            return 0;
        }
    }

    public final void a(long j) {
        this.a.getSharedPreferences("proxy-apps-corpus", 0).edit().putLong("last-seqno", j).commit();
    }
}
