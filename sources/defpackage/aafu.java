package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: aafu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aafu extends aafb {
    public final osf a;

    public aafu(osf osf, ozc ozc) {
        super(aonk.CLEAR_USAGE_REPORT_DATA, 1, 4, osf.b, (Object) null, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        osf osf = this.a;
        ppp ppp = osf.c;
        ovi ovi = new ovi(osf, true, false);
        ppp.d(ovi);
        ovi.h();
        ppp ppp2 = this.a.c;
        aaft aaft = new aaft(this, aonk.CLEAR_USAGE_REPORT_DATA_INTERNAL, psd.b(this.a.b));
        ppp2.d(aaft);
        return !((Boolean) aaft.h()).booleanValue() ? Status.c : Status.a;
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        return status;
    }
}
