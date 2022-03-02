package defpackage;

import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;

/* renamed from: bsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bsu extends FragmentActivity implements aj {
    private final al CI = new al(this);

    public ae getLifecycle() {
        return this.CI;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.CI.a(ad.CREATED);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.CI.a(ad.DESTROYED);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.CI.a(ad.STARTED);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.CI.a(ad.RESUMED);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.CI.a(ad.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.CI.a(ad.STARTED);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.CI.a(ad.CREATED);
        super.onStop();
    }
}
