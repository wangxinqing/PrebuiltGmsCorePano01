package defpackage;

import android.net.Uri;
import android.os.Build;
import android.system.Os;
import android.system.StructStat;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: ahfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahfy {
    public static IOException a(agzs agzs, Uri uri, IOException iOException) {
        try {
            ahch a = ahch.a();
            a.b();
            File file = (File) agzs.a(uri, a, new agzk[0]);
            if (!file.exists()) {
                return new IOException(iOException);
            }
            if (!file.isFile()) {
                return new IOException(iOException);
            }
            if (!file.canRead()) {
                return new IOException(iOException);
            }
            return a(file, iOException);
        } catch (IOException e) {
            return iOException;
        }
    }

    public static IOException b(agzs agzs, Uri uri, IOException iOException) {
        try {
            ahch a = ahch.a();
            a.b();
            File file = (File) agzs.a(uri, a, new agzk[0]);
            if (file.exists() && !file.isFile()) {
                return new IOException(iOException);
            }
            if (!file.exists() || file.canWrite()) {
                return a(file, iOException);
            }
            return new IOException(iOException);
        } catch (IOException e) {
            return iOException;
        }
    }

    private static IOException a(File file, IOException iOException) {
        try {
            String valueOf = String.valueOf(String.format(Locale.US, " canonical[%s] freeSpace[%d] exists[%b] isFile[%b] canRead[%b] canWrite[%b]", new Object[]{file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), Boolean.valueOf(file.exists()), Boolean.valueOf(file.isFile()), Boolean.valueOf(file.canRead()), Boolean.valueOf(file.canWrite())}));
            String str = valueOf.length() == 0 ? new String("Inoperable file:") : "Inoperable file:".concat(valueOf);
            int i = Build.VERSION.SDK_INT;
            try {
                StructStat stat = Os.stat(file.getCanonicalPath());
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(String.format(Locale.US, " mode[%d]", new Object[]{Integer.valueOf(stat.st_mode)}));
                str = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
            } catch (Exception e) {
            }
            return new IOException(str, iOException);
        } catch (IOException e2) {
            return iOException;
        }
    }
}
