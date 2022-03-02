package defpackage;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;

/* renamed from: aatv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aatv {
    protected final String a;
    protected boolean b;

    protected aatv(Context context) {
        this.a = context.getApplicationInfo().dataDir;
    }

    /* access modifiers changed from: protected */
    public final LevelDb a(boolean z, LevelDb levelDb, String str) {
        if (levelDb != null) {
            return levelDb;
        }
        File b2 = b();
        if (!b2.exists()) {
            b2.mkdirs();
        }
        LevelDb.Options options = new LevelDb.Options();
        options.mDeleteIfCorrupted = z;
        try {
            return LevelDb.open(new File(b2, str), options);
        } catch (LevelDbCorruptionException e) {
            this.b = true;
            return null;
        } catch (LevelDbException e2) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final File b() {
        return new File(String.valueOf(this.a).concat("/snet/leveldb"));
    }
}
