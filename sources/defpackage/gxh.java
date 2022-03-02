package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: gxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gxh implements gxl {
    private final HashSet a = new HashSet();

    public final void a(Object obj) {
        try {
            HashSet hashSet = this.a;
            iwd iwd = gxn.a;
            if (obj instanceof Number) {
                hashSet.add(Integer.valueOf(((Number) obj).intValue()));
                return;
            }
            throw new IllegalArgumentException("number expected");
        } catch (IllegalArgumentException e) {
            gxn.a.e(e.toString(), new Object[0]);
        }
    }

    public final void a(StringBuilder sb, Context context) {
        String[] packagesForUid;
        FileInputStream fileInputStream;
        PackageManager packageManager = context.getPackageManager();
        Iterator it = this.a.iterator();
        loop0:
        while (it.hasNext() && (packagesForUid = packageManager.getPackagesForUid(((Integer) it.next()).intValue())) != null) {
            int length = packagesForUid.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String str = packagesForUid[i];
                    try {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                        PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
                        File file = new File(applicationInfo.sourceDir);
                        MessageDigest instance = MessageDigest.getInstance("SHA-256");
                        try {
                            fileInputStream = new FileInputStream(file);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    instance.update(bArr, 0, read);
                                }
                                fileInputStream.close();
                                String a2 = jjp.a(instance.digest());
                                String num = Integer.toString(packageInfo.versionCode);
                                sb.append('|');
                                sb.append(str);
                                sb.append(':');
                                sb.append(a2);
                                sb.append(':');
                                sb.append(num);
                                sb.append(':');
                                Signature[] signatureArr = packageInfo.signatures;
                                MessageDigest instance2 = MessageDigest.getInstance("SHA-256");
                                int i2 = 0;
                                while (true) {
                                    int length2 = signatureArr.length;
                                    if (i2 >= length2) {
                                        break;
                                    }
                                    sb.append(jjp.a(instance2.digest(signatureArr[i2].toByteArray())));
                                    if (i2 != length2 - 1) {
                                        sb.append(",");
                                    }
                                    i2++;
                                }
                                sb.append('|');
                                i++;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            if (fileInputStream == null) {
                                break loop0;
                            }
                            fileInputStream.close();
                            break loop0;
                            throw th;
                        }
                    } catch (PackageManager.NameNotFoundException | IOException | NoSuchAlgorithmException e) {
                        gxn.a.e(e.toString(), new Object[0]);
                    }
                }
            }
            throw th;
        }
    }
}
