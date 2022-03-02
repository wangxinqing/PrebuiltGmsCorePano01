package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: awdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awdi implements awdj {
    public final batz a(File file) {
        try {
            return batq.b(file);
        } catch (FileNotFoundException e) {
            file.getParentFile().mkdirs();
            return batq.b(file);
        }
    }

    public final void b(File file) {
        if (!file.delete() && file.exists()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb.append("failed to delete ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    public final void c(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    c(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    sb.append("failed to delete ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        String valueOf2 = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
        sb2.append("not a readable directory: ");
        sb2.append(valueOf2);
        throw new IOException(sb2.toString());
    }

    public final void a(File file, File file2) {
        b(file2);
        if (!file.renameTo(file2)) {
            String valueOf = String.valueOf(file);
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
            sb.append("failed to rename ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            throw new IOException(sb.toString());
        }
    }
}
