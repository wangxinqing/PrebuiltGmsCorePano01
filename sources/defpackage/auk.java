package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: auk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auk {
    public Map a;
    public Map b;
    public Map c;
    public ov d;
    public oh e;
    public List f;
    public Rect g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public int l = 0;
    private final HashSet m = new HashSet();

    public auk() {
        new avm();
    }

    public final float a() {
        return (float) ((long) ((b() / this.j) * 1000.0f));
    }

    public final void a(int i2) {
        this.l += i2;
    }

    public final float b() {
        return this.i - this.h;
    }

    public final void c() {
        this.k = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        List list = this.f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(((ayx) list.get(i2)).a("\t"));
        }
        return sb.toString();
    }

    public final ayx a(long j2) {
        return (ayx) this.e.a(j2);
    }

    public final void a(String str) {
        bay.a(str);
        this.m.add(str);
    }
}
