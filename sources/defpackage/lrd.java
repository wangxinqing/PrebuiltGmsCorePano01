package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;

/* renamed from: lrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrd extends abk {
    public final void k(View view) {
        int i = RecyclerView.getChildViewHolderInt(view).f;
        if (i == R.layout.drive_file_list_loading_spinner || i == R.layout.drive_file_list_failure_message || i == R.layout.drive_file_list_empty_message) {
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (this.C - s()) - u()), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(Math.max(0, (this.D - t()) - v()), JGCastService.FLAG_PRIVATE_DISPLAY));
            return;
        }
        super.k(view);
    }
}
