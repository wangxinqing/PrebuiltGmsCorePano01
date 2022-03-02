package defpackage;

/* renamed from: aidr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aidr implements Runnable {
    private final aiei a;

    public aidr(aiei aiei) {
        this.a = aiei;
    }

    public final void run() {
        for (aidd aidd : this.a.j.c()) {
            if (aidd.a()) {
                aidd.c();
            }
        }
    }
}
