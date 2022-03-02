package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;

/* renamed from: adum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adum extends ihb {
    final /* synthetic */ SemanticLocationEventRequest a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ PendingIntent c;
    final /* synthetic */ adut d;

    public adum(adut adut, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.d = adut;
        this.a = semanticLocationEventRequest;
        this.b = pendingIntent;
        this.c = pendingIntent2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ((advj) ((advl) ibf).x()).a(this.d.a, (ifu) new adul(acwd), this.a, this.b, this.c);
    }
}
