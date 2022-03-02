package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: admv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admv implements adny {
    private static final iwd a = adnt.e("DefaultFileProvider");
    private final Context b;
    private final String c;
    private final Object d = new Object();
    private final boolean e;
    private String f;

    private admv(Context context, String str, String str2, boolean z) {
        iva.a((Object) context);
        this.b = context;
        iva.c(str);
        this.c = str;
        this.f = str2;
        this.e = z;
    }

    public static admv a(Context context, String str, String str2, boolean z) {
        return new admv(context, str, str2, z);
    }

    private final File b(String str, long j, boolean z) {
        long a2 = admy.a(this.b, "/cache", z);
        if (a2 - j < ((Long) adjx.b.a()).longValue()) {
            a.c("Not enough space under /cache, available: %d, file size: %d, required min space: %d.", Long.valueOf(a2), Long.valueOf(j), adjx.b.a());
            return null;
        } else if (admy.a(this.b, "/data", z) >= ((Long) adjx.a.a()).longValue()) {
            return new File(admy.b(), str);
        } else {
            a.c("Not enough space under /data, available: %d, required min space: %d.", Long.valueOf(a2), adjx.a.a());
            return null;
        }
    }

    private final File a(String str, long j, boolean z) {
        long a2 = admy.a(this.b, "/data", z);
        if (a2 - j < ((Long) adjx.a.a()).longValue()) {
            a.c("Not enough space under /data, available: %d, file size: %d, required min space: %d.", Long.valueOf(a2), Long.valueOf(j), adjx.a.a());
            return null;
        }
        File a3 = admy.a();
        if (a3.exists()) {
            return new File(a3, str);
        }
        if (adjw.a() || new File("/system/bin/uncrypt").exists()) {
            return new File(admy.a(this.b), str);
        }
        return null;
    }

    public final RandomAccessFile a(long j) {
        File file;
        try {
            String a2 = a();
            if (!amrk.a(a2)) {
                return new RandomAccessFile(a2, "rw");
            }
            if (adjw.a()) {
                file = a(this.c, j, this.e);
            } else if (!ayou.a.a().n()) {
                file = b(this.c, j, this.e);
                if (file == null) {
                    file = a(this.c, j, this.e);
                }
            } else {
                file = a(this.c, j, this.e);
                if (file == null) {
                    file = b(this.c, j, this.e);
                }
            }
            if (file != null) {
                String absolutePath = file.getAbsolutePath();
                synchronized (this.d) {
                    this.f = absolutePath;
                }
                return admy.a(this.b, file, j, this.e);
            }
            throw new adnx("Unable to create the file.");
        } catch (IOException e2) {
            throw new adnx("Unable to create the file.", e2);
        }
    }

    public final String a() {
        String str;
        synchronized (this.d) {
            str = this.f;
        }
        return str;
    }
}
