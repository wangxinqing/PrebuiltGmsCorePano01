package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: bll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bll extends bms {
    private ApplicationInfo a;
    public final String d;

    public bll(Context context, int i, int i2, bmr bmr, String str) {
        super(context, i, i2, bmr);
        this.d = str;
    }

    public final synchronized ApplicationInfo a() {
        if (this.a == null) {
            ApplicationInfo applicationInfo = new ApplicationInfo();
            this.a = applicationInfo;
            applicationInfo.packageName = this.e.getPackageName();
            ApplicationInfo applicationInfo2 = this.a;
            String str = this.d;
            applicationInfo2.publicSourceDir = str;
            applicationInfo2.sourceDir = str;
        }
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public aucd j() {
        aucd j = super.j();
        String str = this.d;
        if (j.c) {
            j.c();
            j.c = false;
        }
        bnm bnm = (bnm) j.b;
        bnm bnm2 = bnm.r;
        str.getClass();
        bnm.a |= 2;
        bnm.c = str;
        return j;
    }

    public final brh k() {
        InputStream inputStream;
        try {
            ZipFile zipFile = new ZipFile(this.d);
            try {
                ZipEntry entry = zipFile.getEntry("assets/ChimeraManifest.pb");
                if (entry != null) {
                    try {
                        inputStream = zipFile.getInputStream(entry);
                        if (inputStream != null) {
                            brh a2 = bms.a(inputStream);
                            inputStream.close();
                            zipFile.close();
                            return a2;
                        }
                        throw new IOException("input stream is null");
                    } catch (IOException e) {
                        String str = this.d;
                        String name = entry.getName();
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(name).length() + String.valueOf(message).length());
                        sb.append("Failed to read chimera manifests from ");
                        sb.append(str);
                        sb.append(": ");
                        sb.append(name);
                        sb.append(": ");
                        sb.append(message);
                        Log.e("ChimeraFileApkBase", sb.toString());
                    } catch (Throwable th) {
                        apev.a(th, th);
                    }
                }
                zipFile.close();
                return null;
                throw th;
            } catch (Throwable th2) {
                zipFile.close();
                throw th2;
            }
        } catch (IOException e2) {
            String valueOf = String.valueOf(this);
            String message2 = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(message2).length());
            sb2.append("Failed to read chimera manifests from ");
            sb2.append(valueOf);
            sb2.append(": ");
            sb2.append(message2);
            Log.e("ChimeraFileApkBase", sb2.toString());
            return null;
        } catch (Throwable th3) {
            apev.a(th2, th3);
        }
    }

    public final long l() {
        long lastModified = new File(this.d).lastModified();
        if (lastModified != 0) {
            return lastModified;
        }
        throw new PackageManager.NameNotFoundException(this.d);
    }
}
