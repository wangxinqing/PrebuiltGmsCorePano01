package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: jn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jn implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public jn(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(this.c.getLooper(), this);
    }

    private final void a(jm jmVar) {
        if (jmVar.b) {
            this.b.unbindService(this);
            jmVar.b = false;
        }
        jmVar.e = null;
    }

    private final void b(jm jmVar) {
        if (!this.a.hasMessages(3, jmVar.a)) {
            int i = jmVar.d + 1;
            jmVar.d = i;
            if (i > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + jmVar.c.size() + " tasks to " + jmVar.a + " after " + jmVar.d + " retries");
                jmVar.c.clear();
                return;
            }
            this.a.sendMessageDelayed(this.a.obtainMessage(3, jmVar.a), (long) ((1 << (i - 1)) * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r10.b != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(defpackage.jm r10) {
        /*
            r9 = this;
            java.util.ArrayDeque r0 = r10.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00be
            boolean r0 = r10.b
            java.lang.String r1 = "NotifManCompat"
            r2 = 0
            if (r0 != 0) goto L_0x004a
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r0.<init>(r3)
            android.content.ComponentName r3 = r10.a
            android.content.Intent r0 = r0.setComponent(r3)
            android.content.Context r3 = r9.b
            r4 = 33
            boolean r0 = r3.bindService(r0, r9, r4)
            r10.b = r0
            if (r0 != 0) goto L_0x0044
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unable to bind to listener "
            r0.append(r3)
            android.content.ComponentName r3 = r10.a
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            android.content.Context r0 = r9.b
            r0.unbindService(r9)
            goto L_0x0046
        L_0x0044:
            r10.d = r2
        L_0x0046:
            boolean r0 = r10.b
            if (r0 == 0) goto L_0x00bb
        L_0x004a:
            in r0 = r10.e
            if (r0 == 0) goto L_0x00bb
        L_0x004e:
            java.util.ArrayDeque r0 = r10.c
            java.lang.Object r0 = r0.peek()
            jk r0 = (defpackage.jk) r0
            if (r0 == 0) goto L_0x00af
            in r3 = r10.e     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            java.lang.String r4 = r0.a     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            int r5 = r0.b     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            java.lang.String r6 = r0.c     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            android.app.Notification r0 = r0.d     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            java.lang.String r8 = "android.support.v4.app.INotificationSideChannel"
            r7.writeInterfaceToken(r8)     // Catch:{ all -> 0x0091 }
            r7.writeString(r4)     // Catch:{ all -> 0x0091 }
            r7.writeInt(r5)     // Catch:{ all -> 0x0091 }
            r7.writeString(r6)     // Catch:{ all -> 0x0091 }
            r4 = 1
            if (r0 == 0) goto L_0x007e
            r7.writeInt(r4)     // Catch:{ all -> 0x0091 }
            r0.writeToParcel(r7, r2)     // Catch:{ all -> 0x0091 }
            goto L_0x0082
        L_0x007e:
            r7.writeInt(r2)     // Catch:{ all -> 0x0091 }
        L_0x0082:
            android.os.IBinder r0 = r3.a     // Catch:{ all -> 0x0091 }
            r3 = 0
            r0.transact(r4, r7, r3, r4)     // Catch:{ all -> 0x0091 }
            r7.recycle()     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            java.util.ArrayDeque r0 = r10.c     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            r0.remove()     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            goto L_0x004e
        L_0x0091:
            r0 = move-exception
            r7.recycle()     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
            throw r0     // Catch:{ DeadObjectException -> 0x00ae, RemoteException -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "RemoteException communicating with "
            r2.append(r3)
            android.content.ComponentName r3 = r10.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r1, r2, r0)
            goto L_0x00af
        L_0x00ae:
            r0 = move-exception
        L_0x00af:
            java.util.ArrayDeque r0 = r10.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ba
            r9.b(r10)
        L_0x00ba:
            return
        L_0x00bb:
            r9.b(r10)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn.c(jm):void");
    }

    public final boolean handleMessage(Message message) {
        in inVar;
        int i = message.what;
        if (i == 0) {
            jk jkVar = (jk) message.obj;
            Set a2 = jo.a(this.b);
            if (!a2.equals(this.e)) {
                this.e = a2;
                List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (a2.contains(next.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.d.containsKey(componentName2)) {
                        this.d.put(componentName2, new jm(componentName2));
                    }
                }
                Iterator it = this.d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        a((jm) entry.getValue());
                        it.remove();
                    }
                }
            }
            for (jm jmVar : this.d.values()) {
                jmVar.c.add(jkVar);
                c(jmVar);
            }
            return true;
        } else if (i == 1) {
            jl jlVar = (jl) message.obj;
            ComponentName componentName3 = jlVar.a;
            IBinder iBinder = jlVar.b;
            jm jmVar2 = (jm) this.d.get(componentName3);
            if (jmVar2 != null) {
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    inVar = (queryLocalInterface == null || !(queryLocalInterface instanceof in)) ? new in(iBinder) : (in) queryLocalInterface;
                } else {
                    inVar = null;
                }
                jmVar2.e = inVar;
                jmVar2.d = 0;
                c(jmVar2);
            }
            return true;
        } else if (i == 2) {
            jm jmVar3 = (jm) this.d.get((ComponentName) message.obj);
            if (jmVar3 != null) {
                a(jmVar3);
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            jm jmVar4 = (jm) this.d.get((ComponentName) message.obj);
            if (jmVar4 != null) {
                c(jmVar4);
            }
            return true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new jl(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
