package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* renamed from: aaxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaxh {
    public final aayc a;
    public final PackageManager b;
    private final Context c;

    public aaxh(Context context, aayc aayc) {
        this.c = context;
        this.a = aayc;
        this.b = context.getPackageManager();
        new SparseArray();
        a();
    }

    static aaxf a(PackageManager packageManager, String str, boolean z) {
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        X509Certificate x509Certificate;
        aaxf aaxf = new aaxf();
        aaxf.a = str;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 4162);
            File file = new File(applicationInfo.sourceDir);
            aaxf.b = aaza.a(file);
            file.length();
            Signature[] signatureArr = packageInfo.signatures;
            aaxf.c = new byte[signatureArr.length][];
            aaxf.f = new ArrayList();
            for (int i = 0; i < signatureArr.length; i++) {
                byte[] byteArray = signatureArr[i].toByteArray();
                aaxf.c[i] = instance.digest(byteArray);
                try {
                    byteArrayInputStream = new ByteArrayInputStream(byteArray);
                    try {
                        CertificateFactory instance2 = CertificateFactory.getInstance("X509");
                        if (instance2 != null) {
                            x509Certificate = (X509Certificate) instance2.generateCertificate(byteArrayInputStream);
                        } else {
                            x509Certificate = null;
                        }
                        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                        if (issuerX500Principal != null) {
                            aaxf.f.add(issuerX500Principal.getName());
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e) {
                        }
                    } catch (CertificateException e2) {
                        try {
                            aaxf.f.add("");
                            byteArrayInputStream.close();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException e3) {
                            }
                            throw th;
                        }
                    }
                } catch (CertificateException e4) {
                    byteArrayInputStream = null;
                    aaxf.f.add("");
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = null;
                    byteArrayInputStream.close();
                    throw th;
                }
            }
            aaxf.e = packageInfo.versionCode;
            aaxf.g = packageInfo.requestedPermissions;
            if (z) {
                if (packageInfo.firstInstallTime < packageInfo.lastUpdateTime) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aaxf.j = z2;
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null && (r9 = activityInfoArr.length) > 0) {
                aaxf.h = new ArrayList();
                for (ActivityInfo activityInfo : activityInfoArr) {
                    aaxg aaxg = new aaxg();
                    aaxg.a = activityInfo.name;
                    aaxg.b = activityInfo.enabled;
                    aaxg.c = activityInfo.exported;
                    aaxg.d = activityInfo.permission;
                    aaxf.h.add(aaxg);
                }
            }
            return aaxf;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e5) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final aaxf a(String str) {
        return a(str, false);
    }

    /* access modifiers changed from: package-private */
    public final aaxf a(String str, boolean z) {
        return a(this.b, str, z);
    }

    /* access modifiers changed from: package-private */
    public final SparseIntArray a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.c.getSystemService("activity")).getRunningAppProcesses();
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid != 0) {
                sparseIntArray.put(next.pid, next.uid);
            }
        }
        return sparseIntArray;
    }
}
