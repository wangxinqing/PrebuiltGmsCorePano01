package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: lkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkb {
    public static final File a(Context context) {
        File file = new File(context.getDatabasePath("ignored").getParentFile(), "realtime");
        if (!file.exists()) {
            iva.a(file.mkdirs(), (Object) "Unable to create Realtime database directory.");
        }
        return file;
    }
}
