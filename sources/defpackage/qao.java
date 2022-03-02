package defpackage;

import android.os.Looper;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qao {
    public final Map a = new HashMap();
    private final qaq b = new qaq(new qvr(Looper.getMainLooper()));

    public static qao a(FragmentActivity fragmentActivity) {
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        qap qap = (qap) supportFragmentManager.findFragmentByTag("FutureManagerRetainedFragment");
        if (qap == null) {
            qap = new qap();
            supportFragmentManager.beginTransaction().add((Fragment) qap, "FutureManagerRetainedFragment").commitNow();
        }
        return qap.a;
    }

    public final qat b(Object obj, amsv amsv) {
        a(obj);
        return a(obj, amsv);
    }

    public final qat a(Object obj, amsv amsv) {
        qat qat = (qat) this.a.get(obj);
        if (qat != null) {
            return qat;
        }
        qat qat2 = new qat((aorr) amsv.a(), this.b);
        this.a.put(obj, qat2);
        return qat2;
    }

    public final void a(Object obj) {
        qat qat = (qat) this.a.remove(obj);
        if (qat != null) {
            qat.a();
            qat.cancel(true);
        }
    }
}
