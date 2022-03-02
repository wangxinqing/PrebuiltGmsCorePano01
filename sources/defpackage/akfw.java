package defpackage;

import com.google.android.pano.widget.MetadataView;

/* renamed from: akfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfw implements Runnable {
    final /* synthetic */ MetadataView a;

    public akfw(MetadataView metadataView) {
        this.a = metadataView;
    }

    public final void run() {
        this.a.setVisibility(4);
    }
}
