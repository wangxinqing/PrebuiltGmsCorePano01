package defpackage;

import android.content.Context;

/* renamed from: adns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adns {
    public static final adro a = new adro("logging.clearcut_event_logger.current_execution_id", "");
    private static final iwd c = new iwd("SystemUpdate", "Logging", "ClearcutEventLogger");
    private static final anax d = anax.a((Object) "com.google.android.gms", (Object) "com.google.android.gms.update");
    public final adrn b = ((adrn) adrn.a.b());
    private final anax e;
    private final hol f;
    private final int g;

    private adns(Context context) {
        this.f = new hol(context, "ANDROID_OTA", (String) null);
        this.g = adke.b(context);
        anav j = anax.j();
        for (String str : amsk.a(',').b().a().a((CharSequence) ayox.a.a().e())) {
            try {
                j.b(Integer.valueOf(str));
            } catch (NumberFormatException e2) {
                c.d("Failed to parse event type: %s.", str);
            }
        }
        this.e = j.a();
    }

    public static adns a(Context context) {
        return new adns(context);
    }

    public final aucd a(int i) {
        aucd o = anqb.l.o();
        if (d.contains(jkt.a())) {
            String str = (String) this.b.b(a);
            if (o.c) {
                o.c();
                o.c = false;
            }
            anqb anqb = (anqb) o.b;
            str.getClass();
            anqb.a |= 2;
            anqb.c = str;
        }
        int i2 = this.g;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anqb anqb2 = (anqb) o.b;
        int i3 = anqb2.a | 4;
        anqb2.a = i3;
        anqb2.d = i2;
        anqb2.b = i - 1;
        anqb2.a = i3 | 1;
        return o;
    }

    public final void a(anqb anqb) {
        anax anax = this.e;
        int a2 = anqa.a(anqb.b);
        if (a2 == 0) {
            a2 = 1;
        }
        if (anax.contains(Integer.valueOf(a2 - 1))) {
            this.f.a((audx) anqb).b();
        }
    }

    public final void a(anqd anqd) {
        aucd a2 = a(3);
        if (a2.c) {
            a2.c();
            a2.c = false;
        }
        anqb anqb = (anqb) a2.b;
        anqb anqb2 = anqb.l;
        anqd.getClass();
        anqb.e = anqd;
        anqb.a |= 8;
        a((anqb) a2.i());
    }
}
