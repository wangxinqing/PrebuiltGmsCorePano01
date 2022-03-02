package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: aqet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqet {
    final /* synthetic */ aqeu a;
    private int b = 0;
    private int c = Integer.MIN_VALUE;
    private Iterator d = null;

    public aqet(aqeu aqeu) {
        this.a = aqeu;
    }

    public final boolean a() {
        if (this.c != Integer.MIN_VALUE) {
            return true;
        }
        if (this.b <= this.a.c) {
            while (true) {
                int i = this.b;
                aqeu aqeu = this.a;
                if (i > aqeu.c) {
                    break;
                } else if (aqeu.a[i] == null) {
                    this.b = i + 1;
                } else {
                    this.b = i + 1;
                    this.c = i;
                    return true;
                }
            }
        }
        HashMap hashMap = this.a.b;
        if (hashMap == null) {
            return false;
        }
        if (this.d == null) {
            this.d = hashMap.keySet().iterator();
        }
        if (!this.d.hasNext()) {
            return false;
        }
        this.c = ((Integer) this.d.next()).intValue();
        return true;
    }

    public final int b() {
        if (a()) {
            int i = this.c;
            this.c = Integer.MIN_VALUE;
            return i;
        }
        throw new NoSuchElementException();
    }
}
