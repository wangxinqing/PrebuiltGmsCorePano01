package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: aacm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aacm extends qvy implements Handler.Callback, IBinder.DeathRecipient, aabz {
    public static final /* synthetic */ int i = 0;
    public final List a = new ArrayList();
    public final aacn b;
    public final int c;
    public nsy d;
    public boolean e = false;
    public boolean f = false;
    public IBinder g = null;
    public final /* synthetic */ aacp h;
    private final Messenger j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aacm(aacp aacp, aacn aacn, Looper looper, int i2) {
        super("scheduler");
        this.h = aacp;
        this.b = aacn;
        this.c = i2;
        this.j = new Messenger(new qvr(looper, this));
    }

    public static final Bundle a(aaco aaco) {
        Bundle bundle = new Bundle();
        aabq aabq = aaco.b.a;
        bundle.putString("tag", aabq.e());
        bundle.putParcelable("component", aabq.f());
        bundle.putParcelable("extras", aabq.n.m);
        if (axlu.e()) {
            bundle.putLong("max_exec_duration", aaco.b.l());
        }
        if (aabq.q()) {
            bundle.putParcelableArrayList("triggered_uris", new ArrayList(aabq.d()));
        }
        Bundle a2 = aaco.b.h.a();
        if (!a2.isEmpty()) {
            bundle.putBundle("engine_flags", a2);
        }
        return bundle;
    }

    public final void b() {
        synchronized (this.h.a) {
            String valueOf = String.valueOf(this.b.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 176);
            sb.append("Dropping task as app's play services SDK version does not support Android O. Either update the SDK or lower your app's target SDK version. Canceling all tasks for the service: ");
            sb.append(valueOf);
            Log.e("NetworkScheduler.TED", sb.toString());
            aaaz aaaz = aabg.a().a;
            if (aaaz != null) {
                aacn aacn = this.b;
                aaaz.a(qyl.a(aacn.a, aacn.c));
            }
        }
    }

    public final void binderDied() {
        close();
    }

    public final void c() {
        synchronized (this.h.a) {
            if (this.d != null) {
                for (aaco aaco : this.a) {
                    if (!aaco.a.a.a()) {
                        try {
                            nsy nsy = this.d;
                            if (nsy != null) {
                                nsy.a(a(a(aaco), 1));
                            }
                            aaco.a.b((Object) 1);
                        } catch (RemoteException e2) {
                            aaco.a.b((Object) 2048);
                            onServiceDisconnected(this.b.c);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void close() {
        if (axlu.c()) {
            this.h.e.execute(new aacl(this));
        } else {
            this.h.a(this);
        }
    }

    public final void d() {
        synchronized (this.h.a) {
            if (this.d != null) {
                this.h.a(this);
                this.d = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            aacp r0 = r4.h
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            aacn r1 = r4.b     // Catch:{ all -> 0x003e }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x003e }
            int r2 = r5.sendingUid     // Catch:{ all -> 0x003e }
            int r1 = r1.b     // Catch:{ all -> 0x003e }
            r3 = 0
            if (r2 != r1) goto L_0x003c
            int r1 = r5.what     // Catch:{ all -> 0x003e }
            r2 = 3
            if (r1 != r2) goto L_0x003c
            android.os.Bundle r1 = r5.getData()     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "tag"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x003e }
            aaco r1 = r4.a((java.lang.String) r1)     // Catch:{ all -> 0x003e }
            java.util.List r2 = r4.a     // Catch:{ all -> 0x003e }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x002e
            r4.close()     // Catch:{ all -> 0x003e }
        L_0x002e:
            if (r1 == 0) goto L_0x003a
            aabx r1 = r1.b     // Catch:{ all -> 0x003e }
            int r5 = r5.arg1     // Catch:{ all -> 0x003e }
            r1.a((int) r5)     // Catch:{ all -> 0x003e }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            r5 = 1
            return r5
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return r3
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return r3
        L_0x003e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aacm.handleMessage(android.os.Message):boolean");
    }

    public final aaco a(String str) {
        synchronized (this.h.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                aaco aaco = (aaco) it.next();
                if (ius.a(str, aaco.b.a.e())) {
                    it.remove();
                    return aaco;
                }
            }
            return null;
        }
    }

    public final Message a(Bundle bundle, int i2) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.replyTo = this.j;
        obtain.setData(bundle);
        return obtain;
    }

    public final void a() {
        if (!axlu.c()) {
            b();
        } else {
            this.h.e.execute(new aack(this));
        }
    }

    public final void a(ComponentName componentName) {
        if (!axlu.c()) {
            d();
        } else {
            this.h.e.execute(new aacj(this));
        }
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        if (!axlu.c()) {
            a(iBinder);
        } else {
            this.h.e.execute(new aaci(this, iBinder));
        }
    }

    public final void a(Context context) {
        int i2 = this.c;
        if (i2 == 1) {
            try {
                this.h.f.a(context, (ServiceConnection) this);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Error while unbinding: ");
                sb.append(valueOf);
                Log.w("NetworkScheduler.TED", sb.toString());
            }
        } else if (i2 == 2) {
            try {
                context.unbindService(this);
            } catch (IllegalArgumentException | IllegalStateException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
                sb2.append("Error while unbinding: ");
                sb2.append(valueOf2);
                Log.w("NetworkScheduler.TED", sb2.toString());
            }
        } else if (i2 != 3) {
            StringBuilder sb3 = new StringBuilder(42);
            sb3.append("Unexpected execution strategy: ");
            sb3.append(i2);
            Log.e("NetworkScheduler.TED", sb3.toString());
        } else {
            IBinder iBinder = this.g;
            if (iBinder != null) {
                try {
                    iBinder.unlinkToDeath(this, 0);
                } catch (NoSuchElementException e4) {
                    Log.e("NetworkScheduler.TED", "Binder unlinkToDeath failed", e4);
                }
            }
            nsy nsy = this.d;
            if (nsy == null) {
                Log.w("NetworkScheduler.TED", "Couldn't unbind from the task service in remote user");
                return;
            }
            try {
                nsy.b();
            } catch (RemoteException e5) {
                String valueOf3 = String.valueOf(e5);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 40);
                sb4.append("Failed to close remote binder connection");
                sb4.append(valueOf3);
                Log.e("NetworkScheduler.TED", sb4.toString());
            }
        }
    }

    public final void a(IBinder iBinder) {
        synchronized (this.h.a) {
            if (aaby.a(iBinder)) {
                a((nsy) new nsx(iBinder, this));
            } else {
                a();
            }
        }
    }

    public final void a(nsy nsy) {
        this.e = true;
        this.d = nsy;
        if (!this.f || this.c != 3 || !axbn.a.a().t()) {
            c();
            return;
        }
        Context b2 = this.h.c.b(0);
        if (b2 == null) {
            String valueOf = String.valueOf(this.b.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Unable to get context for ");
            sb.append(valueOf);
            Log.e("NetworkScheduler.TED", sb.toString());
            return;
        }
        a(b2);
    }
}
