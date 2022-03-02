package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* renamed from: ajum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajum implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    final /* synthetic */ ChipGroup b;

    public ajum(ChipGroup chipGroup) {
        this.b = chipGroup;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (view == this.b && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                int i = Build.VERSION.SDK_INT;
                view2.setId(View.generateViewId());
            }
            ((Chip) view2).d = this.b.c;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.b && (view2 instanceof Chip)) {
            ((Chip) view2).d = null;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
