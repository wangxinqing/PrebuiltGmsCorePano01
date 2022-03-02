package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* renamed from: afsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afsa implements agzr {
    private final Uri a;

    public afsa(Uri uri) {
        this.a = uri;
    }

    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        OutputStream outputStream;
        agzs agzs = agzq.a;
        try {
            ZipInputStream zipInputStream = new ZipInputStream(ahcj.b(agzq));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (name.contains("..")) {
                            for (File file = new File(name); file != null; file = file.getParentFile()) {
                                if (file.getName().equals("..")) {
                                    String valueOf = String.valueOf(name);
                                    throw new ZipException(valueOf.length() == 0 ? new String("Illegal name: ") : "Illegal name: ".concat(valueOf));
                                }
                            }
                        }
                        Uri build = this.a.buildUpon().appendPath(name).build();
                        if (!nextEntry.isDirectory()) {
                            outputStream = (OutputStream) agzs.a(build, ahcm.a(), new agzk[0]);
                            anmr.a((InputStream) zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } else {
                            agzs.a(build.getScheme()).h(agzs.g(build));
                        }
                    } else {
                        zipInputStream.close();
                        return null;
                    }
                } catch (Throwable th) {
                    zipInputStream.close();
                    throw th;
                }
            }
            throw th;
        } catch (IOException e) {
            agzs.h(this.a);
            throw e;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }
}
