package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.environment.LevelDbPlatform;
import java.io.File;

/* renamed from: afcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afcp implements awdt {
    private final bapu a;

    public afcp(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        boolean z2;
        boolean z3;
        afco afco;
        afgv afgv;
        afcj afcj = (afcj) this.a.a();
        boolean z4 = true;
        if (!afcj.c.f()) {
            afcx afcx = (afcx) afcj.a.a();
            synchronized (afcx.a) {
                if (!afcx.e) {
                    afcx.e = true;
                    try {
                        afcx.f.getReadableDatabase();
                    } catch (SQLiteException e) {
                        throw new RuntimeException("Failed to open SQLite database", e);
                    }
                }
            }
        }
        synchronized (afcj.e) {
            if (afcj.g == null) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z);
            if (afcj.f) {
                afcj.g = afgv.a(new afdm("LevelDb database in lame duck mode"));
                z2 = false;
            } else {
                File f = afcj.f();
                if (f.mkdirs()) {
                    pia pia = (pia) afcj.b.a();
                    String valueOf = String.valueOf(f.getAbsolutePath());
                    pia.b(valueOf.length() == 0 ? new String("Created dirs for ") : "Created dirs for ".concat(valueOf), new Object[0]);
                }
                File g = afcj.g();
                if (g.exists()) {
                    ((pia) afcj.b.a()).c("Corrupted LevelDb database detected", new Object[0]);
                    try {
                        if (!afcj.c.f()) {
                            afcj.c();
                            if (!g.delete()) {
                                ((pia) afcj.b.a()).e("Failed to clear LevelDb database corruption marker", new Object[0]);
                            }
                        } else {
                            LevelDb.destroy(afcj.f());
                        }
                    } catch (LevelDbException e2) {
                        ((pia) afcj.b.a()).e("Failed to clean corrupted LevelDB database", new Object[0]);
                        afgv = afgv.a(new afdm("Error cleaning corrupted LevelDB database", e2));
                    }
                }
                LevelDb.Options options = new LevelDb.Options();
                if (afcj.c.f()) {
                    options.mDeleteIfCorrupted = false;
                }
                try {
                    LevelDb open = LevelDb.open(f, options);
                    amrl.a((Object) open);
                    afgv = new afgv(open, (Throwable) null);
                } catch (LevelDbException e3) {
                    ((pia) afcj.b.a()).e("Failed to open LevelDB", new Object[0]);
                    afgv = afgv.a(new afdm("Error opening LevelDB", e3));
                }
                afcj.g = afgv;
                z2 = afcj.c.f() && !afcj.g.a() && (((afdm) afcj.g.c()).getCause() instanceof LevelDbException) && (afcj.a(afcj.g.c()) || !LevelDbPlatform.restrictCorruptionMitigation());
            }
        }
        if (z2) {
            afcj.i.a();
        }
        synchronized (afcj.e) {
            if (afcj.g != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            amrl.b(z3, (Object) "open() must be called before createRootFactory()");
            if (afcj.h != null) {
                z4 = false;
            }
            amrl.b(z4, (Object) "only one root factory instance allowed");
            afcj.h = new afco((afco) null, afcj.b, afcj, auay.b, auay.b, new afcv(afcj.b, afcj, afcj.c, afcj.d, afcj.i), afcj.c, afcj.d, afcj.i);
            afco = afcj.h;
        }
        awdx.a((Object) afco, "Cannot return null from a non-@Nullable @Provides method");
        return afco;
    }
}
