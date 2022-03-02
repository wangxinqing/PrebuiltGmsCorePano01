package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.chimera.Service;
import com.google.android.gms.mdm.services.BaseLockscreenMessageChimeraService$1;
import com.google.android.gms.mdm.services.BaseLockscreenMessageChimeraService$2;

/* renamed from: smu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class smu extends Service {
    private final BroadcastReceiver a = new BaseLockscreenMessageChimeraService$1("security");
    private final BroadcastReceiver b = new BaseLockscreenMessageChimeraService$2("security");

    public static void a(Context context) {
        smo.f.a((Object) "");
        smo.g.a((Object) "");
        context.stopService(new Intent().setClassName(context, "com.google.android.gms.mdm.services.LockscreenMessageService"));
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int b();

    /* access modifiers changed from: protected */
    public abstract int c();

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        registerReceiver(this.b, new IntentFilter("android.intent.action.USER_PRESENT"));
        registerReceiver(this.a, new IntentFilter("android.intent.action.SCREEN_ON"));
    }

    public final void onDestroy() {
        alv.a((Context) this).a(new Intent("com.google.android.gms.mdm.DISMISS_MESSAGE"));
        unregisterReceiver(this.b);
        unregisterReceiver(this.a);
        stopForeground(true);
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        je jeVar;
        String stringExtra = intent.getStringExtra("lock_message");
        if (TextUtils.isEmpty(stringExtra)) {
            stopSelf();
            return 2;
        }
        smo.f.a((Object) stringExtra);
        String stringExtra2 = intent.getStringExtra("lock_phone_number");
        if (!TextUtils.isEmpty(stringExtra2)) {
            smo.g.a((Object) stringExtra2);
        }
        int a2 = hdg.a(this, a());
        snh.b(this);
        if (jkr.e()) {
            jeVar = new je(this, "find_my_device");
        } else {
            jeVar = new je(this);
        }
        jeVar.b(a2);
        jeVar.e(getString(b()));
        jeVar.b((CharSequence) stringExtra);
        jd jdVar = new jd();
        jdVar.a((CharSequence) stringExtra);
        jeVar.a((jh) jdVar);
        jeVar.f = PendingIntent.getActivity(this, 0, smf.a(this, stringExtra, stringExtra2, true), 0);
        jeVar.u = kf.b(this, c());
        jeVar.j = 2;
        jeVar.s = "msg";
        jeVar.e();
        Notification b2 = jeVar.b();
        snb.d(this);
        startForeground(76183, b2);
        startActivity(smf.a(this, stringExtra, stringExtra2, false));
        return 3;
    }

    public static void a(Context context, String str, String str2) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.mdm.services.LockscreenMessageService");
        className.putExtra("lock_message", str);
        if (!TextUtils.isEmpty(str2)) {
            className.putExtra("lock_phone_number", str2);
        }
        context.startService(className);
    }
}
