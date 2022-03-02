package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* renamed from: afae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afae implements afbu {
    public final awdn a;
    public final awdn b;
    public final affc c;
    public final afai d;
    public final pbw e;
    public final aezz f;
    private final afeb g;

    public afae(awdn awdn, awdn awdn2, pbw pbw, affc affc, afai afai, afeb afeb, aezz aezz) {
        this.a = awdn;
        this.b = awdn2;
        this.e = pbw;
        this.c = affc;
        this.d = afai;
        this.g = afeb;
        this.f = aezz;
    }

    public final aorr a(Bundle bundle) {
        if (bundle == null) {
            return aorl.a((Throwable) new IllegalArgumentException("Notification task extras is null"));
        }
        String string = bundle.getString("notifications");
        if (string == null) {
            return aorl.a((Throwable) new IllegalArgumentException("Notifications payload is missing"));
        }
        pbw pbw = this.e;
        afeb afeb = this.g;
        afeb.getClass();
        return aopr.a(pbw.a(new afab(afeb)), (aoqb) new afac(this, string), (Executor) this.e);
    }
}
