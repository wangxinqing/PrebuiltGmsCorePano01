package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: aenn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aenn implements View.OnTouchListener {
    private final OpenSearchView a;

    public aenn(OpenSearchView openSearchView) {
        this.a = openSearchView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        OpenSearchView openSearchView = this.a;
        if (!openSearchView.j()) {
            return false;
        }
        openSearchView.h();
        return false;
    }
}
