package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.leanback.widget.SearchBar;

/* renamed from: akx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akx implements Runnable {
    final /* synthetic */ SearchBar a;

    public akx(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final void run() {
        this.a.a.requestFocusFromTouch();
        this.a.a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, (float) this.a.a.getWidth(), (float) this.a.a.getHeight(), 0));
        this.a.a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, (float) this.a.a.getWidth(), (float) this.a.a.getHeight(), 0));
    }
}
