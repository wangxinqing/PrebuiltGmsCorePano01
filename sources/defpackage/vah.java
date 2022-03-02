package defpackage;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: vah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vah {
    public final uyt a;
    public final uys b = new vaf(this);
    public boolean c = false;
    private LevelDb d;
    private final Context e;
    private final ClientAppIdentifier f;
    private final jiq g;
    private final vav h;

    public vah(Context context, ClientAppIdentifier clientAppIdentifier) {
        this.e = context;
        this.f = clientAppIdentifier;
        this.g = (jiq) thl.a(context, jiq.class);
        this.h = (vav) thl.a(context, vav.class);
        uyt uyt = (uyt) thl.a(context, uyt.class);
        this.a = uyt;
        uyt.a(this.b);
        if (clientAppIdentifier != null) {
            a();
        }
    }

    private static aqcr a(Object obj) {
        return new aqcr(obj);
    }

    private final void c(vag vag) {
        if (c()) {
            try {
                this.d.delete(vag.a());
            } catch (LevelDbCorruptionException e2) {
                anih anih = (anih) tgc.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("vah", "c", 539, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Database failed during delete for beacon %s because of %s, %s", "BeaconMessageCache:", vag, a((Object) LevelDbCorruptionException.class.getSimpleName()), a((Object) e2.toString()));
                b();
                f();
            } catch (LevelDbException e3) {
                anih anih2 = (anih) tgc.a.b();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("vah", "c", 548, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Database failed during delete for beacon %s because of %s, %s", "BeaconMessageCache:", vag, a((Object) LevelDbException.class.getSimpleName()), a((Object) e3.toString()));
            }
        }
    }

    private final File d() {
        File cacheDir = this.e.getCacheDir();
        ClientAppIdentifier clientAppIdentifier = this.f;
        String clientAppIdentifier2 = clientAppIdentifier != null ? clientAppIdentifier.toString() : "global";
        StringBuilder sb = new StringBuilder(String.valueOf(clientAppIdentifier2).length() + 24);
        sb.append(clientAppIdentifier2);
        sb.append("_beacon_message_cache.db");
        return new File(cacheDir, sb.toString());
    }

    private final LevelDb e() {
        jjg jjg = tgc.a;
        try {
            return LevelDb.open(d());
        } catch (LevelDbCorruptionException e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("vah", "e", 129, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to open LevelDb because of %s, %s", (Object) "BeaconMessageCache:", (Object) a((Object) LevelDbCorruptionException.class.getSimpleName()), (Object) a((Object) e2.toString()));
            f();
            return null;
        } catch (LevelDbException e3) {
            anih anih2 = (anih) tgc.a.b();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("vah", "e", 136, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to open LevelDb because of %s, %s", (Object) "BeaconMessageCache:", (Object) a((Object) LevelDbException.class.getSimpleName()), (Object) a((Object) e3.toString()));
            return null;
        } catch (UnsatisfiedLinkError e4) {
            anih anih3 = (anih) tgc.a.b();
            anih3.a((Throwable) e4);
            ((anih) anih3.a("vah", "e", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s LevelDb wasn't able to use native methods", (Object) "BeaconMessageCache:");
            return null;
        }
    }

    private final void f() {
        try {
            LevelDb.destroy(d());
        } catch (LevelDbException e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("vah", "f", 151, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to destroy the database because of %s, %s", (Object) a((Object) LevelDbException.class.getSimpleName()), (Object) a((Object) e2.toString()));
        }
    }

    public final Set b(vag vag) {
        aiss a2 = a(vag);
        if (a2 != null) {
            return jir.a((Object[]) (avae[]) a2.c.toArray(new avae[0]));
        }
        return null;
    }

    public static void a(WriteBatch writeBatch, vag vag, aiss aiss) {
        writeBatch.put(vag.a(), aiss.k());
    }

    public final void b() {
        LevelDb levelDb = this.d;
        if (levelDb != null) {
            levelDb.close();
            this.d = null;
        }
    }

    private final void a(WriteBatch writeBatch, vag vag, Collection collection, boolean z) {
        auze auze;
        aiss a2 = a(vag);
        aiss a3 = a(collection);
        aucd aucd = (aucd) a3.c(5);
        aucd.a((aucj) a3);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aiss aiss = (aiss) aucd.b;
        aiss aiss2 = aiss.f;
        aiss.a |= 4;
        aiss.e = z;
        if (a2 != null) {
            auze = a2.d;
            if (auze == null) {
                auze = auze.d;
            }
        } else {
            auze = null;
        }
        if (auze == null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aiss aiss3 = (aiss) aucd.b;
            aiss3.d = null;
            aiss3.a &= -3;
        } else {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aiss aiss4 = (aiss) aucd.b;
            auze.getClass();
            aiss4.d = auze;
            aiss4.a |= 2;
        }
        a(writeBatch, vag, (aiss) aucd.i());
    }

    public final boolean c() {
        if (aync.a.a().f() && !this.c) {
            if (this.d == null) {
                this.d = e();
            }
            if (this.d != null) {
                return true;
            }
        }
        return false;
    }

    public final aiss a(Collection collection) {
        aucd o = aiss.f.o();
        long a2 = this.g.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aiss aiss = (aiss) o.b;
        aiss.a |= 1;
        aiss.b = a2;
        if (!aiss.c.a()) {
            aiss.c = aucj.a(aiss.c);
        }
        auab.a((Iterable) collection, (List) aiss.c);
        return (aiss) o.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ca, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
        r5 = (defpackage.anih) defpackage.tgc.a.b();
        r5.a((java.lang.Throwable) r3);
        ((defpackage.anih) r5.a("vah", "a", 493, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to parse the db result for beacon %s because of %s, %s", "BeaconMessageCache:", r13, a((java.lang.Object) defpackage.augd.class.getSimpleName()), a((java.lang.Object) r3.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fa, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fb, code lost:
        r5 = (defpackage.anih) defpackage.tgc.a.b();
        r5.a((java.lang.Throwable) r3);
        ((defpackage.anih) r5.a("vah", "a", 486, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Database failed during get for beacon %s because of %s, %s", "BeaconMessageCache:", r13, a((java.lang.Object) com.google.android.gms.leveldb.LevelDbException.class.getSimpleName()), a((java.lang.Object) r3.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x012a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x012b, code lost:
        r5 = (defpackage.anih) defpackage.tgc.a.b();
        r5.a((java.lang.Throwable) r3);
        ((defpackage.anih) r5.a("vah", "a", 477, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Database failed during get for beacon %s because of %s, %s", "BeaconMessageCache:", r13, a((java.lang.Object) com.google.android.gms.leveldb.LevelDbCorruptionException.class.getSimpleName()), a((java.lang.Object) r3.toString()));
        b();
        f();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ca A[ExcHandler: auda (r3v3 'e' auda A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aiss a(defpackage.vag r13) {
        /*
            r12 = this;
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r1 = "vah"
            java.lang.String r2 = "a"
            boolean r3 = r12.c()
            r4 = 0
            if (r3 == 0) goto L_0x015f
            byte[] r3 = r13.a()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            com.google.android.gms.leveldb.LevelDb r5 = r12.d     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            byte[] r3 = r5.get(r3)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            if (r3 == 0) goto L_0x015f
            aubs r5 = defpackage.aubs.c()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            aiss r6 = defpackage.aiss.f     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            aucj r3 = defpackage.aucj.a((defpackage.aucj) r6, (byte[]) r3, (defpackage.aubs) r5)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            aiss r3 = (defpackage.aiss) r3     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            boolean r5 = r3.e     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            if (r5 == 0) goto L_0x0035
            aync r5 = defpackage.aync.a     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            aynd r5 = r5.a()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            boolean r5 = r5.K()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            if (r5 != 0) goto L_0x00c9
        L_0x0035:
            long r5 = r3.b     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            vav r8 = r12.h     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            auyn r8 = r8.m()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            int r8 = r8.i     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            long r8 = (long) r8     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            long r7 = r7.toMillis(r8)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            long r5 = r5 + r7
            jiq r7 = r12.g     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            long r7 = r7.a()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x00c9
            java.lang.String r3 = "c"
            boolean r5 = r12.c()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            if (r5 == 0) goto L_0x00c8
            byte[] r5 = r13.a()     // Catch:{ LevelDbCorruptionException -> 0x0093, LevelDbException -> 0x0063, auda -> 0x00ca }
            com.google.android.gms.leveldb.LevelDb r6 = r12.d     // Catch:{ LevelDbCorruptionException -> 0x0093, LevelDbException -> 0x0063, auda -> 0x00ca }
            r6.delete(r5)     // Catch:{ LevelDbCorruptionException -> 0x0093, LevelDbException -> 0x0063, auda -> 0x00ca }
            goto L_0x00c8
        L_0x0063:
            r5 = move-exception
            jjg r6 = defpackage.tgc.a     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            anie r6 = r6.b()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            anih r6 = (defpackage.anih) r6     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r6.a((java.lang.Throwable) r5)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r7 = 548(0x224, float:7.68E-43)
            anie r3 = r6.a((java.lang.String) r1, (java.lang.String) r3, (int) r7, (java.lang.String) r0)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r6 = r3
            anih r6 = (defpackage.anih) r6     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            java.lang.String r7 = "%s Database failed during delete for beacon %s because of %s, %s"
            java.lang.String r8 = "BeaconMessageCache:"
            java.lang.Class<com.google.android.gms.leveldb.LevelDbException> r3 = com.google.android.gms.leveldb.LevelDbException.class
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            aqcr r10 = a((java.lang.Object) r3)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            java.lang.String r3 = r5.toString()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            aqcr r11 = a((java.lang.Object) r3)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r9 = r13
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            goto L_0x00c8
        L_0x0093:
            r5 = move-exception
            jjg r6 = defpackage.tgc.a     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            anie r6 = r6.b()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            anih r6 = (defpackage.anih) r6     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r6.a((java.lang.Throwable) r5)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r7 = 539(0x21b, float:7.55E-43)
            anie r3 = r6.a((java.lang.String) r1, (java.lang.String) r3, (int) r7, (java.lang.String) r0)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r6 = r3
            anih r6 = (defpackage.anih) r6     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            java.lang.String r7 = "%s Database failed during delete for beacon %s because of %s, %s"
            java.lang.String r8 = "BeaconMessageCache:"
            java.lang.Class<com.google.android.gms.leveldb.LevelDbCorruptionException> r3 = com.google.android.gms.leveldb.LevelDbCorruptionException.class
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            aqcr r10 = a((java.lang.Object) r3)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            java.lang.String r3 = r5.toString()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            aqcr r11 = a((java.lang.Object) r3)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r9 = r13
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r12.b()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
            r12.f()     // Catch:{ LevelDbCorruptionException -> 0x012a, LevelDbException -> 0x00fa, auda -> 0x00ca }
        L_0x00c8:
            return r4
        L_0x00c9:
            return r3
        L_0x00ca:
            r3 = move-exception
            jjg r5 = defpackage.tgc.a
            anie r5 = r5.b()
            anih r5 = (defpackage.anih) r5
            r5.a((java.lang.Throwable) r3)
            r6 = 493(0x1ed, float:6.91E-43)
            anie r0 = r5.a((java.lang.String) r1, (java.lang.String) r2, (int) r6, (java.lang.String) r0)
            r5 = r0
            anih r5 = (defpackage.anih) r5
            java.lang.Class<augd> r0 = defpackage.augd.class
            java.lang.String r0 = r0.getSimpleName()
            aqcr r9 = a((java.lang.Object) r0)
            java.lang.String r0 = r3.toString()
            aqcr r10 = a((java.lang.Object) r0)
            java.lang.String r6 = "%s Unable to parse the db result for beacon %s because of %s, %s"
            java.lang.String r7 = "BeaconMessageCache:"
            r8 = r13
            r5.a(r6, r7, r8, r9, r10)
            goto L_0x015f
        L_0x00fa:
            r3 = move-exception
            jjg r5 = defpackage.tgc.a
            anie r5 = r5.b()
            anih r5 = (defpackage.anih) r5
            r5.a((java.lang.Throwable) r3)
            r6 = 486(0x1e6, float:6.81E-43)
            anie r0 = r5.a((java.lang.String) r1, (java.lang.String) r2, (int) r6, (java.lang.String) r0)
            r5 = r0
            anih r5 = (defpackage.anih) r5
            java.lang.Class<com.google.android.gms.leveldb.LevelDbException> r0 = com.google.android.gms.leveldb.LevelDbException.class
            java.lang.String r0 = r0.getSimpleName()
            aqcr r9 = a((java.lang.Object) r0)
            java.lang.String r0 = r3.toString()
            aqcr r10 = a((java.lang.Object) r0)
            java.lang.String r6 = "%s Database failed during get for beacon %s because of %s, %s"
            java.lang.String r7 = "BeaconMessageCache:"
            r8 = r13
            r5.a(r6, r7, r8, r9, r10)
            goto L_0x015f
        L_0x012a:
            r3 = move-exception
            jjg r5 = defpackage.tgc.a
            anie r5 = r5.b()
            anih r5 = (defpackage.anih) r5
            r5.a((java.lang.Throwable) r3)
            r6 = 477(0x1dd, float:6.68E-43)
            anie r0 = r5.a((java.lang.String) r1, (java.lang.String) r2, (int) r6, (java.lang.String) r0)
            r5 = r0
            anih r5 = (defpackage.anih) r5
            java.lang.Class<com.google.android.gms.leveldb.LevelDbCorruptionException> r0 = com.google.android.gms.leveldb.LevelDbCorruptionException.class
            java.lang.String r0 = r0.getSimpleName()
            aqcr r9 = a((java.lang.Object) r0)
            java.lang.String r0 = r3.toString()
            aqcr r10 = a((java.lang.Object) r0)
            java.lang.String r6 = "%s Database failed during get for beacon %s because of %s, %s"
            java.lang.String r7 = "BeaconMessageCache:"
            r8 = r13
            r5.a(r6, r7, r8, r9, r10)
            r12.b()
            r12.f()
        L_0x015f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vah.a(vag):aiss");
    }

    public final void a() {
        if (c()) {
            jjg jjg = tgc.a;
            b();
            f();
        }
    }

    public final void a(WriteBatch writeBatch) {
        if (c()) {
            try {
                this.d.write(writeBatch);
            } catch (LevelDbCorruptionException e2) {
                anih anih = (anih) tgc.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("vah", "a", 511, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Database failed during WriteBatch because of %s, %s", (Object) "BeaconMessageCache:", (Object) a((Object) LevelDbCorruptionException.class.getSimpleName()), (Object) a((Object) e2.toString()));
                b();
                f();
            } catch (LevelDbException e3) {
                anih anih2 = (anih) tgc.a.b();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("vah", "a", 519, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Database failed during WriteBatch because of %s, %s", (Object) "BeaconMessageCache:", (Object) a((Object) LevelDbException.class.getSimpleName()), (Object) a((Object) e3.toString()));
            } catch (Throwable th) {
                writeBatch.close();
                throw th;
            }
            writeBatch.close();
        }
    }

    public final void a(Set<vag> set, boolean z) {
        if (c()) {
            if (!z) {
                HashSet hashSet = new HashSet(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    vag vag = (vag) it.next();
                    if (b(vag) == null) {
                        hashSet.add(vag);
                    }
                }
                set = hashSet;
            }
            jjg jjg = tgc.a;
            set.size();
            WriteBatch create = WriteBatch.create();
            for (vag a2 : set) {
                a(create, a2, anfv.a, false);
            }
            a(create);
        }
    }

    public final void a(avae[] avaeArr, boolean z) {
        if (c()) {
            amzg q = amzg.q();
            for (avae avae : avaeArr) {
                aucx aucx = avae.d;
                int size = aucx.size();
                for (int i = 0; i < size; i++) {
                    q.a((Object) new vag((auzf) aucx.get(i)), (Object) avae);
                }
                aucx aucx2 = avae.e;
                int size2 = aucx2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    q.a((Object) new vag((String) aucx2.get(i2)), (Object) avae);
                }
            }
            for (vag vag : q.m()) {
                HashMap hashMap = new HashMap();
                Set<avae> b2 = b(vag);
                if (b2 != null) {
                    for (avae avae2 : b2) {
                        auzr auzr = avae2.c;
                        if (auzr == null) {
                            auzr = auzr.e;
                        }
                        hashMap.put(auzr, avae2);
                    }
                }
                for (avae avae3 : q.c((Object) vag)) {
                    auzr auzr2 = avae3.c;
                    if (auzr2 == null) {
                        auzr2 = auzr.e;
                    }
                    hashMap.put(auzr2, avae3);
                }
                q.b(vag, hashMap.values());
            }
            jjg jjg = tgc.a;
            q.m().size();
            int length = avaeArr.length;
            q.m();
            WriteBatch create = WriteBatch.create();
            for (vag vag2 : q.m()) {
                a(create, vag2, q.c((Object) vag2), z);
            }
            a(create);
        }
    }
}
