package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.pano.widget.ScrollAdapterView;
import java.util.ArrayList;

/* renamed from: akgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgk extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ScrollAdapterView a;
    private long b;

    public akgk(ScrollAdapterView scrollAdapterView) {
        this.a = scrollAdapterView;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.a.requestFocus();
        ScrollAdapterView scrollAdapterView = this.a;
        int i = ScrollAdapterView.A;
        int size = scrollAdapterView.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            akgp akgp = (akgp) this.a.v.get(i2);
            if (akgp.d > 0.0f) {
                akgp.c.getHitRect(this.a.x);
                ScrollAdapterView scrollAdapterView2 = this.a;
                scrollAdapterView2.x.offset(-scrollAdapterView2.getScrollX(), -this.a.getScrollY());
                if (this.a.x.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    this.b = motionEvent.getDownTime();
                    return false;
                }
            }
        }
        this.b = 0;
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ScrollAdapterView scrollAdapterView = this.a;
        float f3 = -f;
        float f4 = -f2;
        int i = ScrollAdapterView.A;
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f3);
        int i2 = scrollAdapterView.a;
        if (i2 == 1) {
            if (abs < abs2) {
                return false;
            }
            scrollAdapterView.a(0.0f, f4);
            return true;
        } else if (i2 != 0 || abs >= abs2) {
            return false;
        } else {
            scrollAdapterView.a(f3, 0.0f);
            return true;
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ScrollAdapterView scrollAdapterView = this.a;
        if (!scrollAdapterView.i.b(f, f2)) {
            return false;
        }
        scrollAdapterView.w = 4;
        scrollAdapterView.g();
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent.getDownTime() != this.b) {
            int i = -this.a.getScrollX();
            int i2 = -this.a.getScrollY();
            int childCount = this.a.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.a.getChildAt(i3);
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                childAt.getHitRect(this.a.x);
                this.a.x.offset(i, i2);
                if (this.a.x.contains(x, y)) {
                    if (this.a.getOnItemClickListener() == null) {
                        ArrayList arrayList = new ArrayList();
                        childAt.addTouchables(arrayList);
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            View view = (View) arrayList.get(i4);
                            view.getHitRect(this.a.x);
                            this.a.offsetDescendantRectToMyCoords((View) view.getParent(), this.a.x);
                            this.a.x.offset(i, i2);
                            if (!this.a.x.contains(x, y)) {
                                i4++;
                            } else {
                                view.performClick();
                                return true;
                            }
                        }
                        continue;
                    } else {
                        ScrollAdapterView scrollAdapterView = this.a;
                        int i5 = ScrollAdapterView.A;
                        int c = scrollAdapterView.c(i3);
                        AdapterView.OnItemClickListener onItemClickListener = this.a.getOnItemClickListener();
                        ScrollAdapterView scrollAdapterView2 = this.a;
                        onItemClickListener.onItemClick(scrollAdapterView2, childAt, c, scrollAdapterView2.c.getItemId(c));
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
