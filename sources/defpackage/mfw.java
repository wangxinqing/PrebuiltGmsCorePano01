package defpackage;

import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: mfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfw {
    private static mfw a = null;

    public static final ClientContext a(String str) {
        ClientContext clientContext = new ClientContext(Process.myUid(), str, str, "com.google.android.gms", "com.google.android.gms");
        clientContext.d(axgd.a.a().n());
        return clientContext;
    }

    public static void b() {
        if (a == null) {
            a = new mfw();
        }
    }

    public static final mfn a() {
        return new mfn(new iyn(ihs.b(), axgd.a.a().p(), axgd.a.a().o(), axgd.a.a().j(), axgd.a.a().k(), axgd.a.a().i(), axgd.a.a().m()));
    }
}
