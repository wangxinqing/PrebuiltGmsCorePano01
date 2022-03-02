package defpackage;

/* renamed from: afqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afqd implements aoqb {
    private final afqn a;

    public afqd(afqn afqn) {
        this.a = afqn;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        if (((Boolean) obj).booleanValue()) {
            return aorl.a((Object) null);
        }
        afsh.a("%s Failed to init shared file manager.", (Object) "MDDManager");
        return afqn.e();
    }
}
