package defpackage;

import android.content.Context;
import android.os.Process;
import android.system.Os;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: admx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admx {
    private static final iwd a = adnt.e("InstallationUtil");

    public static adqw a() {
        adrn adrn = (adrn) adrn.a.b();
        amri amri = (amri) adrn.b(adls.g);
        if (amri.a()) {
            return (adqw) amri.b();
        }
        return adkb.a((adre) adrn.b(adls.f));
    }

    public static amzy a(Context context) {
        amzt j = amzy.j();
        if (!amrk.a(ayox.j())) {
            j.c(oq.a("AUTHORIZATION", ayox.j()));
        }
        try {
            String b = gwc.b(context);
            if (!amrk.a(b)) {
                j.c(oq.a("DDVI", b));
            }
        } catch (Exception e) {
            a.d("Failed to set ddvi as a download request property.", e, new Object[0]);
        }
        return j.a();
    }

    public static void a(String str, String str2) {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            while (nextEntry != null) {
                if (!nextEntry.isDirectory()) {
                    if (!"care_map.pb".equals(nextEntry.getName())) {
                        if (!"care_map.txt".equals(nextEntry.getName())) {
                            nextEntry = zipInputStream.getNextEntry();
                        }
                    }
                    File file = new File(str2, nextEntry.getName());
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        int gidForName = Process.getGidForName("cache");
                        int i = Os.getuid();
                        if (gidForName != -1) {
                            Os.fchown(fileOutputStream.getFD(), i, gidForName);
                            Os.fchmod(fileOutputStream.getFD(), 416);
                        }
                    } catch (Exception e) {
                        a.e("Failed to set group owner.", e, new Object[0]);
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                    fileOutputStream.close();
                    file.getAbsolutePath();
                    return;
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            zipInputStream.close();
            throw new IOException("Unable to find care_map file.");
        } finally {
            zipInputStream.close();
        }
    }
}
