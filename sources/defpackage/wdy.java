package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: wdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdy implements Callable {
    private final wgu a;
    private final byte[] b;
    private final String c;
    private final byte[] d;
    private final int e;
    private final boolean f;
    private final ShareTarget g;

    public wdy(wgu wgu, byte[] bArr, String str, byte[] bArr2, int i, boolean z, ShareTarget shareTarget) {
        this.a = wgu;
        this.b = bArr;
        this.c = str;
        this.d = bArr2;
        this.e = i;
        this.f = z;
        this.g = shareTarget;
    }

    public final Object call() {
        wgu wgu = this.a;
        byte[] bArr = this.b;
        String str = this.c;
        byte[] bArr2 = this.d;
        int i = this.e;
        boolean z = this.f;
        ShareTarget shareTarget = this.g;
        wcx a2 = wgu.g.a(bArr, str, bArr2, i, z);
        if (a2 != null) {
            return a2;
        }
        throw new Exception(String.format(Locale.getDefault(), "Failed to connect to %s", new Object[]{shareTarget}));
    }
}
