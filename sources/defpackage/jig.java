package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.ScheduledFuture;

/* renamed from: jig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jig implements Runnable {
    final /* synthetic */ jih a;
    private final byte[] b;

    public jig(jih jih, byte[] bArr) {
        this.a = jih;
        this.b = bArr;
    }

    public final void run() {
        FileLock a2;
        synchronized (this.a.e) {
            byte[] bArr = this.b;
            int length = bArr.length;
            jih jih = this.a;
            if (((long) length) + jih.h >= jih.b) {
                try {
                    a2 = jih.a();
                    FileChannel channel = this.a.f.getChannel();
                    if (channel.size() < channel.position()) {
                        channel.position(channel.size());
                    }
                    PrintStream printStream = this.a.g;
                    byte[] bArr2 = this.b;
                    printStream.write(bArr2, 0, bArr2.length);
                    this.a.g.flush();
                    jih jih2 = this.a;
                    jih2.h = 0;
                    jih2.i++;
                    ScheduledFuture scheduledFuture = jih2.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    a2.release();
                } catch (IOException e) {
                    Log.w("CachingFileWriter", "Failed to write cache to disk.", e);
                } catch (Throwable th) {
                    a2.release();
                    throw th;
                }
            } else {
                jih.g.write(bArr, 0, length);
                jih jih3 = this.a;
                jih3.h += (long) this.b.length;
                ScheduledFuture scheduledFuture2 = jih3.j;
                if (scheduledFuture2 != null) {
                    if (!scheduledFuture2.isDone()) {
                    }
                }
                jih3.j = ((jfv) jih3.a).schedule(jih3.k, jih3.c, jih3.d);
            }
        }
    }
}
