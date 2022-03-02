package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: ajug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajug extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    public ajug(Chip chip) {
        this.a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        Chip chip = this.a;
        Rect rect = Chip.a;
        ajuj ajuj = chip.b;
        if (ajuj != null) {
            ajuj.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
