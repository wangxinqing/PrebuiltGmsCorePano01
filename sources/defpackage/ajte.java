package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState;

/* renamed from: ajte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajte implements xh {
    public ajtc a;
    public boolean b = false;
    public int c;
    private wt d;

    public final void a(Context context, wt wtVar) {
        this.d = wtVar;
        this.a.o = wtVar;
    }

    public final void a(wt wtVar, boolean z) {
    }

    public final void a(xg xgVar) {
        throw null;
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(ww wwVar) {
        return false;
    }

    public final boolean a(xp xpVar) {
        return false;
    }

    public final int b() {
        return this.c;
    }

    public final boolean b(ww wwVar) {
        return false;
    }

    public final Parcelable f() {
        BottomNavigationPresenter$SavedState bottomNavigationPresenter$SavedState = new BottomNavigationPresenter$SavedState();
        ajtc ajtc = this.a;
        bottomNavigationPresenter$SavedState.a = ajtc.e;
        bottomNavigationPresenter$SavedState.b = ajst.a(ajtc.m);
        return bottomNavigationPresenter$SavedState;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof BottomNavigationPresenter$SavedState) {
            ajtc ajtc = this.a;
            BottomNavigationPresenter$SavedState bottomNavigationPresenter$SavedState = (BottomNavigationPresenter$SavedState) parcelable;
            int i = bottomNavigationPresenter$SavedState.a;
            int size = ajtc.o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = ajtc.o.getItem(i2);
                if (i == item.getItemId()) {
                    ajtc.e = i;
                    ajtc.f = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            SparseArray a2 = ajst.a(this.a.getContext(), bottomNavigationPresenter$SavedState.b);
            ajtc ajtc2 = this.a;
            ajtc2.m = a2;
            ajsz[] ajszArr = ajtc2.d;
            if (ajszArr != null) {
                for (ajsz ajsz : ajszArr) {
                    ajsz.a((ajss) a2.get(ajsz.getId()));
                }
            }
        }
    }

    public final void a(boolean z) {
        if (this.b) {
            return;
        }
        if (!z) {
            ajtc ajtc = this.a;
            wt wtVar = ajtc.o;
            if (wtVar != null && ajtc.d != null) {
                int size = wtVar.size();
                if (size == ajtc.d.length) {
                    int i = ajtc.e;
                    for (int i2 = 0; i2 < size; i2++) {
                        MenuItem item = ajtc.o.getItem(i2);
                        if (item.isChecked()) {
                            ajtc.e = item.getItemId();
                            ajtc.f = i2;
                        }
                    }
                    if (i != ajtc.e) {
                        arr.a(ajtc, ajtc.a);
                    }
                    boolean a2 = ajtc.a(ajtc.c, ajtc.o.g().size());
                    for (int i3 = 0; i3 < size; i3++) {
                        ajtc.n.b = true;
                        ajtc.d[i3].a(ajtc.c);
                        ajtc.d[i3].a(a2);
                        ajtc.d[i3].a((ww) ajtc.o.getItem(i3));
                        ajtc.n.b = false;
                    }
                    return;
                }
                ajtc.a();
                return;
            }
            return;
        }
        this.a.a();
    }
}
