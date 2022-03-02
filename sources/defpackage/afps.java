package defpackage;

/* renamed from: afps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class afps implements amqy {
    private final afqn a;

    public afps(afqn afqn) {
        this.a = afqn;
    }

    public final Object a(Object obj) {
        afqn afqn = this.a;
        Void voidR = (Void) obj;
        afpk.b(afqn.b);
        afst.a(afqn.b, "gms_icing_mdd_manager_metadata", afqn.m).edit().clear().commit();
        afqn.a = false;
        return null;
    }
}
