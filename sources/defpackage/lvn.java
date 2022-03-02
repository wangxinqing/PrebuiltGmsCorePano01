package defpackage;

import android.content.Intent;

/* renamed from: lvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lvn extends lut {
    final /* synthetic */ lvo a;

    public lvn(lvo lvo) {
        this.a = lvo;
    }

    public final void a() {
        if (this.a.b.a()) {
            this.a.a();
            lvo lvo = this.a;
            Intent makeMainActivity = Intent.makeMainActivity(lto.c());
            makeMainActivity.putExtra("FRX_START_FRAGMENT", "DND_ACCESS");
            makeMainActivity.addFlags(67108864);
            lvo.startActivity(makeMainActivity);
        }
    }
}
