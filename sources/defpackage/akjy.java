package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: akjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akjy implements akio, akjz {
    private static final akja q = new akja();
    public final akjc a;
    public final akma b;
    public final Map c = new HashMap();
    public boolean d;
    public akje e;
    public akin f;
    public akop g;
    public akol h;
    public int i;
    public final aklo j;
    public final akoq k;
    public final akoq l;
    public final akjf m;
    public final akjx n = new akjx(this);
    public final akum o;
    public akka p;
    private final akuv r;

    static {
        Collections.singletonList(akiz.a);
    }

    public static int a(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? 1 : 4;
        }
        return 2;
    }

    private final long a(long j2) {
        return j2 - this.r.a;
    }

    public akjy(akjc akjc, akum akum, akjf akjf) {
        akuj akuj = (akuj) akjc;
        akun akun = akuj.d;
        akuv akuv = akuj.a;
        akow akow = new akow(akun, akuj.h);
        this.a = akjc;
        this.o = akum;
        this.m = akjf;
        this.k = akow;
        akun akun2 = akuj.d;
        akuv akuv2 = akuj.a;
        this.l = new akob(akun2, akuj.h, akuj.f);
        this.r = akuj.a;
        this.b = akuj.d;
        this.i = -1;
        this.g = null;
        this.j = new aklo();
    }

    public final akip a(akhy akhy) {
        long j2;
        aklr aklr;
        int i2;
        if (akhy == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = 1;
        if (akhy.i) {
            aklr aklr2 = akhy.j;
            j2 = akhy.d;
            i2 = 1;
            aklr = aklr2;
        } else {
            akop akop = this.g;
            if (akop != null) {
                if (akop.a != aocj.AT_PLACE) {
                    i3 = 2;
                }
                akop akop2 = this.g;
                aklr = akop2.c;
                i2 = i3;
                j2 = a(akop2.b);
            } else {
                i2 = 0;
                j2 = elapsedRealtime;
                aklr = null;
            }
        }
        return new akip(i2, akhy, q, aklr, j2, akhy.e, akhy.f, akhy.g);
    }

    public final akip a(String str) {
        return a(new akhy(akhy.a, a(this.g.b), str, 0, false, false, 1, 0, (aklr) null));
    }

    public final void a() {
        if (this.d) {
            this.b.a(2, 3, a(this.i));
            this.d = false;
            this.g = null;
            this.k.a();
            akka akka = this.p;
            akka.a = null;
            akke akke = akka.b;
            akke.j = null;
            aklb aklb = (aklb) akke.b;
            aklb.g.execute(new akkt(aklb));
            this.p = null;
            this.e.b();
            this.e = null;
            for (akje b2 : this.c.values()) {
                b2.b();
            }
            aklo aklo = this.j;
            long currentTimeMillis = System.currentTimeMillis();
            if (aklo.n.size() == 10) {
                aklo.n.remove();
            }
            aklo.n.add(String.format(Locale.US, "Centralized place inference engine was stopped at: %d", new Object[]{Long.valueOf(currentTimeMillis)}));
            this.c.clear();
            this.h = null;
            this.a.a().b();
            this.i = -1;
            return;
        }
        aklz.a();
    }

    public final void a(akip akip) {
        akin akin = this.f;
        if (akin == null) {
            aklz.a().b("No callback set for SemanticLocationInferenceEngine");
        } else if (akip == null) {
            aklz.a().b("SemanticLocationInternal is null, not sending to the callback");
        } else {
            akin.a(akip);
        }
    }
}
