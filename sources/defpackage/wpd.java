package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: wpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wpd implements Runnable {
    final /* synthetic */ ParcelFileDescriptor a;
    final /* synthetic */ yco b;
    final /* synthetic */ int c;

    public wpd(ParcelFileDescriptor parcelFileDescriptor, yco yco, int i) {
        this.a = parcelFileDescriptor;
        this.b = yco;
        this.c = i;
    }

    public final void run() {
        FileOutputStream fileOutputStream;
        Throwable th;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        IOException e;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream2 = null;
        try {
            autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.a);
            try {
                fileOutputStream = new FileOutputStream(this.b.a.getFileDescriptor());
                try {
                    jjt.a(new BufferedInputStream(autoCloseInputStream, this.c), fileOutputStream, true, this.c);
                } catch (IOException e2) {
                    e = e2;
                    try {
                        Log.w("BasePeopleOperation", "Failed to write to pipe", e);
                        jjt.a((Closeable) autoCloseInputStream);
                        jjt.a((Closeable) fileOutputStream);
                        jjt.a((Closeable) this.b);
                    } catch (Throwable th2) {
                        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream3 = autoCloseInputStream;
                        th = th2;
                        autoCloseInputStream2 = autoCloseInputStream3;
                    }
                }
            } catch (IOException e3) {
                IOException iOException = e3;
                fileOutputStream = null;
                e = iOException;
                Log.w("BasePeopleOperation", "Failed to write to pipe", e);
                jjt.a((Closeable) autoCloseInputStream);
                jjt.a((Closeable) fileOutputStream);
                jjt.a((Closeable) this.b);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileOutputStream = null;
                autoCloseInputStream2 = autoCloseInputStream;
                th = th4;
                jjt.a((Closeable) autoCloseInputStream2);
                jjt.a((Closeable) fileOutputStream);
                jjt.a((Closeable) this.b);
                throw th;
            }
        } catch (IOException e4) {
            fileOutputStream = null;
            e = e4;
            autoCloseInputStream = null;
            Log.w("BasePeopleOperation", "Failed to write to pipe", e);
            jjt.a((Closeable) autoCloseInputStream);
            jjt.a((Closeable) fileOutputStream);
            jjt.a((Closeable) this.b);
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            jjt.a((Closeable) autoCloseInputStream2);
            jjt.a((Closeable) fileOutputStream);
            jjt.a((Closeable) this.b);
            throw th;
        }
        jjt.a((Closeable) autoCloseInputStream);
        jjt.a((Closeable) fileOutputStream);
        jjt.a((Closeable) this.b);
    }
}
