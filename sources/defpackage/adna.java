package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: adna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adna implements adny {
    private static final iwd a = adnt.e("PropertyFileProvider");
    private final String b;
    private final Context c;
    private final boolean d;

    private adna(Context context, String str, boolean z) {
        iva.a(adjw.a());
        iva.a(jkr.c());
        this.c = context;
        iva.c(str);
        this.b = str;
        this.d = z;
    }

    public static adna a(Context context, String str, boolean z) {
        return new adna(context, str, z);
    }

    public final RandomAccessFile a(long j) {
        File file;
        try {
            String str = this.b;
            long a2 = admy.a(this.c, "/data", this.d);
            if (a2 < j) {
                a.c("Not enough space under /data, available: %d, property file size: %d.", Long.valueOf(a2), Long.valueOf(j));
                file = null;
            } else {
                file = new File(admy.a(), str);
            }
            if (file != null) {
                return admy.a(this.c, file, j, this.d);
            }
            throw new adnx("Unable to create the file.");
        } catch (IOException e) {
            throw new adnx("Unable to create the file.", e);
        }
    }
}
