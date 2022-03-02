package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.concurrent.Callable;

/* renamed from: wee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wee implements Callable {
    private final wgu a;
    private final ShareTarget b;

    public wee(wgu wgu, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = shareTarget;
    }

    public final Object call() {
        wgu wgu = this.a;
        ShareTarget shareTarget = this.b;
        if (wgu.x != 2) {
            return 35511;
        }
        if (shareTarget.i) {
            return Integer.valueOf(wgu.e(shareTarget));
        }
        return Integer.valueOf(wgu.g(shareTarget));
    }
}
