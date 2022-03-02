package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.Formatter;

/* renamed from: zdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zdl extends iyv {
    public final izb a;

    public zdl(izb izb) {
        this.a = izb;
        izb.g = 6400;
    }

    public final void a(ClientContext clientContext, String str) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("applications/%1$s/moments", new Object[]{iyv.a(str)});
        this.a.a(clientContext, 3, sb.toString(), (Object) null);
    }
}
