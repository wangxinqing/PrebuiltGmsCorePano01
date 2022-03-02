package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjs {
    private static final jjg a = jjg.a(iyc.GUNS);

    public static ArrayList a(Context context) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : iwq.a(context).a()) {
            aucd o = ameg.h.o();
            String id = notificationChannel.getId();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ameg ameg = (ameg) o.b;
            id.getClass();
            int i = 1;
            ameg.a |= 1;
            ameg.b = id;
            int importance = notificationChannel.getImportance();
            if (importance == 0) {
                i = 2;
            } else if (importance == 1) {
                i = 7;
            } else if (importance == 2) {
                i = 5;
            } else if (importance == 3) {
                i = 3;
            } else if (importance == 4) {
                i = 4;
            } else if (importance == 5) {
                i = 6;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            ameg ameg2 = (ameg) o.b;
            ameg2.g = i - 1;
            ameg2.a |= 32;
            if (!TextUtils.isEmpty(notificationChannel.getGroup())) {
                String group = notificationChannel.getGroup();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ameg ameg3 = (ameg) o.b;
                group.getClass();
                ameg3.a |= 8;
                ameg3.e = group;
            }
            arrayList.add((ameg) o.i());
        }
        return arrayList;
    }

    public static void a(Context context, ameg ameg) {
        List<NotificationChannelGroup> list;
        iwq a2 = iwq.a(context);
        if (ameg != null && !ameg.b.isEmpty() && !ameg.c.isEmpty()) {
            ((anih) a.d()).a("Creating notification channcel: %s", (Object) ameg.b);
            String str = ameg.b;
            String str2 = ameg.c;
            int a3 = amef.a(ameg.g);
            int i = 1;
            if (a3 == 0) {
                a3 = 1;
            }
            int i2 = a3 - 1;
            if (i2 == 0) {
                i = -1000;
            } else if (i2 == 1) {
                i = 0;
            } else if (i2 == 3) {
                i = 4;
            } else if (i2 == 4) {
                i = 2;
            } else if (i2 == 5) {
                i = 5;
            } else if (i2 != 6) {
                i = 3;
            }
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
            if (!ameg.d.isEmpty()) {
                notificationChannel.setDescription(ameg.d);
            }
            if (!ameg.e.isEmpty()) {
                if (!ameg.e.isEmpty() && !ameg.f.isEmpty()) {
                    ((anih) a.d()).a("Creating notification channcel group: %s", (Object) ameg.e);
                    iwq.a(context).a(new NotificationChannelGroup(ameg.e, ameg.f));
                }
                String str3 = ameg.e;
                iwq a4 = iwq.a(context);
                if (jkr.e()) {
                    list = a4.a.getNotificationChannelGroups();
                } else {
                    list = null;
                }
                for (NotificationChannelGroup id : list) {
                    if (id.getId().equals(str3)) {
                        notificationChannel.setGroup(ameg.e);
                    }
                }
                return;
            }
            a2.a(notificationChannel);
        }
    }
}
