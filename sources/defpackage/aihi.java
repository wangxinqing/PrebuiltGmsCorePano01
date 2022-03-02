package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aihi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aihi implements aift {
    public final amsv a = amta.a(aihh.a);
    public long b = -1;
    public long c = -1;
    public final aigy d = new aigy();
    public final aqgg e;
    public final aqgu f;
    public aihc g;
    private final Context h;
    private final aiha i;

    public aihi(Context context, aqgg aqgg, aqgu aqgu, aiha aiha) {
        this.h = context;
        this.e = aqgg;
        this.f = aqgu;
        this.i = aiha;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.c = -1;
        this.b = -1;
        this.d.c();
        this.e.d();
        this.f.a(1);
    }

    public final void b(arjm arjm) {
        atir atir = new atir("com.google.android.gms");
        byte[] k = arjm.k();
        PendingIntent a2 = aifw.a(this.h, "com.google.android.location.internal.action.ACTION_FLP_COMPUTE_WIFI_LOCATIONS_RESULT");
        atir.a.putExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_REQUEST", k);
        atir.a.putExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_RESPONSE", a2);
        atir.a(this.h);
    }

    /* access modifiers changed from: package-private */
    public final void a(Location location) {
        long time = location.getTime();
        this.f.c.a(2, time * 1000000, aiet.a(location, ayap.k()));
    }

    /* access modifiers changed from: package-private */
    public final void a(arjk arjk) {
        arjv arjv;
        arjv arjv2;
        arjr arjr;
        arjv arjv3;
        arjr arjr2;
        arjv arjv4;
        arjs arjs;
        arjo arjo;
        int a2 = arjj.a(arjk.a);
        int i2 = a2 - 1;
        aqey aqey = null;
        if (a2 == 0) {
            throw null;
        } else if (i2 == 0) {
            if (arjk.a == 2) {
                arjv = (arjv) arjk.b;
            } else {
                arjv = arjv.c;
            }
            int a3 = arjt.a(arjv.a);
            int i3 = a3 - 1;
            if (a3 == 0) {
                throw null;
            } else if (i3 == 0) {
                aqgv aqgv = this.f.b;
                long j = arjk.c;
                if (arjk.a == 2) {
                    arjv2 = (arjv) arjk.b;
                } else {
                    arjv2 = arjv.c;
                }
                if (arjv2.a == 1) {
                    arjr = (arjr) arjv2.b;
                } else {
                    arjr = arjr.c;
                }
                double d2 = (double) arjr.a;
                if (arjk.a == 2) {
                    arjv3 = (arjv) arjk.b;
                } else {
                    arjv3 = arjv.c;
                }
                if (arjv3.a == 1) {
                    arjr2 = (arjr) arjv3.b;
                } else {
                    arjr2 = arjr.c;
                }
                aqgv.a(2, j, d2, (double) arjr2.b);
            } else if (i3 == 1) {
                this.f.b.b(2, arjk.c);
            } else if (i3 == 3) {
                aqgv aqgv2 = this.f.b;
                long j2 = arjk.c;
                if (arjk.a == 2) {
                    arjv4 = (arjv) arjk.b;
                } else {
                    arjv4 = arjv.c;
                }
                if (arjv4.a == 4) {
                    arjs = (arjs) arjv4.b;
                } else {
                    arjs = arjs.b;
                }
                aqgv2.a(2, j2, (double) arjs.a);
            }
        } else if (i2 == 1) {
            if (arjk.a == 3) {
                arjo = (arjo) arjk.b;
            } else {
                arjo = arjo.k;
            }
            if (arjo != null) {
                aqew k = aqey.k();
                k.a(arjo.b, arjo.c, Math.round(arjo.g * 1000.0f));
                k.a(aqex.GPS);
                if ((arjo.a & 8) != 0) {
                    k.b(arjo.e);
                }
                if ((arjo.a & 128) != 0) {
                    k.a(arjo.i);
                }
                if ((4 & arjo.a) != 0) {
                    k.d(arjo.d);
                }
                if ((arjo.a & 64) != 0) {
                    k.c(arjo.h);
                }
                if ((arjo.a & 16) != 0) {
                    k.a((double) arjo.f);
                }
                if ((arjo.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    k.b((double) arjo.j);
                }
                aqey = k.a();
            }
            this.f.c.a(2, arjk.c, aqey);
        } else if (i2 == 3) {
            this.f.d.a(2, arjk.c);
        }
    }

    public final void b(List list) {
        Location a2;
        Iterator b2 = this.d.b();
        while (b2.hasNext()) {
            arjk arjk = (arjk) b2.next();
            if (arjk.a == 4) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Location location = (Location) it.next();
                    if (arjk.c / 1000000 == location.getTime()) {
                        a(location);
                        it.remove();
                        break;
                    }
                }
            } else {
                a(arjk);
            }
        }
        this.b = -1;
        this.d.c();
        aihc aihc = this.g;
        if (aihc != null) {
            aien aien = (aien) aihc;
            if (TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()) - aien.h.b() < axxm.a.a().flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs() && (a2 = aien.a(System.currentTimeMillis(), TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()))) != null) {
                aien.c(Collections.singletonList(a2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(arjm arjm) {
        aucx aucx = arjm.a;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            arjk arjk = (arjk) aucx.get(i2);
            if (arjk.a != 2 || ((arjv) arjk.b).a != 3) {
                aigy aigy = this.d;
                if (((long) aigy.b.size()) == ((Long) aigy.a.a()).longValue()) {
                    arjk arjk2 = (arjk) aigy.b.removeFirst();
                }
                aigy.b.add(arjk);
            }
        }
    }

    public final void a(List list) {
        aiha aiha = this.i;
        boolean z = !list.isEmpty();
        if (axxm.f()) {
            if (!z) {
                aiha.i++;
            } else {
                aiha.h++;
            }
        }
        if (this.d.d()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((Location) it.next());
            }
            return;
        }
        b(list);
    }
}
