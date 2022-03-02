package defpackage;

import java.nio.channels.Channels;

/* renamed from: bauz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bauz implements bawd {
    final /* synthetic */ bavb a;

    public bauz(bavb bavb) {
        this.a = bavb;
    }

    public final void a() {
        bavb bavb = this.a;
        if (bavb.g == null) {
            bawc bawc = bavb.i;
            String str = bawc.a;
            bawc.l = 10;
            bavb.f.setDoOutput(true);
            bavb.f.connect();
            bavb.i.l = 12;
            bavb.h = bavb.f.getOutputStream();
            bavb.g = Channels.newChannel(bavb.h);
        }
        this.a.a.set(0);
        this.a.a((bawd) new bauy(this));
    }
}
