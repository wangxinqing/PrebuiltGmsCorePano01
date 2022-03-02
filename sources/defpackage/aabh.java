package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.PeriodicTask;
import com.google.android.gms.gcm.Task;

/* renamed from: aabh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aabh implements Runnable {
    private final Context a;
    private final Intent b;

    public aabh(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    private static final qxl a(nto nto) {
        Bundle bundle = new Bundle();
        bundle.putInt("retry_policy", nto.b);
        bundle.putInt("initial_backoff_seconds", 30);
        bundle.putInt("maximum_backoff_seconds", 3600);
        qxl a2 = qxl.a(bundle);
        iva.a((Object) a2);
        return a2;
    }

    public final void run() {
        String str;
        qxx qxx;
        aaaz aaaz;
        aaaz aaaz2;
        aaaz aaaz3;
        if (!axbn.a.a().W() || a(this.b)) {
            nqw.a(this.a);
            int d = nqw.d();
            if (d == 0) {
                aaaz aaaz4 = aabg.a().a;
                if (aaaz4 != null) {
                    String action = this.b.getAction();
                    int intExtra = this.b.getIntExtra("user_serial", 0);
                    aaaz aaaz5 = aaaz4;
                    if ("com.google.android.gms.gcm.ACTION_TRIGGER_TASK".equals(action)) {
                        Intent intent = this.b;
                        Context context = this.a;
                        String stringExtra = intent.getStringExtra("component");
                        String stringExtra2 = intent.getStringExtra("tag");
                        if (TextUtils.isEmpty(stringExtra)) {
                            Log.e("NetworkScheduler", "Error triggering debug task - no component name provided. Did you use the correct key ('component')?");
                        } else if (TextUtils.isEmpty(stringExtra2)) {
                            Log.e("NetworkScheduler", "Error triggering debug task - no tag provided. Did you use the correct key ('tag')?");
                        } else {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(stringExtra);
                            if (unflattenFromString == null) {
                                Log.e("NetworkScheduler", "Error triggering debug task - Component name could not be resolved.");
                            } else if (!axbu.a.a().a() || !unflattenFromString.getPackageName().equals("com.google.android.gms") || hxz.g(context)) {
                                aaaz aaaz6 = aabg.a().a;
                                if (aaaz6 == null) {
                                    Log.e("NetworkScheduler", "Error triggering debug task - network scheduler unavailable.Are you running as u0?");
                                    return;
                                }
                                Bundle bundle = (Bundle) intent.getParcelableExtra("extras");
                                try {
                                    qxf qxf = new qxf();
                                    qxf.k = stringExtra2;
                                    qxf.i = unflattenFromString.getClassName();
                                    qxf.a(0, 1);
                                    qxf.b(1);
                                    qxf.a(2);
                                    qxf.s = bundle;
                                    aabq a2 = aabq.a(qxf.b(), unflattenFromString, SystemClock.elapsedRealtime(), 0);
                                    a2.j = aadn.a(1, 0);
                                    aaaz6.a(a2);
                                } catch (IllegalArgumentException e) {
                                    String valueOf = String.valueOf(e);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                                    sb.append("Failed to schedule Task: ");
                                    sb.append(valueOf);
                                    Log.e("NetworkScheduler", sb.toString());
                                }
                            } else {
                                Log.e("NetworkScheduler", "Error triggering debug task - Triggering a GMS Core task on a non-userdebug build is not allowed.");
                            }
                        }
                    } else if ("android.intent.action.USER_REMOVED".equals(action)) {
                        int intExtra2 = this.b.getIntExtra("android.intent.extra.user_handle", -1);
                        if (intExtra2 != -1) {
                            aabg.a().d.a(nqw.b(intExtra2));
                        }
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        aabg.a().d.b(1);
                    } else if ("com.google.android.gms.gcm.ACTION_SCHEDULE".equals(action) || "com.google.android.gms.gcm.nts.ACTION_SCHEDULE".equals(action)) {
                        Parcelable parcelableExtra = this.b.getParcelableExtra("app");
                        if (!(parcelableExtra instanceof PendingIntent)) {
                            Log.e("NetworkScheduler", "Invalid parameter app");
                            str = null;
                        } else {
                            int i = Build.VERSION.SDK_INT;
                            String creatorPackage = ((PendingIntent) parcelableExtra).getCreatorPackage();
                            if (creatorPackage == null || TextUtils.isEmpty(creatorPackage)) {
                                str = null;
                            } else {
                                ntx a3 = ntx.a(creatorPackage, intExtra);
                                try {
                                    a3.b(aabg.a().c, 0);
                                    str = creatorPackage;
                                } catch (PackageManager.NameNotFoundException e2) {
                                    String valueOf2 = String.valueOf(a3);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                                    sb2.append("Provided package not found: ");
                                    sb2.append(valueOf2);
                                    Log.e("NetworkScheduler", sb2.toString());
                                    str = null;
                                }
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            Log.e("NetworkScheduler", "Invalid package name : Perhaps you didn't include a PendingIntent in the extras?");
                            return;
                        }
                        Intent intent2 = this.b;
                        String stringExtra3 = intent2.getStringExtra("scheduler_action");
                        if (TextUtils.isEmpty(stringExtra3)) {
                            Log.e("NetworkScheduler", "Broadcast provided with no action to the scheduler in Intent.");
                        } else if (!stringExtra3.equals("SCHEDULE_TASK")) {
                            String stringExtra4 = intent2.getStringExtra("tag");
                            ComponentName componentName = (ComponentName) intent2.getParcelableExtra("component");
                            if (componentName == null) {
                                Log.e("NetworkScheduler", "Invalid component specified.");
                                return;
                            }
                            ComponentName componentName2 = new ComponentName(str, componentName.getClassName());
                            if (stringExtra3.equals("ACTION_SCHEDULE")) {
                                aaaz = aaaz5;
                            } else if (stringExtra3.equals("ACTION_SCHEDULE")) {
                                aaaz = aaaz5;
                            } else {
                                if (stringExtra3.equals("SCHEDULE_RECURRING")) {
                                    aaaz2 = aaaz5;
                                } else if (stringExtra3.equals("NTS_SCHEDULE_RECURRING")) {
                                    aaaz2 = aaaz5;
                                } else {
                                    if (stringExtra3.equals("CANCEL_TASK")) {
                                        aaaz3 = aaaz5;
                                    } else if (stringExtra3.equals("NTS_CANCEL_TASK")) {
                                        aaaz3 = aaaz5;
                                    } else if (stringExtra3.equals("CANCEL_ALL") || stringExtra3.equals("NTS_CANCEL_ALL")) {
                                        aaaz5.a(qyl.a(intExtra, componentName2));
                                        return;
                                    } else {
                                        return;
                                    }
                                    aaaz3.b.execute(new aaax(3, aaaz3.a, nxn.CAUSE_UNKNOWN, (aabq) null, qyl.a(intExtra, componentName2, stringExtra4), (qvz) null, (Uri) null, -1));
                                    return;
                                }
                                long longExtra = intent2.getLongExtra("period", 0);
                                long longExtra2 = intent2.getLongExtra("period_flex", (long) (((float) longExtra) * 0.1f));
                                if (stringExtra4 == null) {
                                    stringExtra4 = "";
                                }
                                try {
                                    qxi qxi = new qxi();
                                    qxi.k = stringExtra4;
                                    qxi.i = componentName2.getClassName();
                                    qxi.a = longExtra;
                                    qxi.b = longExtra2;
                                    qxi.b(0);
                                    qxi.a(0);
                                    aabq a4 = aabq.a(qxi.b(), componentName2, SystemClock.elapsedRealtime(), intExtra);
                                    a4.j = aadn.a(2, intent2.getIntExtra("source_version", 5000000));
                                    aaaz2.a(a4);
                                    return;
                                } catch (IllegalArgumentException e3) {
                                    String valueOf3 = String.valueOf(e3);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                                    sb3.append("Failed to schedule Task: ");
                                    sb3.append(valueOf3);
                                    Log.e("NetworkScheduler", sb3.toString());
                                    return;
                                }
                            }
                            long longExtra3 = intent2.getLongExtra("window_start", 0);
                            if (longExtra3 < 0) {
                                StringBuilder sb4 = new StringBuilder(71);
                                sb4.append("Cannot specify a start time in the past: ");
                                sb4.append(longExtra3);
                                sb4.append(", aborting");
                                Log.e("NetworkScheduler", sb4.toString());
                            }
                            aaaz aaaz7 = aaaz;
                            long longExtra4 = intent2.getLongExtra("window_end", 0);
                            if (longExtra4 < 0) {
                                StringBuilder sb5 = new StringBuilder(70);
                                sb5.append("Cannot specify an end time in the past: ");
                                sb5.append(longExtra4);
                                sb5.append(", aborting");
                                Log.e("NetworkScheduler", sb5.toString());
                            }
                            boolean booleanExtra = intent2.getBooleanExtra("update_current", true);
                            if (stringExtra4 == null) {
                                stringExtra4 = "";
                            }
                            try {
                                qxf qxf2 = new qxf();
                                qxf2.k = stringExtra4;
                                qxf2.i = componentName2.getClassName();
                                qxf2.a(longExtra3, longExtra4);
                                qxf2.b(booleanExtra);
                                aabq a5 = aabq.a(qxf2.b(), componentName2, SystemClock.elapsedRealtime(), intExtra);
                                a5.j = aadn.a(2, intent2.getIntExtra("source_version", 5000000));
                                aaaz7.a(a5);
                            } catch (IllegalArgumentException e4) {
                                String valueOf4 = String.valueOf(e4);
                                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 25);
                                sb6.append("Failed to schedule Task: ");
                                sb6.append(valueOf4);
                                Log.e("NetworkScheduler", sb6.toString());
                            }
                        } else {
                            aaaz aaaz8 = aaaz5;
                            try {
                                Bundle bundleExtra = intent2.getBundleExtra("task_wrapper");
                                if (bundleExtra == null) {
                                    bundleExtra = intent2.getExtras();
                                }
                                if (bundleExtra != null) {
                                    Parcelable parcelable = bundleExtra.getParcelable("task");
                                    if (parcelable != null) {
                                        try {
                                            if (parcelable instanceof Task) {
                                                Task task = (Task) parcelable;
                                                if (task instanceof PeriodicTask) {
                                                    PeriodicTask periodicTask = (PeriodicTask) task;
                                                    qxi qxi2 = new qxi();
                                                    qxi2.i = periodicTask.c;
                                                    qxi2.b = periodicTask.b;
                                                    qxi2.a = periodicTask.a;
                                                    qxi2.a(0);
                                                    qxi2.k = periodicTask.d;
                                                    qxi2.n = periodicTask.f;
                                                    qxi2.b(periodicTask.e);
                                                    qxi2.r = a(periodicTask.g);
                                                    qxx = qxi2.b();
                                                } else if (task instanceof OneoffTask) {
                                                    OneoffTask oneoffTask = (OneoffTask) task;
                                                    qxf qxf3 = new qxf();
                                                    qxf3.i = oneoffTask.c;
                                                    qxf3.a(oneoffTask.a, oneoffTask.b);
                                                    qxf3.a(2);
                                                    qxf3.k = oneoffTask.d;
                                                    qxf3.n = oneoffTask.f;
                                                    qxf3.b(oneoffTask.e);
                                                    qxf3.r = a(oneoffTask.g);
                                                    qxx = qxf3.b();
                                                } else {
                                                    qxx = null;
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Invalid task class");
                                            }
                                        } catch (IllegalArgumentException e5) {
                                            String valueOf5 = String.valueOf(e5);
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf5).length() + 46);
                                            sb7.append("Failed to extract Task from schedule request: ");
                                            sb7.append(valueOf5);
                                            Log.e("NetworkScheduler", sb7.toString());
                                            qxx = null;
                                        }
                                    } else {
                                        qxx = qxx.a(bundleExtra);
                                    }
                                } else {
                                    qxx = null;
                                }
                                if (qxx != null) {
                                    try {
                                        aabq a6 = aabq.a(qxx, new ComponentName(str, qxx.e), SystemClock.elapsedRealtime(), intExtra);
                                        a6.j = aadn.a(intent2.getIntExtra("source", 4), intent2.getIntExtra("source_version", 0));
                                        aaaz8.a(a6);
                                    } catch (IllegalArgumentException e6) {
                                        Log.e("NetworkScheduler", e6.toString());
                                    }
                                } else {
                                    Log.e("NetworkScheduler", "Empty task parameter for schedule request");
                                }
                            } catch (IllegalArgumentException e7) {
                                String valueOf6 = String.valueOf(e7);
                                StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf6).length() + 26);
                                sb8.append("Exception unpacking task: ");
                                sb8.append(valueOf6);
                                Log.e("NetworkScheduler", sb8.toString());
                            }
                        }
                    } else {
                        String valueOf7 = String.valueOf(action);
                        Log.e("NetworkScheduler", valueOf7.length() == 0 ? new String("Unrecognised action provided: ") : "Unrecognised action provided: ".concat(valueOf7));
                    }
                }
            } else {
                Context context2 = this.a;
                Intent intent3 = this.b;
                Intent intent4 = new Intent(intent3);
                intent4.putExtra("user_serial", d);
                intent4.setClassName(context2, "com.google.android.gms.gcm.nts.SchedulerReceiver");
                Intent intent5 = ("com.google.android.gms.gcm.ACTION_SCHEDULE".equals(intent3.getAction()) || "com.google.android.gms.gcm.nts.ACTION_SCHEDULE".equals(intent3.getAction())) ? intent4 : "android.intent.action.USER_REMOVED".equals(intent3.getAction()) ? null : null;
                if (intent5 != null) {
                    nqw.a(this.a, 0, intent5, (String) null, (BroadcastReceiver) null, (Handler) null);
                }
            }
        } else {
            Log.e("NetworkScheduler", "Received task with invalid intent. Ignoring task.");
        }
    }

    private static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return true;
        }
        try {
            for (String str : extras.keySet()) {
                try {
                    extras.get(str);
                } catch (BadParcelableException e) {
                    String valueOf = String.valueOf(str);
                    Log.e("NetworkScheduler", valueOf.length() == 0 ? new String("Intent contains extra with bad key: ") : "Intent contains extra with bad key: ".concat(valueOf));
                    return false;
                }
            }
            return true;
        } catch (BadParcelableException e2) {
            Log.e("NetworkScheduler", "Failed to unmarshall extras.");
            return false;
        }
    }
}
