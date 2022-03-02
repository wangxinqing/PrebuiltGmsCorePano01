package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: psu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psu {
    public static File a(Context context) {
        File file = new File(ovk.a(context.getFilesDir()), "user_actions");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
