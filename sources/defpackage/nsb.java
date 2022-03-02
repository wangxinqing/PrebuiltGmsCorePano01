package defpackage;

import android.content.Context;

/* renamed from: nsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsb {
    private static final anaf b;
    private static final anaf c;
    private static final anaf d;
    public final nsa a;
    private final Context e;

    static {
        anab anab = new anab();
        anab.a(nxt.APP_WAS_IN_HIGH_USAGE_BUCKET, "USAGE_QUOTA_APP_IN_HIGH_USAGE_BUCKET");
        anab.a(nxt.APP_WAS_WITHIN_QUOTA, "USAGE_QUOTA_WITHIN_QUOTA");
        anab.a(nxt.REDUCED_MESSAGE_PRIORITY, "USAGE_QUOTA_PRIORITY_REDUCED");
        b = anab.a();
        anab anab2 = new anab();
        anab2.a(nxw.WRITTEN_TO_DOZE_QUEUE, "DOZE_QUEUE_MESSAGE_QUEUED");
        anab2.a(nxw.SENT_ON_LEAVING_DOZE, "DOZE_QUEUE_SENT_ON_LEAVING_DOZE");
        anab2.a(nxw.SENT_ON_GMSCORE_RESTART, "DOZE_QUEUE_SENT_ON_RESTART");
        c = anab2.a();
        anab anab3 = new anab();
        anab3.a(nxy.DOZE_QUEUE_COLLAPSED, "DOZE_QUEUE_COLLAPSED");
        anab3.a(nxy.DOZE_QUEUE_DROPPED_DUE_TO_DIRTY_PING, "DOZE_QUEUE_DROPPED_DIRTY_PING");
        anab3.a(nxy.TTL_ZERO, "DOZE_QUEUE_DROPPED_TTL_0");
        anab3.a(nxy.TTL_EXPIRED, "DOZE_QUEUE_DROPPED_EXPIRED");
        d = anab3.a();
    }

    public nsb(Context context, nsa nsa) {
        this.e = context;
        this.a = nsa;
    }

    public final void a(aucd aucd, nxt nxt) {
        if (axjy.a.a().a()) {
            nsa nsa = this.a;
            aucd o = nyb.c.o();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            nya nya = (nya) aucd.b;
            nya nya2 = nya.k;
            nya.c = Integer.valueOf(nxt.f);
            nya.b = 8;
            if (o.c) {
                o.c();
                o.c = false;
            }
            nyb nyb = (nyb) o.b;
            nya nya3 = (nya) aucd.i();
            nya3.getClass();
            nyb.b = nya3;
            nyb.a |= 4;
            nsa.a((nyb) o.i());
        }
        if (b.containsKey(nxt)) {
            this.a.a.c((String) b.get(nxt)).a();
        }
    }

    public final void a(ntx ntx, String str, int i, nxw nxw) {
        if (axkq.b()) {
            aucd o = nya.k.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nya nya = (nya) o.b;
            str.getClass();
            int i2 = nya.a | 1;
            nya.a = i2;
            nya.d = str;
            String str2 = ntx.a;
            str2.getClass();
            int i3 = i2 | 2;
            nya.a = i3;
            nya.e = str2;
            int i4 = ntx.b;
            int i5 = i3 | 4;
            nya.a = i5;
            nya.f = i4;
            nya.a = i5 | 8;
            nya.g = i;
            nya.c = Integer.valueOf(nxw.e);
            nya.b = 7;
            if (axlc.k()) {
                int a2 = nuc.a(this.e);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                nya nya2 = (nya) o.b;
                nya2.j = a2 - 1;
                nya2.a |= 64;
            }
            nsa nsa = this.a;
            aucd o2 = nyb.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            nyb nyb = (nyb) o2.b;
            nya nya3 = (nya) o.i();
            nya3.getClass();
            nyb.b = nya3;
            nyb.a |= 4;
            nsa.a((nyb) o2.i());
        }
        if (c.containsKey(nxw)) {
            this.a.a.c((String) c.get(nxw)).a();
        }
    }

    public final void a(ntx ntx, String str, int i, nxy nxy) {
        if (axkq.b()) {
            aucd o = nya.k.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nya nya = (nya) o.b;
            str.getClass();
            int i2 = nya.a | 1;
            nya.a = i2;
            nya.d = str;
            String str2 = ntx.a;
            str2.getClass();
            int i3 = i2 | 2;
            nya.a = i3;
            nya.e = str2;
            int i4 = ntx.b;
            int i5 = i3 | 4;
            nya.a = i5;
            nya.f = i4;
            nya.a = i5 | 8;
            nya.g = i;
            nya.c = Integer.valueOf(nxy.l);
            nya.b = 5;
            nya nya2 = (nya) o.i();
            nsa nsa = this.a;
            aucd o2 = nyb.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            nyb nyb = (nyb) o2.b;
            nya2.getClass();
            nyb.b = nya2;
            nyb.a |= 4;
            nsa.a((nyb) o2.i());
        }
        if (d.containsKey(nxy)) {
            this.a.a.c((String) d.get(nxy)).a();
        }
    }
}
