package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: mag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mag implements mad {
    private final maf a;
    private final jiq b;
    private long c;
    private final aucd d;

    public mag(maf maf) {
        jiu jiu = jiu.a;
        this.a = maf;
        this.b = jiu;
        this.d = amnz.b.o();
        this.c = -1;
    }

    public final amnz a() {
        return (amnz) this.d.i();
    }

    /* renamed from: c */
    public final mag clone() {
        return new mag(this);
    }

    public final void a(int i, maf maf) {
        if (maf == maf.NOTHING) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        } else if (maf.compareTo(this.a) <= 0) {
            aucd o = amny.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            amny amny = (amny) o.b;
            amny.b = i - 1;
            amny.a |= 1;
            long nanoTime = System.nanoTime();
            if (this.c >= 0) {
                long millis = TimeUnit.NANOSECONDS.toMillis(nanoTime - this.c);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                amny amny2 = (amny) o.b;
                amny2.a |= 2;
                amny2.c = millis;
            }
            this.c = nanoTime;
            aucd aucd = this.d;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            amnz amnz = (amnz) aucd.b;
            amny amny3 = (amny) o.i();
            amnz amnz2 = amnz.b;
            amny3.getClass();
            if (!amnz.a.a()) {
                amnz.a = aucj.a(amnz.a);
            }
            amnz.a.add(amny3);
        }
    }

    private mag(mag mag) {
        this.a = mag.a;
        this.b = mag.b;
        this.d = mag.d.clone();
        this.c = mag.c;
    }
}
