package defpackage;

/* renamed from: ahrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahrk implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ahrs b;

    public ahrk(ahrs ahrs, String str) {
        this.b = ahrs;
        this.a = str;
    }

    public final void run() {
        ahry ahry = this.b.f;
        String valueOf = String.valueOf(this.a);
        if (valueOf.length() == 0) {
            new String("Failed to batch upload: ");
        } else {
            "Failed to batch upload: ".concat(valueOf);
        }
        ajcs ajcs = (ajcs) ahry;
        ajcs.h++;
        ajcs.b();
    }
}
