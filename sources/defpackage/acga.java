package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.android.volley.RequestQueue;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.concurrent.ExecutorService;

/* renamed from: acga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acga extends Fragment {
    public static final iwd a = acqa.a("MagicWand", "AssertionFragment");
    public static final aoru b = aosd.a((ExecutorService) jfm.b(9));
    public static final RequestQueue c = ihs.b().getRequestQueue();
    public aorr d;
    public achr e;
    public acfz f;
    public Context g;
    public boolean h;
    private Handler i;
    /* access modifiers changed from: private */
    public boolean j;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        a.b("onAttach", new Object[0]);
        this.g = activity.getApplicationContext();
        acfz acfz = (acfz) activity;
        this.f = acfz;
        if (this.h) {
            acfz.a();
        } else if (this.j) {
            acfz.b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.b("onCreate", new Object[0]);
        setRetainInstance(true);
        jfp jfp = new jfp("AccountBootstrapBackground", 9);
        jfp.start();
        this.i = new jfo(jfp);
        this.e = new achr(this.g, this.i);
    }

    public final void onDetach() {
        super.onDetach();
        a.b("onDetach", new Object[0]);
        this.f = null;
    }
}
