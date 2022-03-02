package defpackage;

import android.content.Context;
import android.os.Debug;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: whx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class whx extends mum {
    private final Context a;
    private final String[] b;

    public whx(Context context, String... strArr) {
        this.a = context;
        this.b = strArr;
    }

    private final File a(String str) {
        String[] strArr;
        FileOutputStream fileOutputStream;
        File fileStreamPath = this.a.getFileStreamPath(String.valueOf(str).concat(".tmp"));
        if (fileStreamPath.exists()) {
            fileStreamPath.delete();
        }
        if (str.endsWith("Service")) {
            String packageName = this.a.getPackageName();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str).length());
            sb.append(packageName);
            sb.append("/");
            sb.append(str);
            strArr = new String[]{"service", sb.toString()};
        } else {
            String packageName2 = this.a.getPackageName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName2).length() + 1 + String.valueOf(str).length());
            sb2.append(packageName2);
            sb2.append("/");
            sb2.append(str);
            strArr = new String[]{sb2.toString()};
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(fileStreamPath);
            try {
                if (!Debug.dumpService("activity", fileOutputStream.getFD(), strArr)) {
                    ((anih) ((anih) vvj.a.c()).a("whx", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to invoke dumpsys on %s", (Object) str);
                    jjt.a((Closeable) fileOutputStream);
                    return null;
                }
                jjg jjg = vvj.a;
                jjt.a((Closeable) fileOutputStream);
                return fileStreamPath;
            } catch (IOException | NullPointerException | SecurityException e) {
                e = e;
                try {
                    anih anih = (anih) vvj.a.c();
                    anih.a(e);
                    ((anih) anih.a("whx", "a", 239, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to invoke dumpsys on %s", (Object) str);
                    jjt.a((Closeable) fileOutputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                }
            }
        } catch (IOException | NullPointerException | SecurityException e2) {
            e = e2;
            fileOutputStream = null;
            anih anih2 = (anih) vvj.a.c();
            anih2.a(e);
            ((anih) anih2.a("whx", "a", 239, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to invoke dumpsys on %s", (Object) str);
            jjt.a((Closeable) fileOutputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            jjt.a((Closeable) fileOutputStream2);
            throw th;
        }
    }

    public final List b() {
        String[] strArr;
        String[] strArr2;
        FileOutputStream fileOutputStream;
        File file;
        byte[] b2;
        FileOutputStream fileOutputStream2;
        whx whx = this;
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = whx.b;
        int length = strArr3.length;
        char c = 0;
        int i = 0;
        while (i < length) {
            String str = strArr3[i];
            File fileStreamPath = whx.a.getFileStreamPath(String.valueOf(str).concat(".tmp"));
            if (fileStreamPath.exists()) {
                fileStreamPath.delete();
            }
            if (str.endsWith("Service")) {
                strArr2 = new String[2];
                strArr2[c] = "service";
                String packageName = whx.a.getPackageName();
                strArr = strArr3;
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str).length());
                sb.append(packageName);
                sb.append("/");
                sb.append(str);
                strArr2[1] = sb.toString();
            } else {
                strArr = strArr3;
                String packageName2 = whx.a.getPackageName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName2).length() + 1 + String.valueOf(str).length());
                sb2.append(packageName2);
                sb2.append("/");
                sb2.append(str);
                strArr2 = new String[]{sb2.toString()};
            }
            try {
                fileOutputStream2 = new FileOutputStream(fileStreamPath);
                try {
                    if (!Debug.dumpService("activity", fileOutputStream2.getFD(), strArr2)) {
                        ((anih) ((anih) vvj.a.c()).a("whx", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to invoke dumpsys on %s", (Object) str);
                        jjt.a((Closeable) fileOutputStream2);
                        file = null;
                        if (!(file == null || (b2 = whw.b(file)) == null)) {
                            arrayList.add(new FileTeleporter(b2, "text/plain", file.getName()));
                        }
                        i++;
                        whx = this;
                        strArr3 = strArr;
                        c = 0;
                    } else {
                        jjg jjg = vvj.a;
                        jjt.a((Closeable) fileOutputStream2);
                        file = fileStreamPath;
                        arrayList.add(new FileTeleporter(b2, "text/plain", file.getName()));
                        i++;
                        whx = this;
                        strArr3 = strArr;
                        c = 0;
                    }
                } catch (IOException | NullPointerException | SecurityException e) {
                    e = e;
                    try {
                        anih anih = (anih) vvj.a.c();
                        anih.a(e);
                        ((anih) anih.a("whx", "a", 239, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to invoke dumpsys on %s", (Object) str);
                        jjt.a((Closeable) fileOutputStream2);
                        file = null;
                        arrayList.add(new FileTeleporter(b2, "text/plain", file.getName()));
                        i++;
                        whx = this;
                        strArr3 = strArr;
                        c = 0;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        jjt.a((Closeable) fileOutputStream);
                        throw th;
                    }
                }
            } catch (IOException | NullPointerException | SecurityException e2) {
                e = e2;
                fileOutputStream2 = null;
                anih anih2 = (anih) vvj.a.c();
                anih2.a(e);
                ((anih) anih2.a("whx", "a", 239, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to invoke dumpsys on %s", (Object) str);
                jjt.a((Closeable) fileOutputStream2);
                file = null;
                arrayList.add(new FileTeleporter(b2, "text/plain", file.getName()));
                i++;
                whx = this;
                strArr3 = strArr;
                c = 0;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                jjt.a((Closeable) fileOutputStream);
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
