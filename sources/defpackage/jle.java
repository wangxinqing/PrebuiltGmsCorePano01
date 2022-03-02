package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* renamed from: jle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jle {
    @Deprecated
    public static void a(Context context, SharedPreferences.Editor editor, String str) {
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.setExecutable(true, false);
        }
        file.setExecutable(true, false);
        editor.commit();
        new File(file, str.concat(".xml")).setReadable(true, false);
    }
}
