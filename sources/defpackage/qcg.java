package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: qcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class qcg extends Fragment implements aj {
    private final al a = new al(this);

    public final ae getLifecycle() {
        return this.a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((qcj) getChildFragmentManager().findFragmentByTag("ViewModelHolderFragment")) == null) {
            getChildFragmentManager().beginTransaction().add((Fragment) new qcj(), "ViewModelHolderFragment").commitNow();
        }
        this.a.a(ac.ON_CREATE);
    }

    public void onDestroy() {
        this.a.a(ac.ON_DESTROY);
        super.onDestroy();
    }

    public void onPause() {
        this.a.a(ac.ON_PAUSE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.a.a(ac.ON_RESUME);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.a.a(ac.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.a.a(ac.ON_START);
    }

    public final void onStop() {
        this.a.a(ac.ON_STOP);
        super.onStop();
    }
}
