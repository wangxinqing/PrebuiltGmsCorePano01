package com.google.android.gms.smartdevice.fastpair;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.smartdevice.setup.ui.DiscoveryChimeraActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NotificationBehaviorIntentOperation extends IntentOperation {
    private static final iwd b = acqa.a("Fastpair", "NotificationBehaviorIntentOperation");
    aucd a = anxg.g.o();

    public static PendingIntent a(Context context, String str, int i, byte[] bArr, byte[] bArr2) {
        Class<NotificationBehaviorIntentOperation> cls = NotificationBehaviorIntentOperation.class;
        Intent startIntent = IntentOperation.getStartIntent(context, (Class) cls, str);
        amrl.a((Object) startIntent, (Object) "Error getting NotificationBehaviorIntentOperation.");
        startIntent.putExtra("key_for_notification_id", i);
        startIntent.putExtra("key_for_notification_log", bArr);
        if (bArr2 != null) {
            startIntent.putExtra("key_for_fastpair_code", bArr2);
        }
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, (Class) cls, startIntent, 0, 134217728);
        amrl.a((Object) pendingIntent, (Object) "Getting null PendingIntent.");
        return pendingIntent;
    }

    public final void onHandleIntent(Intent intent) {
        iwd iwd = b;
        String valueOf = String.valueOf(intent.getAction());
        iwd.a(valueOf.length() == 0 ? new String("onHandleIntent(). Action: ") : "onHandleIntent(). Action: ".concat(valueOf), new Object[0]);
        String action = intent.getAction();
        try {
            anxg anxg = (anxg) aucj.a((aucj) anxg.g, intent.getByteArrayExtra("key_for_notification_log"));
            aucd aucd = (aucd) anxg.c(5);
            aucd.a((aucj) anxg);
            this.a = aucd;
        } catch (auda e) {
            b.a((Throwable) e);
        }
        anxe anxe = ((anxg) this.a.b).d;
        if (anxe == null) {
            anxe = anxe.d;
        }
        aucd aucd2 = (aucd) anxe.c(5);
        aucd2.a((aucj) anxe);
        if ("com.google.android.gms.smartdevice.fastpair.DISMISS".equals(action)) {
            b.b("Notification gets dismissed.", new Object[0]);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anxe anxe2 = (anxe) aucd2.b;
            anxe2.b = 2;
            anxe2.a |= 1;
            aucd aucd3 = this.a;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            anxg anxg2 = (anxg) aucd3.b;
            anxe anxe3 = (anxe) aucd2.i();
            anxg anxg3 = anxg.g;
            anxe3.getClass();
            anxg2.d = anxe3;
            anxg2.a |= 4;
            a(this.a);
            return;
        }
        iwq a2 = iwq.a((Context) this);
        int intExtra = intent.getIntExtra("key_for_notification_id", 0);
        if (!(a2 == null || intExtra == 0)) {
            a2.a(intExtra);
        }
        if ("com.google.android.gms.smartdevice.fastpair.OPEN".equals(action)) {
            b.b("Notification gets clicked.", new Object[0]);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anxe anxe4 = (anxe) aucd2.b;
            anxe4.b = 1;
            anxe4.a |= 1;
        } else if ("com.google.android.gms.smartdevice.fastpair.OPEN_ACTION".equals(action)) {
            b.b("Notification action gets clicked.", new Object[0]);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anxe anxe5 = (anxe) aucd2.b;
            anxe5.b = 3;
            anxe5.a |= 1;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_for_fastpair_code");
        aucd aucd4 = this.a;
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        anxg anxg4 = (anxg) aucd4.b;
        anxe anxe6 = (anxe) aucd2.i();
        anxg anxg5 = anxg.g;
        anxe6.getClass();
        anxg4.d = anxe6;
        anxg4.a |= 4;
        Intent a3 = DiscoveryChimeraActivity.a((Context) this);
        a3.putExtra("android.intent.extra.REFERRER_NAME", "fastpair");
        if (byteArrayExtra != null) {
            a3.putExtra("key_for_fastpair_code", byteArrayExtra);
        }
        a3.addFlags(536870912);
        a3.addFlags(268435456);
        startActivity(a3);
        a(this.a);
    }

    /* access modifiers changed from: package-private */
    public final void a(aucd aucd) {
        hol hol = new hol(this, "SMART_SETUP", (String) null);
        b.a(((anxg) aucd.i()).toString(), new Object[0]);
        if (azkn.b()) {
            aucd o = anwh.j.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anwh anwh = (anwh) o.b;
            anxg anxg = (anxg) aucd.i();
            anxg.getClass();
            anwh.i = anxg;
            anwh.a |= 128;
            hol.a((audx) (anwh) o.i()).b();
            return;
        }
        hol.a(((anxg) aucd.i()).k()).b();
    }
}
