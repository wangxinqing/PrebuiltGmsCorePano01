package defpackage;

import com.google.android.gms.drive.auth.AppIdentity;
import java.util.List;

/* renamed from: kdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kdu implements jks {
    final /* synthetic */ AppIdentity a;
    final /* synthetic */ kkz b;
    final /* synthetic */ List c;

    public kdu(AppIdentity appIdentity, kkz kkz, List list) {
        this.a = appIdentity;
        this.b = kkz;
        this.c = list;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        kdw kdw = (kdw) obj;
        return kdw.b().a(this.a, this.b) && this.c.containsAll(kdw.b().c().e);
    }
}
