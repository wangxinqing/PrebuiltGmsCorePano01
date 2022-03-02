package defpackage;

import android.util.Log;
import java.io.IOException;

/* renamed from: jif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jif implements Runnable {
    final /* synthetic */ jih a;

    public jif(jih jih) {
        this.a = jih;
    }

    public final void run() {
        try {
            this.a.b();
        } catch (IOException e) {
            Log.w("CachingFileWriter", "Failed to flush cache.", e);
        }
    }
}
