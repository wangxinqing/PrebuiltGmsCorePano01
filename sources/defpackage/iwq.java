package defpackage;

import android.app.AutomaticZenRule;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: iwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwq {
    public final NotificationManager a;
    public final String b;
    public final iwo c;
    final boolean d;
    private final Context e;
    private final CharSequence f;
    private final Set g = Collections.newSetFromMap(new ConcurrentHashMap());

    public iwq(Context context, NotificationManager notificationManager, String str, CharSequence charSequence, iwo iwo, boolean z) {
        this.e = context;
        iva.a((Object) notificationManager);
        this.a = notificationManager;
        this.b = str;
        this.f = charSequence;
        this.c = iwo;
        this.d = z;
    }

    public static iwq a(Context context) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
        if (notificationManager == null) {
            return null;
        }
        String a2 = jil.a(applicationContext);
        if (!jkr.e()) {
            charSequence = "";
        } else {
            String a3 = jil.a(applicationContext);
            if (a3 != null) {
                CharSequence charSequence3 = (CharSequence) jil.a.get(a3);
                if (charSequence3 == null) {
                    CharSequence b2 = jil.b(applicationContext);
                    if (b2 != null) {
                        jil.a.put(a3, b2);
                    }
                    charSequence = b2;
                } else {
                    charSequence = charSequence3;
                }
            } else {
                charSequence = null;
            }
        }
        if (a2 == null || charSequence == null) {
            str = "gmscore";
            charSequence2 = jil.d(applicationContext);
        } else {
            charSequence2 = charSequence;
            str = a2;
        }
        if (applicationContext.getApplicationInfo() == null || applicationContext.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        } else {
            z = true;
        }
        synchronized (iwo.class) {
            if (iwo.a == null) {
                hol hol = new hol(applicationContext, "GMSCORE_NOTIFICATION_COUNTERS", (String) null);
                hol.a(avsd.UNMETERED_OR_DAILY);
                iwo.a = new hph(hol, "GMSCORE_NOTIFICATION_COUNTERS", 1024);
            }
        }
        return new iwq(applicationContext, notificationManager, str, charSequence2, new iwo(str), z);
    }

    public static final boolean f() {
        return !axaf.a.a().c();
    }

    public final void b() {
        this.c.b();
    }

    public final int c() {
        return this.a.getCurrentInterruptionFilter();
    }

    public final Map d() {
        if (jkr.c()) {
            return this.a.getAutomaticZenRules();
        }
        return null;
    }

    public final boolean e() {
        if (jkr.b()) {
            return this.a.isNotificationPolicyAccessGranted();
        }
        return false;
    }

    public final void b(String str) {
        if (jkr.e()) {
            this.a.deleteNotificationChannel(str);
        }
    }

    public final NotificationChannelGroup c(String str) {
        if (jkr.g()) {
            return this.a.getNotificationChannelGroup(str);
        }
        if (!jkr.e()) {
            return null;
        }
        for (NotificationChannelGroup next : this.a.getNotificationChannelGroups()) {
            if (next.getId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public final void d(String str) {
        if (jkr.c()) {
            this.a.removeAutomaticZenRule(str);
        }
    }

    public final Notification a(Notification notification) {
        if (!jkr.e() || !this.d || !TextUtils.isEmpty(notification.getChannelId())) {
            return notification;
        }
        if (notification.priority != 0) {
            Log.e("NotificationManager", "Notifications that use non-default priority should use NotificationChannels.");
        }
        if (!this.g.contains(this.b)) {
            this.a.createNotificationChannel(new NotificationChannel(this.b, this.f, 3));
            this.g.add(this.b);
        }
        return Notification.Builder.recoverBuilder(this.e, notification).setChannelId(this.b).build();
    }

    public final NotificationChannel a(String str) {
        if (jkr.e()) {
            return this.a.getNotificationChannel(str);
        }
        return null;
    }

    public final String a(AutomaticZenRule automaticZenRule) {
        if (jkr.c()) {
            return this.a.addAutomaticZenRule(automaticZenRule);
        }
        return null;
    }

    public final List a() {
        if (jkr.e()) {
            return this.a.getNotificationChannels();
        }
        return null;
    }

    public final void a(int i) {
        this.a.cancel(i);
        if (!f()) {
            this.c.b();
        }
    }

    public final void a(int i, Notification notification) {
        if (f()) {
            this.a.notify(i, notification);
        } else {
            a((String) null, i, notification);
        }
    }

    public final void a(NotificationChannel notificationChannel) {
        if (jkr.e()) {
            this.a.createNotificationChannel(notificationChannel);
        }
    }

    public final void a(NotificationChannelGroup notificationChannelGroup) {
        if (jkr.e()) {
            this.a.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public final void a(String str, int i) {
        this.a.cancel(str, i);
        if (!f()) {
            this.c.b();
        }
    }

    public final void a(String str, int i, Notification notification) {
        if (f()) {
            this.a.notify(str, i, notification);
            return;
        }
        iva.a((Object) notification);
        if (iwp.a(this.b)) {
            this.a.notify(str, i, a(notification));
            this.c.a();
            return;
        }
        this.c.c();
    }

    public final void a(String str, AutomaticZenRule automaticZenRule) {
        if (jkr.c()) {
            this.a.updateAutomaticZenRule(str, automaticZenRule);
        }
    }
}
