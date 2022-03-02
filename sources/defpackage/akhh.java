package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;

/* renamed from: akhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class akhh {
    private final int a;
    public final Bundle b = new Bundle();

    public akhh(int i) {
        this.a = i;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void b() {
        this.b.clear();
    }

    public final void c() {
        if (this.a != 0) {
            a();
        }
    }

    public final void a(View view, int i) {
        SparseArray sparseParcelableArray = this.b.getSparseParcelableArray(Integer.toString(i));
        if (sparseParcelableArray != null) {
            view.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final void c(View view, int i) {
        if (this.a == 2) {
            this.b.size();
            b(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(View view, int i) {
        String num = Integer.toString(i);
        SparseArray sparseArray = new SparseArray();
        view.saveHierarchyState(sparseArray);
        this.b.putSparseParcelableArray(num, sparseArray);
    }
}
