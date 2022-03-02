package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.RemoveGeofencingRequest;

/* renamed from: akyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akyf extends akhl {
    final /* synthetic */ RemoveGeofencingRequest b;
    final /* synthetic */ akyk c;
    final /* synthetic */ akyn d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akyf(akyn akyn, icc icc, RemoveGeofencingRequest removeGeofencingRequest, akyk akyk) {
        super(icc);
        this.d = akyn;
        this.b = removeGeofencingRequest;
        this.c = akyk;
    }

    /* access modifiers changed from: protected */
    public final icf a() {
        akyn akyn = this.d;
        rgb rgb = akyn.x;
        return rgb.a(akyn.k, this.b);
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Status status = (Status) icl;
        super.a((icl) status);
        this.d.d.post(new akye(this, status));
    }
}
