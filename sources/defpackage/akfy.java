package defpackage;

import com.google.android.pano.widget.PlaybackControlsView;

/* renamed from: akfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfy implements Runnable {
    final /* synthetic */ PlaybackControlsView a;

    public akfy(PlaybackControlsView playbackControlsView) {
        this.a = playbackControlsView;
    }

    public final void run() {
        this.a.f();
    }
}
