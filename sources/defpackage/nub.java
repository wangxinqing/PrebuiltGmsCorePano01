package defpackage;

import android.content.Context;
import android.util.LruCache;

/* renamed from: nub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nub {
    public final nsa a;
    public final LruCache b = new LruCache(20);
    private final Context c;

    public nub(Context context, nsa nsa) {
        this.c = context;
        this.a = nsa;
    }

    private final void b(String str) {
        this.a.a.c(str).a();
    }

    public final void a(String str) {
        if (axlc.j()) {
            b(str);
        }
    }

    public final void b(ntx ntx, String str, int i, int i2) {
        aucd o = nya.k.o();
        aucd o2 = nye.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nye nye = (nye) o2.b;
        nye.b = 2;
        int i3 = nye.a | 1;
        nye.a = i3;
        nye.c = i - 1;
        int i4 = i3 | 2;
        nye.a = i4;
        int i5 = i4 | 4;
        nye.a = i5;
        nye.d = i2;
        nye.a = i5 | 8;
        nye.e = 0;
        if (o.c) {
            o.c();
            o.c = false;
        }
        nya nya = (nya) o.b;
        nye nye2 = (nye) o2.i();
        nye2.getClass();
        nya.c = nye2;
        nya.b = 4;
        if (axlc.k()) {
            int a2 = nuc.a(this.c);
            if (o.c) {
                o.c();
                o.c = false;
            }
            nya nya2 = (nya) o.b;
            nya2.j = a2 - 1;
            nya2.a |= 64;
        }
        a(ntx, str, o);
    }

    public final void a(ntx ntx, String str, int i, int i2) {
        aucd o = nya.k.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nya nya = (nya) o.b;
        nya.a |= 8;
        nya.g = i;
        int i3 = i2 - 1;
        nya.c = Integer.valueOf(i3);
        nya.b = 6;
        a(ntx, str, o);
        nxy nxy = nxy.REASON_UNKNOWN;
        if (i3 == 1) {
            a("CLIENT_QUEUE_ERROR_MISSING_FROM_DB");
        } else if (i3 == 2) {
            a("CLIENT_QUEUE_ERROR_DIFFERENT_MESSAGE_IN_DB");
        } else if (i3 == 3) {
            a("CLIENT_QUEUE_DUPLICATE_MESSAGE");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ntx ntx, String str, int i, int i2, int i3, long j) {
        aucd o = nya.k.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nya nya = (nya) o.b;
        nya.a |= 8;
        nya.g = i;
        aucd o2 = nye.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nye nye = (nye) o2.b;
        nye.b = 1;
        int i4 = nye.a | 1;
        nye.a = i4;
        int i5 = i2 - 1;
        nye.c = i5;
        int i6 = i4 | 2;
        nye.a = i6;
        int i7 = i6 | 4;
        nye.a = i7;
        nye.d = i3;
        nye.a = i7 | 8;
        nye.e = j;
        if (o.c) {
            o.c();
            o.c = false;
        }
        nya nya2 = (nya) o.b;
        nye nye2 = (nye) o2.i();
        nye2.getClass();
        nya2.c = nye2;
        nya2.b = 4;
        if (axlc.k()) {
            int a2 = nuc.a(this.c);
            if (o.c) {
                o.c();
                o.c = false;
            }
            nya nya3 = (nya) o.b;
            nya3.j = a2 - 1;
            nya3.a |= 64;
        }
        a(ntx, str, o);
        nxy nxy = nxy.REASON_UNKNOWN;
        if (i5 != 1) {
            if (i5 != 2) {
                if (axlc.j()) {
                    synchronized (this) {
                        this.b.put(str, -1);
                    }
                    b("CLIENT_QUEUE_ATTEMPTING_RETRY_ON_RESTART");
                }
            } else if (axlc.j()) {
                synchronized (this) {
                    this.b.put(str, Integer.valueOf(i3));
                }
                this.a.a.d("CLIENT_QUEUE_ATTEMPTING_RETRY_WITH_BACKOFF").a(i3);
            }
        } else if (axlc.j()) {
            b("CLIENT_QUEUE_NEW_MESSAGE");
            synchronized (this) {
                this.b.put(str, 0);
            }
        }
    }

    public final void a(ntx ntx, String str, int i, nxy nxy) {
        aucd o = nya.k.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nya nya = (nya) o.b;
        nya.a |= 8;
        nya.g = i;
        nya.c = Integer.valueOf(nxy.l);
        nya.b = 5;
        a(ntx, str, o);
        nxy nxy2 = nxy.REASON_UNKNOWN;
        int ordinal = nxy.ordinal();
        if (ordinal == 1) {
            a("CLIENT_QUEUE_DROPPED_EXPIRED");
        } else if (ordinal == 2) {
            a("CLIENT_QUEUE_DROPPED_EXCEEDED_MAX_RETRIES");
        } else if (ordinal == 3) {
            a("CLIENT_QUEUE_DROPPED_EXCEEDED_STORAGE_LIMIT");
        } else if (ordinal == 10) {
            a("CLIENT_QUEUE_DROPPED_APP_RESTRICTED");
        }
    }

    public final void a(ntx ntx, String str, aucd aucd) {
        if (axkh.a.a().a()) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            nya nya = (nya) aucd.b;
            nya nya2 = nya.k;
            str.getClass();
            int i = nya.a | 1;
            nya.a = i;
            nya.d = str;
            String str2 = ntx.a;
            str2.getClass();
            int i2 = i | 2;
            nya.a = i2;
            nya.e = str2;
            int i3 = ntx.b;
            nya.a = i2 | 4;
            nya.f = i3;
            nya nya3 = (nya) aucd.i();
            nsa nsa = this.a;
            aucd o = nyb.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nyb nyb = (nyb) o.b;
            nya3.getClass();
            nyb.b = nya3;
            nyb.a |= 4;
            nsa.a((nyb) o.i());
        }
    }
}
