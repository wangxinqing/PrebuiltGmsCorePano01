package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: qam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qam extends Fragment {
    public qan a;

    public final void onActivityResult(int i, int i2, Intent intent) {
        aosh aosh = (aosh) this.a.b.get(i);
        if (aosh != null) {
            aosh.b((Object) new qal(i2, intent));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
