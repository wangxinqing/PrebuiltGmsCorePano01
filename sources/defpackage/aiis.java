package defpackage;

import android.location.LocationListener;
import android.os.Looper;

/* renamed from: aiis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aiis extends aiip {
    final /* synthetic */ aiit b;
    private final LocationListener c = new aiir(this, "location", "GpsProviderController");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiis(aiit aiit) {
        super(aiit);
        this.b = aiit;
    }

    public void a() {
        aiit aiit = this.b;
        ajpz ajpz = aiit.a;
        long j = aiit.r;
        LocationListener e = e();
        Looper looper = this.b.d.getLooper();
        aiit aiit2 = this.b;
        ajpz.a("gps", j, e, looper, aiit2.w, aiit2.x);
    }

    public void b() {
        this.b.a.a(e());
    }

    public final void c() {
        a();
    }

    public LocationListener e() {
        return this.c;
    }

    public String toString() {
        return "on";
    }
}
