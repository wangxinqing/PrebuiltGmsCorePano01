package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.pano.widget.ScrollAdapterView;

/* renamed from: akgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgq extends GestureDetector {
    final /* synthetic */ ScrollAdapterView a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akgq(ScrollAdapterView scrollAdapterView, Context context) {
        super(context, scrollAdapterView.z);
        this.a = scrollAdapterView;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ScrollAdapterView scrollAdapterView = this.a;
            int i = ScrollAdapterView.A;
            scrollAdapterView.c();
        }
        return super.onTouchEvent(motionEvent);
    }
}
