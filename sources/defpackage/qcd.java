package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: qcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class qcd extends bjs implements aj {
    private final al a = new al(this);

    public final ae getLifecycle() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final qcj h() {
        return (qcj) getSupportFragmentManager().findFragmentByTag("ViewModelHolderFragment");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (h() == null) {
            getSupportFragmentManager().beginTransaction().add((Fragment) new qcj(), "ViewModelHolderFragment").commitNow();
        }
        this.a.a(ac.ON_CREATE);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.a.a(ac.ON_DESTROY);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.a.a(ac.ON_PAUSE);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.a.a(ac.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.a.a(ac.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.a.a(ac.ON_START);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.a.a(ac.ON_STOP);
        super.onStop();
    }
}
