package defpackage;

import androidx.preference.Preference;

/* renamed from: lwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lwm implements aml {
    private final lwr a;

    public lwm(lwr lwr) {
        this.a = lwr;
    }

    public final boolean a(Preference preference) {
        lwr lwr = this.a;
        lwr.c = new lum();
        lwr.c.setTargetFragment(lwr, 1);
        lwr.c.show(lwr.getFragmentManager(), lum.class.getName());
        return true;
    }
}
