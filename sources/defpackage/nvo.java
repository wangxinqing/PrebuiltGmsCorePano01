package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;
import java.util.List;

/* renamed from: nvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class nvo {
    private final String a;
    private final Context b;
    private LevelDb c;

    public nvo(Context context, String str) {
        this.a = str;
        this.b = context;
    }

    private final amri d(byte[] bArr) {
        if (bArr != null) {
            try {
                return amri.b(c(bArr));
            } catch (auda e) {
                Log.e("GCM", "Could not parse a proto message.", e);
            }
        }
        return ampu.a;
    }

    /* access modifiers changed from: protected */
    public final amri a(byte[] bArr) {
        byte[] bArr2 = null;
        if (bArr != null) {
            try {
                bArr2 = a().get(bArr);
            } catch (LevelDbException e) {
                Log.e("GCM", "Failed to get a proto message.", e);
            }
        }
        return d(bArr2);
    }

    public final List b() {
        return a(nvn.a);
    }

    /* access modifiers changed from: protected */
    public abstract amri c(aucj aucj);

    /* access modifiers changed from: protected */
    public abstract aucj c(byte[] bArr);

    public final void b(aucj aucj) {
        amri c2 = c(aucj);
        if (!c2.a()) {
            Log.e("GCM", "Invalid proto message was provided.");
        } else {
            b((byte[]) c2.b());
        }
    }

    /* JADX INFO: finally extract failed */
    public final amzy a(ivb ivb) {
        try {
            LevelDb.Iterator it = a().iterator();
            if (it == null) {
                return amzy.h();
            }
            amzt amzt = new amzt();
            try {
                it.seekToFirst();
                while (it.isValid()) {
                    amri d = d(it.value());
                    if (d.a() && ivb.a((aucj) d.b())) {
                        amzt.c((aucj) d.b());
                    }
                    it.next();
                }
                it.close();
                return amzt.a();
            } catch (Throwable th) {
                it.close();
                throw th;
            }
        } catch (LevelDbException e) {
            Log.w("GCM", "The iterator is not available.");
            return amzy.h();
        }
    }

    public final void b(byte[] bArr) {
        try {
            a().delete(bArr);
        } catch (LevelDbException e) {
            Log.e("GCM", "Failed to delete a proto message.");
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized LevelDb a() {
        LevelDb levelDb;
        levelDb = this.c;
        if (levelDb == null) {
            levelDb = LevelDb.open(new File(this.b.getFilesDir(), this.a));
            this.c = levelDb;
            if (levelDb == null) {
                throw new LevelDbException("Failed to open db.");
            }
        }
        return levelDb;
    }

    public final boolean a(aucj aucj) {
        amri c2 = c(aucj);
        if (!c2.a()) {
            Log.w("GCM", "Not storing invalid message.");
            return false;
        }
        try {
            a().put((byte[]) c2.b(), aucj.k());
            return true;
        } catch (LevelDbException e) {
            Log.e("GCM", "Failed to addOrUpdate message.", e);
            return false;
        }
    }
}
