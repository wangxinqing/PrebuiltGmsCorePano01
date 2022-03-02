package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;

/* renamed from: akmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akmg implements Runnable {
    private final akmn a;

    public akmg(akmn akmn) {
        this.a = akmn;
    }

    public final void run() {
        akmn akmn = this.a;
        akmn.c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(azcf.b());
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(akmn.g, "rw");
            try {
                randomAccessFile2.seek(1);
                randomAccessFile2.writeLong(akmn.c);
                akmn.a((Closeable) randomAccessFile2);
            } catch (IOException e) {
                randomAccessFile = randomAccessFile2;
                try {
                    aklz.a().b("Failed to update ttl");
                    akmn.a((Closeable) randomAccessFile);
                    akmn.b = 0;
                } catch (Throwable th) {
                    th = th;
                    akmn.a((Closeable) randomAccessFile);
                    akmn.b = 0;
                    throw th;
                }
            } catch (Throwable th2) {
                RandomAccessFile randomAccessFile3 = randomAccessFile2;
                th = th2;
                randomAccessFile = randomAccessFile3;
                akmn.a((Closeable) randomAccessFile);
                akmn.b = 0;
                throw th;
            }
        } catch (IOException e2) {
            aklz.a().b("Failed to update ttl");
            akmn.a((Closeable) randomAccessFile);
            akmn.b = 0;
        } catch (Throwable th3) {
            th = th3;
            akmn.a((Closeable) randomAccessFile);
            akmn.b = 0;
            throw th;
        }
        akmn.b = 0;
    }
}
