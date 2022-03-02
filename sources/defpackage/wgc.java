package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wgc implements Runnable {
    private final wgd a;
    private final byte[] b;
    private final ShareTarget c;
    private final String d;
    private final vtx e;
    private final wgk f;

    public wgc(wgd wgd, byte[] bArr, ShareTarget shareTarget, String str, vtx vtx, wgk wgk) {
        this.a = wgd;
        this.b = bArr;
        this.c = shareTarget;
        this.d = str;
        this.e = vtx;
        this.f = wgk;
    }

    public final void run() {
        ShareTarget a2;
        wgd wgd = this.a;
        byte[] bArr = this.b;
        ShareTarget shareTarget = this.c;
        String str = this.d;
        vtx vtx = this.e;
        wgk wgk = this.f;
        wby a3 = wby.a(bArr);
        if (a3 != null && (a2 = wgd.d.a(a3, false)) != null && wcu.a(shareTarget, a2)) {
            jjg jjg = vvj.a;
            wgd.d.b(a2, str);
            wgd.d.a(a2, vtx);
            wgu wgu = wgd.d;
            wgm wgm = (wgm) wgu.c.remove(a2);
            if (wgm != null) {
                wgm wgm2 = (wgm) wgu.c.remove(shareTarget);
                if (wgm2 != null) {
                    tjc[] tjcArr = wgm2.i;
                    if (tjcArr.length > 0) {
                        wgm.i = tjcArr;
                    }
                }
                if (wgm2 != null) {
                    tjc[] tjcArr2 = wgm2.h;
                    if (tjcArr2.length > 0) {
                        wgm.h = tjcArr2;
                    }
                }
                if (wgm2 != null) {
                    tjc[] tjcArr3 = wgm2.j;
                    if (tjcArr3.length > 0) {
                        wgm.j = tjcArr3;
                    }
                }
                wgu.c.put(shareTarget, wgm);
            }
            wgd.d.q.a(shareTarget, str, bArr);
            wgk.a.b((Object) shareTarget);
            wgd.d.m();
        }
    }
}
