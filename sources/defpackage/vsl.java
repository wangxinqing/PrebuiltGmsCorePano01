package defpackage;

import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;

/* renamed from: vsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vsl implements igp {
    private final CharSequence a;

    public vsl(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final void a(Object obj, Object obj2) {
        CharSequence charSequence = this.a;
        int i = vts.a;
        war war = new war();
        war.a.a = charSequence.toString();
        ifu b = vts.b((acwd) obj2);
        SetDeviceNameParams setDeviceNameParams = war.a;
        setDeviceNameParams.b = b;
        ((vyk) ((waz) obj).x()).a(setDeviceNameParams);
    }
}
