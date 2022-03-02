package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: afcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afcj implements Closeable, afdl, afbz {
    public final awdn a;
    public final awdn b;
    public final aeri c;
    public final awdn d;
    public final Object e = new Object();
    public boolean f;
    public afgv g;
    public afco h;
    public final afca i;
    private final File j;

    public afcj(awdn awdn, File file, awdn awdn2, aeri aeri, awdn awdn3, afca afca) {
        this.a = awdn2;
        this.j = file;
        this.b = awdn;
        this.c = aeri;
        this.d = awdn3;
        this.i = afca;
    }

    static boolean a(Throwable th) {
        while (th != null) {
            if (th instanceof LevelDbCorruptionException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public final void b() {
        RuntimeException runtimeException;
        afgv a2;
        synchronized (this.e) {
            try {
                LevelDb.destroy(f());
                this.f = true;
                if (this.g != null) {
                    a2 = afgv.a(new afdm("LevelDb database in lame duck mode"));
                    this.g = a2;
                }
            } catch (LevelDbException | IllegalStateException e2) {
                try {
                    ((pia) this.b.a()).e("Failed to destroy LevelDb database", new Object[0]);
                    g().createNewFile();
                    afgv afgv = this.g;
                    if (afgv != null) {
                        if (afgv.a()) {
                            try {
                                ((LevelDb) this.g.b()).close();
                            } catch (ExecutionException e3) {
                                runtimeException = new RuntimeException("Unexpected condition", e3);
                                throw runtimeException;
                            }
                        }
                    }
                    this.f = true;
                    if (this.g != null) {
                        a2 = afgv.a(new afdm("LevelDb database in lame duck mode"));
                    }
                } catch (IOException e4) {
                    ((pia) this.b.a()).e("Failed to create LevelDb nuke file.", new Object[0]);
                    throw new afdm("Failed to create LevelDb nuke file.", e4);
                } catch (Throwable th) {
                    this.f = true;
                    if (this.g != null) {
                        this.g = afgv.a(new afdm("LevelDb database in lame duck mode"));
                    }
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void c() {
        boolean z;
        ((pia) this.b.a()).c("Destroying LevelDb database", new Object[0]);
        try {
            synchronized (this.e) {
                if (this.g == null) {
                    z = true;
                } else {
                    z = false;
                }
                amrl.b(z);
                LevelDb.destroy(f());
            }
        } catch (LevelDbException | IllegalStateException e2) {
            ((pia) this.b.a()).e("Failed to destroy LevelDb database", new Object[0]);
            d();
            throw e2;
        }
    }

    public final void close() {
        boolean z;
        synchronized (this.e) {
            boolean z2 = true;
            if (this.g != null) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z);
            if (this.h != null) {
                z2 = false;
            }
            amrl.b(z2);
            if (this.g.a()) {
                try {
                    ((LevelDb) this.g.b()).close();
                } catch (ExecutionException e2) {
                    throw new RuntimeException("Unexpected condition", e2);
                }
            }
            this.g = null;
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void d() {
        try {
            g().createNewFile();
        } catch (IOException e2) {
            ((pia) this.b.a()).e("Failed to mark LevelDb database as corrupted", new Object[0]);
        }
        synchronized (this.e) {
            afgv afgv = this.g;
            if (afgv != null) {
                if (afgv.a()) {
                    try {
                        ((LevelDb) this.g.b()).close();
                    } catch (ExecutionException e3) {
                        throw new RuntimeException("Unexpected condition", e3);
                    }
                }
                this.g = afgv.a(new afdm("Database marked as corrupted"));
            }
        }
    }

    public final LevelDb e() {
        LevelDb levelDb;
        try {
            synchronized (this.e) {
                afgv afgv = this.g;
                if (afgv != null) {
                    levelDb = (LevelDb) afgv.b();
                } else {
                    throw new afdm("Database object is null");
                }
            }
            return levelDb;
        } catch (ExecutionException e2) {
            throw new afdm(e2.getCause().getMessage(), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final File f() {
        return new File(this.j, "level.db");
    }

    /* access modifiers changed from: package-private */
    public final File g() {
        return new File(this.j, "level.db.corrupted");
    }

    @Deprecated
    public final void a() {
        d();
    }

    @Deprecated
    public final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            c();
        } catch (LevelDbException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void a(Exception exc) {
        if (a((Throwable) exc)) {
            d();
        }
    }
}
