package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* renamed from: yzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yzh extends Fragment {
    public final yzi a = new yzi();

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        yzi yzi = this.a;
        if (!(activity instanceof yzf)) {
            String valueOf = String.valueOf(yzf.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        yzi.f = (yzf) activity;
        yzi.g = activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        yzi yzi = this.a;
        Bundle arguments = getArguments();
        yzi.a = arguments.getString("account_name");
        yzi.c = arguments.getString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
        PlusCommonExtras b = PlusCommonExtras.b(arguments);
        yzi.b = b.b;
        ywh ywh = new ywh(yzi.g);
        ywh.a = yzi.a;
        ywh.c = yzi.c;
        ywh.d = new String[0];
        ywh.a(ykq.c.b);
        ywh.f = b;
        yzi.e = yzi.d.a(yzi.g, ywh.a(), yzi, yzi);
    }

    public final void onDestroy() {
        super.onDestroy();
        yzi yzi = this.a;
        if (yzi.e.l() || yzi.e.m()) {
            yzi.e.j();
        }
        yzi.e = null;
    }

    public final void onDetach() {
        super.onDetach();
        yzi yzi = this.a;
        yzi.f = null;
        yzi.g = null;
    }

    public final void onStart() {
        super.onStart();
        yzi yzi = this.a;
        if (!yzi.e.l() && !yzi.e.m()) {
            if (yzi.i == null || yzi.h) {
                yzi.e.t();
            }
        }
    }
}
