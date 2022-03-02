package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wcr extends wgu {
    public wcr(Context context, wbo wbo, vva vva) {
        super(context, wbo, vva);
        this.p.b();
    }

    public final int a(ShareTarget shareTarget) {
        ((anih) ((anih) vvj.a.c()).a("wcr", "a", 61, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot accept on DisabledNearbySharingProvider.");
        return 35501;
    }

    public final int b(ShareTarget shareTarget) {
        ((anih) ((anih) vvj.a.c()).a("wcr", "b", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deny on DisabledNearbySharingProvider.");
        return 35501;
    }

    public final int c(ShareTarget shareTarget) {
        ((anih) ((anih) vvj.a.c()).a("wcr", "c", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot open on DisabledNearbySharingProvider.");
        return 35501;
    }

    public final int d(ShareTarget shareTarget) {
        ((anih) ((anih) vvj.a.c()).a("wcr", "d", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot cancel on DisabledNearbySharingProvider.");
        return 35501;
    }

    public final List f() {
        ((anih) ((anih) vvj.a.c()).a("wcr", "f", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot get discovered share targets on DisabledNearbySharingProvider.");
        return new ArrayList();
    }

    public final void g() {
        ((anih) ((anih) vvj.a.c()).a("wcr", "g", 88, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot sync on DisabledNearbySharingProvider.");
    }

    public final void a() {
        ((anih) ((anih) vvj.a.c()).a("wcr", "a", 49, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot stop discovery on DisabledNearbySharingProvider.");
    }

    public final void b() {
        ((anih) ((anih) vvj.a.c()).a("wcr", "b", 39, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot stop advertising on DisabledNearbySharingProvider.");
    }

    public final void a(int i) {
        ((anih) ((anih) vvj.a.c()).a("wcr", "a", 99, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot set visibility on DisabledNearbySharingProvider.");
    }

    public final void a(String str, ShareTarget shareTarget, vtx vtx) {
        ((anih) ((anih) vvj.a.c()).a("wcr", "a", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot send on DisabledNearbySharingProvider.");
    }

    public final void a(String str, vtx vtx, wbq wbq) {
        ((anih) ((anih) vvj.a.c()).a("wcr", "a", 34, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot start advertising on DisabledNearbySharingProvider.");
    }

    public final void a(vsh vsh, wbt wbt) {
        ((anih) ((anih) vvj.a.c()).a("wcr", "a", 44, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot start discovery on DisabledNearbySharingProvider.");
    }
}
