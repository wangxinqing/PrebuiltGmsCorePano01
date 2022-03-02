package defpackage;

import com.google.android.gms.leveldb.LevelDb;
import java.io.Closeable;

/* renamed from: qgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgx implements Closeable {
    public final LevelDb.Snapshot a;
    private boolean b = false;

    public qgx(LevelDb.Snapshot snapshot) {
        this.a = snapshot;
    }

    public final synchronized void close() {
        if (!this.b) {
            this.b = true;
            this.a.close();
        }
    }
}
