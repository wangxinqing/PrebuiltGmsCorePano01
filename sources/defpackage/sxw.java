package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxw implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ AppMetadata e;
    final /* synthetic */ sye f;

    public sxw(sye sye, AtomicReference atomicReference, String str, String str2, String str3, AppMetadata appMetadata) {
        this.f = sye;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = appMetadata;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.a) {
            try {
                sye sye = this.f;
                sug sug = sye.c;
                if (sug != null) {
                    if (!TextUtils.isEmpty(this.b)) {
                        this.a.set(sug.a(this.b, this.c, this.d));
                    } else {
                        this.a.set(sug.a(this.c, this.d, this.e));
                    }
                    this.f.q();
                    atomicReference = this.a;
                    atomicReference.notify();
                    return;
                }
                sye.E().c.a("(legacy) Failed to get conditional properties; not connected to service", sut.a(this.b), this.c, this.d);
                this.a.set(Collections.emptyList());
                this.a.notify();
            } catch (RemoteException e2) {
                try {
                    this.f.E().c.a("(legacy) Failed to get conditional properties; remote exception", sut.a(this.b), this.c, e2);
                    this.a.set(Collections.emptyList());
                    atomicReference = this.a;
                } catch (Throwable th) {
                    this.a.notify();
                    throw th;
                }
            }
        }
    }
}
