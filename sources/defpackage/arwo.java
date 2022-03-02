package defpackage;

import android.view.View;

/* renamed from: arwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class arwo implements Runnable {
    private final View a;

    public arwo(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.performClick();
    }
}
