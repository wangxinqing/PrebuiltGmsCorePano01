package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Message;
import java.util.Random;

/* renamed from: ajfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajfz extends ajgs {
    private final Context a;
    private final Random b;
    private final ajgc c;
    private ajdb d;
    private long e;

    static {
        jjg.a("EAlert");
    }

    public ajfz(Context context, Random random, ajgc ajgc) {
        super("EANotification");
        this.a = context;
        this.b = random;
        this.c = ajgc;
    }

    private final void a(long j) {
        if (!this.h.b.hasMessages(7)) {
            this.h.b.a(7, (Bundle) null, j);
        }
    }

    private final long c() {
        Location d2 = this.c.d();
        if (d2 != null) {
            return aema.a(aema.a(d2.getLatitude(), d2.getLongitude()), (int) ayab.l());
        }
        return 0;
    }

    public final void b() {
        ajdb ajdb = this.d;
        if (ajdb != null) {
            ajdb.b();
            this.d = null;
        }
    }

    public final void a() {
        ajdb ajdb = new ajdb(this.a);
        this.d = ajdb;
        ajdb.a();
        this.e = ayab.a.a().notificationLogBaseOffsetMillis() + ((long) this.b.nextInt((int) ayab.a.a().notificationLogWindowMillis()));
        if (ayab.a.a().enableAlertExperimentCheckin()) {
            a(0);
        }
        e();
    }

    public final boolean a(Message message) {
        int i = message.what;
        if (i == 4) {
            if (ayab.d()) {
                this.h.b.a(5, message.getData(), this.e);
            }
            return true;
        } else if (i == 5) {
            long j = message.getData().getLong("t");
            int a2 = ajfs.a(this.a);
            String b2 = ajfs.b(this.a);
            ajdb ajdb = this.d;
            long c2 = c();
            long j2 = this.e;
            int i2 = ajdb.d;
            aqek aqek = new aqek(ajck.r);
            aqek.a(1, j);
            aqek.a(3, a2);
            if (!amrk.a(b2)) {
                aqek.a(4, (Object) b2);
            }
            aqek.a(5, 0);
            aqek.a(6, c2);
            aqek.a(8, j2);
            aqek aqek2 = new aqek(ajck.n);
            aqek2.b(3, (Object) aqek);
            ajdb.a(ajdb.a(aqek2, (aqek) null));
            return true;
        } else if (i != 7) {
            return false;
        } else {
            int a3 = ajfs.a(this.a);
            String b3 = ajfs.b(this.a);
            ajdb ajdb2 = this.d;
            long c3 = c();
            int i3 = ajdb.d;
            aqek aqek3 = new aqek(ajck.s);
            aqek3.a(1, c3);
            aqek3.a(2, a3);
            if (!amrk.a(b3)) {
                aqek3.a(3, (Object) b3);
            }
            aqek aqek4 = new aqek(ajck.n);
            aqek4.b(5, (Object) aqek3);
            ajdb2.a(ajdb.a(aqek4, (aqek) null));
            a(ayab.a.a().alertExperimentCheckinIntervalMillis());
            return true;
        }
    }
}
