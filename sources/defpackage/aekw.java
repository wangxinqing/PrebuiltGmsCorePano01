package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: aekw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aekw {
    private final Context a;
    private final Object b = new Object();
    private File c;

    public aekw(Context context) {
        this.a = context.getApplicationContext();
    }

    public final File a() {
        File file;
        synchronized (this.b) {
            if (this.c == null) {
                if (Build.VERSION.SDK_INT < 24) {
                    this.c = this.a.getDatabasePath("dps-dummy").getParentFile().getParentFile();
                } else {
                    this.c = this.a.getDataDir();
                }
            }
            file = this.c;
        }
        return file;
    }
}
