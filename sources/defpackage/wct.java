package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wct {
    public final String a;
    public final byte[] b;
    public final ShareTarget c;
    public tfu d;

    public wct(String str, byte[] bArr, ShareTarget shareTarget) {
        this.a = str;
        this.b = bArr;
        this.c = shareTarget;
    }

    public final void a() {
        tfu tfu = this.d;
        if (tfu != null) {
            tfu.b();
            this.d = null;
        }
    }
}
