package defpackage;

import android.os.Bundle;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: qie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qie extends qfd {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qie(qij qij) {
        super("setInstantAppCookie");
        this.b = qij;
    }

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        String str2;
        int length;
        byte[] byteArray = bundle.getByteArray("cookie");
        String str3 = qfc.b.packageName;
        int a = this.b.a();
        boolean z = true;
        if (byteArray != null && (length = byteArray.length) > a) {
            qij.a.b("Cookie for %s is too large; %d > %d", str3, Integer.valueOf(length), Integer.valueOf(a));
            z = false;
        } else {
            File a2 = this.b.a(str3);
            if (a2 != null && (!a2.exists() || a2.delete())) {
                FileOutputStream fileOutputStream = null;
                if (byteArray != null) {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(a2);
                        try {
                            fileOutputStream2.write(byteArray);
                            fileOutputStream2.flush();
                            fileOutputStream = fileOutputStream2;
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            try {
                                qij.a.a(e, "Failed to write to file", new Object[0]);
                                jjt.a((Closeable) fileOutputStream);
                                z = false;
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("result", z);
                                return bundle2;
                            } catch (Throwable th) {
                                th = th;
                                jjt.a((Closeable) fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            jjt.a((Closeable) fileOutputStream);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        qij.a.a(e, "Failed to write to file", new Object[0]);
                        jjt.a((Closeable) fileOutputStream);
                        z = false;
                        Bundle bundle22 = new Bundle();
                        bundle22.putBoolean("result", z);
                        return bundle22;
                    } catch (Throwable th3) {
                        th = th3;
                        jjt.a((Closeable) fileOutputStream);
                        throw th;
                    }
                }
                jjt.a((Closeable) fileOutputStream);
            } else {
                qfn qfn = qij.a;
                Object[] objArr = new Object[1];
                if (a2 == null) {
                    str2 = "null";
                } else {
                    str2 = a2.toString();
                }
                objArr[0] = str2;
                qfn.b("Could not delete existing file, or file was null: %s", objArr);
                z = false;
            }
        }
        Bundle bundle222 = new Bundle();
        bundle222.putBoolean("result", z);
        return bundle222;
    }
}
