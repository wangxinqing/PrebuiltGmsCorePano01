package defpackage;

import android.location.Location;

/* renamed from: aiic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiic implements acvv {
    private final aiie a;

    public aiic(aiie aiie) {
        this.a = aiie;
    }

    public final void a(Object obj) {
        aiie aiie = this.a;
        aiie.a.post(new aiid(aiie, (Location) obj));
    }
}
