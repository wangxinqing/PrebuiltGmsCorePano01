package defpackage;

@Deprecated
/* renamed from: admp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admp extends adlq {
    public static final adro e = new adro("file_path", "");

    public admp(adre adre) {
        super("reboot", adre);
    }

    public final adll c() {
        if (adjw.a()) {
            adrd a = adre.a();
            a.a(adlw.f, (String) a(e));
            return new adll("ab-reboot", a.a());
        }
        adrd a2 = adre.a();
        a2.a(admj.e, (String) a(e));
        return new adll("non-ab-reboot", a2.a());
    }
}
