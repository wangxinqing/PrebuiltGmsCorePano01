package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: ajxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajxf extends oz {
    final /* synthetic */ CheckableImageButton b;

    public ajxf(CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        qsVar.a(this.b.b);
        qsVar.a.setChecked(this.b.a);
    }

    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.a);
    }
}
