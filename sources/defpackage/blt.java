package defpackage;

import android.os.Build;
import android.system.Os;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: blt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class blt extends blq {
    protected final File a;

    public blt(File file) {
        this.a = file;
    }

    public static boolean a(String str, String str2, bms bms, List list) {
        String b;
        File parentFile;
        if (Build.VERSION.SDK_INT < 23 || (b = bms.b()) == null || !b.startsWith(str) || (parentFile = new File(b).getParentFile()) == null) {
            return false;
        }
        File file = new File(parentFile, str2);
        if (!file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("System image module root not found at ");
            sb.append(valueOf);
            sb.append(". Ignoring.");
            sb.toString();
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
            sb2.append("Failed to list system image files in ");
            sb2.append(valueOf2);
            sb2.append(".");
            sb2.toString();
            return false;
        }
        Arrays.sort(listFiles);
        boolean z = false;
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(".apk")) {
                list.add(new blt(file2));
                z = true;
            }
        }
        if (!z) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
            sb3.append("Empty module directory: ");
            sb3.append(valueOf3);
            Log.w("FileApkMgr", sb3.toString());
        }
        return z;
    }

    public final boolean b() {
        return true;
    }

    public final String a() {
        return this.a.getName();
    }

    public final String a(File file) {
        try {
            Os.symlink(this.a.getAbsolutePath(), file.getAbsolutePath());
            String valueOf = String.valueOf(file.getAbsolutePath());
            if (valueOf.length() == 0) {
                new String("Symlinked to ");
            } else {
                "Symlinked to ".concat(valueOf);
            }
            return blz.a(file);
        } catch (Exception e) {
            if (!(e instanceof RuntimeException)) {
                String valueOf2 = String.valueOf(this.a);
                String valueOf3 = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 22 + String.valueOf(valueOf3).length());
                sb.append("Failed to symlink ");
                sb.append(valueOf2);
                sb.append(" to ");
                sb.append(valueOf3);
                Log.e("FileApkMgr", sb.toString());
                return null;
            }
            throw ((RuntimeException) e);
        }
    }
}
