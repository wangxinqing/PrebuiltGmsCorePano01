package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;

/* renamed from: vbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vbt implements Closeable {
    private final Context a;
    private final Map b = new nz();
    private final vbg c;

    public vbt(Context context, vbg vbg) {
        this.a = context;
        this.c = vbg;
    }

    public final Set a() {
        return this.b.keySet();
    }

    /* access modifiers changed from: package-private */
    public final Set b() {
        return this.b.entrySet();
    }

    public final void close() {
        for (vbu close : this.b.values()) {
            close.close();
        }
    }

    public final vbu a(ClientAppIdentifier clientAppIdentifier) {
        vbu vbu = (vbu) this.b.get(clientAppIdentifier);
        if (vbu != null) {
            return vbu;
        }
        Context context = this.a;
        vbu vbu2 = new vbu(context, clientAppIdentifier, new vbm(this.c.a, clientAppIdentifier));
        ((uxd) thl.a(context, uxd.class)).a(vbu2);
        this.b.put(clientAppIdentifier, vbu2);
        return vbu2;
    }
}
