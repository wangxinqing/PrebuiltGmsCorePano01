package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.location.quake.SeismicDataCollectionManager$QuakeAlarmsManager$1;

/* renamed from: ajey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajey extends ajgs {
    public final amsv a;
    public final ajfa b;
    final PendingIntent c;
    public long d;
    public boolean e;
    private final nla i = new SeismicDataCollectionManager$QuakeAlarmsManager$1(this, "location");
    private final Context j;
    private final jbs k;

    public ajey(Context context, amsv amsv, jbs jbs, ajfa ajfa) {
        super("QAlarms");
        this.j = context;
        this.k = jbs;
        this.a = amsv;
        this.b = ajfa;
        Intent intent = new Intent("com.google.android.location.intent.action.ONLINE_CHECKIN_ALARM");
        intent.setPackage(this.j.getPackageName());
        this.c = PendingIntent.getBroadcast(this.j, 0, intent, 134217728);
    }

    public final void a() {
        jjg jjg = ajfj.a;
        this.k.a(this.c);
        this.j.registerReceiver(this.i, new IntentFilter("com.google.android.location.intent.action.ONLINE_CHECKIN_ALARM"), (String) null, this.h.b);
        c();
        this.e = true;
        this.h.c();
    }

    public final void b() {
        jjg jjg = ajfj.a;
        this.e = false;
        this.k.a(this.c);
        this.j.unregisterReceiver(this.i);
    }

    public final void c() {
        long j2;
        jbs jbs = this.k;
        long j3 = this.d;
        long quakeApiAlarmOnlineMs = ayel.a.a().quakeApiAlarmOnlineMs();
        if (j3 != 0) {
            j2 = j3 + quakeApiAlarmOnlineMs;
        } else {
            j2 = 1;
        }
        jjg jjg = ajfj.a;
        this.a.a();
        jbs.b("QMonitor", 2, j2, this.c);
    }
}
