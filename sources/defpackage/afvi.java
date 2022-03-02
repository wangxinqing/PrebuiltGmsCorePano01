package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: afvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afvi {
    public final agzs a;
    private final Executor b;

    public afvi(Executor executor, agzs agzs) {
        this.b = executor;
        this.a = agzs;
    }

    public final aorr a(afur afur, int i) {
        Uri uri;
        if (i == 0) {
            uri = Uri.parse(afur.b);
        } else if (i == 1) {
            uri = Uri.parse(afur.c);
        } else if (i == 2) {
            uri = Uri.parse(afur.d);
        } else if (i != 3) {
            uri = Uri.parse(afur.f);
        } else {
            uri = Uri.parse(afur.e);
        }
        return aorl.a((aoqa) new afvh(this, uri), this.b);
    }
}
