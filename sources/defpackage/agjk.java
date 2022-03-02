package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: agjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agjk {
    public static final anhq a = anhq.a("agjk");

    public static long a(File[] fileArr) {
        long j = 0;
        try {
            int length = fileArr.length;
            int i = 0;
            while (i < length) {
                try {
                    File file = fileArr[i];
                    if (!a(file)) {
                        if (file.isFile()) {
                            j += file.length();
                        } else if (!file.isDirectory()) {
                            ((anhn) ((anhn) a.c()).a("agjk", "a", 41, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("not a link / dir / regular file: %s", (Object) file);
                        } else {
                            j += a(file.listFiles());
                        }
                    }
                    i++;
                } catch (IOException | SecurityException e) {
                    e = e;
                    anhn anhn = (anhn) a.c();
                    anhn.a(e);
                    ((anhn) anhn.a("agjk", "a", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("failure computing subtree size");
                    return j;
                }
            }
        } catch (IOException | SecurityException e2) {
            e = e2;
            anhn anhn2 = (anhn) a.c();
            anhn2.a(e);
            ((anhn) anhn2.a("agjk", "a", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("failure computing subtree size");
            return j;
        }
        return j;
    }

    public static amzy a(Context context, int i, amzy amzy) {
        File file;
        agzj.c();
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).dataDir);
        } catch (PackageManager.NameNotFoundException e) {
            try {
                ((anhn) ((anhn) a.c()).a("agjk", "a", 193, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to use package manager getting data directory from context instead.");
                File filesDir = context.getFilesDir();
                if (filesDir != null) {
                    file = filesDir.getParentFile();
                } else {
                    file = null;
                }
            } catch (Exception e2) {
                anhn anhn = (anhn) a.c();
                anhn.a((Throwable) e2);
                ((anhn) anhn.a("agjk", "a", 205, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve DirStats.");
                return amzy.h();
            }
        }
        if (file == null) {
            return amzy.h();
        }
        a(file, arrayList, i, amzy);
        return amzy.a((Collection) arrayList);
    }

    public static void a(File file, List list, int i, amzy amzy) {
        agjj agjj = new agjj(file, list, i, amzy);
        agjj.a(new agji(agjj));
    }

    static boolean a(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Files.isSymbolicLink(file.toPath());
        }
        try {
            File file2 = new File(file.getParentFile().getCanonicalFile(), file.getName());
            if (!file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
                return true;
            }
            return false;
        } catch (IOException e) {
            anhn anhn = (anhn) a.c();
            anhn.a((Throwable) e);
            ((anhn) anhn.a("agjk", "a", 71, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not check symlink for file: %s, assuming symlink.", (Object) file);
            return true;
        }
    }
}
