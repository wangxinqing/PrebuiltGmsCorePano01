package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: aknq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aknq implements akni {
    static final int a = atjv.PERSONALIZED_PLACES.bA;
    public static final jtn b;
    final jtv c = new aknm(this);
    public final icc d;
    public volatile boolean e;
    public boolean f;
    public akki g;
    private final icb h;
    private final akma i;

    static {
        jtm jtm = new jtm();
        jtm.a(a);
        jtm.b(1);
        b = jtm.a();
    }

    public aknq(Context context, Handler handler, String str, akma akma) {
        ibz ibz = new ibz(context);
        ibz.a(juc.a, (ibj) new jub("com.google.android.places.inference.net.contextmanager.PersonalPlaceInfoSourceImpl"));
        ibz.a(str);
        ibz.a(handler);
        icc b2 = ibz.b();
        aknn aknn = new aknn(this);
        this.h = aknn;
        this.g = null;
        this.f = true;
        this.d = b2;
        this.i = akma;
        b2.a((icb) aknn);
    }

    public final void a() {
        if (this.e) {
            this.d.e();
            icc icc = this.d;
            icc.a((ica) new aknp(this, icc, "Stop Context Manager updates"));
            this.g = null;
            this.e = false;
        }
    }

    public final void a(akki akki) {
        if (!this.e) {
            this.g = akki;
            this.d.e();
            this.f = true;
            icc icc = this.d;
            icc.a((ica) new akno(this, icc, "Start Context Manager updates"));
            this.e = true;
        }
    }

    public final void a(astv[] astvArr, astz[] astzArr, int i2, int i3, boolean z, int i4) {
        int seconds;
        astv[] astvArr2 = astvArr;
        int i5 = 0;
        for (astv astv : astvArr2) {
            aucx aucx = astv.d;
            int size = aucx.size();
            for (int i6 = 0; i6 < size; i6++) {
                astm astm = (astm) aucx.get(i6);
                if (astm.d.size() > 0 && (seconds = (int) TimeUnit.MICROSECONDS.toSeconds(astm.d.a(0))) > i5) {
                    i5 = seconds;
                }
            }
        }
        this.i.a(astvArr2.length, astzArr.length, i3, i2, i5, z, i4, 1);
    }
}
