package defpackage;

import android.location.Location;

/* renamed from: aiiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiiu extends qvw {
    final /* synthetic */ aiiv a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiiu(aiiv aiiv, String str, String str2) {
        super(str, str2);
        this.a = aiiv;
    }

    /* access modifiers changed from: protected */
    public final void a(Location location) {
        if (this.a.d()) {
            this.a.d.a(location);
            aiiv aiiv = this.a;
            int i = aiiv.c + 1;
            aiiv.c = i;
            aiix aiix = aiiv.d;
            int i2 = aiix.q;
            if (i >= aiix.o || location.getAccuracy() <= ((float) this.a.d.p)) {
                aiix aiix2 = this.a.d;
                aiix2.a(aiix2.m);
            }
        }
    }
}
