package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: adm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adm extends oz {
    final adn b;
    public final Map c = new WeakHashMap();

    public adm(adn adn) {
        this.b = adn;
    }

    public final qv a(View view) {
        oz ozVar = (oz) this.c.get(view);
        if (ozVar != null) {
            return ozVar.a(view);
        }
        return super.a(view);
    }

    public final boolean b(View view, AccessibilityEvent accessibilityEvent) {
        oz ozVar = (oz) this.c.get(view);
        if (ozVar != null) {
            return ozVar.b(view, accessibilityEvent);
        }
        return super.b(view, accessibilityEvent);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        oz ozVar = (oz) this.c.get(view);
        if (ozVar != null) {
            ozVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        oz ozVar = (oz) this.c.get(view);
        if (ozVar != null) {
            ozVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    public final void a(View view, int i) {
        oz ozVar = (oz) this.c.get(view);
        if (ozVar != null) {
            ozVar.a(view, i);
        } else {
            super.a(view, i);
        }
    }

    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        oz ozVar = (oz) this.c.get(view);
        if (ozVar != null) {
            ozVar.a(view, accessibilityEvent);
        } else {
            super.a(view, accessibilityEvent);
        }
    }

    public final void a(View view, qs qsVar) {
        if (this.b.a() || this.b.b.getLayoutManager() == null) {
            super.a(view, qsVar);
            return;
        }
        this.b.b.getLayoutManager().a(view, qsVar);
        oz ozVar = (oz) this.c.get(view);
        if (ozVar != null) {
            ozVar.a(view, qsVar);
        } else {
            super.a(view, qsVar);
        }
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (this.b.a() || this.b.b.getLayoutManager() == null) {
            return super.a(view, i, bundle);
        }
        oz ozVar = (oz) this.c.get(view);
        if (ozVar != null) {
            if (ozVar.a(view, i, bundle)) {
                return true;
            }
        } else if (super.a(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.b.b.getLayoutManager().r;
        adb adb = recyclerView.mRecycler;
        adi adi = recyclerView.mState;
        return false;
    }

    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        oz ozVar = (oz) this.c.get(viewGroup);
        if (ozVar != null) {
            return ozVar.a(viewGroup, view, accessibilityEvent);
        }
        return super.a(viewGroup, view, accessibilityEvent);
    }
}
