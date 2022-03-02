package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.chimera.Service;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* renamed from: hdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hdd extends Service implements Handler.Callback {
    private int a = 0;
    public int c = 0;
    public final ReentrantLock d = new ReentrantLock();
    protected final String e;
    protected final hdb f;
    protected final long g;
    protected final Handler h;

    protected hdd(String str, hdb hdb, long j) {
        this.e = str;
        iva.a((Object) hdb);
        this.f = hdb;
        this.g = j;
        this.h = new qvr(Looper.getMainLooper(), this);
    }

    public final void a() {
        if (this.c == 0) {
            this.h.sendMessageDelayed(this.h.obtainMessage(1), this.g);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(hdc hdc);

    /* JADX INFO: finally extract failed */
    public final boolean handleMessage(Message message) {
        this.d.lock();
        try {
            if (this.c == 0) {
                stopSelfResult(this.a);
            }
            this.d.unlock();
            return true;
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: finally extract failed */
    public int onStartCommand(Intent intent, int i, int i2) {
        this.d.lock();
        try {
            this.a = i2;
            while (true) {
                hcy hcy = (hcy) this.f.poll();
                if (hcy == null) {
                    break;
                }
                this.c++;
                a(new hdc(this, hcy));
            }
            if (this.c > 0) {
                this.h.removeMessages(1);
            }
            a();
            this.d.unlock();
            return 2;
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }
}
