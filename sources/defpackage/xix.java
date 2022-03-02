package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: xix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xix {
    public static final Uri a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            File a = a(context.getCacheDir(), "avatars", str);
            if (a == null) {
                a = a(context.getFilesDir(), "avatars", str);
            }
            if (a == null && "mounted".equals(Environment.getExternalStorageState())) {
                a = a(Environment.getExternalStorageDirectory(), "avatars", str);
            }
            if (a != null) {
                return ki.a(context, "com.google.android.gms.fileprovider", a);
            }
        }
        return null;
    }

    private static File a(File file, String str, String str2) {
        File file2 = new File(file, str);
        File file3 = new File(file2, str2);
        try {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (file3.exists()) {
                file3.delete();
            }
            file3.createNewFile();
            return file3;
        } catch (IOException e) {
            xdt.a("People.Avatar", "Failed to create file in %s: %s", file2.getAbsolutePath(), e.getMessage());
            return null;
        }
    }
}
