package defpackage;

import android.os.FileObserver;
import android.os.Process;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: bks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bks extends FileObserver {
    public final bkv a;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue(1);
    private final String c;

    public bks(bkv bkv, String str) {
        super(str, 962);
        this.a = bkv;
        this.c = str;
    }

    public final void onEvent(int i, String str) {
        if ("downgrade_from_config.fb".equals(str)) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Downgrade file event: ");
            sb.append(i);
            sb.toString();
            if (new File(this.c, "downgrade_from_config.fb").exists()) {
                stopWatching();
                Process.killProcess(Process.myPid());
            }
        } else if ("current_config.fb".equals(str)) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Config file event: ");
            sb2.append(i);
            sb2.toString();
            if (new File(this.c, "current_config.fb").exists()) {
                this.b.offer(1);
            }
        }
    }
}
