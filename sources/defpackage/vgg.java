package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vgg {
    public static final /* synthetic */ int e = 0;
    private static final ClientAppIdentifier f = ClientAppIdentifier.a("com.google.android.gms");
    public final uxy a;
    public final Map b = new HashMap();
    public final Context c;
    public final uwl d;

    public vgg(Context context, ClientAppIdentifier clientAppIdentifier, uwl uwl) {
        this.c = context;
        this.d = uwl;
        if (f.equals(clientAppIdentifier)) {
            jjg jjg = tgc.a;
            this.a = null;
            return;
        }
        this.a = new uxy(context, clientAppIdentifier, uwl);
    }

    /* access modifiers changed from: package-private */
    public final Collection a() {
        uxy uxy = this.a;
        if (uxy == null) {
            return this.b.values();
        }
        return Collections.singletonList(uxy);
    }
}
