package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: rio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rio extends rjz {
    private static final String a = rio.class.getSimpleName();
    private final rim b;
    private final rik c;
    private final rin d;
    private final ril e;

    public rio(rik rik) {
        this.b = null;
        this.c = rik;
        this.d = null;
        this.e = null;
    }

    public final void a(Status status) {
        this.d.a((icl) status);
    }

    public final void b(DataHolder dataHolder) {
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                Log.e(a, "onAutocompletePrediction received null DataHolder", new Throwable());
            }
            this.c.a(Status.c);
            return;
        }
        this.c.a((icl) new rhg(dataHolder));
    }

    public final void c(DataHolder dataHolder) {
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                Log.e(a, "onPlaceUserDataFetched received null DataHolder", new Throwable());
            }
            Status status = Status.a;
            throw null;
        }
        new rlf(dataHolder);
        throw null;
    }

    public final void d(DataHolder dataHolder) {
        this.e.a((icl) new rhr(dataHolder));
    }

    public rio(ril ril) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = ril;
    }

    public final void a(DataHolder dataHolder) {
        boolean z;
        int i;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "placeEstimator cannot be null");
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                Log.e(a, "onPlaceEstimated received null DataHolder", new Throwable());
            }
            this.b.a(Status.c);
            return;
        }
        Bundle bundle = dataHolder.f;
        if (bundle != null) {
            i = bundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
        } else {
            i = 100;
        }
        this.b.a((icl) new ria(dataHolder, i));
    }

    public rio(rim rim) {
        this.b = rim;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public rio(rin rin) {
        this.b = null;
        this.c = null;
        this.d = rin;
        this.e = null;
    }
}
