package defpackage;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: iqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqo implements Runnable {
    final /* synthetic */ iqq a;
    private final Uri b;
    private final ParcelFileDescriptor c;

    public iqo(iqq iqq, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = iqq;
        this.b = uri;
        this.c = parcelFileDescriptor;
    }

    public final void run() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            ParcelFileDescriptor parcelFileDescriptor = this.c;
            if (parcelFileDescriptor != null) {
                try {
                    BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    Log.e("ImageManager", sb.toString(), e);
                }
                try {
                    this.c.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            new CountDownLatch(1);
            iqq iqq = this.a;
            int i = iqq.f;
            Handler handler = iqq.b;
            new iqp(iqq);
            throw null;
        }
        String valueOf2 = String.valueOf(Thread.currentThread());
        String valueOf3 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 56 + String.valueOf(valueOf3).length());
        sb2.append("checkNotMainThread: current thread ");
        sb2.append(valueOf2);
        sb2.append(" IS the main thread ");
        sb2.append(valueOf3);
        sb2.append("!");
        Log.e("Asserts", sb2.toString());
        throw new IllegalStateException("LoadBitmapFromDiskRunnable can't be executed in the main thread");
    }
}
