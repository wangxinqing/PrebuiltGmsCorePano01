package defpackage;

import android.widget.ScrollView;

/* renamed from: ajox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ajox implements Runnable {
    private final ScrollView a;

    public ajox(ScrollView scrollView) {
        this.a = scrollView;
    }

    public final void run() {
        this.a.fullScroll(130);
    }
}
