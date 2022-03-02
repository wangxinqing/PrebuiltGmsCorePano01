package defpackage;

/* renamed from: ar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ar {
    final ax c;
    boolean d;
    int e = -1;
    final /* synthetic */ as f;

    public ar(as asVar, ax axVar) {
        this.f = asVar;
        this.c = axVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (z != this.d) {
            this.d = z;
            as asVar = this.f;
            int i = asVar.e;
            asVar.e = (!z ? -1 : 1) + i;
            if (i == 0 && z) {
                asVar.a();
            }
            as asVar2 = this.f;
            if (asVar2.e == 0 && !this.d) {
                asVar2.c();
            }
            if (this.d) {
                this.f.a(this);
            }
        }
    }

    public abstract boolean a();

    public boolean a(aj ajVar) {
        return false;
    }

    public void b() {
    }
}
