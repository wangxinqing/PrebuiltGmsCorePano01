package defpackage;

import android.content.Context;
import com.google.android.gms.udc.service.UdcContextInitChimeraService;

/* renamed from: addn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class addn implements afun {
    private final UdcContextInitChimeraService a;
    private final adeu b;

    public addn(UdcContextInitChimeraService udcContextInitChimeraService, adeu adeu) {
        this.a = udcContextInitChimeraService;
        this.b = adeu;
    }

    public final aorr a() {
        UdcContextInitChimeraService udcContextInitChimeraService = this.a;
        if (adev.a((Context) udcContextInitChimeraService).a(this.b)) {
            return aorl.a((Object) null);
        }
        throw new Exception("generic sync failure (see CEL)");
    }
}
