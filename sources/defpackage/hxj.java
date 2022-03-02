package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.R;

/* renamed from: hxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hxj extends hxk {
    public static final hxj a = new hxj();
    public static final int b = hxk.c;
    private static final Object e = new Object();

    public final Dialog a(Activity activity, int i, int i2) {
        return a(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    public final boolean b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return a((Context) activity, i, (isl) new isi(b(activity, i, "d"), activity, i2), onCancelListener);
    }

    public final Dialog a(Context context, int i, isl isl, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(isf.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e2 = isf.e(context, i);
        if (e2 != null) {
            builder.setPositiveButton(e2, isl);
        }
        String a2 = isf.a(context, i);
        if (a2 != null) {
            builder.setTitle(a2);
        }
        return builder.create();
    }

    public final ifq a(Context context, ifp ifp) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        ifq ifq = new ifq(ifp);
        context.registerReceiver(ifq, intentFilter);
        ifq.a = context;
        if (hxz.a(context, "com.google.android.gms")) {
            return ifq;
        }
        ifp.a();
        ifq.a();
        return null;
    }

    public final void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof gl) {
                hl at = ((gl) activity).at();
                hye hye = new hye();
                iva.a((Object) dialog, (Object) "Cannot display null dialog");
                dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                hye.ag = dialog;
                if (onCancelListener != null) {
                    hye.ah = onCancelListener;
                }
                hye.show(at, str);
                return;
            }
        } catch (NoClassDefFoundError e2) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        hxf hxf = new hxf();
        iva.a((Object) dialog, (Object) "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        hxf.a = dialog;
        if (onCancelListener != null) {
            hxf.b = onCancelListener;
        }
        hxf.show(fragmentManager, str);
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context) {
        new hxi(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    public final void a(Context context, int i) {
        a(context, i, (String) null);
    }

    public final void a(Context context, int i, String str) {
        a(context, i, str, c(context, i, "n"));
    }

    public final void a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), str}), new IllegalArgumentException());
        if (i == 18) {
            a(context);
        } else if (pendingIntent != null) {
            String b2 = isf.b(context, i);
            String d = isf.d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            je jeVar = new je(context);
            jeVar.r = true;
            jeVar.a(true);
            jeVar.e(b2);
            jd jdVar = new jd();
            jdVar.a((CharSequence) d);
            jeVar.a((jh) jdVar);
            jix.i(context);
            jeVar.b(17301642);
            jeVar.d(resources.getString(R.string.common_google_play_services_notification_ticker));
            jeVar.a(System.currentTimeMillis());
            jeVar.f = pendingIntent;
            jeVar.b((CharSequence) d);
            if (jkr.e()) {
                iva.a(jkr.e());
                synchronized (e) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b3 = isf.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b3, 4));
                } else if (!b3.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(b3);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                jeVar.z = "com.google.android.gms.availability";
            }
            Notification b4 = jeVar.b();
            if (i == 1 || i == 2 || i == 3) {
                hxz.d.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            if (str != null) {
                notificationManager.notify(str, i2, b4);
            } else {
                notificationManager.notify(i2, b4);
            }
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
