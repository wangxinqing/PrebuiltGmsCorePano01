package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ybp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ybp extends ybm implements wln {
    protected static final Status h = new Status(5);
    private final String a;
    private final String b;
    private final int c;
    public final String i;
    public final String j;
    public boolean k;
    public String l;

    static {
        new Status(8);
    }

    public ybp(Context context, String str, String str2, String str3, String str4, int i2) {
        super(context);
        if (TextUtils.isEmpty(str3)) {
            Log.w("PeopleClientLoader", "Caller should set application ID");
            str3 = "0";
        }
        this.i = str;
        this.j = str2;
        this.a = str3;
        this.b = str4;
        this.c = i2;
    }

    /* access modifiers changed from: protected */
    public final icc a(Context context) {
        int i2 = 0;
        if (!TextUtils.isEmpty(this.a)) {
            try {
                i2 = Integer.parseInt(this.a);
            } catch (NumberFormatException e) {
            }
        }
        wlr wlr = new wlr();
        wlr.a = i2;
        wls a2 = wlr.a();
        ibz ibz = new ibz(context);
        ibz.b = this.b;
        ibz.a(wlt.a, (ibj) a2);
        icc b2 = ibz.b();
        b2.a((ica) new ybo(this));
        return b2;
    }

    public final void b() {
        onContentChanged();
    }

    public final void e() {
        if (!this.k && this.c != 0 && d()) {
            this.k = true;
            ibq ibq = wlt.a;
            xdp.a(this.e, this, this.i, this.j, this.c).a((icm) new ybn(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.e == null) {
            this.e = a(getContext());
            this.e.a((ica) new ybk(this));
            this.e.a((icb) new ybl(this));
        }
        ilh ilh = this.g;
        if (ilh != null) {
            deliverResult(ilh);
        }
        if (takeContentChanged() || this.g == null) {
            forceLoad();
        }
        e();
    }

    public final void b(String str) {
        this.l = str;
        onContentChanged();
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        if (d() && this.k) {
            ibq ibq = wlt.a;
            xdp.a(this.e, this);
        }
        this.k = false;
        icc icc = this.e;
        if (icc != null && icc.i()) {
            this.e.g();
        }
    }
}
