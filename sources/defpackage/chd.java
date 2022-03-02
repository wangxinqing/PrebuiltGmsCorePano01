package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: chd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class chd implements acvp {
    final /* synthetic */ chf a;

    public chd(chf chf) {
        this.a = chf;
    }

    public final void a(acwa acwa) {
        if (!acwa.b() || !((Boolean) acwa.d()).booleanValue()) {
            ((anih) ((anih) bxk.a.b()).a("chd", "a", 197, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ShushGestureSensor] Nano app not available.");
        } else {
            this.a.a(chf.a(1, ByteBuffer.allocate(36).order(ByteOrder.LITTLE_ENDIAN).putFloat((float) awwn.a.a().i()).putFloat((float) awwn.a.a().a()).putFloat((float) awwn.a.a().c()).putFloat((float) awwn.a.a().e()).putFloat((float) awwn.a.a().b()).putFloat((float) awwn.a.a().f()).putFloat((float) awwn.a.a().k()).putFloat((float) awwn.a.a().j()).putFloat((float) awwn.a.a().h()).array()));
        }
    }
}
