package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: rfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rfy extends rga {
    final /* synthetic */ GeofencingRequest a;
    final /* synthetic */ PendingIntent b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfy(icc icc, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(icc);
        this.a = geofencingRequest;
        this.b = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((rgu) ibf).a(this.a, this.b, (idg) this);
    }
}
