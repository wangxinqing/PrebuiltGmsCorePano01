package defpackage;

import com.google.android.libraries.material.progress.MaterialProgressBar;

/* renamed from: aeoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aeoy implements Runnable {
    private final MaterialProgressBar a;

    public aeoy(MaterialProgressBar materialProgressBar) {
        this.a = materialProgressBar;
    }

    public final void run() {
        MaterialProgressBar materialProgressBar = this.a;
        if (materialProgressBar.getVisibility() == 0) {
            materialProgressBar.setVisibility(4);
        }
    }
}
