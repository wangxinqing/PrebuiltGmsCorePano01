package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.scheduler.PendingCallback;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class qwf extends Service implements qxa {
    final amsv f = amta.a((amsv) new qwe(this));

    public int a(qxz qxz) {
        throw null;
    }

    public void aH() {
    }

    public final boolean b(String str) {
        return "com.google.android.gms.gcm.ACTION_TASK_READY".equals(str);
    }

    public IBinder onBind(Intent intent) {
        String action;
        qwz qwz = (qwz) this.f.a();
        IInterface iInterface = null;
        if (intent == null || (action = intent.getAction()) == null || !qwz.m.b(action)) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        Binder binder = (Binder) qwz.e.getBinder();
        qyf qyf = new qyf(qwz, binder);
        String interfaceDescriptor = binder.getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            iInterface = binder.queryLocalInterface(interfaceDescriptor);
        }
        qyf.attachInterface(iInterface, interfaceDescriptor);
        return qyf;
    }

    public void onCreate() {
        super.onCreate();
        qwz qwz = (qwz) this.f.a();
        qwz.g = qwq.a((Context) qwz);
        qwz.e = new Messenger(new qwv(qwz, Looper.getMainLooper()));
        qwz.f = new ComponentName(qwz, qwz.c().getClass());
        qwz.h = qvu.d.a(qwz.getClass(), qwz);
    }

    public void onDestroy() {
        super.onDestroy();
        ((qwz) this.f.a()).a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        qwy qwy;
        ntc ntc;
        qxb qxb;
        qwz qwz = (qwz) this.f.a();
        if (intent != null) {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    if (stringExtra != null) {
                        Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                        Bundle bundleExtra = intent.getBundleExtra("extras");
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                        intent.getLongExtra("max_exec_duration", 180);
                        qwd a = qwd.a(intent.getBundleExtra("engine_flags"));
                        if (parcelableExtra instanceof PendingCallback) {
                            IBinder iBinder = ((PendingCallback) parcelableExtra).a;
                            if (iBinder != null) {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.libs.scheduler.IGmsTaskCallback");
                                qxb = !(queryLocalInterface instanceof qxd) ? new qxb(iBinder) : (qxd) queryLocalInterface;
                            } else {
                                qxb = null;
                            }
                            qwy = new qwy(qwz, stringExtra, (qxd) qxb, bundleExtra, (List) parcelableArrayListExtra, a);
                        } else if (!(parcelableExtra instanceof com.google.android.gms.gcm.PendingCallback)) {
                            String packageName = qwz.getPackageName();
                            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 47 + stringExtra.length());
                            sb.append(packageName);
                            sb.append(" ");
                            sb.append(stringExtra);
                            sb.append(": Could not process request, invalid callback.");
                            Log.e("GmsTaskChimeraService", sb.toString());
                        } else {
                            IBinder iBinder2 = ((com.google.android.gms.gcm.PendingCallback) parcelableExtra).a;
                            if (iBinder2 != null) {
                                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                                ntc = !(queryLocalInterface2 instanceof nte) ? new ntc(iBinder2) : (nte) queryLocalInterface2;
                            } else {
                                ntc = null;
                            }
                            qwy = new qwy(qwz, stringExtra, (nte) ntc, bundleExtra, (List) parcelableArrayListExtra, a);
                        }
                        if (!qwz.a(stringExtra)) {
                            qwz.a(qwy);
                        }
                    }
                } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 37);
                    sb2.append("Unknown action received ");
                    sb2.append(action);
                    sb2.append(", terminating");
                    Log.e("GmsTaskChimeraService", sb2.toString());
                } else {
                    qwz.b();
                }
            } catch (Throwable th) {
                qwz.a(i2);
                throw th;
            }
        }
        qwz.a(i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        String action;
        qwz qwz = (qwz) this.f.a();
        if (intent != null && (action = intent.getAction()) != null && qwz.m.b(action) && ((qwz.c() instanceof BoundService) || axbn.a.a().k())) {
            qwz.a();
        }
        return super.onUnbind(intent);
    }

    public final aorr a(qxz qxz, qxr qxr) {
        aorr aorr;
        qwz qwz = (qwz) this.f.a();
        iva.a((Object) qxr);
        synchronized (qwz.c) {
            aoru aoru = qwz.d;
            if (aoru == null) {
                Log.e("GmsTaskChimeraService", "Executor service has been shutdown before running the task.");
                aorr = aorl.a((Object) 1);
            } else {
                aorr = aoru.b(new qwt(qwz, qxz));
            }
        }
        return aorr;
    }
}
