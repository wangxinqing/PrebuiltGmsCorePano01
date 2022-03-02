package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.Closeable;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: ajik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajik implements Closeable {
    public final ajio a;
    public final Context b;
    public final Object c = new Object();
    public LevelDb d;

    public ajik(LevelDb levelDb, ajio ajio, Context context) {
        this.d = levelDb;
        this.a = ajio;
        this.b = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1591322833(0xffffffffa126572f, float:-5.6358374E-19)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 806778686(0x3016773e, float:5.4739135E-10)
            if (r0 == r1) goto L_0x0020
            r1 = 2043376075(0x79cb71cb, float:1.3204303E35)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "Delete"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "Locations"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "Activity"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0040
            if (r4 == r3) goto L_0x003e
            if (r4 == r2) goto L_0x003c
            return r2
        L_0x003c:
            r4 = 4
            return r4
        L_0x003e:
            r4 = 3
            return r4
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajik.a(java.lang.String):int");
    }

    public static final ajjr b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return (ajjr) aucj.a((aucj) ajjr.g, bArr, aubs.c());
        } catch (auda e) {
            ajix.a("GCoreUlr", 41, "Error deserializing datastore entry, item will be skipped", e);
            return null;
        }
    }

    public final void close() {
        synchronized (this.c) {
            try {
                LevelDb levelDb = this.d;
                if (levelDb != null) {
                    levelDb.close();
                }
            } catch (IllegalStateException e) {
                ajix.b("GCoreUlr", "Error closing LevelDb", (Throwable) e);
            }
            this.d = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.d != null) {
            ajix.c("GCoreUlr", 26, "LevelDb instance was not closed.");
            close();
        }
        super.finalize();
    }

    public static LevelDb a(String str, Context context) {
        LevelDb.Options options = new LevelDb.Options();
        options.mUseSnappy = false;
        return LevelDb.open(b(str, context), options);
    }

    public static boolean a(LevelDb.Iterator iterator, Account account) {
        if (iterator.isValid()) {
            return new ajir(iterator.key()).a(account);
        }
        return false;
    }

    static File b(String str, Context context) {
        return context.getDir(str, 0);
    }

    public final void a(ajij ajij, List list, long j, ajjr ajjr, String str) {
        byte[] a2 = a(ajjr, str);
        if (a2 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ajij.a(ajir.a((Account) it.next(), j, ajjr), a2);
            }
        }
    }

    public final void a(ajip ajip) {
        String valueOf = String.valueOf(ajip);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Deleting from datastore: ");
        sb.append(valueOf);
        sb.toString();
        synchronized (this.c) {
            if (this.d != null) {
                ajij ajij = new ajij();
                try {
                    Iterator it = ajip.f.iterator();
                    while (it.hasNext()) {
                        ajij.a.delete((byte[]) it.next());
                        ajij.b++;
                    }
                    a(ajij, "Delete");
                } finally {
                    ajij.a();
                }
            }
        }
    }

    public final void a(Account account) {
        boolean z;
        String valueOf = String.valueOf(rmp.a(account));
        if (valueOf.length() == 0) {
            new String("Removing expired entries for ");
        } else {
            "Removing expired entries for ".concat(valueOf);
        }
        long D = aztb.D() - 7200000;
        if (D > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        a(account, Long.MIN_VALUE, System.currentTimeMillis() - D);
    }

    public final void a(Account account, long j, long j2) {
        synchronized (this.c) {
            if (this.d != null) {
                try {
                    int deleteRange = this.d.deleteRange(ajir.a(account, j2), ajir.b(account, j));
                    String a2 = rmp.a(account);
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 93);
                    sb.append("Deleted ");
                    sb.append(deleteRange);
                    sb.append(" entries from datastore for ");
                    sb.append(a2);
                    sb.append(", ");
                    sb.append(j);
                    sb.append(" to ");
                    sb.append(j2);
                    sb.toString();
                } catch (LevelDbCorruptionException e) {
                    e = e;
                    a(e);
                } catch (IllegalStateException e2) {
                    e = e2;
                    a(e);
                } catch (LevelDbException e3) {
                    ajix.a("GCoreUlr", "Error deleting entries", (Throwable) e3);
                    ajjf.a(e3);
                }
            }
        }
    }

    public final void a(Exception exc) {
        ajix.b("GCoreUlr", "Datastore corrupted, removing and recreating", (Throwable) exc);
        try {
            this.d.close();
            LevelDb.destroy(b("ulr_db_grpc", this.b));
            this.d = a("ulr_db_grpc", this.b);
        } catch (LevelDbException e) {
            ajix.b("GCoreUlr", 5, "datastore corrupted");
            ajjf.a(e);
            this.d = null;
        } catch (IllegalStateException e2) {
            ajix.b("GCoreUlr", 52, "LevelDb");
            ajjf.a(e2);
            this.d = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.ajij r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "UlrProfLeveldbWriteError"
            boolean r1 = defpackage.aztb.t()
            if (r1 == 0) goto L_0x000d
            hpe r1 = defpackage.ajjb.a()
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            r2 = 0
            com.google.android.gms.leveldb.LevelDb r3 = r7.d     // Catch:{ LevelDbCorruptionException -> 0x00a6, IllegalStateException -> 0x00a4, LevelDbException -> 0x006e }
            com.google.android.gms.leveldb.WriteBatch r4 = r8.a     // Catch:{ LevelDbCorruptionException -> 0x00a6, IllegalStateException -> 0x00a4, LevelDbException -> 0x006e }
            r3.write(r4)     // Catch:{ LevelDbCorruptionException -> 0x00a6, IllegalStateException -> 0x00a4, LevelDbException -> 0x006e }
            if (r1 == 0) goto L_0x0021
            java.lang.String r3 = "UlrProfLeveldbWriteSuccess"
            hpg r3 = defpackage.ajjb.b(r3)     // Catch:{ LevelDbCorruptionException -> 0x00a6, IllegalStateException -> 0x00a4, LevelDbException -> 0x006e }
            r1.a(r3)     // Catch:{ LevelDbCorruptionException -> 0x00a6, IllegalStateException -> 0x00a4, LevelDbException -> 0x006e }
        L_0x0021:
            int r3 = r9.hashCode()
            r4 = -1591322833(0xffffffffa126572f, float:-5.6358374E-19)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L_0x004b
            r4 = 806778686(0x3016773e, float:5.4739135E-10)
            if (r3 == r4) goto L_0x0041
            r4 = 2043376075(0x79cb71cb, float:1.3204303E35)
            if (r3 == r4) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            java.lang.String r3 = "Delete"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0055
            r3 = 0
            goto L_0x0056
        L_0x0041:
            java.lang.String r3 = "Locations"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0055
            r3 = 1
            goto L_0x0056
        L_0x004b:
            java.lang.String r3 = "Activity"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0055
            r3 = 2
            goto L_0x0056
        L_0x0055:
            r3 = -1
        L_0x0056:
            if (r3 == 0) goto L_0x0065
            if (r3 == r6) goto L_0x0062
            if (r3 == r5) goto L_0x005f
            java.lang.String r3 = "UlrSavedMetadata"
            goto L_0x0067
        L_0x005f:
            java.lang.String r3 = "UlrSavedActivity"
            goto L_0x0067
        L_0x0062:
            java.lang.String r3 = "UlrSavedLocation"
            goto L_0x0067
        L_0x0065:
            java.lang.String r3 = "UlrEntitiesDeleted"
        L_0x0067:
            int r8 = r8.b     // Catch:{ LevelDbCorruptionException -> 0x00a6, IllegalStateException -> 0x00a4, LevelDbException -> 0x006e }
            long r4 = (long) r8     // Catch:{ LevelDbCorruptionException -> 0x00a6, IllegalStateException -> 0x00a4, LevelDbException -> 0x006e }
            defpackage.ajjb.a((java.lang.String) r3, (long) r4)     // Catch:{ LevelDbCorruptionException -> 0x00a6, IllegalStateException -> 0x00a4, LevelDbException -> 0x006e }
            return r6
        L_0x006e:
            r8 = move-exception
            if (r1 != 0) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            hpg r0 = defpackage.ajjb.b(r0)
            r1.a(r0)
        L_0x007a:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 43
            r1.<init>(r0)
            java.lang.String r0 = "Error saving writebatch for '"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "' to datastore"
            r1.append(r0)
            int r9 = a((java.lang.String) r9)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "GCoreUlr"
            defpackage.ajix.a(r1, r9, r0, r8)
            return r2
        L_0x00a4:
            r8 = move-exception
            goto L_0x00a7
        L_0x00a6:
            r8 = move-exception
        L_0x00a7:
            r7.a((java.lang.Exception) r8)
            if (r1 == 0) goto L_0x00b3
            hpg r8 = defpackage.ajjb.b(r0)
            r1.a(r8)
        L_0x00b3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajik.a(ajij, java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean a(List list, atco atco, String str) {
        synchronized (this.c) {
            if (this.d == null) {
                return false;
            }
            ajij ajij = new ajij();
            try {
                aucd o = ajjr.g.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ajjr ajjr = (ajjr) o.b;
                atco.getClass();
                ajjr.d = atco;
                ajjr.a |= 4;
                a(ajij, list, atco.b, (ajjr) o.i(), str);
                boolean a2 = a(ajij, str);
                return a2;
            } finally {
                ajij.a();
            }
        }
    }

    public final byte[] a(ajjr ajjr, String str) {
        try {
            return this.a.a(ajjr.k());
        } catch (GeneralSecurityException e) {
            int a2 = a(str);
            String valueOf = String.valueOf(str);
            ajix.a("GCoreUlr", a2, valueOf.length() == 0 ? new String("Error encrypting datastore entry for ") : "Error encrypting datastore entry for ".concat(valueOf), e);
            return null;
        }
    }

    public final byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return this.a.b(bArr);
        } catch (GeneralSecurityException e) {
            ajix.a("GCoreUlr", 41, "Error decrypting datastore entry, item will be skipped", e);
            return null;
        }
    }
}
