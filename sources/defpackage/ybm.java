package defpackage;

import android.content.Context;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: ybm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ybm extends Loader {
    private final ArrayList a = new ArrayList();
    public icc e;
    public Status f;
    public ilh g;

    protected ybm(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public abstract icc a(Context context);

    /* access modifiers changed from: protected */
    public final void a(Status status, ilh ilh) {
        this.f = status;
        deliverResult(ilh);
    }

    /* access modifiers changed from: protected */
    public abstract void a(icc icc);

    public final void b(Status status, ilh ilh) {
        this.f = status;
        a(ilh, false);
    }

    public final void c() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((ilh) this.a.get(i)).c();
        }
        this.a.clear();
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        icc icc = this.e;
        return icc != null && icc.i();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        super.onForceLoad();
        if (this.e.i()) {
            a(this.e);
        } else {
            this.e.e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        ilh ilh = this.g;
        if (ilh != null) {
            ilh.c();
            c();
        }
        this.g = null;
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        if (this.e == null) {
            icc a2 = a(getContext());
            this.e = a2;
            a2.a((ica) new ybk(this));
            this.e.a((icb) new ybl(this));
        }
        ilh ilh = this.g;
        if (ilh != null) {
            deliverResult(ilh);
        }
        if (takeContentChanged() || this.g == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        icc icc = this.e;
        if (icc != null && icc.i()) {
            this.e.g();
        }
    }

    /* renamed from: a */
    public final void deliverResult(ilh ilh) {
        a(ilh, true);
    }

    public final void a(ilh ilh, boolean z) {
        if (!isReset()) {
            ilh ilh2 = this.g;
            this.g = ilh;
            if (isStarted()) {
                super.deliverResult(ilh);
            }
            if (ilh2 != null && ilh2 != ilh) {
                this.a.add(ilh2);
                if (z) {
                    c();
                }
            }
        } else if (ilh != null && z) {
            ilh.c();
        }
    }
}
