package defpackage;

/* renamed from: aems  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aems extends aemv {
    final /* synthetic */ aemu a;

    public aems(aemu aemu) {
        this.a = aemu;
    }

    public final void a(aemr aemr) {
        if (!((Boolean) this.a.b.get(aemr)).booleanValue()) {
            this.a.b.put(aemr, true);
            aemu aemu = this.a;
            aemu.c++;
            aemu.c();
        }
    }
}
