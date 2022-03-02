package defpackage;

/* renamed from: ors  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ors {
    public final /* synthetic */ osf a;

    public ors(osf osf) {
        this.a = osf;
    }

    public final void a(String str) {
        osf osf = this.a;
        if (osf.w || !str.equals(osf.b.getPackageName())) {
            this.a.a(str);
        } else {
            oso.e("Skipping remove pkg from self resource");
        }
    }
}
