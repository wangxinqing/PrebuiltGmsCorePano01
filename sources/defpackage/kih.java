package defpackage;

import android.content.Context;
import java.util.Locale;

/* renamed from: kih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kih implements kik {
    final /* synthetic */ khq a;
    final /* synthetic */ kmp b;
    final /* synthetic */ lht c;
    final /* synthetic */ kim d;

    public kih(kim kim, khq khq, kmp kmp, lht lht) {
        this.d = kim;
        this.a = khq;
        this.b = kmp;
        this.c = lht;
    }

    public final kit a(kin kin) {
        khq khq = this.a;
        kmp kmp = this.b;
        iva.b(!kmp.ab());
        String format = String.format(Locale.US, (String) jzq.aT.c(), new Object[]{kmp.i()});
        kim kim = this.d;
        Context context = kim.b;
        kht kht = kim.i;
        return new kiz(kin, khq, format, context, kim.h, kim.d, kim.g, this.b, this.c);
    }
}
