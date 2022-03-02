package defpackage;

import com.google.android.pano.widget.ScrollAdapterView;

/* renamed from: akgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgn extends akhh {
    final /* synthetic */ ScrollAdapterView a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akgn(ScrollAdapterView scrollAdapterView) {
        super(0);
        this.a = scrollAdapterView;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        int childCount = this.a.getChildCount();
        for (int k = this.a.k(); k < childCount; k++) {
            b(this.a.getChildAt(k), this.a.c(k));
        }
    }
}
