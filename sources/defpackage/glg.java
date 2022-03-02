package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.chimera.Loader;

/* renamed from: glg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class glg extends Loader implements glh {
    public static final iwd a = ehv.a("AddAccountLoader");
    gli b = null;
    public final Context c;
    AsyncTask d;
    AsyncTask e;
    private boolean f = false;
    private final gck g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    public glg(Context context, gck gck, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        super(context);
        this.c = context;
        this.g = gck;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = z;
        this.m = z2;
        this.n = z3;
    }

    private final void c() {
        AsyncTask asyncTask = this.d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.d = null;
        }
    }

    public final void a() {
        b();
        Context context = this.c;
        this.e = new glj(context, new fyk(context), this, this.g, new ghe(context), this.h, this.i, this.k, this.l, this.m, this.n).execute(new Void[0]);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        AsyncTask asyncTask = this.e;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.e = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        b();
        c();
        this.b = null;
        super.onReset();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        gli gli = this.b;
        if (gli != null) {
            deliverResult(gli);
        }
        if (!this.f) {
            this.f = true;
            c();
            this.d = new gly(this, new gfi(getContext()), this.g, this.j).execute(new Void[0]);
        }
    }

    /* renamed from: a */
    public final void deliverResult(gli gli) {
        this.b = gli;
        iwd iwd = a;
        String valueOf = String.valueOf(gli.toString());
        iwd.c(valueOf.length() == 0 ? new String("Got result: ") : "Got result: ".concat(valueOf), new Object[0]);
        super.deliverResult(gli);
    }
}
