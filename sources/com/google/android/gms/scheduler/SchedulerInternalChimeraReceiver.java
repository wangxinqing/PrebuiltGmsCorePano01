package com.google.android.gms.scheduler;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.gcm.PendingCallback;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SchedulerInternalChimeraReceiver extends BroadcastReceiver {
    private static final nz c = new nz();
    private static final Binder d = new Binder();
    private static final aoru e = jfm.b(10);
    private final Handler b = new qvr(Looper.getMainLooper());

    private static Set a(Intent intent) {
        return qwb.a(intent.getIntArrayExtra("content_uri_flags_array"), intent.getParcelableArrayExtra("content_uri_array"));
    }

    public final void onReceive(Context context, Intent intent) {
        Throwable th;
        IBinder binder;
        ntb ntb;
        Intent intent2;
        Throwable th2;
        Context context2 = context;
        Intent intent3 = intent;
        if ("com.google.android.gms.gcm.ACTION_CHECK_QUEUE".equals(intent.getAction())) {
            aaaz aaaz = aabg.a().a;
            if (aaaz != null) {
                amkr a = amlv.a("NetworkScheduler_alarmUp");
                try {
                    aaaz.b.execute(aaax.a(aaaz.a, nxn.ALARM_MANAGER));
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    apev.a(th2, th3);
                }
            } else {
                Log.e("NetworkScheduler.SIR", "GmsTaskScheduler unavailable.");
                return;
            }
        } else if ("com.google.android.gms.gcm.ACTION_HTTP_OK".equals(intent.getAction())) {
            aaaz.a();
            return;
        } else if ("com.google.android.gms.gcm.ACTION_EXECUTE_TASK".equals(intent.getAction())) {
            String stringExtra = intent3.getStringExtra("tag");
            Parcelable parcelableExtra = intent3.getParcelableExtra("callback");
            Bundle bundle = (Bundle) intent3.getParcelableExtra("extras");
            ComponentName componentName = (ComponentName) intent3.getParcelableExtra("component");
            long longExtra = intent3.getLongExtra("max_exec_duration", 180);
            if (componentName == null || TextUtils.isEmpty(componentName.getPackageName())) {
                Log.e("NetworkScheduler.SIR", "No package provided.");
                setResultCode(16);
                return;
            } else if (!(parcelableExtra instanceof PendingCallback) && !(parcelableExtra instanceof com.google.android.gms.libs.scheduler.PendingCallback)) {
                Log.e("NetworkScheduler.SIR", "Invalid callback provided.");
                setResultCode(16);
                return;
            } else if (!axbn.g() || a(context, intent)) {
                Intent a2 = aabx.a(context.getPackageManager(), componentName, stringExtra, parcelableExtra, bundle, longExtra, intent3.getBundleExtra("engine_flags"));
                if (a2 == null) {
                    setResultCode(32);
                    return;
                }
                try {
                    if (context2.startService(a2) == null) {
                        setResultCode(128);
                        return;
                    } else {
                        setResultCode(1);
                        return;
                    }
                } catch (SecurityException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e("NetworkScheduler.SIR", valueOf.length() == 0 ? new String("SecurityException starting service: ") : "SecurityException starting service: ".concat(valueOf));
                    setResultCode(8);
                    return;
                } catch (IllegalStateException e3) {
                    String valueOf2 = String.valueOf(e3.getMessage());
                    Log.e("NetworkScheduler.SIR", valueOf2.length() == 0 ? new String("IllegalStateException starting service: ") : "IllegalStateException starting service: ".concat(valueOf2));
                    setResultCode(64);
                    return;
                }
            } else {
                setResultCode(16);
                return;
            }
        } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
            int intExtra = intent3.getIntExtra("OP_CODE", -1);
            if (intExtra == 1) {
                nqw.a(context);
                for (qvz qvz : a(intent)) {
                    if (!c.containsKey(qvz)) {
                        aaep aaep = new aaep(context2, this.b, qvz);
                        if (c.put(qvz, aaep) == null) {
                            try {
                                context.getContentResolver().registerContentObserver(qvz.a, qvz.a(), aaep);
                            } catch (IllegalArgumentException | SecurityException e4) {
                                String valueOf3 = String.valueOf(qvz);
                                String valueOf4 = String.valueOf(e4);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 42 + String.valueOf(valueOf4).length());
                                sb.append("Failed to register content observer for ");
                                sb.append(valueOf3);
                                sb.append(": ");
                                sb.append(valueOf4);
                                Log.w("NetworkScheduler.SIR", sb.toString());
                                c.remove(qvz);
                            }
                        }
                    }
                }
                return;
            } else if (intExtra == 2) {
                Set<qvz> a3 = a(intent);
                ContentResolver contentResolver = context.getContentResolver();
                for (qvz remove : a3) {
                    aaep aaep2 = (aaep) c.remove(remove);
                    if (aaep2 != null) {
                        contentResolver.unregisterContentObserver(aaep2);
                    }
                }
                return;
            } else if (intExtra == 3) {
                Set a4 = a(intent);
                Parcelable[] parcelableArrayExtra = intent3.getParcelableArrayExtra("triggered_uris");
                if (a4.size() == 1 && parcelableArrayExtra != null && parcelableArrayExtra.length == 1) {
                    int intExtra2 = intent3.getIntExtra("user_serial", -1);
                    aaaz aaaz2 = aabg.a().a;
                    if (aaaz2 != null) {
                        qvz qvz2 = (qvz) a4.iterator().next();
                        Uri uri = (Uri) parcelableArrayExtra[0];
                        amkr a5 = amlv.a("NetworkScheduler_onContentUpdate");
                        try {
                            aaaz2.b.execute(amll.a((Runnable) new aaax(7, aaaz2.a, nxn.CONTENT_URI_UPDATED, (aabq) null, (qyl) null, qvz2, uri, intExtra2)));
                            if (a5 != null) {
                                a5.close();
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            apev.a(th, th4);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (intExtra == 4) {
                int intExtra3 = intent3.getIntExtra("user_serial", -1);
                aaaz aaaz3 = aabg.a().a;
                if (aaaz3 != null) {
                    aaaz3.b.execute(new aaax(8, aaaz3.a, nxn.CAUSE_UNKNOWN, (aabq) null, (qyl) null, (qvz) null, (Uri) null, intExtra3));
                    return;
                }
                return;
            } else if (intExtra != 5) {
                Log.w("NetworkScheduler.SIR", "Unrecognised action received by internal scheduler receiver.");
                return;
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putBinder("binder", d);
                Context applicationContext = context.getApplicationContext();
                Bundle extras = intent.getExtras();
                aoru b2 = jfm.b(10);
                aacf aacf = null;
                if (!(extras == null || (binder = extras.getBinder("callback")) == null || !aaby.a("com.google.android.gms.gcm.IMessengerProxyCallback", binder))) {
                    IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.gcm.IMessengerProxyCallback");
                    if (queryLocalInterface instanceof ntb) {
                        ntb = (ntb) queryLocalInterface;
                    } else {
                        ntb = new nsz(binder);
                    }
                    if (!(ntb == null || (intent2 = (Intent) extras.getParcelable("intent")) == null)) {
                        aacf = new aacf(applicationContext, ntb, intent2, b2);
                    }
                }
                if (aacf != null) {
                    setResultExtras(bundle2);
                    e.execute(aacf);
                    return;
                }
                return;
            }
        } else {
            String stringExtra2 = intent3.getStringExtra("package");
            if (stringExtra2 == null) {
                Log.e("NetworkScheduler.SIR", "Trying to send multi-user initialization message but got no package to send to.");
                return;
            }
            int intExtra4 = intent3.getIntExtra("user_serial", -1);
            if (intExtra4 == -1) {
                Log.e("NetworkScheduler.SIR", "Trying to send multi-user initialization message but got an invalid user serial.");
                return;
            } else if (!axbn.g() || a(context, intent)) {
                aacu.a(context2, ntx.a(stringExtra2, intExtra4));
                return;
            } else {
                return;
            }
        }
        throw th2;
        throw th;
    }

    private static final boolean a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("user_serial", -1);
        if (intExtra != -1) {
            nqw.a(context);
            int d2 = nqw.d();
            if (intExtra != d2) {
                Log.e("NetworkScheduler.SIR", String.format(Locale.ENGLISH, "Received broadcast destined for user %d at user %d", new Object[]{Integer.valueOf(intExtra), Integer.valueOf(d2)}));
                return false;
            }
        }
        return true;
    }
}
