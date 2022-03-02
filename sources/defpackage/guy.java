package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.checkin.CheckinApiChimeraService;
import com.google.android.gms.checkin.CheckinChimeraService;

/* renamed from: guy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class guy implements gxx {
    public Bundle a;
    public final boolean b;
    public final Bundle c;
    private final CheckinApiChimeraService d;
    private final jbf e;
    private final ifu f;
    private final gvn g;
    private boolean h;

    public guy() {
    }

    public final void a() {
        Bundle bundle = this.c;
        if (bundle != null) {
            iva.a((Object) bundle);
            this.a = bundle;
        }
        this.g.a.add(this);
        gwd.a("CheckinApi:start", Integer.valueOf(this.f.hashCode()), Long.valueOf(SystemClock.elapsedRealtime()));
        CheckinChimeraService.b((Context) this.d);
    }

    public guy(CheckinApiChimeraService checkinApiChimeraService, jbf jbf, ifu ifu, Bundle bundle, boolean z) {
        gvn a2 = gvn.a();
        this.h = false;
        this.d = checkinApiChimeraService;
        this.e = jbf;
        this.f = ifu;
        this.c = bundle;
        this.b = z;
        this.g = a2;
    }

    public final synchronized void a(int i) {
        if (this.h) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("dispatchResult is called more than once : ");
            sb.append(i);
            Log.e("CheckinApiRequest", sb.toString());
        } else {
            this.e.a(this.d, new gvm(this.f, i));
        }
        this.h = true;
    }

    public final void a(boolean z) {
        a(!z ? 21041 : 21021);
    }
}
