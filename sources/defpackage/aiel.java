package defpackage;

import android.location.Location;
import android.os.Build;
import java.util.Collections;

/* renamed from: aiel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiel extends qvw {
    final /* synthetic */ aien a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiel(aien aien, String str, String str2) {
        super(str, str2);
        this.a = aien;
    }

    /* access modifiers changed from: protected */
    public final void a(Location location) {
        int i = Build.VERSION.SDK_INT;
        if (!"network".equals(location.getProvider())) {
            this.a.b(Collections.singletonList(location));
        }
    }
}
