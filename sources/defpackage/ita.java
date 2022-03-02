package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ita  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ita implements Handler.Callback {
    public final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final Object d = new Object();
    private final isz e;
    private volatile boolean f = false;
    private final AtomicInteger g = new AtomicInteger(0);
    private boolean h = false;
    private final Handler i;

    public ita(Looper looper, isz isz) {
        this.e = isz;
        this.i = new qvr(looper, this);
    }

    public final void a() {
        this.f = false;
        this.g.incrementAndGet();
    }

    public final void b() {
        this.f = true;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            ica ica = (ica) message.obj;
            synchronized (this.d) {
                if (this.f && this.e.l() && this.a.contains(ica)) {
                    ica.g(this.e.C());
                }
            }
            return true;
        }
        int i2 = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i2);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    public final void a(int i2) {
        iva.a(this.i, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.i.removeMessages(1);
        synchronized (this.d) {
            this.h = true;
            ArrayList arrayList = new ArrayList(this.a);
            int i3 = this.g.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ica ica = (ica) it.next();
                if (this.f) {
                    if (this.g.get() != i3) {
                        break;
                    } else if (this.a.contains(ica)) {
                        ica.a(i2);
                    }
                } else {
                    break;
                }
            }
            this.b.clear();
            this.h = false;
        }
    }

    public final void b(ica ica) {
        iva.a((Object) ica);
        synchronized (this.d) {
            if (!this.a.remove(ica)) {
                String valueOf = String.valueOf(ica);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            } else if (this.h) {
                this.b.add(ica);
            }
        }
    }

    public final void a(Bundle bundle) {
        iva.a(this.i, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.d) {
            boolean z = true;
            iva.a(!this.h);
            this.i.removeMessages(1);
            this.h = true;
            if (this.b.size() != 0) {
                z = false;
            }
            iva.a(z);
            ArrayList arrayList = new ArrayList(this.a);
            int i2 = this.g.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ica ica = (ica) it.next();
                if (this.f) {
                    if (!this.e.l() || this.g.get() != i2) {
                        break;
                    } else if (!this.b.contains(ica)) {
                        ica.g(bundle);
                    }
                } else {
                    break;
                }
            }
            this.b.clear();
            this.h = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.i
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            defpackage.iva.a((android.os.Handler) r0, (java.lang.String) r1)
            android.os.Handler r0 = r5.i
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.d
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            java.util.ArrayList r2 = r5.c     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.g     // Catch:{ all -> 0x0049 }
            int r2 = r2.get()     // Catch:{ all -> 0x0049 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0049 }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0047
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0049 }
            icb r3 = (defpackage.icb) r3     // Catch:{ all -> 0x0049 }
            boolean r4 = r5.f     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicInteger r4 = r5.g     // Catch:{ all -> 0x0049 }
            int r4 = r4.get()     // Catch:{ all -> 0x0049 }
            if (r4 != r2) goto L_0x0045
            java.util.ArrayList r4 = r5.c     // Catch:{ all -> 0x0049 }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0021
            r3.a(r6)     // Catch:{ all -> 0x0049 }
            goto L_0x0021
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x004c:
            throw r6
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ita.a(com.google.android.gms.common.ConnectionResult):void");
    }

    public final void a(ica ica) {
        iva.a((Object) ica);
        synchronized (this.d) {
            if (this.a.contains(ica)) {
                String valueOf = String.valueOf(ica);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.a.add(ica);
            }
        }
        if (this.e.l()) {
            Handler handler = this.i;
            handler.sendMessage(handler.obtainMessage(1, ica));
        }
    }

    public final void a(icb icb) {
        iva.a((Object) icb);
        synchronized (this.d) {
            if (this.c.contains(icb)) {
                String valueOf = String.valueOf(icb);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.c.add(icb);
            }
        }
    }
}
