package defpackage;

/* renamed from: apps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apps implements acvf {
    final /* synthetic */ apth a;

    public apps(apth apth) {
        this.a = apth;
    }

    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        if (!acwa.b()) {
            return acws.a(acwa.e());
        }
        apth apth = this.a;
        apth.a((audx) acwa.d());
        if (apth != null) {
            return acws.a((Object) apth);
        }
        return acws.a((Exception) new apqd("Error parsing response."));
    }
}
