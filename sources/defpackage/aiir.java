package defpackage;

import android.location.Location;

/* renamed from: aiir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiir extends qvw {
    final /* synthetic */ aiis a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiir(aiis aiis, String str, String str2) {
        super(str, str2);
        this.a = aiis;
    }

    /* access modifiers changed from: protected */
    public final void a(Location location) {
        if (this.a.d()) {
            this.a.b.a(location);
        }
    }
}
