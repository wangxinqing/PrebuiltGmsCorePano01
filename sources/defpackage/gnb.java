package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: gnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class gnb extends Fragment {
    private fzl a;

    public final fzl b() {
        fzl fzl = this.a;
        if (fzl != null) {
            return fzl;
        }
        throw new IllegalStateException("Must not access state before fragment onCreate().");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = gnj.a((Fragment) this, bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        gnj.a(this.a, bundle);
        super.onSaveInstanceState(bundle);
    }
}
