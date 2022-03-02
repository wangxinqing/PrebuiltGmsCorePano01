package defpackage;

/* renamed from: aheo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aheo implements Runnable {
    private final ahey a;

    public aheo(ahey ahey) {
        this.a = ahey;
    }

    public final void run() {
        ahey ahey = this.a;
        synchronized (ahey.g) {
            ahey.h = null;
            ahey.i = true;
        }
    }
}
