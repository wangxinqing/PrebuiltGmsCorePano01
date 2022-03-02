package defpackage;

import android.net.Uri;
import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;

/* renamed from: xpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xpm extends wsx implements niz {
    private final nix a;
    private final nio b;
    private final String c;

    public xpm(nio nio, nix nix, String str) {
        this.b = nio;
        this.a = nix;
        this.c = str;
    }

    public final void a(wtb wtb) {
        this.a.a(new xqm(wtb, this.b, this.c));
    }

    public final void b(wtb wtb) {
        this.a.a(new xqj(wtb, this.b, this.c));
    }

    public final void c(wtb wtb) {
        this.a.a(new xqk(wtb, this.b, this.c));
    }

    public final void a(wtb wtb, Uri uri) {
        this.a.a(new xqt(wtb, this.b, this.c, uri));
    }

    public final void b(wtb wtb, int[] iArr) {
        this.a.a(new xqn(wtb, this.b, iArr));
    }

    public final void a(wtb wtb, String str) {
        this.a.a(new xql(wtb, this.b, str, this.c));
    }

    public final void a(wtb wtb, List list, String str) {
        nix nix = this.a;
        nio nio = this.b;
        ClientContext clientContext = new ClientContext();
        clientContext.e = this.c;
        clientContext.j = Binder.getCallingPid();
        clientContext.b = Binder.getCallingUid();
        nix.a(new wmg(nio, clientContext, list, wtb, wmd.a(this.b), wml.a(), str));
    }

    public final void a(wtb wtb, int[] iArr) {
        this.a.a(new xqh(wtb, this.b, iArr));
    }
}
