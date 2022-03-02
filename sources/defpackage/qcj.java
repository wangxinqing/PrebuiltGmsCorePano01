package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: qcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qcj extends Fragment {
    private bs a;

    /* access modifiers changed from: package-private */
    public final br a(bn bnVar) {
        return new br(this.a, bnVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.a = new bs();
    }

    public final void onDestroy() {
        super.onDestroy();
        bs bsVar = this.a;
        if (bsVar != null) {
            bsVar.a();
        }
    }
}
