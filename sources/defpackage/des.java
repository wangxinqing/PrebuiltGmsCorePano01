package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: des  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class des extends Fragment implements aj {
    public final al l = new al(this);

    public final ae getLifecycle() {
        return this.l;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l.a(ad.CREATED);
    }

    public void onDestroy() {
        this.l.a(ad.DESTROYED);
        super.onDestroy();
    }

    public void onPause() {
        this.l.a(ad.STARTED);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.l.a(ad.RESUMED);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.l.a(ad.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.l.a(ad.STARTED);
    }

    public final void onStop() {
        this.l.a(ad.CREATED);
        super.onStop();
    }
}
