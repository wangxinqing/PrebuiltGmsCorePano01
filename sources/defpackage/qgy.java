package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgy {
    private long A = 0;
    private final List B = new ArrayList();
    private final Context a;
    private final qew b;
    private final qew c;
    private final qew d;
    private final qew e;
    private final qew f;
    private final qew g;
    private final qew h;
    private final qew i;
    private final qew j;
    private final qew k;
    private final qew l;
    private final qew m;
    private final qew n;
    private final qew o;
    private final qew p;
    private final qew q;
    private final qew r;
    private final qew s;
    private final qew t;
    private final qew u;
    private final qew v;
    private final qew w;
    private final File x;
    private final qfn y;
    private LevelDb z;

    private qgy(Context context, qex qex, String str, LevelDb levelDb, File file, qfn qfn) {
        this.a = context;
        this.b = qex.b(String.valueOf(str).concat(".InitializedWhenNullSuccess"));
        this.c = qex.b(String.valueOf(str).concat(".InitializedWhenNullFail"));
        this.d = qex.b(String.valueOf(str).concat(".InitializedWhenNullThrottle"));
        this.e = qex.b(String.valueOf(str).concat(".GetCorruptionReset"));
        this.f = qex.b(String.valueOf(str).concat(".PutCorruptionReset"));
        this.g = qex.b(String.valueOf(str).concat(".DeleteCorruptionReset"));
        this.h = qex.b(String.valueOf(str).concat(".WriteBatchCorruptionReset"));
        this.i = qex.b(String.valueOf(str).concat(".WipeAllCorruptionReset"));
        this.j = qex.b(String.valueOf(str).concat(".GetCorruptionUnhandled"));
        this.k = qex.b(String.valueOf(str).concat(".PutCorruptionUnhandled"));
        this.l = qex.b(String.valueOf(str).concat(".DeleteCorruptionUnhandled"));
        this.m = qex.b(String.valueOf(str).concat(".WriteBatchCorruptionUnhandled"));
        this.n = qex.b(String.valueOf(str).concat(".GetGenericLevelDbException"));
        this.o = qex.b(String.valueOf(str).concat(".PutGenericLevelDbException"));
        this.p = qex.b(String.valueOf(str).concat(".DeleteGenericLevelDbException"));
        this.q = qex.b(String.valueOf(str).concat(".WriteBatchGenericLevelDbException"));
        this.r = qex.b(String.valueOf(str).concat(".WipeAllGenericLevelDbException"));
        this.s = qex.b(String.valueOf(str).concat(".CorruptedDbClosed"));
        this.t = qex.b(String.valueOf(str).concat(".CorruptedDbDeleted"));
        this.u = qex.b(String.valueOf(str).concat(".CorruptedDbDeleteFailed"));
        this.v = qex.b(String.valueOf(str).concat(".CorruptedDbRecreateSuccess"));
        this.w = qex.b(String.valueOf(str).concat(".CorruptedDbRecreateFailed"));
        this.z = levelDb;
        this.x = file;
        this.y = qfn;
        if (levelDb != null) {
            this.A = SystemClock.uptimeMillis();
        }
    }

    private static LevelDb a(Context context, File file, qfn qfn) {
        try {
            return LevelDb.open(file);
        } catch (LevelDbException e2) {
            qfp.a(context, String.format("Unable to open LevelDb: %s", new Object[]{file}), e2, qfn);
            return null;
        }
    }

    private final synchronized boolean e() {
        LevelDb a2;
        this.y.a("Reloading level DB", new Object[0]);
        amrl.b(this.z == null);
        this.A = SystemClock.uptimeMillis();
        a2 = a(this.a, this.x, this.y);
        this.z = a2;
        return a2 != null;
    }

    private final synchronized void f() {
        if (this.z == null) {
            throw new IllegalStateException("LevelDb was null");
        }
    }

    public final synchronized qgx b() {
        qgx qgx;
        f();
        qgx = new qgx(this.z.getSnapshot());
        this.B.add(new WeakReference(qgx));
        return qgx;
    }

    public final synchronized qgw c() {
        return a((qgx) null);
    }

    public final synchronized void d() {
        f();
        try {
            this.z.deleteRange((byte[]) null, (byte[]) null);
        } catch (LevelDbCorruptionException e2) {
            if (axvb.a.a().d()) {
                this.i.a();
                a((Exception) e2);
            }
        } catch (LevelDbException e3) {
            this.y.a(e3, "Failure deleteRange from LevelDb", new Object[0]);
            this.r.a();
            throw new IOException(e3);
        }
    }

    public final synchronized byte[] c(byte[] bArr) {
        f();
        try {
        } catch (LevelDbCorruptionException e2) {
            if (axvb.a.a().b()) {
                this.e.a();
                a((Exception) e2);
                throw new IOException("Corrupted data store on get");
            }
            this.j.a();
            throw e2;
        } catch (LevelDbException e3) {
            this.y.a(e3, "Failure getting from LevelDb", new Object[0]);
            this.n.a();
            throw new IOException(e3);
        }
        return this.z.get((LevelDb.Snapshot) null, bArr);
    }

    public static qgy a(Context context, String str, File file) {
        String str2 = str.length() == 0 ? new String("DataStore") : "DataStore".concat(str);
        qfn qfn = new qfn(str2);
        return new qgy(context, new qex(context), str2, a(context, file, qfn), file, qfn);
    }

    public final synchronized void b(byte[] bArr) {
        f();
        try {
            this.z.delete(bArr);
        } catch (LevelDbCorruptionException e2) {
            if (axvb.a.a().a()) {
                this.g.a();
                a((Exception) e2);
                throw new IOException("Corrupted data store on delete");
            }
            this.l.a();
            throw e2;
        } catch (LevelDbException e3) {
            this.y.a(e3, "Failure deleting from LevelDb", new Object[0]);
            this.p.a();
            throw new IOException(e3);
        }
    }

    public final synchronized qgw a(qgx qgx) {
        LevelDb.Snapshot snapshot;
        qgw qgw;
        f();
        if (qgx != null) {
            snapshot = qgx.a;
        } else {
            snapshot = null;
        }
        qgw = new qgw(this.z.iterator(snapshot));
        this.B.add(new WeakReference(qgw));
        return qgw;
    }

    public final synchronized void a(WriteBatch writeBatch) {
        f();
        try {
            this.z.write(writeBatch);
        } catch (LevelDbCorruptionException e2) {
            if (axvb.a.a().e()) {
                this.h.a();
                a((Exception) e2);
                throw new IOException("Corrupted data store on writeBatch");
            }
            this.m.a();
            throw e2;
        } catch (LevelDbException e3) {
            this.y.a(e3, "Failure writing batch to LevelDb", new Object[0]);
            this.q.a();
            throw new IOException(e3);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Exception exc) {
        this.y.a(exc, "Datastore corrupted, removing and recreating", new Object[0]);
        try {
            for (int size = this.B.size() - 1; size >= 0; size--) {
                jjt.a((Closeable) ((WeakReference) this.B.remove(size)).get());
            }
            LevelDb levelDb = this.z;
            if (levelDb != null) {
                levelDb.close();
                this.s.a();
            }
            LevelDb.destroy(this.x);
            this.t.a();
        } catch (LevelDbException e2) {
            this.u.a();
            qfp.a(this.a, String.format("Unable to recreate corrupted LevelDb: %s", new Object[]{this.x}), e2, this.y);
            this.z = null;
        }
        LevelDb a2 = a(this.a, this.x, this.y);
        this.z = a2;
        if (a2 != null) {
            this.v.a();
        } else {
            this.w.a();
        }
    }

    public final synchronized void a(byte[] bArr, byte[] bArr2) {
        f();
        try {
            this.z.put(bArr, bArr2);
        } catch (LevelDbCorruptionException e2) {
            if (axvb.a.a().c()) {
                this.f.a();
                a((Exception) e2);
                throw new IOException("Corrupted data store on put");
            }
            this.k.a();
            throw e2;
        } catch (LevelDbException e3) {
            this.y.a(e3, "Failure writing to LevelDb", new Object[0]);
            this.o.a();
            throw new IOException(e3);
        }
    }

    public final synchronized boolean a() {
        if (this.z != null) {
            return true;
        }
        long f2 = axvb.a.a().f();
        if (f2 >= 0) {
            if (SystemClock.uptimeMillis() - this.A >= f2) {
                if (e()) {
                    this.b.a();
                    return true;
                }
                this.c.a();
                return false;
            }
        }
        this.d.a();
        return false;
    }

    public final synchronized byte[] a(byte[] bArr) {
        return c(bArr);
    }
}
