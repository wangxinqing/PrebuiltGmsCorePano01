package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: hvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hvw implements Runnable {
    public static final Runnable a = new hvw();

    private hvw() {
    }

    public final void run() {
        hvk hvk = null;
        try {
            hvk = hvk.c();
            try {
                hvg a2 = hvk.a();
                if (a2 != null) {
                    a2.a(1);
                }
            } catch (SQLiteException | IOException e) {
                e = e;
                try {
                    Log.e("WallClockChangedIntentOperation", "Could not write internal log event.", e);
                    jjt.b((Closeable) hvk);
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (SQLiteException | IOException e2) {
            e = e2;
            Log.e("WallClockChangedIntentOperation", "Could not write internal log event.", e);
            jjt.b((Closeable) hvk);
        } catch (Throwable th2) {
            th = th2;
            jjt.b((Closeable) hvk);
            throw th;
        }
        jjt.b((Closeable) hvk);
    }
}
