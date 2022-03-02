package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.R;
import com.google.android.gms.maps.model.LatLng;
import java.util.concurrent.TimeUnit;

/* renamed from: alda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alda {
    public static final long a = TimeUnit.SECONDS.toMillis(2);
    public final aleu b;
    public final icc c;
    public final ales d;
    public final Handler e = new qvr(Looper.getMainLooper());
    public alcx f;
    public rhq g;
    public LatLng h;
    public rhq i;
    public Bitmap j;
    public icf k;
    public Runnable l;
    private icf m;

    public alda(aleu aleu, aldi aldi, ales ales) {
        ibq ibq = rij.a;
        this.b = aleu;
        this.c = aldi.a;
        this.d = ales;
    }

    private final void a(rhq rhq) {
        this.f.a(false);
        this.f.a(rhq.p());
        this.f.b(rhq.q());
        this.f.a(rhq.d());
        this.f.a(this.j);
    }

    public final void b() {
        icf icf = this.k;
        if (icf != null) {
            icf.b();
            this.k = null;
        }
        icf icf2 = this.m;
        if (icf2 != null) {
            icf2.b();
            this.m = null;
        }
        Runnable runnable = this.l;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
        }
    }

    public final void a() {
        alcx alcx = this.f;
        if (alcx == null) {
            return;
        }
        if (this.g != null) {
            alcx.a((int) R.string.place_picker_use_this_place);
            a(this.g);
            if (this.j == null) {
                icf icf = this.k;
                if (icf != null) {
                    icf.b();
                    this.k = null;
                }
                icc icc = this.c;
                String a2 = this.g.a();
                iva.a((Object) a2, (Object) "placeId == null");
                iva.b(true ^ a2.isEmpty(), "placeId is empty");
                idf a3 = icc.a((idf) new rhp(rij.a, icc, a2));
                a3.a((icm) new alcz(this, new alcy(this), ((aldg) this.f).getResources().getDimensionPixelSize(R.dimen.place_picker_photo_width), ((aldg) this.f).getResources().getDimensionPixelSize(R.dimen.place_picker_confirm_map_height)));
                this.k = a3;
            }
        } else if (this.i != null) {
            alcx.a((int) R.string.place_picker_use_this_location);
            a(this.i);
        } else if (this.h != null) {
            alcx.a((int) R.string.place_picker_use_this_location);
            this.f.a((CharSequence) "");
            this.f.b("");
            this.f.a(this.h);
            this.f.a(true);
        }
    }

    public final void a(alcx alcx) {
        this.f = alcx;
        a();
    }

    public final void a(String str, int i2) {
        icf a2 = rjl.a(this.c, str);
        this.m = a2;
        a2.a((icm) new alcw(this, i2, str));
    }
}
