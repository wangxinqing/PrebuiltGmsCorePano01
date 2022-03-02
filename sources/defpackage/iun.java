package defpackage;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

@Deprecated
/* renamed from: iun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class iun extends isy {
    private final ita a;

    public iun(Context context, ise ise, ica ica, icb icb) {
        super(context, context.getMainLooper(), itc.a(context), hxj.a, 70, ise, (iea) null, (igg) null);
        ita ita = new ita(context.getMainLooper(), this);
        this.a = ita;
        ita.a(ica);
        this.a.a(icb);
    }

    public final void a(int i) {
        super.a(i);
        this.a.a(i);
    }

    public final boolean b(ica ica) {
        boolean contains;
        ita ita = this.a;
        iva.a((Object) ica);
        synchronized (ita.d) {
            contains = ita.a.contains(ica);
        }
        return contains;
    }

    public final void c(ica ica) {
        this.a.b(ica);
    }

    public final void j() {
        this.a.a();
        super.j();
    }

    public final void t() {
        this.a.b();
        super.t();
    }

    public final void a(IInterface iInterface) {
        super.a(iInterface);
        this.a.a(C());
    }

    public final void a(ConnectionResult connectionResult) {
        super.a(connectionResult);
        this.a.a(connectionResult);
    }

    public final void a(ica ica) {
        this.a.a(ica);
    }

    public final void a(icb icb) {
        this.a.a(icb);
    }
}
