package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.ads.identifier.internal.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class d {
    hwz a;
    com.google.android.gms.ads.identifier.internal.d b;
    boolean c;
    final Object d;
    b e;
    final long f;
    private final Context g;

    public d(Context context) {
        this(context, 30000, false);
    }

    public static c a(Context context) {
        d dVar = new d(context, -1, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            dVar.a(false);
            c b2 = dVar.b();
            a(b2, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            dVar.c();
            return b2;
        } catch (Throwable th) {
            dVar.c();
            throw th;
        }
    }

    private final void d() {
        synchronized (this.d) {
            b bVar = this.e;
            if (bVar != null) {
                bVar.a.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException e2) {
                }
            }
            long j = this.f;
            if (j > 0) {
                this.e = new b(this, j);
            }
        }
    }

    public final c b() {
        c cVar;
        iva.b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    b bVar = this.e;
                    if (bVar == null || !bVar.b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    a(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                } catch (RemoteException e3) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                    throw new IOException("Remote exception");
                }
            }
            iva.a((Object) this.a);
            iva.a((Object) this.b);
            cVar = new c(this.b.b(), this.b.c());
        }
        d();
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            defpackage.iva.b((java.lang.String) r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.g     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            hwz r0 = r3.a     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            boolean r0 = r3.c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0026
            jca r0 = defpackage.jca.a()     // Catch:{ all -> 0x001e }
            android.content.Context r1 = r3.g     // Catch:{ all -> 0x001e }
            hwz r2 = r3.a     // Catch:{ all -> 0x001e }
            r0.a((android.content.Context) r1, (android.content.ServiceConnection) r2)     // Catch:{ all -> 0x001e }
            goto L_0x0026
        L_0x001e:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0032 }
        L_0x0026:
            r0 = 0
            r3.c = r0     // Catch:{ all -> 0x0032 }
            r0 = 0
            r3.b = r0     // Catch:{ all -> 0x0032 }
            r3.a = r0     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.d.c():void");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        c();
        super.finalize();
    }

    public d(Context context, long j, boolean z) {
        Context applicationContext;
        this.d = new Object();
        iva.a((Object) context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.g = context;
        this.c = false;
        this.f = j;
    }

    static final void a(c cVar, long j, String str, Throwable th) {
        String str2;
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str3 = "1";
            hashMap.put("app_context", str3);
            if (cVar != null) {
                if (!cVar.b) {
                    str3 = "0";
                }
                hashMap.put("limit_ad_tracking", str3);
            }
            if (!(cVar == null || (str2 = cVar.a) == null)) {
                hashMap.put("ad_id_size", Integer.toString(str2.length()));
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            if (!str.isEmpty()) {
                hashMap.put("experiment_id", str);
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new a(hashMap).start();
        }
    }

    public final void a() {
        a(true);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        com.google.android.gms.ads.identifier.internal.d dVar;
        iva.b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                c();
            }
            Context context = this.g;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int b2 = hxk.d.b(context);
                if (b2 != 0) {
                    if (b2 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                hwz hwz = new hwz();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (jca.a().a(context, intent, hwz, 1)) {
                    this.a = hwz;
                    IBinder a2 = hwz.a(10000, TimeUnit.MILLISECONDS);
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (!(queryLocalInterface instanceof com.google.android.gms.ads.identifier.internal.d)) {
                        dVar = new b(a2);
                    } else {
                        dVar = (com.google.android.gms.ads.identifier.internal.d) queryLocalInterface;
                    }
                    this.b = dVar;
                    this.c = true;
                    if (z) {
                        d();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException e2) {
                throw new hxw();
            } catch (InterruptedException e3) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }
}
