package defpackage;

import android.widget.RatingBar;

/* renamed from: oce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oce implements RatingBar.OnRatingBarChangeListener {
    final /* synthetic */ ocf a;

    public oce(ocf ocf) {
        this.a = ocf;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        this.a.e();
        this.a.a((int) f);
    }
}
