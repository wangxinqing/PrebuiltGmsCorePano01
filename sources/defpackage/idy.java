package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: idy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class idy implements ifv {
    final /* synthetic */ idz a;

    public idy(idz idz) {
        this.a = idz;
    }

    public final void a(int i) {
        Lock lock;
        this.a.g.lock();
        try {
            idz idz = this.a;
            if (!idz.f) {
                idz.f = true;
                idz.a.a(i);
                lock = this.a.g;
            } else {
                idz.f = false;
                idz.a(i);
                lock = this.a.g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.a.g.unlock();
            throw th;
        }
    }

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = ConnectionResult.a;
            this.a.h();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            idz idz = this.a;
            idz.e = connectionResult;
            idz.h();
        } finally {
            this.a.g.unlock();
        }
    }
}
