package defpackage;

import java.util.Observable;

/* renamed from: nzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzx extends Observable {
    public final synchronized void a() {
        b();
        super.deleteObservers();
    }

    public final synchronized void b() {
        super.setChanged();
        super.notifyObservers();
    }
}
