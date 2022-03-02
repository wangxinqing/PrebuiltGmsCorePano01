package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: woz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class woz implements Runnable {
    final /* synthetic */ yco a;
    final /* synthetic */ byte[] b;

    public woz(yco yco, byte[] bArr) {
        this.a = yco;
        this.b = bArr;
    }

    public final void run() {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(this.a.a.getFileDescriptor());
            try {
                byte[] bArr = this.b;
                fileOutputStream.write(bArr, 0, bArr.length);
            } catch (IOException e2) {
                e = e2;
                try {
                    Log.w("BasePeopleOperation", "Failed to write to pipe", e);
                    jjt.a((Closeable) fileOutputStream);
                    jjt.a((Closeable) this.a);
                } catch (Throwable th2) {
                    FileOutputStream fileOutputStream3 = fileOutputStream;
                    th = th2;
                    fileOutputStream2 = fileOutputStream3;
                }
            }
        } catch (IOException e3) {
            IOException iOException = e3;
            fileOutputStream = null;
            e = iOException;
            Log.w("BasePeopleOperation", "Failed to write to pipe", e);
            jjt.a((Closeable) fileOutputStream);
            jjt.a((Closeable) this.a);
        } catch (Throwable th3) {
            th = th3;
            jjt.a((Closeable) fileOutputStream2);
            jjt.a((Closeable) this.a);
            throw th;
        }
        jjt.a((Closeable) fileOutputStream);
        jjt.a((Closeable) this.a);
    }
}
