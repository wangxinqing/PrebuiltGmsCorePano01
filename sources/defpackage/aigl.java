package defpackage;

import android.location.Location;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aigl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aigl extends aics {
    private final aidg a;

    public aigl(aiex aiex, Looper looper, acrz acrz) {
        super(aiex);
        this.a = new aidg(new aigi(this, looper), acrz);
    }

    private final Object a(int i, FutureTask futureTask, long j) {
        try {
            if (this.a.a(i, futureTask)) {
                return futureTask.get(j, TimeUnit.MILLISECONDS);
            }
            Log.e("SynchronizedLE", "error posting asynchronous call to engine looper");
            return null;
        } catch (InterruptedException | TimeoutException e) {
            Log.e("SynchronizedLE", "asynchronous call timed out or was interrupted");
            return null;
        }
    }

    public final void b() {
        this.a.a(6, 1, 0, 0, (Object) null);
    }

    public final Location a(boolean z) {
        Object obj;
        aigj aigj = new aigj(this, z);
        try {
            if (Thread.currentThread() != this.a.a().getThread()) {
                obj = a(12, new FutureTask(aigj), 500);
            } else {
                obj = aigj.call();
            }
            return (Location) obj;
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public final void a() {
        this.a.a(7, 0, 0, 0, (Object) null);
    }

    public final void a(aido aido) {
        this.a.a(10, 4, 0, 0, aido);
    }

    public final void a(aiew aiew) {
        this.a.a(11, 5, 0, 0, aiew);
    }

    public final void a(Location location, int i) {
        this.a.a(9, 3, i, 0, location);
    }

    public final void a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aigk aigk = new aigk(this, fileDescriptor, printWriter, strArr);
        if (Thread.currentThread() == this.a.a().getThread()) {
            aigk.run();
            return;
        }
        try {
            a(13, new FutureTask(aigk, (Object) null), 5000);
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public final void a(Collection collection, boolean z) {
        this.a.a(8, 2, z ? 1 : 0, 0, collection);
    }
}
