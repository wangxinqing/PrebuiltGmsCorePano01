package defpackage;

import android.util.Log;
import java.io.File;

/* renamed from: ofo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ofo implements Runnable {
    final /* synthetic */ ofp a;

    public ofo(ofp ofp) {
        this.a = ofp;
    }

    public final void run() {
        File[] listFiles;
        ofp ofp = this.a;
        try {
            long nanoTime = System.nanoTime();
            File[] listFiles2 = ofp.a.getDir("gH_async_psd", 0).listFiles();
            if (listFiles2 != null) {
                ofp.a(listFiles2, nanoTime);
            }
            File file = new File(ofp.a.getFilesDir(), "gH_async_psd");
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                ofp.a(listFiles, nanoTime);
            }
        } catch (RuntimeException e) {
            Log.w("gH_AsyncPsdFileRemover", "Failed to delete old async psd files.");
        }
    }
}
