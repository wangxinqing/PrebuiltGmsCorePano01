package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: atz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atz extends oz {
    final /* synthetic */ ViewPager b;

    public atz(ViewPager viewPager) {
        this.b = viewPager;
    }

    private final boolean a() {
        atr atr = this.b.b;
        return atr != null && atr.a() > 1;
    }

    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        atr atr;
        super.d(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(a());
        if (accessibilityEvent.getEventType() == 4096 && (atr = this.b.b) != null) {
            accessibilityEvent.setItemCount(atr.a());
            accessibilityEvent.setFromIndex(this.b.c);
            accessibilityEvent.setToIndex(this.b.c);
        }
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        qsVar.a((CharSequence) "androidx.viewpager.widget.ViewPager");
        qsVar.e(a());
        if (this.b.canScrollHorizontally(1)) {
            qsVar.a((int) FragmentTransaction.TRANSIT_ENTER_MASK);
        }
        if (this.b.canScrollHorizontally(-1)) {
            qsVar.a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
        }
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.b.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager = this.b;
            viewPager.b(viewPager.c - 1);
            return true;
        } else if (!this.b.canScrollHorizontally(1)) {
            return false;
        } else {
            ViewPager viewPager2 = this.b;
            viewPager2.b(viewPager2.c + 1);
            return true;
        }
    }
}
