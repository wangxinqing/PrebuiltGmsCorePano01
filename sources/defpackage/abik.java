package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: abik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abik {
    public final List a;
    protected int b;
    public List c;

    public abik() {
        this.a = new LinkedList();
    }

    public final void a(List list) {
        this.b = 2;
        this.c = list;
        for (abid a2 : this.a) {
            a2.a();
        }
    }

    public abik(byte[] bArr) {
        this.a = new LinkedList();
        this.b = 1;
    }
}
