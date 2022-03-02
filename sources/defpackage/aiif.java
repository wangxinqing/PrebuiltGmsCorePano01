package defpackage;

import android.location.Location;

/* renamed from: aiif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiif implements acvv {
    private final aiih a;

    public aiif(aiih aiih) {
        this.a = aiih;
    }

    public final void a(Object obj) {
        aiih aiih = this.a;
        aiih.a.post(new aiig(aiih, (Location) obj));
    }
}
