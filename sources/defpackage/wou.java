package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: wou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wou implements Runnable {
    final /* synthetic */ wow a;

    public wou(wow wow) {
        this.a = wow;
    }

    public final void run() {
        File file;
        synchronized (this.a.a) {
            wph wph = this.a.c;
            if (wph == null || wph.a.d()) {
                wow wow = this.a;
                if (wow.b > 0 && (file = wow.e) != null) {
                    if (!file.exists()) {
                        this.a.e.mkdirs();
                    }
                    long usableSpace = this.a.e.getUsableSpace();
                    wow wow2 = this.a;
                    long j = (long) wow2.b;
                    if (usableSpace > j) {
                        try {
                            wow2.c = new wph(avzy.a(awdj.a, wow2.e, j));
                        } catch (IOException e) {
                            this.a.e = null;
                            Log.e("AvatarCacheImpl", "initDiskCache: Error opening disk cache.", e);
                        }
                    }
                }
            }
            wow wow3 = this.a;
            wow3.d = false;
            wow3.a.notifyAll();
        }
    }
}
