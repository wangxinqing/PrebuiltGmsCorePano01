package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zv {
    public final zu a = new zu();
    public final List b = new ArrayList();
    public final ace c;

    public zv(ace ace) {
        this.c = ace;
    }

    public final int a() {
        return this.c.a() - this.b.size();
    }

    public final int b() {
        return this.c.a();
    }

    public final View c(int i) {
        return this.c.b(i);
    }

    /* access modifiers changed from: package-private */
    public final void d(int i) {
        adl childViewHolderInt;
        int a2 = a(i);
        this.a.d(a2);
        ace ace = this.c;
        View b2 = ace.b(a2);
        if (!(b2 == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(b2)) == null)) {
            if (!childViewHolderInt.o() || childViewHolderInt.ax()) {
                childViewHolderInt.b(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + ace.a.exceptionLabel());
            }
        }
        ace.a.detachViewFromParent(a2);
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }

    public final int a(int i) {
        if (i >= 0) {
            int a2 = this.c.a();
            int i2 = i;
            while (i2 < a2) {
                int e = i - (i2 - this.a.e(i2));
                if (e != 0) {
                    i2 += e;
                } else {
                    while (this.a.c(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final int b(View view) {
        int a2 = this.c.a(view);
        if (a2 == -1 || this.a.c(a2)) {
            return -1;
        }
        return a2 - this.a.e(a2);
    }

    public final boolean c(View view) {
        return this.b.contains(view);
    }

    public final void a(View view) {
        this.b.add(view);
        ace ace = this.c;
        adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            RecyclerView recyclerView = ace.a;
            int i = childViewHolderInt.p;
            if (i == -1) {
                childViewHolderInt.o = qb.f(childViewHolderInt.a);
            } else {
                childViewHolderInt.o = i;
            }
            recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, 4);
        }
    }

    public final View b(int i) {
        return this.c.b(a(i));
    }

    public final void d(View view) {
        if (this.b.remove(view)) {
            this.c.b(view);
        }
    }

    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.c.a();
        } else {
            i2 = a(i);
        }
        this.a.a(i2, z);
        if (z) {
            a(view);
        }
        ace ace = this.c;
        adl childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.o() || childViewHolderInt.ax()) {
                childViewHolderInt.j();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + ace.a.exceptionLabel());
            }
        }
        ace.a.attachViewToParent(view, i2, layoutParams);
    }

    public final void a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.c.a();
        } else {
            i2 = a(i);
        }
        this.a.a(i2, z);
        if (z) {
            a(view);
        }
        ace ace = this.c;
        ace.a.addView(view, i2);
        ace.a.dispatchChildAttached(view);
    }
}
