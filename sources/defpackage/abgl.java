package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: abgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgl {
    public avhl a;
    public avhz b;
    public avio c;
    public aviq d;
    public avis e;
    public avjk f;
    public avjo g;
    public avjs h;
    public avjv i;
    public avjx j;
    public avka k;

    public abgl(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            avhr avhr = (avhr) it.next();
            int i2 = avhr.a;
            if ((i2 & 16) != 0) {
                avhl avhl = avhr.f;
                this.a = avhl == null ? avhl.k : avhl;
            } else if ((65536 & i2) != 0) {
                avhz avhz = avhr.l;
                this.b = avhz == null ? avhz.e : avhz;
            } else if ((131072 & i2) == 0) {
                if ((i2 & 128) != 0) {
                    avio avio = avhr.g;
                    this.c = avio == null ? avio.b : avio;
                } else if ((i2 & 8) == 0) {
                    if ((32768 & i2) != 0) {
                        aviq aviq = avhr.k;
                        this.d = aviq == null ? aviq.k : aviq;
                    } else if ((i2 & 16384) != 0) {
                        avis avis = avhr.j;
                        this.e = avis == null ? avis.f : avis;
                    } else if ((i2 & 2) != 0) {
                        avjk avjk = avhr.c;
                        this.f = avjk == null ? avjk.b : avjk;
                    } else if (!azis.b() && (avhr.a & 4) != 0) {
                        avjo avjo = avhr.d;
                        this.g = avjo == null ? avjo.c : avjo;
                    } else if (!aziv.b() && (avhr.a & 1) != 0) {
                        avjs avjs = avhr.b;
                        this.h = avjs == null ? avjs.b : avjs;
                    } else {
                        int i3 = avhr.a;
                        if ((262144 & i3) != 0) {
                            avjv avjv = avhr.n;
                            this.i = avjv == null ? avjv.e : avjv;
                        } else if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            avjx avjx = avhr.h;
                            this.j = avjx == null ? avjx.c : avjx;
                        } else if ((i3 & 1024) != 0) {
                            avka avka = avhr.i;
                            this.k = avka == null ? avka.c : avka;
                        }
                    }
                }
            } else if (avhr.m == null) {
                avie avie = avie.a;
            }
        }
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b() {
        return this.c != null;
    }

    public final boolean c() {
        return this.d != null;
    }

    public final boolean d() {
        return this.g != null;
    }

    public final boolean e() {
        return this.h != null;
    }

    public final boolean f() {
        return this.i != null;
    }
}
