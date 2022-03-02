package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: yck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yck {
    private static yck c;
    private final Context a;
    private final String b;

    public yck(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    private static final String a(String str) {
        String replace = str.replace(":", "");
        iva.c(replace);
        return replace;
    }

    private final File b(String str, String str2, String str3) {
        File c2 = c(str, str2, str3);
        if (c2.listFiles() == null || c2.listFiles().length <= 0) {
            return null;
        }
        return c2.listFiles()[0];
    }

    private final File c(String str, String str2, String str3) {
        String b2 = b(str, str2);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 1 + String.valueOf(str3).length());
        sb.append(b2);
        sb.append("/");
        sb.append(str3);
        return new File(sb.toString());
    }

    public static synchronized yck a(Context context) {
        yck yck;
        synchronized (yck.class) {
            if (c == null) {
                c = new yck(context, "images/people-cover-photos");
            }
            yck = c;
        }
        return yck;
    }

    private final String b(String str, String str2) {
        String str3;
        String c2 = c();
        if (!TextUtils.isEmpty(str2)) {
            String valueOf = String.valueOf(str2);
            str3 = valueOf.length() == 0 ? new String("~") : "~".concat(valueOf);
        } else {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(c2);
        sb.append(str);
        sb.append(str3);
        return sb.toString();
    }

    private final String c() {
        String valueOf = String.valueOf(this.a.getFilesDir());
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + str.length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    public final synchronized List a() {
        File file = new File(c());
        if (!file.exists()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : file.list()) {
            int indexOf = str.indexOf("~");
            if (indexOf != -1) {
                arrayList.add(new ycj(str.substring(0, indexOf), str.substring(indexOf + 1)));
            } else {
                arrayList.add(new ycj(str, (String) null));
            }
        }
        return arrayList;
    }

    public final synchronized void b() {
        String valueOf = String.valueOf(this.a.getFilesDir());
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + str.length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(str);
        jjc.a(new File(sb.toString()));
        wus.b(this.a, "PeopleCoverPhotoFileUtils", "Cover photo size changed.  Wiped cache.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.yci a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            defpackage.iva.c(r2)     // Catch:{ all -> 0x002a }
            defpackage.iva.c(r4)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = a((java.lang.String) r4)     // Catch:{ all -> 0x002a }
            java.io.File r2 = r1.b(r2, r3, r4)     // Catch:{ all -> 0x002a }
            r3 = 0
            if (r2 == 0) goto L_0x0028
            boolean r4 = r2.exists()     // Catch:{ all -> 0x002a }
            if (r4 == 0) goto L_0x0028
            yci r2 = defpackage.yci.a(r2)     // Catch:{ IOException -> 0x001e }
            monitor-exit(r1)
            return r2
        L_0x001e:
            r2 = move-exception
            java.lang.String r4 = "PeopleCoverPhotoFileUtils"
            java.lang.String r0 = "Couldn't load cover photo"
            android.util.Log.w(r4, r0, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r1)
            return r3
        L_0x0028:
            monitor-exit(r1)
            return r3
        L_0x002a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yck.a(java.lang.String, java.lang.String, java.lang.String):yci");
    }

    public final synchronized void a(String str, String str2, String str3, byte[] bArr, int i) {
        FileOutputStream fileOutputStream;
        iva.c(str);
        iva.c(str3);
        iva.b(true);
        String a2 = a(str3);
        boolean a3 = a(str, str2);
        String path = c(str, str2, a2).getPath();
        String valueOf = String.valueOf(i);
        StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 1 + String.valueOf(valueOf).length());
        sb.append(path);
        sb.append("/");
        sb.append(valueOf);
        File file = new File(sb.toString());
        if (file.getParentFile().mkdirs()) {
            try {
                fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                Log.w("PeopleCoverPhotoFileUtils", "Couldn't update cover photo", e);
            } catch (IOException e2) {
                throw new RuntimeException("Couldn't update cover photo", e2);
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } else {
            throw new RuntimeException(String.format("Could not create a directory in dir=%s . Delete succeeded=%b, parent directory already exists=%b.", new Object[]{file.getAbsolutePath(), Boolean.valueOf(a3), Boolean.valueOf(file.getParentFile().exists())}));
        }
    }

    public final synchronized boolean a(String str, String str2) {
        iva.c(str);
        return jjc.a(new File(b(str, str2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            defpackage.iva.c(r3)     // Catch:{ all -> 0x0037 }
            defpackage.iva.c(r5)     // Catch:{ all -> 0x0037 }
            java.lang.String r5 = a((java.lang.String) r5)     // Catch:{ all -> 0x0037 }
            java.io.File r0 = r2.c(r3, r4, r5)     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0037 }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            java.io.File r3 = r2.b(r3, r4, r5)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0035
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x0035
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x0037 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0037 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0037 }
            if (r3 < r6) goto L_0x0033
            r3 = 1
            monitor-exit(r2)
            return r3
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            monitor-exit(r2)
            return r1
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yck.a(java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }
}
