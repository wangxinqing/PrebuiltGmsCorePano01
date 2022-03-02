package defpackage;

/* renamed from: aucg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aucg extends aucj implements audy {
    public aubx m = aubx.c;

    public final void a(auci auci) {
        if (auci.a != ((aucj) c(6))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    /* access modifiers changed from: package-private */
    public final aubx c() {
        aubx aubx = this.m;
        if (aubx.b) {
            this.m = aubx.clone();
        }
        return this.m;
    }
}
