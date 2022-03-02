package defpackage;

import android.content.Intent;
import com.google.android.chimera.Fragment;
import java.lang.ref.WeakReference;

/* renamed from: adgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adgt implements adgu {
    private final WeakReference a;

    public adgt(Fragment fragment) {
        this.a = new WeakReference(fragment);
    }

    public final boolean a(Intent intent) {
        Fragment fragment = (Fragment) this.a.get();
        if (fragment == null) {
            return false;
        }
        fragment.startActivityForResult(intent, 1);
        return true;
    }
}
