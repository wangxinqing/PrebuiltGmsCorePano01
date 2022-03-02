package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: hsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hsh implements Runnable {
    public static final Runnable a = new hsh();

    private hsh() {
    }

    public final void run() {
        hvk hvk = null;
        try {
            hvk = hvk.c();
            try {
                hvg a2 = hvk.a();
                if (a2 != null) {
                    a2.a(2);
                }
            } catch (SQLiteException | IOException e) {
                e = e;
                try {
                    Log.e("ClearcutBootCompleteIntentOperation", "Could not write internal log event: ", e);
                    jjt.b((Closeable) hvk);
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (SQLiteException | IOException e2) {
            e = e2;
            Log.e("ClearcutBootCompleteIntentOperation", "Could not write internal log event: ", e);
            jjt.b((Closeable) hvk);
        } catch (Throwable th2) {
            th = th2;
            jjt.b((Closeable) hvk);
            throw th;
        }
        jjt.b((Closeable) hvk);
    }
}
