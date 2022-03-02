package defpackage;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: fxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxz {
    public static final iwd a = new iwd("GLSUser", "DeviceKeyStore");
    private static WeakReference e = new WeakReference((Object) null);
    public final ReadWriteLock b = new ReentrantReadWriteLock();
    public final Context c;
    public avpe d;

    private fxz(Context context) {
        iva.a((Object) context);
        this.c = context;
    }

    public static synchronized fxz a(Context context) {
        fxz fxz;
        synchronized (fxz.class) {
            fxz = (fxz) e.get();
            if (fxz == null) {
                fxz = new fxz(context.getApplicationContext());
                e = new WeakReference(fxz);
            }
        }
        return fxz;
    }

    public final avpe a() {
        FileInputStream openFileInput;
        Lock readLock = this.b.readLock();
        readLock.lock();
        try {
            if (this.d == null) {
                try {
                    Lock writeLock = this.b.writeLock();
                    writeLock.lock();
                    try {
                        if (this.d == null) {
                            openFileInput = this.c.openFileInput("device_key");
                            int size = (int) openFileInput.getChannel().size();
                            iwd iwd = a;
                            StringBuilder sb = new StringBuilder(45);
                            sb.append("Retrieving device key, file size: ");
                            sb.append(size);
                            iwd.a(sb.toString(), new Object[0]);
                            aucd o = avpe.f.o();
                            aubc a2 = aubc.a((InputStream) openFileInput);
                            o.a(a2);
                            a2.a(0);
                            this.d = (avpe) o.i();
                            openFileInput.close();
                        }
                        writeLock.unlock();
                    } catch (FileNotFoundException e2) {
                        throw new IOException("Device key file not found.", e2);
                    } catch (IOException e3) {
                        throw new IOException("Failed to read size of key file. ", e3);
                    } catch (Throwable th) {
                        writeLock.unlock();
                        throw th;
                    }
                } catch (IOException e4) {
                    iwd iwd2 = a;
                    String valueOf = String.valueOf(e4.getMessage());
                    iwd2.d(valueOf.length() == 0 ? new String("Cannot load key: ") : "Cannot load key: ".concat(valueOf), new Object[0]);
                }
            }
            Lock readLock2 = this.b.readLock();
            readLock2.lock();
            try {
                return this.d;
            } finally {
                readLock2.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
