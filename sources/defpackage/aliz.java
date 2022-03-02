package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.google.android.gms.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: aliz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aliz implements alhi {
    public final TemplateLayout a;
    private ColorStateList b;

    public aliz(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    public final ProgressBar a() {
        return (ProgressBar) this.a.b(R.id.sud_layout_progress);
    }

    public final void a(ColorStateList colorStateList) {
        this.b = colorStateList;
        int i = Build.VERSION.SDK_INT;
        ProgressBar a2 = a();
        if (a2 != null) {
            a2.setIndeterminateTintList(colorStateList);
            if (Build.VERSION.SDK_INT >= 23 || colorStateList != null) {
                a2.setProgressBackgroundTintList(colorStateList);
            }
        }
    }

    public final void a(boolean z) {
        if (!z) {
            ProgressBar a2 = a();
            if (a2 != null) {
                a2.setVisibility(8);
                return;
            }
            return;
        }
        if (a() == null) {
            ViewStub viewStub = (ViewStub) this.a.b(R.id.sud_layout_progress_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            a(this.b);
        }
        ProgressBar a3 = a();
        if (a3 != null) {
            a3.setVisibility(0);
        }
    }
}
