package defpackage;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: ahyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahyc implements Runnable {
    final /* synthetic */ aiab a;
    final /* synthetic */ File b;
    final /* synthetic */ String c;
    final /* synthetic */ ahye d;

    public ahyc(ahye ahye, aiab aiab, File file, String str) {
        this.d = ahye;
        this.a = aiab;
        this.b = file;
        this.c = str;
    }

    public final void run() {
        File file;
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        ahye ahye = this.d;
        ahye.i = this.a;
        ahye.l = new File(this.b, this.c);
        if (ahyp.a(this.d.l)) {
            ahye ahye2 = this.d;
            ahye2.m = new File[1];
            File[] fileArr = ahye2.m;
            File file2 = ahye2.l;
            String str = this.c;
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append(str);
            sb.append(".0");
            fileArr[0] = new File(file2, sb.toString());
            File[] listFiles = this.d.l.listFiles();
            if (listFiles == null) {
                ahyp.b(this.d.l);
                return;
            }
            List asList = Arrays.asList(this.d.m);
            for (File file3 : listFiles) {
                if (!asList.contains(file3)) {
                    ahyp.b(file3);
                }
            }
            try {
                ahye ahye3 = this.d;
                if (ahyp.a(ahye3.l)) {
                    file = ahye3.m[0];
                    if (file == null || !file.exists()) {
                        throw new IOException("Cache file does not exist.");
                    }
                    fileInputStream = new FileInputStream(file);
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    dataInputStream = new DataInputStream(bufferedInputStream);
                    byte[] bArr = ahye3.i.a(dataInputStream).b;
                    ahyp.a((Closeable) fileInputStream);
                    ahyp.a((Closeable) bufferedInputStream);
                    ahyp.a((Closeable) dataInputStream);
                    this.d.a(bArr);
                    ahye ahye4 = this.d;
                    ahye4.k = 0;
                    ahye4.j = true;
                    return;
                }
                throw new IOException("Cache directory cannot be validated.");
            } catch (IOException e) {
                ahyp.b(file);
                throw e;
            } catch (IOException e2) {
                this.d.c();
            } catch (Throwable th) {
                ahyp.a((Closeable) fileInputStream);
                ahyp.a((Closeable) bufferedInputStream);
                ahyp.a((Closeable) dataInputStream);
                throw th;
            }
        }
    }
}
