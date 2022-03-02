package defpackage;

import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Set;

/* renamed from: vet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vet extends arwm {
    final /* synthetic */ avcw a;
    final /* synthetic */ avcx b;
    final /* synthetic */ veu c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vet(veu veu, String str, avcw avcw, avcx avcx) {
        super(str);
        this.c = veu;
        this.a = avcw;
        this.b = avcx;
    }

    public final void run() {
        veu veu = this.c;
        uyz uyz = veu.b;
        ClientAppIdentifier clientAppIdentifier = veu.a;
        avcw avcw = this.a;
        avcx avcx = this.b;
        Set set = veu.d;
        uyz.e.b();
        Set set2 = set;
        ((anih) ((anih) tgc.a.d()).a("uyz", "a", 145, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s response succeeded for %s [%dms], addresses %s", "CopresenceLogger: ", clientAppIdentifier, Long.valueOf(uyz.a((audx) avcw)), set2);
        uyz.a(uyz.a(clientAppIdentifier, avcw, avcx, 200, set2));
        uyz.b(avcw);
    }
}
