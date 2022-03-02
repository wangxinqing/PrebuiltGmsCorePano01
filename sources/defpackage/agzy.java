package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;

/* renamed from: agzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzy {
    public static File a(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    public static File b(Context context) {
        return a(context.createDeviceProtectedStorageContext()).getParentFile();
    }
}
