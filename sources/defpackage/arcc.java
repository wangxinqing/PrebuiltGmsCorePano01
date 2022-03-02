package defpackage;

import com.google.location.bluemoon.inertialanchor.Pose;
import java.util.List;

/* renamed from: arcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arcc implements Runnable {
    public Pose a;
    private final List b;

    public arcc(List list) {
        this.b = list;
    }

    public final void run() {
        synchronized (this.b) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((arce) this.b.get(i)).a(this.a);
            }
        }
    }
}
