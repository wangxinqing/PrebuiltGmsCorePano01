package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: idx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class idx implements ifv {
    final /* synthetic */ idz a;

    public idx(idz idz) {
        this.a = idz;
    }

    public final void a(int i) {
        Lock lock;
        ConnectionResult connectionResult;
        this.a.g.lock();
        try {
            idz idz = this.a;
            if (idz.f || (connectionResult = idz.e) == null || !connectionResult.b()) {
                idz idz2 = this.a;
                idz2.f = false;
                idz2.a(i);
                lock = this.a.g;
            } else {
                idz idz3 = this.a;
                idz3.f = true;
                idz3.b.a(i);
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
            idz idz = this.a;
            Bundle bundle2 = idz.c;
            if (bundle2 == null) {
                idz.c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.a.d = ConnectionResult.a;
            this.a.h();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            idz idz = this.a;
            idz.d = connectionResult;
            idz.h();
        } finally {
            this.a.g.unlock();
        }
    }
}
